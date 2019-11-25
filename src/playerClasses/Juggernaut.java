package playerClasses;

import collections.LinkedList;
import nuetral.trainers.Trainer;
import enemyClasses.Cyborg;
import enemyClasses.Nail;
import enemyClasses.Rampage;
import objects.Grass;
import objects.Wall;
import objects.NextLevelBlock;
import objects.House;
import game.CharacterData;
import game.gametools.Directions;
import game.gametools.GameCharacter;
import game.gametools.Animation;
import game.GameEngine;
import game.Icons;
import maps.Map1;
import maps.Map2;
import maps.Map4;
import maps.Map3;
import maps.Map5;
import jframes.Upgrade;
import jframes.BattleUI;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class Juggernaut extends GameCharacter {

    private LinkedList<Cyborg>         cyborgs;
    private LinkedList<Nail>           nails;
    private LinkedList<Rampage>        rampages;
    private LinkedList<Wall>           walls;
    private LinkedList<Grass>          grass;
    private LinkedList<House>          houses;
    private LinkedList<NextLevelBlock> nextLevelBlocks;
    private LinkedList<Trainer>        trainers;
    
    private GameEngine engine;
    private BattleUI   battleUI;

    public final String NAME = "Juggernaut";
    public String attack1    = "Unbreakable";
    public String attack2    = "Intimitate";
    public String attack3    = "Unstoppable";
    public String attack4    = "Bash";
    public String passive    = "Iron Skin";
    public String ultimate   = "Invincible";

    private JFrame currentMap;
    private JFrame previousMap;
    private int    currentMapNumber;
    private int    previousMapNumber;

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
     * @param currentMapNumber
     * @param previousMapNumber
     * @param trainers
     */
    public Juggernaut(
            JLabel heroImage,
            LinkedList<Wall> walls, LinkedList<House> houses,
            LinkedList<Cyborg> cyborgs, LinkedList<Nail> nails, LinkedList<Rampage> rampages,
            LinkedList<NextLevelBlock> nextLevelBlock,
            GameEngine engine, boolean hasBeenCreated,
            JFrame currentMap, JFrame previousMap,
            int currentMapNumber, int previousMapNumber,
            LinkedList<Trainer> trainers) {
        super(heroImage, 100, Directions.STOP, Directions.FOUR_DIRECTIONS, 100);

        this.currentMap        = currentMap;
        this.previousMap       = previousMap;
        this.currentMapNumber  = currentMapNumber;
        this.previousMapNumber = previousMapNumber;

        this.engine          = engine;
        this.cyborgs         = cyborgs;
        this.nails           = nails;
        this.rampages        = rampages;
        this.walls           = walls;
        this.houses          = houses;
        this.nextLevelBlocks = nextLevelBlock;
        this.trainers        = trainers;

        super.playerAttack1Name  = attack1;
        super.playerAttack2Name  = attack2;
        super.playerAttack3Name  = attack3;
        super.playerAttack4Name  = attack4;
        super.playerPassiveName  = passive;
        super.playerUltimateName = ultimate;
        super.playerBattleBack   = Icons.GAMBLER_BATTLE_BACK;
        super.playerBattleFront  = Icons.GAMBLER_BATTLE_FRONT;

        final int[] DEFAULTS = {5, 5, 100, 100, 1000, 1, 0, 0};
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

        attack1Duration = (punchSpeed * 3);
        attack2Duration = (punchSpeed * 3);
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
        walkUpFiles.add(Icons.JUGGERNAUT_WALK_UP_1);
        walkUpFiles.add(Icons.JUGGERNAUT_IDLE_UP);
        walkUpFiles.add(Icons.JUGGERNAUT_WALK_UP_2);
        walkUpFiles.add(Icons.JUGGERNAUT_IDLE_UP);

        LinkedList<String> walkDownFiles = new LinkedList<>();
        walkDownFiles.add(Icons.JUGGERNAUT_WALK_DOWN_1);
        walkDownFiles.add(Icons.JUGGERNAUT_IDLE_DOWN);
        walkDownFiles.add(Icons.JUGGERNAUT_WALK_DOWN_2);
        walkDownFiles.add(Icons.JUGGERNAUT_IDLE_DOWN);

        LinkedList<String> walkLeftFiles = new LinkedList<>();
        walkLeftFiles.add(Icons.JUGGERNAUT_WALK_LEFT_1);
        walkLeftFiles.add(Icons.JUGGERNAUT_IDLE_LEFT);
        walkLeftFiles.add(Icons.JUGGERNAUT_WALK_LEFT_2);
        walkLeftFiles.add(Icons.JUGGERNAUT_IDLE_LEFT);

        LinkedList<String> walkRightFiles = new LinkedList<>();
        walkRightFiles.add(Icons.JUGGERNAUT_WALK_RIGHT_1);
        walkRightFiles.add(Icons.JUGGERNAUT_IDLE_RIGHT);
        walkRightFiles.add(Icons.JUGGERNAUT_WALK_RIGHT_2);
        walkRightFiles.add(Icons.JUGGERNAUT_IDLE_RIGHT);

        LinkedList<String> stopUpFiles = new LinkedList<>();
        stopUpFiles.add(Icons.JUGGERNAUT_IDLE_UP);
        stopUpFiles.add(Icons.JUGGERNAUT_IDLE_UP);

        LinkedList<String> stopDownFiles = new LinkedList<>();
        stopDownFiles.add(Icons.JUGGERNAUT_IDLE_DOWN);
        stopDownFiles.add(Icons.JUGGERNAUT_IDLE_DOWN);

        LinkedList<String> stopLeftFiles = new LinkedList<>();
        stopLeftFiles.add(Icons.JUGGERNAUT_IDLE_LEFT);
        stopLeftFiles.add(Icons.JUGGERNAUT_IDLE_LEFT);

        LinkedList<String> stopRightFiles = new LinkedList<>();
        stopRightFiles.add(Icons.JUGGERNAUT_IDLE_RIGHT);
        stopRightFiles.add(Icons.JUGGERNAUT_IDLE_RIGHT);

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
        battleUI.enemyDamage /= 2;
    }

    @Override
    public void attack2() {
        battleUI.enemyDamage /= 2;
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
        battleUI.enemyDamage = battleUI.enemyBaseDamage;
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
