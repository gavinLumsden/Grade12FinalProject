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

public class Mage extends GameCharacter {

    public  JLabel                heroImage; 
    private LinkedList<Animation> animations; 
    private Location[][]          locations; 
    private Grid                  grid; 
    
    private GameEngine engine;
    private BattleUI   battleUI;

    public final String NAME = "Mage";
    public String attack1    = "Fire Ball";
    public String attack2    = "Freeze";
    public String attack3    = "Lightning";
    public String attack4    = "Fire wall";
    public String passive    = "Incinerator";
    public String ultimate   = "Elementalist";

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
     * Constructor for the mage player class (when loading a hero)
     * @param locations
     * @param grid
     * @param heroImage
     * @param engine
     */
    public Mage(Location[][] locations, Grid grid, JLabel heroImage, GameEngine engine) {
        super(heroImage, 100, Directions.STOP, Directions.FOUR_DIRECTIONS, 100);
        
        this.heroImage = heroImage; 
        this.locations = locations; 
        this.grid      = grid; 

        int stats[] = new int[super.DEFAULTS.length];
        stats = CharacterData.check(this, stats, super.DEFAULTS);
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
        attack2Duration = (punchSpeed * 3);
        attack2Duration = (punchSpeed * 3);

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

    /**
     * Constructor for the mage player class (when loading a hero)
     * @param locations
     * @param grid
     * @param heroImage
     * @param engine
     * @param data 
     */
    public Mage(Location[][] locations, Grid grid, JLabel heroImage, GameEngine engine, String[] data) {
        super(heroImage, 100, Directions.STOP, Directions.FOUR_DIRECTIONS, 100);
        
        this.heroImage = heroImage; 
        this.locations = locations; 
        this.grid      = grid; 
        
        damage      = Integer.parseInt(data[0]); 
        dodgeChance = Integer.parseInt(data[1]); 
        maxHealth   = Integer.parseInt(data[2]);    
        health      = Integer.parseInt(data[3]);       
        punchSpeed  = Integer.parseInt(data[4]);   
        level       = Integer.parseInt(data[5]); 
        exp         = Integer.parseInt(data[6]); 
        gold        = Integer.parseInt(data[7]); 

        attack1Cooldown = 3000;
        attack2Cooldown = 3000;
        attack3Cooldown = 5000;
        attack4Cooldown = 10000;

        attack1Duration = (punchSpeed * 3);
        attack2Duration = (punchSpeed * 3);
        attack2Duration = (punchSpeed * 3);
        attack2Duration = (punchSpeed * 3);

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
        walkUpFiles.add(Icons.MAGE_WALK_UP_1);
        walkUpFiles.add(Icons.MAGE_IDLE_UP_1);
        walkUpFiles.add(Icons.MAGE_WALK_UP_2);
        walkUpFiles.add(Icons.MAGE_IDLE_UP_1);

        LinkedList<String> walkDownFiles = new LinkedList<>();
        walkDownFiles.add(Icons.MAGE_WALK_DOWN_1);
        walkDownFiles.add(Icons.MAGE_IDLE_DOWN_1);
        walkDownFiles.add(Icons.MAGE_WALK_DOWN_2);
        walkDownFiles.add(Icons.MAGE_IDLE_DOWN_1);

        LinkedList<String> walkLeftFiles = new LinkedList<>();
        walkLeftFiles.add(Icons.MAGE_WALK_LEFT_1);
        walkLeftFiles.add(Icons.MAGE_IDLE_LEFT_1);
        walkLeftFiles.add(Icons.MAGE_WALK_LEFT_2);
        walkLeftFiles.add(Icons.MAGE_IDLE_LEFT_1);

        LinkedList<String> walkRightFiles = new LinkedList<>();
        walkRightFiles.add(Icons.MAGE_WALK_RIGHT_1);
        walkRightFiles.add(Icons.MAGE_IDLE_RIGHT_1);
        walkRightFiles.add(Icons.MAGE_WALK_RIGHT_2);
        walkRightFiles.add(Icons.MAGE_IDLE_RIGHT_1);

        LinkedList<String> stopUpFiles = new LinkedList<>();
        stopUpFiles.add(Icons.MAGE_IDLE_UP_1);
        stopUpFiles.add(Icons.MAGE_IDLE_UP_2);
        stopUpFiles.add(Icons.MAGE_IDLE_UP_3);

        LinkedList<String> stopDownFiles = new LinkedList<>();
        stopDownFiles.add(Icons.MAGE_IDLE_DOWN_1);
        stopDownFiles.add(Icons.MAGE_IDLE_DOWN_2);
        stopDownFiles.add(Icons.MAGE_IDLE_DOWN_3);

        LinkedList<String> stopLeftFiles = new LinkedList<>();
        stopLeftFiles.add(Icons.MAGE_IDLE_LEFT_1);
        stopLeftFiles.add(Icons.MAGE_IDLE_LEFT_2);
        stopLeftFiles.add(Icons.MAGE_IDLE_LEFT_3);

        LinkedList<String> stopRightFiles = new LinkedList<>();
        stopRightFiles.add(Icons.MAGE_IDLE_RIGHT_1);
        stopRightFiles.add(Icons.MAGE_IDLE_RIGHT_2);
        stopRightFiles.add(Icons.MAGE_IDLE_RIGHT_3);

        Animation walkUpAnimation    = new Animation(heroImage, walkUpFiles, super.WALK_DELAY, true);
        Animation walkDownAnimation  = new Animation(heroImage, walkDownFiles, super.WALK_DELAY, true);
        Animation walkLeftAnimation  = new Animation(heroImage, walkLeftFiles, super.WALK_DELAY, true);
        Animation walkRightAnimation = new Animation(heroImage, walkRightFiles, super.WALK_DELAY, true);

        Animation stopUpAnimation    = new Animation(heroImage, stopUpFiles, super.WALK_DELAY, true);
        Animation stopDownAnimation  = new Animation(heroImage, stopDownFiles, super.WALK_DELAY, true);
        Animation stopLeftAnimation  = new Animation(heroImage, stopLeftFiles, super.WALK_DELAY, true);
        Animation stopRightAnimation = new Animation(heroImage, stopRightFiles, super.WALK_DELAY, true);

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
        battleUI.enemyEffects("bleed");
    }

    @Override
    public void attack2() {
        battleUI.enemyPunchSpeed /= 2;
    }

    @Override
    public void attack3() {
        battleUI.enemyEffects("stun");
    }

    @Override
    public void attack4() {
        battleUI.enemyDamage = 0;
    }

    @Override
    public void resetAttack1() {
        battleUI.enemyEffects("stop bleed");
    }

    @Override
    public void resetAttack2() {
        battleUI.enemyPunchSpeed = battleUI.enemyBasePunchSpeed;
    }

    @Override
    public void resetAttack3() {
        battleUI.enemyEffects("stop stun");
    }

    @Override
    public void resetAttack4() {
        battleUI.enemyDamage = battleUI.enemyBaseDamage;
    }

}
