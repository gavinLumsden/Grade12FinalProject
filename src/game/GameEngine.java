package game;

import collections.LinkedList;
import objects.NextLevelBlock;
import objects.Grass;
import objects.Wall;
import enemyClasses.Cyborg;
import enemyClasses.Nail;
import enemyClasses.Rampage;
import game.gametools.Directions;
import game.gametools.MediaPlayer;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import nuetral.shopkeeper.Shopkeeper;
import nuetral.trainers.DamageTrainer;
import nuetral.trainers.DodgeTrainer;
import nuetral.trainers.HealthTrainer;
import nuetral.trainers.SpeedTrainer;
import nuetral.trainers.Trainer;
import objects.House;

/**
 * GameEngine.java - Represents an "engine" that controls many things to do with
 * forms, heros and enemies
 *
 * @author g.lumsden
 * @since 12-Jun-2019
 */
public class GameEngine {

    // enemies
    private LinkedList<Cyborg> cyborgs;
    private LinkedList<Nail> nails;
    private LinkedList<Rampage> rampages;

    // shopkeepers 
    private LinkedList<Shopkeeper> shopkeepers;

    // trainers 
    private LinkedList<Trainer> trainers;

    // hero
    public Hero hero;

    // objects
    private LinkedList<Wall> walls;
    private LinkedList<Grass> grass;
    private LinkedList<House> houses;

    // used to play music
    public MediaPlayer mediaPlayer;

    // form width and height for the introduction
    private final int INTRO_FORM_WIDTH = 416;
    private final int INTRO_FORM_HEIGHT = 319;

    // what map (name) the player is on
    public String currentMapName;
    public String previousMapName;

    // what map the player is on
    public JFrame currentMap;
    public JFrame previousMap;

    private boolean moveable;
    private boolean hasBeenCreated;

    /**
     * creates a game engine
     */
    public GameEngine() {
        mediaPlayer = new MediaPlayer();
        hasBeenCreated = false;
    }

    /**
     * when the player presses a key
     *
     * @param evt
     */
    public void keyPress(KeyEvent evt) {
        if (moveable == true) {
            hero.keyPress(evt);
        }
    }

    /**
     * when the player releases a key
     *
     * @param evt
     */
    public void keyRelease(KeyEvent evt) {
        if (moveable == true) {
            hero.keyRelease(evt);
        }
    }

    /**
     * creates a game object
     *
     * @param images
     * @param objectToCreate
     */
    public void createGameObject(LinkedList<JLabel> images, String objectToCreate) {
        if (objectToCreate.equals("grass")) {
            grass = new LinkedList<>();
            for (int i = 0; i < images.size(); i++) {
                Grass newGrass = new Grass(images.get(i));
                grass.add(newGrass);
            }
        }
        if (objectToCreate.equals("walls")) {
            walls = new LinkedList<>();
            for (int i = 0; i < images.size(); i++) {
                Wall newWall = new Wall(images.get(i));
                walls.add(newWall);
            }
        }
        if (objectToCreate.equals("houses")) {
            houses = new LinkedList<>();
            for (int i = 0; i < images.size(); i++) {
                House newHouse = new House(images.get(i));
                houses.add(newHouse);
            }
        }
    }

    /**
     * creates game character 
     * 
     * @param images
     * @param characterToCreate 
     */
    public void createGameCharacter(LinkedList<JLabel> images, String characterToCreate) {
        if (characterToCreate.equals("shopkeepers")) {
            shopkeepers = new LinkedList<>();
            for (int i = 0; i < shopkeepers.size(); i++) {
                Shopkeeper newShopkeeper = new Shopkeeper(images.get(i));
                shopkeepers.add(newShopkeeper);
            }
        }
        if (characterToCreate.equals("trainers")) {
            trainers = new LinkedList<>();
            DamageTrainer newDamageTrainer = new DamageTrainer(images.get(0));
            DodgeTrainer newDodgeTrainer = new DodgeTrainer(images.get(1));
            HealthTrainer newHealthTrainer = new HealthTrainer(images.get(2));
            SpeedTrainer newSpeedTrainer = new SpeedTrainer(images.get(3));
            trainers.add(newDamageTrainer);
            trainers.add(newDodgeTrainer);
            trainers.add(newHealthTrainer);
            trainers.add(newSpeedTrainer);
        }
        if (characterToCreate.equals("cyborgs")) {
            cyborgs = new LinkedList<>();
            for (int i = 0; i < images.size(); i++) {
                Cyborg newCyborg = new Cyborg(images.get(i), 25, Directions.STOP, 4, 100);
                cyborgs.add(newCyborg);
            }
        }
        if (characterToCreate.equals("nails")) {
            nails = new LinkedList<>();
            for (int i = 0; i < images.size(); i++) {
                Nail newNail = new Nail(images.get(i), 25, Directions.STOP, 4, 100);
                nails.add(newNail);
            }
        }
        if (characterToCreate.equals("rampages")) {
            rampages = new LinkedList<>();
            for (int i = 0; i < images.size(); i++) {
                Rampage newRampage = new Rampage(images.get(i), 25, Directions.STOP, 4, 100);
                rampages.add(newRampage);
            }
        }
    }

    /**
     * creates the hero on the form
     *
     * @param heroImage
     * @param nextLevelBlocks
     */
    public void createHero(JLabel heroImage, LinkedList<NextLevelBlock> nextLevelBlocks) {
        hero = new Hero(heroImage,
                walls, houses,
                cyborgs, nails, rampages,
                nextLevelBlocks,
                this, hasBeenCreated,
                currentMap, previousMap,
                currentMapName, previousMapName,
                trainers);
        hasBeenCreated = true;
        hero.update();
    }

    /**
     * Pauses the game
     */
    public void pause() {
        //stop the animaitons and moving
        moveable = false;
        hero.heroClass.sprite.stop();
        hero.heroClass.mover.stop();
    }

    /**
     * Plays the game
     */
    public void play() {
        moveable = true;
    }

    /**
     * creates the intro form
     *
     * @param intro
     */
    public void createIntro(Introduction intro) {
        mediaPlayer.playWAV("/sounds/introSoundtrack.wav");
        intro.setSize(INTRO_FORM_WIDTH, INTRO_FORM_HEIGHT);
        intro.setLocationRelativeTo(null);
        intro.setResizable(false);
        intro.setVisible(true);
    }

    /**
     * creates a map
     *
     * @param map
     * @param formWidth
     * @param formHeight
     * @param mapName
     */
    public void createMap(JFrame map, int formWidth, int formHeight, String mapName) {
        map.setSize(formWidth, formHeight);
        map.setResizable(false);
        map.setLocationRelativeTo(null);
        map.setVisible(true);
        previousMapName = currentMapName;
        previousMap = currentMap;
        currentMap = map;
        currentMapName = mapName;
        moveable = true;
    }

    /**
     * clears a map
     *
     * @param map
     */
    public void clearMap(JFrame map) {
        map.dispose();
    }

    /**
     * clears the current map
     */
    public void clearCurrentMap() {
        if (currentMap != null) {
            currentMap.dispose();
        }
    }

    /**
     * clears the previous map
     */
    public void clearPreviousMap() {
        if (previousMap != null) {
            previousMap.dispose();
        }
    }
    
}
