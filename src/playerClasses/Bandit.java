package playerClasses;

import game.CharacterData;
import collections.LinkedList;
import enemyClasses.Cyborg;
import enemyClasses.Nail;
import enemyClasses.Rampage;
import objects.Grass;
import objects.Wall;
import objects.NextLevelBlock;
import game.gametools.Directions;
import game.gametools.GameCharacter;
import game.GameEngine;
import game.gametools.Animation;
import jframes.BattleUI; 
import javax.swing.JFrame;
import maps.Map1;
import javax.swing.JLabel;
import maps.Map2;
import maps.Map3;
import maps.Map4;
import maps.Map5;
import maps.Upgrade;
import nuetral.trainers.Trainer;
import objects.House;

/**
 * Bandit.java - Represents a "bandit" object
 *
 * @author g.lumsden
 * @since 14-May-2019
 */
public class Bandit extends GameCharacter {

    private LinkedList<Cyborg>  cyborgs;
    private LinkedList<Nail>    nails;
    private LinkedList<Rampage> rampages; 

    private GameEngine engine;
    private BattleUI   battleUI; 
    
    private LinkedList<Wall>           walls;
    private LinkedList<Grass>          grass;
    private LinkedList<House>          houses; 
    private LinkedList<NextLevelBlock> nextLevelBlocks; 
    private LinkedList<Trainer>        trainers; 
    
    public final String NAME = "Bandit"; 
    
    /**
    * Class: Bandit
    * Ability 1: Swift,     increases dodge stat by _ for _ seconds
    * Ability 2: Poison,    slows the enemy down by _for _ seconds
    * Ablilty 3: Stab,      makes the enemy bleed for _ seconds
    * Ability 4: Evade,     100% to dodge the next _ attacks
    * Passive:   Back Stab, when you dodge an attack you have a _% chance to hit the enemy back
    * Ultimate:  Elusive,   raises dodge stat by _ for the rest of the battle
    */
    
    public String attack1  = "Swift"; 
    public String attack2  = "Poison"; 
    public String attack3  = "Stab"; 
    public String attack4  = "Evade"; 
    public String passive  = "Back Stab"; 
    public String ultimate = "Elusive"; 
    
    public static String abilitiesInformation = 
        "* Class: Bandit\n" +
        "* Ability 1: Swift,     increases dodge stat by _ for _ seconds\n" +
        "* Ability 2: Poison,    slows the enemy down by _for _ seconds\n" +
        "* Ablilty 3: Stab,      makes the enemy bleed for _ seconds\n" +
        "* Ability 4: Evade,     100% to dodge the next _ attacks\n" +
        "* Passive:   Back Stab, when you dodge an attack you have a _% chance to hit the enemy back\n" +
        "* Ultimate:  Elusive,   raises dodge stat by _ for the rest of the battle\n";
    
    public static final String INFORMATION_ICON  = "/animations/formBackgrounds/characterInformationBandit.png"; 
    public static final String IDLE_ICON         = "/animations/playerClasses/bandit/right/banditIdle.png"; 
    public static final String BATTLE_BACK_ICON  = "/animations/playerClasses/bandit/fightBack/fightBack.png";
    public static final String BATTLE_FRONT_ICON = "/animations/playerClasses/bandit/fightFront/fightFront.png";
    
    private JFrame currentMap; 
    private JFrame previousMap; 
        
    private int currentMapNumber; 
    private int previousMapNumber; 
    
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
    
    private boolean canTravel; 
    
    /**
     * Creates a "bandit"
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
     * @param currentMapNumber
     * @param previousMapNumber
     * @param trainers
     */
    public Bandit(
            JLabel heroImage,
            LinkedList<Wall> walls, LinkedList<House> houses, 
            LinkedList<Cyborg> cyborgs, LinkedList<Nail> nails, LinkedList<Rampage> rampages, 
            LinkedList<NextLevelBlock> nextLevelBlock, 
            GameEngine engine, boolean hasBeenCreated,
            JFrame currentMap, JFrame previousMap, 
            int currentMapNumber, int previousMapNumber,
            LinkedList<Trainer> trainers) {
        super(heroImage, 100, Directions.STOP, Directions.FOUR_DIRECTIONS, 100);

        canTravel = true; 
        
        this.currentMap        = currentMap; 
        this.previousMap       = previousMap; 
        this.currentMapNumber  = currentMapNumber; 
        this.previousMapNumber = previousMapNumber; 
        
        this.engine = engine;
        this.walls = walls;
        this.houses = houses; 
        this.nextLevelBlocks = nextLevelBlock; 
        this.trainers = trainers; 

        this.cyborgs = cyborgs;
        this.nails = nails;
        this.rampages = rampages;
        
        super.playerAttack1Name  = attack1; 
        super.playerAttack2Name  = attack2; 
        super.playerAttack3Name  = attack3; 
        super.playerAttack4Name  = attack4; 
        super.playerPassiveName  = passive; 
        super.playerUltimateName = ultimate; 
        super.playerBattleBack   = BATTLE_BACK_ICON; 
        super.playerBattleFront  = BATTLE_FRONT_ICON; 
        
        final int[] DEFAULTS = { 5,5,100,100,1000,1,0,0 };
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

        LinkedList<String> walkUpFiles = new LinkedList<>();
        walkUpFiles.add("/animations/playerclasses/bandit/up/banditWalk1.png");
        walkUpFiles.add("/animations/playerclasses/bandit/up/banditIdle.png");
        walkUpFiles.add("/animations/playerclasses/bandit/up/banditWalk2.png");
        walkUpFiles.add("/animations/playerclasses/bandit/up/banditIdle.png");

        LinkedList<String> walkDownFiles = new LinkedList<>();
        walkDownFiles.add("/animations/playerclasses/bandit/down/banditWalk1.png");
        walkDownFiles.add("/animations/playerclasses/bandit/down/banditIdle.png");
        walkDownFiles.add("/animations/playerclasses/bandit/down/banditWalk2.png");
        walkDownFiles.add("/animations/playerclasses/bandit/down/banditIdle.png");

        LinkedList<String> walkLeftFiles = new LinkedList<>();
        walkLeftFiles.add("/animations/playerclasses/bandit/left/banditWalk1.png");
        walkLeftFiles.add("/animations/playerclasses/bandit/left/banditIdle.png");
        walkLeftFiles.add("/animations/playerclasses/bandit/left/banditWalk2.png");
        walkLeftFiles.add("/animations/playerclasses/bandit/left/banditIdle.png");

        LinkedList<String> walkRightFiles = new LinkedList<>();
        walkRightFiles.add("/animations/playerclasses/bandit/right/banditWalk1.png");
        walkRightFiles.add("/animations/playerclasses/bandit/right/banditIdle.png");
        walkRightFiles.add("/animations/playerclasses/bandit/right/banditWalk2.png");
        walkRightFiles.add("/animations/playerclasses/bandit/right/banditIdle.png");

        LinkedList<String> stopUpFiles = new LinkedList<>();
        stopUpFiles.add("/animations/playerclasses/bandit/up/banditIdle.png");
        stopUpFiles.add("/animations/playerclasses/bandit/up/banditIdle.png");

        LinkedList<String> stopDownFiles = new LinkedList<>();
        stopDownFiles.add("/animations/playerclasses/bandit/down/banditIdle.png");
        stopDownFiles.add("/animations/playerclasses/bandit/down/banditIdle.png");

        LinkedList<String> stopLeftFiles = new LinkedList<>();
        stopLeftFiles.add("/animations/playerclasses/bandit/left/banditIdle.png");
        stopLeftFiles.add("/animations/playerclasses/bandit/left/banditIdle.png");

        LinkedList<String> stopRightFiles = new LinkedList<>();
        stopRightFiles.add("/animations/playerclasses/bandit/right/banditIdle.png");
        stopRightFiles.add("/animations/playerclasses/bandit/right/banditIdle.png");

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
        boolean check = checkWalls();
        if (check) check = checkNextLevelBlocks();
        if (check) check = checkHouses(); 
        if (check) check = checkEnemies();
        if (check) check = checkTrainers();
        redraw();
    }

    /**
     * checks to see if the hero is overlapping with a wall
     */
    private boolean checkWalls() {
        for (int i = 0; i < walls.size(); i++) {
            if (walls.get(i) != null) {
                if (detector.isOverLapping(walls.get(i))) {
                    reactor.stickTo(walls.get(i));
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * checks to see if the hero is overlapping with a next level block
     */
    private boolean checkNextLevelBlocks() {
        for (int i = 0; i < nextLevelBlocks.size(); i++) {
            if (nextLevelBlocks.get(i) != null) {
                if (detector.isOverLapping(nextLevelBlocks.get(i))){
                    engine.clearCurrentMap(); 
                    if (nextLevelBlocks.get(i).mapToGoTo.equals("1")) {
                        timer.stop(); 
                        Map1 map1 = new Map1(currentMapNumber, engine); 
                    } else if (nextLevelBlocks.get(i).mapToGoTo.equals("2")) {
                        timer.stop(); 
                        Map2 map2 = new Map2(currentMapNumber, engine); 
                    } else if (nextLevelBlocks.get(i).mapToGoTo.equals("3")) {
                        timer.stop(); 
                        Map3 map3 = new Map3(currentMapNumber, engine); 
                    } else if (nextLevelBlocks.get(i).mapToGoTo.equals("4")) {
                        timer.stop(); 
                        Map4 map4 = new Map4(currentMapNumber, engine); 
                    } else if (nextLevelBlocks.get(i).mapToGoTo.equals("5")) {
                        timer.stop(); 
                        Map5 map5 = new Map5(currentMapNumber, engine); 
                    } else {
                        System.out.println("error creating map");
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
    /**
     * checks to see if the hero is overlapping with a house
     */
    private boolean checkHouses() {
        for (int i = 0; i < houses.size(); i++) {
            if (houses.get(i) != null) {
                if (detector.isOverLapping(houses.get(i))) {
                    reactor.stickTo(houses.get(i));
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * checks to see if the hero is overlapping with an enemy
     */
    private boolean checkEnemies() {
        if (cyborgs != null) {
            for (int i = 0; i < cyborgs.size(); i++) {
                if (detector.isOverLapping(cyborgs.get(i))) {
                    cyborgs.get(i).sprite.setLocation(10000, 10000);
                    cyborgs.get(i).update();
                    engine.pause(); 
                    BattleUI battleUI = new BattleUI(engine, this, cyborgs.get(i)); 
                    this.battleUI = battleUI; 
                    return false;
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
                    return false;
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
                    return false;
                }
            }
        } 
        return true;
    }

    private boolean checkTrainers() {
        if (canTravel == true) { 
            if (trainers != null) {
                for (int i = 0; i < trainers.size(); i++) {
                    if (detector.isOverLapping(trainers.get(i))) {
                        canTravel = false; 
                        engine.pause();
                        Upgrade upgrade = new Upgrade(trainers.get(i)); 
                        return false; 
                    }
                }
            }
        }
        return true; 
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
