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
import game.Globals;
import game.gametools.Animation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import maps.Spawn;
import maps.Main;
import maps.EnemyVillage;
import maps.PlayerVillage;
import javax.swing.JLabel;
import javax.swing.Timer;
import objects.House;

public class Vampire extends GameCharacter {

    private Spawn spawn;
    private Main main;
    private EnemyVillage enemyVillage;
    private PlayerVillage playerVillage;

    private Cyborg[] cyborgs;
    private Nail[] nails;
    private Rampage[] rampages;

    private GameEngine engine;

    private Wall[] walls;
    private Grass[] grass;
    private House[] houses;

    private NextLevelBlock toSpawn;
    private NextLevelBlock toEnemyVillage;
    private NextLevelBlock toPlayerVillage;
    private NextLevelBlock toMain;

    private boolean hasTravelledToMain = false;
    private boolean hasTravelledToSpawn = false;
    private boolean hasTravelledToEnemyVillage = false;
    private boolean hasTravelledToPlayerVillage = false;
    
    public final String NAME = "Vampire"; 
    
    public String attack1 = "Leech"; 
    public String attack2 = "Bite"; 
    public String attack3 = "Bats"; 
    public String attack4 = "Coffin"; 

    public int health      = 100;  // how much health you have, can be increased
    public int punchSpeed  = 1000; // how fast you hit
    public int dodgeChance = 1;    // your chance of dodging
    public int damage      = 1;    // how much damage you do
    
    private Timer attack1Cooldown;     
    private Timer attack2Cooldown;     
    private Timer attack3Cooldown;     
    private Timer attack4Cooldown; 
    
    private int attack1CooldownTime;     
    private int attack2CooldownTime;     
    private int attack3CooldownTime;     
    private int attack4CooldownTime; 
    
    /**
     * Creates a "vampire"
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
    public Vampire(
            JLabel heroImage,
            Wall[] walls, House[] houses, 
            Cyborg[] cyborgs, Nail[] nails, Rampage[] rampages,
            NextLevelBlock toMain, NextLevelBlock toSpawn, NextLevelBlock toEnemyVillage, NextLevelBlock toPlayerVillage,
            GameEngine engine) {
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
        
        super.playerDamage      = damage; 
        super.playerDodgeChance = dodgeChance; 
        super.playerHealth      = health; 
        super.playerPunchSpeed  = punchSpeed; 
        
        super.playerName = NAME; 

        if (engine.map.equals("spawn") || engine.map.equals("enemy village") || engine.map.equals("player village")) {
            this.toMain = toMain;
        } else if (engine.map.equals("ui")) {
            this.toSpawn = toSpawn;
            this.toEnemyVillage = toEnemyVillage;
            this.toPlayerVillage = toPlayerVillage;
        }

        LinkedList<String> walkUpFiles = new LinkedList<>();
        walkUpFiles.add("/animations/vampire/up/vampireWalk1.png");
        walkUpFiles.add("/animations/vampire/up/vampireIdle.png");
        walkUpFiles.add("/animations/vampire/up/vampireWalk2.png");
        walkUpFiles.add("/animations/vampire/up/vampireIdle.png");

        LinkedList<String> walkDownFiles = new LinkedList<>();
        walkDownFiles.add("/animations/vampire/down/vampireWalk1.png");
        walkDownFiles.add("/animations/vampire/down/vampireIdle.png");
        walkDownFiles.add("/animations/vampire/down/vampireWalk2.png");
        walkDownFiles.add("/animations/vampire/down/vampireIdle.png");

        LinkedList<String> walkLeftFiles = new LinkedList<>();
        walkLeftFiles.add("/animations/vampire/left/vampireWalk1.png");
        walkLeftFiles.add("/animations/vampire/left/vampireIdle.png");
        walkLeftFiles.add("/animations/vampire/left/vampireWalk2.png");
        walkLeftFiles.add("/animations/vampire/left/vampireIdle.png");

        LinkedList<String> walkRightFiles = new LinkedList<>();
        walkRightFiles.add("/animations/vampire/right/vampireWalk1.png");
        walkRightFiles.add("/animations/vampire/right/vampireIdle.png");
        walkRightFiles.add("/animations/vampire/right/vampireWalk2.png");
        walkRightFiles.add("/animations/vampire/right/vampireIdle.png");

        LinkedList<String> stopUpFiles = new LinkedList<>();
        stopUpFiles.add("/animations/vampire/up/vampireIdle.png");
        stopUpFiles.add("/animations/vampire/up/vampireIdle.png"); 

        LinkedList<String> stopDownFiles = new LinkedList<>();
        stopDownFiles.add("/animations/vampire/down/vampireIdle.png");
        stopDownFiles.add("/animations/vampire/down/vampireIdle.png"); 

        LinkedList<String> stopLeftFiles = new LinkedList<>();
        stopLeftFiles.add("/animations/vampire/left/vampireIdle.png");
        stopLeftFiles.add("/animations/vampire/left/vampireIdle.png");

        LinkedList<String> stopRightFiles = new LinkedList<>();
        stopRightFiles.add("/animations/vampire/right/vampireIdle.png");
        stopRightFiles.add("/animations/vampire/right/vampireIdle.png");

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
        for (Wall wall : walls) {
            if (wall != null) {
                if (detector.isOverLapping(wall)) {
                    reactor.stickTo(wall);
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
        for (House house : houses) {
            if (house != null) {
                if (detector.isOverLapping(house)) {
                    reactor.stickTo(house);
                }
            }
        }
    }

    /**
     * checks to see if the hero is overlapping with an enemy
     */
    private void checkEnemies() {
        if (cyborgs != null) {
            for (Cyborg cyborg : cyborgs) {
                if (detector.isOverLapping(cyborg)) {
                    cyborg.sprite.setLocation(10000, 10000);
                    cyborg.update();
                    engine.pause(); 
                    BattleUI battle = new BattleUI(engine, this, cyborg); 
                }
            }
        }
        if (nails != null) {
            for (Nail nail : nails) {
                if (detector.isOverLapping(nail)) {
                    nail.sprite.setLocation(10000, 10000);
                    nail.update();
                    engine.pause(); 
                    BattleUI battle = new BattleUI(engine, this, nail); 
                }
            }
        }
        if (rampages != null) {
            for (Rampage rampage : rampages) {
                if (detector.isOverLapping(rampage)) {
                    rampage.sprite.setLocation(10000, 10000);
                    rampage.update();
                    engine.pause(); 
                    BattleUI battle = new BattleUI(engine, this, rampage); 
                }
            }
        }
    }

    @Override
    public void attack1() {
        System.out.println("life steal (10%)");
    }
    
    @Override
    public void attack2() {
        System.out.println("make enemy bleed");
    }
    
    @Override
    public void attack3() {
        System.out.println("stun enemy");
    }
    
    @Override
    public void attack4() {
        System.out.println("raise defence for three attacks and stop punching, after the third attack do x3 damage");
    }

    private void createTimers() {
        attack1Cooldown = new Timer(attack1CooldownTime, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                attack1Cooldown.stop();
            }
        }); 
        attack2Cooldown = new Timer(attack2CooldownTime, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                attack2Cooldown.stop();
            }
        }); 
        attack3Cooldown = new Timer(attack3CooldownTime, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                attack3Cooldown.stop();
            }
        }); 
        attack4Cooldown = new Timer(attack4CooldownTime, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                attack4Cooldown.stop();
            }
        }); 
    }

}
