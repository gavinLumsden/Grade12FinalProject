package playerClasses;

import game.CharacterData;
import collections.LinkedList;
import enemyClasses.Cyborg;
import enemyClasses.Nail;
import enemyClasses.Rampage;
import game.BattleUI;
import objects.Grass;
import objects.Wall;
import objects.NextLevelBlock;
import game.gametools.Directions;
import game.gametools.GameCharacter;
import game.GameEngine;
import game.gametools.Animation;
import javax.swing.JFrame;
import maps.Map1;
import maps.Map2;
import maps.Map4;
import maps.Map3;
import javax.swing.JLabel;
import objects.House;

public class Juggernaut extends GameCharacter {

    private LinkedList<Cyborg>  cyborgs;
    private LinkedList<Nail>    nails;
    private LinkedList<Rampage> rampages; 

    private GameEngine engine;
    private BattleUI   battleUI; 
    
    private LinkedList<Wall>           walls;
    private LinkedList<Grass>          grass;
    private LinkedList<House>          houses; 
    private LinkedList<NextLevelBlock> nextLevelBlocks; 
    
    public final String NAME = "Juggernaut"; 
    
    public String attack1 = "Harden"; 
    public String attack2 = "Intimedate"; 
    public String attack3 = "Hold"; 
    public String attack4 = "Bash"; 
    
    private JFrame currentMap; 
    private JFrame previousMap; 
        
    private String currentMapName; 
    private String previousMapName; 
    
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
     * Creates a "juggernaut"
     *
     * @param heroImage
     * @param walls
     * @param houses
     * @param cyborgs
     * @param nails
     * @param rampages
     * @param nextLevelBlock
     * @param hasBeenCreated
     * @param engine
     * @param currentMap
     * @param previousMap
     * @param currentMapName
     * @param previousMapName
     */
    public Juggernaut(
            JLabel heroImage,
            LinkedList<Wall> walls, LinkedList<House> houses, 
            LinkedList<Cyborg> cyborgs, LinkedList<Nail> nails, LinkedList<Rampage> rampages, 
            LinkedList<NextLevelBlock> nextLevelBlock, 
            GameEngine engine, boolean hasBeenCreated,
            JFrame currentMap, JFrame previousMap, 
            String currentMapName, String previousMapName) {
        super(heroImage, 25, Directions.STOP, Directions.FOUR_DIRECTIONS, 100);

        this.currentMap  = currentMap; 
        this.previousMap = previousMap; 

        this.currentMapName  = currentMapName; 
        this.previousMapName = previousMapName; 
        
        this.engine = engine;
        this.walls = walls;
        this.houses = houses; 
        this.nextLevelBlocks = nextLevelBlock; 

        this.cyborgs = cyborgs;
        this.nails = nails;
        this.rampages = rampages;
        
        super.playerAttack1 = attack1; 
        super.playerAttack2 = attack2; 
        super.playerAttack3 = attack3; 
        super.playerAttack4 = attack4; 
        
        final int[] DEFAULTS = { 2,5,100,100,1000,1,0,0 };
        int stats[] = new int[DEFAULTS.length];
        stats = CharacterData.check(this, hasBeenCreated, stats, DEFAULTS);
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
        attack2Duration = (punchSpeed * 3); 
        attack3Duration = punchSpeed; 
        attack4Duration = (punchSpeed * 3); 
        
        super.playerDamage      = damage; 
        super.playerDodgeChance = dodgeChance; 
        super.playerHealth      = health; 
        super.playerMaxHealth   = maxHealth; 
        super.playerPunchSpeed  = punchSpeed; 
        
        super.level = level; 
        super.exp   = exp; 
        super.gold  = gold; 
        
        super.attack1Cooldown = attack1Cooldown; 
        super.attack2Cooldown = attack2Cooldown; 
        super.attack3Cooldown = attack3Cooldown; 
        super.attack4Cooldown = attack4Cooldown; 
        
        super.attack1Duration = attack1Duration; 
        super.attack2Duration = attack2Duration; 
        super.attack3Duration = attack3Duration; 
        super.attack4Duration = attack4Duration; 
        
        super.playerName = NAME; 

        LinkedList<String> walkUpFiles = new LinkedList<>();
        walkUpFiles.add("/animations/juggernaut/up/juggernautWalk1.png");
        walkUpFiles.add("/animations/juggernaut/up/juggernautIdle.png");
        walkUpFiles.add("/animations/juggernaut/up/juggernautWalk2.png");
        walkUpFiles.add("/animations/juggernaut/up/juggernautIdle.png");

        LinkedList<String> walkDownFiles = new LinkedList<>();
        walkDownFiles.add("/animations/juggernaut/down/juggernautWalk1.png");
        walkDownFiles.add("/animations/juggernaut/down/juggernautIdle.png");
        walkDownFiles.add("/animations/juggernaut/down/juggernautWalk2.png");
        walkDownFiles.add("/animations/juggernaut/down/juggernautIdle.png");

        LinkedList<String> walkLeftFiles = new LinkedList<>();
        walkLeftFiles.add("/animations/juggernaut/left/juggernautWalk1.png");
        walkLeftFiles.add("/animations/juggernaut/left/juggernautIdle.png");
        walkLeftFiles.add("/animations/juggernaut/left/juggernautWalk2.png");
        walkLeftFiles.add("/animations/juggernaut/left/juggernautIdle.png");

        LinkedList<String> walkRightFiles = new LinkedList<>();
        walkRightFiles.add("/animations/juggernaut/right/juggernautWalk1.png");
        walkRightFiles.add("/animations/juggernaut/right/juggernautIdle.png");
        walkRightFiles.add("/animations/juggernaut/right/juggernautWalk2.png");
        walkRightFiles.add("/animations/juggernaut/right/juggernautIdle.png");

        LinkedList<String> stopUpFiles = new LinkedList<>();
        stopUpFiles.add("/animations/juggernaut/up/juggernautIdle.png");
        stopUpFiles.add("/animations/juggernaut/up/juggernautIdle.png");

        LinkedList<String> stopDownFiles = new LinkedList<>();
        stopDownFiles.add("/animations/juggernaut/down/juggernautIdle.png");
        stopDownFiles.add("/animations/juggernaut/down/juggernautIdle.png");

        LinkedList<String> stopLeftFiles = new LinkedList<>();
        stopLeftFiles.add("/animations/juggernaut/left/juggernautIdle.png");
        stopLeftFiles.add("/animations/juggernaut/left/juggernautIdle.png");

        LinkedList<String> stopRightFiles = new LinkedList<>();
        stopRightFiles.add("/animations/juggernaut/right/juggernautIdle.png");
        stopRightFiles.add("/animations/juggernaut/right/juggernautIdle.png");

        Animation walkUpAnimation = new Animation(heroImage, walkUpFiles, super.WALK_DELAY, true);
        Animation walkDownAnimation = new Animation(heroImage, walkDownFiles, super.WALK_DELAY, true);
        Animation walkLeftAnimation = new Animation(heroImage, walkLeftFiles, super.WALK_DELAY, true);
        Animation walkRightAnimation = new Animation(heroImage, walkRightFiles, super.WALK_DELAY, true);

        Animation stopUpAnimation = new Animation(heroImage, stopUpFiles, super.IDLE_DELAY, true);
        Animation stopDownAnimation = new Animation(heroImage, stopDownFiles, super.IDLE_DELAY, true);
        Animation stopLeftAnimation = new Animation(heroImage, stopLeftFiles, super.IDLE_DELAY, true);
        Animation stopRightAnimation = new Animation(heroImage, stopRightFiles, super.IDLE_DELAY, true);

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
        checkWalls();
        checkNextLevelBlocks();
        checkHouses(); 
        checkEnemies();
        redraw();
    }

    /**
     * checks to see if the hero is overlapping with a wall
     */
    private void checkWalls() {
        for (int i = 0; i < walls.size(); i++) {
            if (walls.get(i) != null) {
                if (detector.isOverLapping(walls.get(i))) {
                    reactor.stickTo(walls.get(i));
                }
            }
        }
    }

    /**
     * checks to see if the hero is overlapping with a next level block
     */
    private void checkNextLevelBlocks() {
        for (int i = 0; i < nextLevelBlocks.size(); i++) {
            if (nextLevelBlocks.get(i) != null) {
                if (detector.isOverLapping(nextLevelBlocks.get(i))){
                    if (nextLevelBlocks.get(i).mapToGoTo.equals("map 1")) {
                        Map1 map1 = new Map1(currentMapName, engine); 
                    }
                }
            }
        }
    }
    
    /**
     * checks to see if the hero is overlapping with a house
     */
    private void checkHouses() {
        for (int i = 0; i < houses.size(); i++) {
            if (houses.get(i) != null) {
                if (detector.isOverLapping(houses.get(i))) {
                    reactor.stickTo(houses.get(i));
                }
            }
        }
    }

    /**
     * checks to see if the hero is overlapping with an enemy
     */
    private void checkEnemies() {
        if (cyborgs != null) {
            for (int i = 0; i < cyborgs.size(); i++) {
                if (detector.isOverLapping(cyborgs.get(i))) {
                    cyborgs.get(i).sprite.setLocation(10000, 10000);
                    cyborgs.get(i).update();
                    engine.pause(); 
                    BattleUI battleUI = new BattleUI(engine, this, cyborgs.get(i)); 
                    this.battleUI = battleUI; 
                }
            }
        }
        if (nails != null) {
            for (int i = 0; i < nails.size(); i++) {
                if (detector.isOverLapping(nails.get(i))) {
                    nails.get(i).sprite.setLocation(10000, 10000);
                    nails.get(i).update();
                    engine.pause(); 
                    BattleUI battleUI = new BattleUI(engine, this, nails.get(i)); 
                    this.battleUI = battleUI; 
                }
            }
        }
        if (rampages != null) {
            for (int i = 0; i < rampages.size(); i++) {
                if (detector.isOverLapping(rampages.get(i))) {
                    rampages.get(i).sprite.setLocation(10000, 10000);
                    rampages.get(i).update();
                    engine.pause(); 
                    BattleUI battleUI = new BattleUI(engine, this, rampages.get(i)); 
                    this.battleUI = battleUI; 
                }
            }
        }
    }

    @Override
    public void attack1() {
        System.out.println("make ability 1 for juggernaut");
    }
    
    @Override
    public void attack2() {
        battleUI.enemyDamage -= 1; 
    }
    
    @Override
    public void attack3() {
        battleUI.playerDamage *= 2; 
        battleUI.enemyDodgeChance = 0; 
    }
    
    @Override
    public void attack4() {
        battleUI.enemyEffects("stun"); 
    }

    @Override
    public void resetAttack1() {
        
    }

    @Override
    public void resetAttack2() {
        battleUI.enemyDamage = battleUI.enemyBaseDamage; 
    }

    @Override
    public void resetAttack3() {
        battleUI.playerDamage = battleUI.playerBaseDamage; 
        battleUI.enemyDodgeChance = battleUI.enemyBaseDodgeChance; 
    }

    @Override
    public void resetAttack4() {
        battleUI.enemyEffects("stop stun");
    }

}
