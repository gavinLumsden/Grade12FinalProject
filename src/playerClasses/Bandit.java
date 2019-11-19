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
import game.Icons;
import game.gametools.Animation;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import jframes.BattleUI;
import javax.swing.JFrame;
import maps.Map1;
import javax.swing.JLabel;
import maps.Map2;
import maps.Map3;
import maps.Map4;
import maps.Map5;
import jframes.Upgrade;
import nuetral.trainers.Trainer;
import objects.House;

/**
 * Bandit.java - Represents a "bandit" object
 *
 * @author g.lumsden
 * @since 14-May-2019
 */
public class Bandit extends GameCharacter {

    private LinkedList<Cyborg> cyborgs;
    private LinkedList<Nail> nails;
    private LinkedList<Rampage> rampages;

    private GameEngine engine;
    private BattleUI battleUI;

    private LinkedList<Wall> walls;
    private LinkedList<Grass> grass;
    private LinkedList<House> houses;
    private LinkedList<NextLevelBlock> nextLevelBlocks;
    private LinkedList<Trainer> trainers;

    public final String NAME = "Bandit";

    /**
     * Class: Bandit Ability 1: Swift, increases dodge stat by _ for _ seconds
     * Ability 2: Poison, slows the enemy down by _for _ seconds Ablilty 3:
     * Stab, makes the enemy bleed for _ seconds Ability 4: Evade, 100% to dodge
     * the next _ attacks Passive: Back Stab, when you dodge an attack you have
     * a _% chance to hit the enemy back Ultimate: Elusive, raises dodge stat by
     * _ for the rest of the battle
     */
    public String attack1 = "Swift";
    public String attack2 = "Poison";
    public String attack3 = "Stab";
    public String attack4 = "Evade";
    public String passive = "Back Stab";
    public String ultimate = "Elusive";

    public static String abilitiesInformation
            = "* Class: Bandit\n"
            + "* Ability 1: Swift,     increases dodge stat by _ for _ seconds\n"
            + "* Ability 2: Poison,    slows the enemy down by _for _ seconds\n"
            + "* Ablilty 3: Stab,      makes the enemy bleed for _ seconds\n"
            + "* Ability 4: Evade,     100% to dodge the next _ attacks\n"
            + "* Passive:   Back Stab, when you dodge an attack you have a _% chance to hit the enemy back\n"
            + "* Ultimate:  Elusive,   raises dodge stat by _ for the rest of the battle\n";

    public static final String INFORMATION_ICON  = Icons.CHARACTER_INFORMATION_BANDIT;
    public static final String IDLE_ICON         = Icons.BANDIT_IDLE_DOWN;
    public static final String BATTLE_BACK_ICON  = Icons.BANDIT_BATTLE_BACK;
    public static final String BATTLE_FRONT_ICON = Icons.BANDIT_BATTLE_FRONT;

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
            LinkedList<Trainer> trainers) throws MalformedURLException {
        super(heroImage, 100, Directions.STOP, Directions.FOUR_DIRECTIONS, 100);

        this.currentMap = currentMap;
        this.previousMap = previousMap;
        this.currentMapNumber = currentMapNumber;
        this.previousMapNumber = previousMapNumber;

        this.engine = engine;
        this.walls = walls;
        this.houses = houses;
        this.nextLevelBlocks = nextLevelBlock;
        this.trainers = trainers;

        this.cyborgs = cyborgs;
        this.nails = nails;
        this.rampages = rampages;

        super.playerAttack1Name = attack1;
        super.playerAttack2Name = attack2;
        super.playerAttack3Name = attack3;
        super.playerAttack4Name = attack4;
        super.playerPassiveName = passive;
        super.playerUltimateName = ultimate;
        super.playerBattleBack = BATTLE_BACK_ICON;
        super.playerBattleFront = BATTLE_FRONT_ICON;

        final int[] DEFAULTS = {5, 5, 100, 100, 1000, 1, 0, 0};
        int stats[] = new int[DEFAULTS.length];
        stats = CharacterData.check(this, hasBeenCreated, stats, DEFAULTS);
        damage = stats[0];
        dodgeChance = stats[1];
        health = stats[2];
        maxHealth = stats[3];
        punchSpeed = stats[4];
        level = stats[5];
        exp = stats[6];
        gold = stats[7];

        attack1Cooldown = 3000;
        attack2Cooldown = 3000;
        attack3Cooldown = 5000;
        attack4Cooldown = 10000;

        attack1Duration = punchSpeed;
        attack2Duration = punchSpeed;
        attack3Duration = punchSpeed;
        attack4Duration = (punchSpeed * 3);

        super.playerDamage = damage;
        super.playerDodgeChance = dodgeChance;
        super.playerHealth = health;
        super.playerMaxHealth = maxHealth;
        super.playerPunchSpeed = punchSpeed;

        super.playerLevel = level;
        super.exp = exp;
        super.gold = gold;

        super.attack1Cooldown = attack1Cooldown;
        super.attack2Cooldown = attack2Cooldown;
        super.attack3Cooldown = attack3Cooldown;
        super.attack4Cooldown = attack4Cooldown;

        super.attack1Duration = attack1Duration;
        super.attack2Duration = attack2Duration;
        super.attack3Duration = attack3Duration;
        super.attack4Duration = attack4Duration;

        super.playerName = NAME;
        
        URL walkUp1 = new URL(Icons.BANDIT_WALK_UP_1); 
        URL walkUp2 = new URL(Icons.BANDIT_WALK_UP_2); 
        URL idleUp  = new URL(Icons.BANDIT_IDLE_UP); 
        
        URL walkDown1 = new URL(Icons.BANDIT_WALK_DOWN_1); 
        URL walkDown2 = new URL(Icons.BANDIT_WALK_DOWN_2); 
        URL idleDown  = new URL(Icons.BANDIT_IDLE_DOWN); 
        
        URL walkLeft1 = new URL(Icons.BANDIT_WALK_LEFT_1); 
        URL walkLeft2 = new URL(Icons.BANDIT_WALK_LEFT_2); 
        URL idleLeft  = new URL(Icons.BANDIT_IDLE_LEFT); 
        
        URL walkRight1 = new URL(Icons.BANDIT_WALK_RIGHT_1); 
        URL walkRight2 = new URL(Icons.BANDIT_WALK_RIGHT_2); 
        URL idleRight  = new URL(Icons.BANDIT_IDLE_RIGHT); 

        LinkedList<URL> walkUpFiles = new LinkedList<>();
        walkUpFiles.add(walkUp1);
        walkUpFiles.add(idleUp);
        walkUpFiles.add(walkUp2);
        walkUpFiles.add(idleUp);

        LinkedList<URL> walkDownFiles = new LinkedList<>();
        walkDownFiles.add(walkDown1);
        walkDownFiles.add(idleDown);
        walkDownFiles.add(walkDown2);
        walkDownFiles.add(idleDown);

        LinkedList<URL> walkLeftFiles = new LinkedList<>();
        walkLeftFiles.add(walkLeft1);
        walkLeftFiles.add(idleLeft);
        walkLeftFiles.add(walkLeft2);
        walkLeftFiles.add(idleLeft);

        LinkedList<URL> walkRightFiles = new LinkedList<>();
        walkRightFiles.add(walkRight1);
        walkRightFiles.add(idleRight);
        walkRightFiles.add(walkRight2);
        walkRightFiles.add(idleRight);

        LinkedList<URL> stopUpFiles = new LinkedList<>();
        stopUpFiles.add(idleUp);
        stopUpFiles.add(idleUp);

        LinkedList<URL> stopDownFiles = new LinkedList<>();
        stopDownFiles.add(idleDown);
        stopDownFiles.add(idleDown);

        LinkedList<URL> stopLeftFiles = new LinkedList<>();
        stopLeftFiles.add(idleLeft);
        stopLeftFiles.add(idleLeft);

        LinkedList<URL> stopRightFiles = new LinkedList<>();
        stopRightFiles.add(idleRight);
        stopRightFiles.add(idleRight);

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
        try {
            mover.move();
            animate();
            boolean check = checkWalls();
            if (check) check = checkNextLevelBlocks();
            if (check) check = checkHouses();
            if (check) check = checkEnemies();
            if (check) check = checkTrainers();
            redraw();
        } catch (MalformedURLException ex) {
            Logger.getLogger(Juggernaut.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    private boolean checkNextLevelBlocks() throws MalformedURLException {
        for (int i = 0; i < nextLevelBlocks.size(); i++) {
            if (nextLevelBlocks.get(i) != null) {
                if (detector.isOverLapping(nextLevelBlocks.get(i))) {
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
        if (trainers != null) {
            for (int i = 0; i < trainers.size(); i++) {
                if (detector.isOverLapping(trainers.get(i))) {
                    engine.pause();
                    Upgrade upgrade = new Upgrade(trainers.get(i));
                    return false;
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
