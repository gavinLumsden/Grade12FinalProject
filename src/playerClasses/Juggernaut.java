package playerClasses;

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
import game.Globals;
import game.gametools.Animation;
import maps.Spawn;
import maps.Main;
import maps.EnemyVillage;
import maps.PlayerVillage;
import javax.swing.JLabel;

public class Juggernaut extends GameCharacter {

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

    private NextLevelBlock toSpawn;
    private NextLevelBlock toEnemyVillage;
    private NextLevelBlock toPlayerVillage;
    private NextLevelBlock toMain;

    private boolean hasTravelledToMain = false;
    private boolean hasTravelledToSpawn = false;
    private boolean hasTravelledToEnemyVillage = false;
    private boolean hasTravelledToPlayerVillage = false;

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
            Wall[] walls,
            Cyborg[] cyborgs, Nail[] nails, Rampage[] rampages,
            NextLevelBlock toMain, NextLevelBlock toSpawn, NextLevelBlock toEnemyVillage, NextLevelBlock toPlayerVillage,
            GameEngine engine) {
        super(heroImage, 25, Directions.STOP, Directions.FOUR_DIRECTIONS, 100);

        this.engine = engine;
        this.walls = walls;

        this.cyborgs = cyborgs;
        this.nails = nails;
        this.rampages = rampages;

        if (engine.map.equals("spawn") || engine.map.equals("enemy village") || engine.map.equals("player village")) {
            this.toMain = toMain;
        } else if (engine.map.equals("ui")) {
            this.toSpawn = toSpawn;
            this.toEnemyVillage = toEnemyVillage;
            this.toPlayerVillage = toPlayerVillage;
        }

        LinkedList<String> walkFiles = new LinkedList<>();
        walkFiles.add("/animations/juggernautWalk1.png");
        walkFiles.add("/animations/juggernautIdle.png");
        walkFiles.add("/animations/juggernautWalk2.png");
        walkFiles.add("/animations/juggernautIdle.png");

        LinkedList<String> stopFiles = new LinkedList<>();
        stopFiles.add("/animations/juggernautIdle.png");

        Animation walkAnimation = new Animation(heroImage, walkFiles, super.WALK_DELAY, true);
        Animation stopAnimation = new Animation(heroImage, stopFiles, super.IDLE_DELAY, true);

        LinkedList<Animation> animations = new LinkedList<>();
        animations.add(walkAnimation);
        animations.add(stopAnimation);

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
        checkEnemies();
        checkNextLevelBlocks();
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

    /**
     * checks to see if the hero is overlapping with an enemy
     */
    private void checkEnemies() {
        if (cyborgs != null) {
            for (Cyborg cyborg : cyborgs) {
                if (detector.isOverLapping(cyborg)) {
                    Globals.points++;
                    cyborg.sprite.setLocation(10000, 10000);
                    cyborg.update();
                }
            }
        }
        if (nails != null) {
            for (Nail nail : nails) {
                if (detector.isOverLapping(nail)) {
                    Globals.points++;
                    nail.sprite.setLocation(10000, 10000);
                    nail.update();
                }
            }
        }
        if (rampages != null) {
            for (Rampage rampage : rampages) {
                if (detector.isOverLapping(rampage)) {
                    Globals.points++;
                    rampage.sprite.setLocation(10000, 10000);
                    rampage.update();
                }
            }
        }
    }

}
