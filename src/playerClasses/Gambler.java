package playerClasses;

import game.CharacterData;
import game.gametools.Directions;
import game.gametools.GameCharacter;
import game.gametools.Animation;
import game.GameEngine;
import game.Icons; 
import grid.Grid; 
import grid.Location; 
import grid.Types; 
import collections.LinkedList; 
import jframes.BattleUI;
import javax.swing.JLabel;

public class Gambler extends GameCharacter {

    public  JLabel                label; 
    private LinkedList<Animation> animations; 
    private Location[][]          locations; 
    private Grid                  grid; 
    
    private GameEngine engine;
    private BattleUI   battleUI;

    public final String NAME = "Gambler";
    public String attack1    = "Coin flip";
    public String attack2    = "Risk";
    public String attack3    = "Bribe";
    public String attack4    = "Rob";
    public String passive    = "Lucky";
    public String ultimate   = "Gamble";

    public int damage;      // how much damage you do (can be increased)
    public int dodgeChance; // your chance of dodging  (can be increased)
    public int maxHealth;   // the maximum amount of health you can have (can be increased) 
    public int health;      // how much health you have (can be increased)
    public int punchSpeed;  // how fast you hit (can be increased)
    public int level;
    public int exp;
    public int gold;

    public int attack1Cooldown;
    public int attack2Cooldown;
    public int attack3Cooldown;
    public int attack4Cooldown;
    public int attack1Duration;
    public int attack2Duration;
    public int attack3Duration;
    public int attack4Duration;

    /**
     * Creates a "gambler"
     * @param locations
     * @param grid
     * @param label
     * @param engine
     */
    public Gambler(Location[][] locations, Grid grid, JLabel label, GameEngine engine) {
        super(label, 100, Directions.STOP, Directions.FOUR_DIRECTIONS, 100);
        
        this.label = label; 
        this.locations = locations; 
        this.grid      = grid; 

        final int[] DEFAULTS = {5, 5, 100, 100, 1000, 1, 0, 0};
        int stats[] = new int[DEFAULTS.length];
        stats = CharacterData.check(this, stats, DEFAULTS);
        damage      = stats[0];
        dodgeChance = stats[1];
        health      = stats[2];
        maxHealth   = stats[3];
        punchSpeed  = stats[4];
        level       = stats[5];
        exp         = stats[6];
        gold        = stats[7];

        attack1Cooldown = 3000;
        attack2Cooldown = 3000;
        attack3Cooldown = 5000;
        attack4Cooldown = 10000;

        attack1Duration = (punchSpeed * 3);
        attack2Duration = (punchSpeed * 3);
        attack3Duration = punchSpeed;
        attack4Duration = punchSpeed; 

        super.playerDamage      = damage;
        super.playerDodgeChance = dodgeChance;
        super.playerHealth      = health;
        super.playerMaxHealth   = maxHealth;
        super.playerPunchSpeed  = punchSpeed;

        super.playerLevel = level;
        super.exp         = exp;
        super.gold        = gold;

        super.attack1Cooldown = attack1Cooldown;
        super.attack2Cooldown = attack2Cooldown;
        super.attack3Cooldown = attack3Cooldown;
        super.attack4Cooldown = attack4Cooldown;

        super.attack1Duration = attack1Duration;
        super.attack2Duration = attack2Duration;
        super.attack3Duration = attack3Duration;
        super.attack4Duration = attack4Duration;

        super.playerName = NAME;
        
        setAnimations(); 
    }

    private void setAnimations() {
        LinkedList<String> walkUpFiles = new LinkedList<>();
        walkUpFiles.add(Icons.GAMBLER_WALK_UP_1);
        walkUpFiles.add(Icons.GAMBLER_IDLE_UP);
        walkUpFiles.add(Icons.GAMBLER_WALK_UP_2);
        walkUpFiles.add(Icons.GAMBLER_IDLE_UP);

        LinkedList<String> walkDownFiles = new LinkedList<>();
        walkDownFiles.add(Icons.GAMBLER_WALK_DOWN_1);
        walkDownFiles.add(Icons.GAMBLER_IDLE_DOWN);
        walkDownFiles.add(Icons.GAMBLER_WALK_DOWN_2);
        walkDownFiles.add(Icons.GAMBLER_IDLE_DOWN);

        LinkedList<String> walkLeftFiles = new LinkedList<>();
        walkLeftFiles.add(Icons.GAMBLER_WALK_LEFT_1);
        walkLeftFiles.add(Icons.GAMBLER_IDLE_LEFT);
        walkLeftFiles.add(Icons.GAMBLER_WALK_LEFT_2);
        walkLeftFiles.add(Icons.GAMBLER_IDLE_LEFT);

        LinkedList<String> walkRightFiles = new LinkedList<>();
        walkRightFiles.add(Icons.GAMBLER_WALK_RIGHT_1);
        walkRightFiles.add(Icons.GAMBLER_IDLE_RIGHT);
        walkRightFiles.add(Icons.GAMBLER_WALK_RIGHT_2);
        walkRightFiles.add(Icons.GAMBLER_IDLE_RIGHT);

        LinkedList<String> stopUpFiles = new LinkedList<>();
        stopUpFiles.add(Icons.GAMBLER_IDLE_UP);
        stopUpFiles.add(Icons.GAMBLER_IDLE_UP);

        LinkedList<String> stopDownFiles = new LinkedList<>();
        stopDownFiles.add(Icons.GAMBLER_IDLE_DOWN);
        stopDownFiles.add(Icons.GAMBLER_IDLE_DOWN);

        LinkedList<String> stopLeftFiles = new LinkedList<>();
        stopLeftFiles.add(Icons.GAMBLER_IDLE_LEFT);
        stopLeftFiles.add(Icons.GAMBLER_IDLE_LEFT);

        LinkedList<String> stopRightFiles = new LinkedList<>();
        stopRightFiles.add(Icons.GAMBLER_IDLE_RIGHT);
        stopRightFiles.add(Icons.GAMBLER_IDLE_RIGHT);

        Animation walkUpAnimation    = new Animation(label, walkUpFiles, super.WALK_DELAY, true);
        Animation walkDownAnimation  = new Animation(label, walkDownFiles, super.WALK_DELAY, true);
        Animation walkLeftAnimation  = new Animation(label, walkLeftFiles, super.WALK_DELAY, true);
        Animation walkRightAnimation = new Animation(label, walkRightFiles, super.WALK_DELAY, true);

        Animation stopUpAnimation    = new Animation(label, stopUpFiles, super.WALK_DELAY, true);
        Animation stopDownAnimation  = new Animation(label, stopDownFiles, super.WALK_DELAY, true);
        Animation stopLeftAnimation  = new Animation(label, stopLeftFiles, super.WALK_DELAY, true);
        Animation stopRightAnimation = new Animation(label, stopRightFiles, super.WALK_DELAY, true);

        LinkedList<Animation> animations = new LinkedList<>();

        animations.add(walkUpAnimation);
        animations.add(walkDownAnimation);
        animations.add(walkLeftAnimation);
        animations.add(walkRightAnimation);

        animations.add(stopUpAnimation);
        animations.add(stopDownAnimation);
        animations.add(stopLeftAnimation);
        animations.add(stopRightAnimation);

        sprite.setAnimations(animations);
    }
    
    /**
     * moves and animates the hero
     */
    @Override
    public void action() {
        mover.move();
        animate();
        check();
        redraw();
    }
    
    private void check() {
        for (int r = 0; r < locations.length; r++) {
            for (int c = 0; c < locations[0].length; c++) {
                if (detector.isOverLapping(locations[r][c].tile.tile)) {
                    if (locations[r][c].type == Types.BOUNDRY) {
                        moveMap();
                        return; 
                    } 
                    if (locations[r][c].type == Types.ENEMY) {
                        battle();
                        return; 
                    } 
                    if (locations[r][c].type == Types.HOUSE) {
                        reactor.stickTo(locations[r][c].tile.tile);
                        return; 
                    }
                }
            }
        }
    }

    private void moveMap() {
        System.out.println("move map");
    }
    
    private void battle() {
        System.out.println("battle");
    }

    @Override
    public void attack1() {
        int number = random(1, 3);
        if (number == 1) {
            battleUI.playerDamage *= 2;
        } else if (number == 2) {
            battleUI.playerDodgeChance *= 2;
        } else if (number == 3) {
            battleUI.playerPunchSpeed /= 2; // potential bug with int and double
        }
    }

    @Override
    public void attack2() {
        int number = random(1, 2);
        if (number == 1) {
            battleUI.enemyDamage /= 2;
        }
        if (number == 2) {
            battleUI.enemyDamage *= 2;
        }
    }

    @Override
    public void attack3() {
        if (gold >= 10) {
            gold -= 10;
            battleUI.enemyEffects("stun");
        }
    }

    @Override
    public void attack4() {
        gold += 20;
    }

    @Override
    public void resetAttack1() {
        battleUI.playerDamage = battleUI.playerBaseDamage;
        battleUI.playerDodgeChance = battleUI.playerBaseDodgeChance;
        battleUI.playerPunchSpeed = battleUI.playerBasePunchSpeed;
    }

    @Override
    public void resetAttack2() {
        battleUI.enemyDamage = battleUI.enemyBaseDamage;
    }

    @Override
    public void resetAttack3() {
        battleUI.enemyEffects("no stun"); 
    }

    @Override
    public void resetAttack4() {

    }

    /**
     * Generates a random number
     *
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @return the generated number
     */
    private int random(int low, int high) {
        double seed = Math.random();
        double L = (double) low;
        double H = (double) high;
        double number = (H - L + 1) * seed + L;
        int answer = (int) number;
        return answer;
    }

}
