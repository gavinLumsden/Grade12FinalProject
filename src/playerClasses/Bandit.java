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

/**
 * Bandit.java - Represents a "bandit" object
 *
 * @author g.lumsden
 * @since 14-May-2019
 */
public class Bandit extends GameCharacter {

    public  JLabel                heroImage; 
    private LinkedList<Animation> animations; 
    private Location[][]          locations; 
    private Grid                  grid; 
    
    private GameEngine engine;
    private BattleUI   battleUI;

    public final String NAME = "Bandit";
    public String attack1    = "Swift";
    public String attack2    = "Poison";
    public String attack3    = "Stab";
    public String attack4    = "Evade";
    public String passive    = "Back Stab";
    public String ultimate   = "Elusive";

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
     * Creates a "bandit"
     * @param locations
     * @param grid
     * @param heroImage
     * @param engine
     */
    public Bandit(Location[][] locations, Grid grid, JLabel heroImage, GameEngine engine) {
        super(heroImage, 100, Directions.STOP, Directions.FOUR_DIRECTIONS, 100);
        
        this.heroImage = heroImage; 
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

        attack1Duration = punchSpeed;
        attack2Duration = punchSpeed;
        attack3Duration = punchSpeed;
        attack4Duration = (punchSpeed * 3);

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
        walkUpFiles.add(Icons.BANDIT_WALK_UP_1);
        walkUpFiles.add(Icons.BANDIT_IDLE_UP);
        walkUpFiles.add(Icons.BANDIT_WALK_UP_2);
        walkUpFiles.add(Icons.BANDIT_IDLE_UP);

        LinkedList<String> walkDownFiles = new LinkedList<>();
        walkDownFiles.add(Icons.BANDIT_WALK_DOWN_1);
        walkDownFiles.add(Icons.BANDIT_IDLE_DOWN);
        walkDownFiles.add(Icons.BANDIT_WALK_DOWN_2);
        walkDownFiles.add(Icons.BANDIT_IDLE_DOWN);

        LinkedList<String> walkLeftFiles = new LinkedList<>();
        walkLeftFiles.add(Icons.BANDIT_WALK_LEFT_1);
        walkLeftFiles.add(Icons.BANDIT_IDLE_LEFT);
        walkLeftFiles.add(Icons.BANDIT_WALK_LEFT_2);
        walkLeftFiles.add(Icons.BANDIT_IDLE_LEFT);

        LinkedList<String> walkRightFiles = new LinkedList<>();
        walkRightFiles.add(Icons.BANDIT_WALK_RIGHT_1);
        walkRightFiles.add(Icons.BANDIT_IDLE_RIGHT);
        walkRightFiles.add(Icons.BANDIT_WALK_RIGHT_2);
        walkRightFiles.add(Icons.BANDIT_IDLE_RIGHT);

        LinkedList<String> stopUpFiles = new LinkedList<>();
        stopUpFiles.add(Icons.BANDIT_IDLE_UP);
        stopUpFiles.add(Icons.BANDIT_IDLE_UP);

        LinkedList<String> stopDownFiles = new LinkedList<>();
        stopDownFiles.add(Icons.BANDIT_IDLE_DOWN);
        stopDownFiles.add(Icons.BANDIT_IDLE_DOWN);

        LinkedList<String> stopLeftFiles = new LinkedList<>();
        stopLeftFiles.add(Icons.BANDIT_IDLE_LEFT);
        stopLeftFiles.add(Icons.BANDIT_IDLE_LEFT);

        LinkedList<String> stopRightFiles = new LinkedList<>();
        stopRightFiles.add(Icons.BANDIT_IDLE_RIGHT);
        stopRightFiles.add(Icons.BANDIT_IDLE_RIGHT);

        Animation walkUpAnimation    = new Animation(heroImage, walkUpFiles, WALK_DELAY, true);
        Animation walkDownAnimation  = new Animation(heroImage, walkDownFiles, WALK_DELAY, true);
        Animation walkLeftAnimation  = new Animation(heroImage, walkLeftFiles, WALK_DELAY, true);
        Animation walkRightAnimation = new Animation(heroImage, walkRightFiles, WALK_DELAY, true);

        Animation stopUpAnimation    = new Animation(heroImage, stopUpFiles, WALK_DELAY, true);
        Animation stopDownAnimation  = new Animation(heroImage, stopDownFiles, WALK_DELAY, true);
        Animation stopLeftAnimation  = new Animation(heroImage, stopLeftFiles, WALK_DELAY, true);
        Animation stopRightAnimation = new Animation(heroImage, stopRightFiles, WALK_DELAY, true);

        animations = new LinkedList<>();

        animations.add(walkUpAnimation);
        animations.add(walkDownAnimation);
        animations.add(walkLeftAnimation);
        animations.add(walkRightAnimation);

        animations.add(stopUpAnimation);
        animations.add(stopDownAnimation);
        animations.add(stopLeftAnimation);
        animations.add(stopRightAnimation);

        sprite.setAnimations(animations);
        sprite.animate(5);
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
        
    }
    
    private void battle() {
        
    }
    
    @Override
    public void attack1() {
        battleUI.playerDodgeChance *= 2;
        if (battleUI.playerDodgeChance >= MAX_DODGE_CHANCE) {
            battleUI.playerDodgeChance = MAX_DODGE_CHANCE;
        }
    }

    @Override
    public void attack2() {
        battleUI.enemyPunchSpeed -= 50;
    }

    @Override
    public void attack3() {
        battleUI.enemyEffects("bleed");
    }

    @Override
    public void attack4() {
        battleUI.playerDodgeChance = 100;
    }

    @Override
    public void resetAttack1() {
        battleUI.playerDodgeChance = battleUI.playerBaseDodgeChance;
    }

    @Override
    public void resetAttack2() {
        battleUI.enemyPunchSpeed = battleUI.enemyBasePunchSpeed;
    }

    @Override
    public void resetAttack3() {
        battleUI.enemyEffects("stop bleed");
    }

    @Override
    public void resetAttack4() {
        battleUI.playerDodgeChance = battleUI.playerBaseDodgeChance;
    }

}
