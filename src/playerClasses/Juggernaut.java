package playerClasses;

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
import maps.Spawn;
import maps.Main;
import maps.EnemyVillage;
import maps.PlayerVillage;
import javax.swing.JLabel;
import objects.House;

public class Juggernaut extends GameCharacter {

    // properties
    private Spawn spawn;
    private Main main;
    private EnemyVillage enemyVillage;
    private PlayerVillage playerVillage;

    private LinkedList<Cyborg>  cyborgs;
    private LinkedList<Nail>    nails;
    private LinkedList<Rampage> rampages; 

    private GameEngine engine;
    private BattleUI battleUI; 
    
    private LinkedList<Wall>  walls;
    private LinkedList<Grass> grass;
    private LinkedList<House> houses; 

    private NextLevelBlock toSpawn;
    private NextLevelBlock toEnemyVillage;
    private NextLevelBlock toPlayerVillage;
    private NextLevelBlock toMain;

    // used to determine if the hero has traveled to a certain map
    private boolean hasTravelledToMain = false;
    private boolean hasTravelledToSpawn = false;
    private boolean hasTravelledToEnemyVillage = false;
    private boolean hasTravelledToPlayerVillage = false;
    
    public final String NAME = "Juggernaut"; 
    
    public String attack1 = "Harden"; 
    public String attack2 = "Intimedate"; 
    public String attack3 = "Hold"; 
    public String attack4 = "Bash"; 
    
    public int damage;      // how much damage you do
    public int dodgeChance; // your chance of dodging 
    public int health;      // how much health you have, can be increased
    public int punchSpeed;  // how fast you hit  
    
    public int level; 
    public int exp; 
    public int gold; 
    
    public int attack1Cooldown = 3000;     
    public int attack2Cooldown = 3000;     
    public int attack3Cooldown = 5000;     
    public int attack4Cooldown = 10000; 
    
    public int attack1Duration = punchSpeed;     
    public int attack2Duration = (punchSpeed * 3);
    public int attack3Duration = punchSpeed;     
    public int attack4Duration = (punchSpeed * 3);

    /**
     * Creates a "juggernaut"
     *
     * @param heroImage
     * @param walls
     * @param cyborgs
     * @param nails
     * @param rampages
     * @param toMain
     * @param toSpawn
     * @param toEnemyVillage
     * @param toPlayerVillage
     * @param engine
     */
    public Juggernaut(
            JLabel heroImage,
            LinkedList<Wall> walls, LinkedList<House> houses, 
            LinkedList<Cyborg> cyborgs, LinkedList<Nail> nails, LinkedList<Rampage> rampages, 
            NextLevelBlock toMain, NextLevelBlock toSpawn, NextLevelBlock toEnemyVillage, NextLevelBlock toPlayerVillage,
            GameEngine engine, boolean hasBeenCreated) {
        super(heroImage, 25, Directions.STOP, Directions.FOUR_DIRECTIONS, 100);

        this.engine = engine;
        this.walls = walls;
        this.houses = houses; 

        this.cyborgs = cyborgs;
        this.nails = nails;
        this.rampages = rampages;
        
        super.playerAttack1 = attack1; 
        super.playerAttack2 = attack2; 
        super.playerAttack3 = attack3; 
        super.playerAttack4 = attack4; 
        
        final int[] DEFAULTS = { 2,5,100,1000,1,0,0 };
        int stats[] = new int[7];
        stats = CharacterData.check(this, hasBeenCreated, stats, DEFAULTS);
        damage      = stats[0];
        dodgeChance = stats[1];
        health      = stats[2];
        punchSpeed  = stats[3]; 
        level       = stats[4]; 
        exp         = stats[5]; 
        gold        = stats[6]; 
        
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
        super.playerPunchSpeed  = punchSpeed; 
        
        super.attack1Cooldown = attack1Cooldown; 
        super.attack2Cooldown = attack2Cooldown; 
        super.attack3Cooldown = attack3Cooldown; 
        super.attack4Cooldown = attack4Cooldown; 
        
        super.attack1Duration = attack1Duration; 
        super.attack2Duration = attack2Duration; 
        super.attack3Duration = attack3Duration; 
        super.attack4Duration = attack4Duration; 
        
        super.playerName = NAME; 

        if (engine.map.equals("spawn") || engine.map.equals("enemy village") || engine.map.equals("player village")) {
            this.toMain = toMain;
        } else if (engine.map.equals("main")) {
            this.toSpawn = toSpawn;
            this.toEnemyVillage = toEnemyVillage;
            this.toPlayerVillage = toPlayerVillage;
        }

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
        if (toSpawn != null) {
            if (hasTravelledToSpawn == false) {
                if (detector.isOverLapping(toSpawn)) {
                    spawn = new Spawn("main", engine);
                    engine.clearMain();
                    hasTravelledToSpawn = true;
                }
            }
        }
        if (toEnemyVillage != null) {
            if (hasTravelledToEnemyVillage == false) {
                if (detector.isOverLapping(toEnemyVillage)) {
                    enemyVillage = new EnemyVillage(engine);
                    engine.clearMain();
                    hasTravelledToEnemyVillage = true;
                }
            }
        }
        if (toPlayerVillage != null) {
            if (hasTravelledToPlayerVillage == false) {
                if (detector.isOverLapping(toPlayerVillage)) {
                    playerVillage = new PlayerVillage(engine);
                    engine.clearMain();
                    hasTravelledToPlayerVillage = true;
                }
            }
        }
        if (toMain != null) {
            if (hasTravelledToMain == false) {
                if (detector.isOverLapping(toMain)) {
                    if (engine.map.equals("spawn")) {
                        main = new Main("spawn", engine);
                        engine.clearSpawn();
                    } else if (engine.map.equals("player village")) {
                        main = new Main("player village", engine);
                        engine.clearPlayerVillage();
                    } else if (engine.map.equals("enemy village")) {
                        main = new Main("enemy village", engine);
                        engine.clearEnemyVillage();
                    }
                    hasTravelledToMain = true;
                }
            }
        }
    }
    
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
