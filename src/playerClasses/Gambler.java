package playerClasses;

import game.CharacterData;
import collections.LinkedList;
import enemyClasses.Cyborg;
import enemyClasses.Nail;
import enemyClasses.Rampage;
import jframes.BattleUI;
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
import javax.swing.JFrame;
import maps.Map1;
import maps.Map2;
import maps.Map4;
import maps.Map3;
import javax.swing.JLabel;
import maps.Map5;
import jframes.Upgrade;
import nuetral.trainers.Trainer;
import objects.House;

public class Gambler extends GameCharacter {

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

    public final String NAME = "Gambler";

    /**
     * Class: Gambler Ability 1: Coin flip, raises or lowers a random stat by _%
     * for _ seconds Ability 2: Risk, has a chance to take reduced or more
     * damage for _ seconds Ablilty 3: Bribe, costs gold but stuns the enemy for
     * _ seconds Ability 4: Rob, next hit give you gold Passive: Lucky, gains
     * more gold after battles Ultimate: Gamble, has a chance to: immense damage
     * to the enemy, decent damage to yourself, causes ALL stats (player and
     * enemy) to be random (between the min and max) for _ seconds // GENIOUS
     * IDEA: slot machine appears when you use your ultimate
    *
     */
    public String attack1 = "Coin flip";
    public String attack2 = "Risk";
    public String attack3 = "Bribe";
    public String attack4 = "Rob";
    public String passive = "Lucky";
    public String ultimate = "Gamble";

    public static final String INFORMATION_ICON  = "/animations/formBackgrounds/characterInformationGambler.png";
    public static final String IDLE_ICON         = "/animations/playerClasses/gambler/gamblerRightIdle.png";
    public static final String BATTLE_BACK_ICON  = "/animations/playerClasses/gambler/gamblerFightBack.png";
    public static final String BATTLE_FRONT_ICON = "/animations/playerClasses/gambler/gamblerFightFront.png";

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
     * Creates a "gambler"
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
    public Gambler(
            JLabel heroImage,
            LinkedList<Wall> walls, LinkedList<House> houses,
            LinkedList<Cyborg> cyborgs, LinkedList<Nail> nails, LinkedList<Rampage> rampages,
            LinkedList<NextLevelBlock> nextLevelBlock,
            GameEngine engine, boolean hasBeenCreated,
            JFrame currentMap, JFrame previousMap,
            int currentMapNumber, int previousMapNumber,
            LinkedList<Trainer> trainers) throws MalformedURLException {
        super(heroImage, 25, Directions.STOP, Directions.FOUR_DIRECTIONS, 100);

        this.currentMap = currentMap;
        this.previousMap = previousMap;
        this.currentMapNumber = currentMapNumber;
        this.previousMapNumber = previousMapNumber;

        this.engine = engine;
        this.walls = walls;
        this.houses = houses;
        this.nextLevelBlocks = nextLevelBlock;

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

        attack1Duration = (punchSpeed * 3);
        attack2Duration = (punchSpeed * 3);
        attack3Duration = punchSpeed;
        attack4Duration = punchSpeed;

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
