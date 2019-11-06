package game;

import collections.LinkedList;
import objects.NextLevelBlock;
import objects.Grass;
import objects.Wall;
import enemyClasses.Cyborg;
import enemyClasses.Engineer;
import enemyClasses.Hammer;
import enemyClasses.Kingpin;
import enemyClasses.Nail;
import enemyClasses.Rampage;
import enemyClasses.Trickster;
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
    private LinkedList<Cyborg>    cyborgs;
    private LinkedList<Engineer>  engineers;
    private LinkedList<Hammer>    hammers;
    private LinkedList<Kingpin>   kingpins;
    private LinkedList<Nail>      nails;
    private LinkedList<Rampage>   rampages;
    private LinkedList<Trickster> tricksters;

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
    public int currentMapNumber;
    public int previousMapNumber;

    // what map the player is on
    public JFrame currentMap;
    public JFrame previousMap;

    private boolean moveable;
    private boolean hasBeenCreated;
    private boolean paused; 

    /**
     * creates a game engine
     */
    public GameEngine() {
        mediaPlayer = new MediaPlayer();
        hasBeenCreated = false;
        paused = false; 
    }

    /**
     * when the player presses a key
     *
     * @param evt
     */
    public void keyPress(KeyEvent evt) {
        int key = evt.getKeyCode(); 
        if      (key == 27)        pause(); 
        else if (moveable == true) hero.keyPress(evt);
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
                int enemyLevel = random((currentMapNumber - 1), (currentMapNumber + 1)); 
                Cyborg newCyborg = new Cyborg(images.get(i), 25, Directions.STOP, 4, 100, enemyLevel);
                cyborgs.add(newCyborg);
            }
        }
        if (characterToCreate.equals("engineers")) {
            engineers = new LinkedList<>();
            for (int i = 0; i < images.size(); i++) {
                int enemyLevel = random((currentMapNumber - 1), (currentMapNumber + 1)); 
                Engineer newEngineer = new Engineer(images.get(i), 25, Directions.STOP, 4, 100, enemyLevel);
                engineers.add(newEngineer);
            }
        }
        if (characterToCreate.equals("hammers")) {
            hammers = new LinkedList<>();
            for (int i = 0; i < images.size(); i++) {
                int enemyLevel = random((currentMapNumber - 1), (currentMapNumber + 1)); 
                Hammer newHammer = new Hammer(images.get(i), 25, Directions.STOP, 4, 100, enemyLevel);
                hammers.add(newHammer);
            }
        }
        if (characterToCreate.equals("kingpins")) {
            kingpins = new LinkedList<>();
            for (int i = 0; i < images.size(); i++) {
                int enemyLevel = random((currentMapNumber - 1), (currentMapNumber + 1)); 
                Kingpin newKingpin = new Kingpin(images.get(i), 25, Directions.STOP, 4, 100, enemyLevel);
                kingpins.add(newKingpin);
            }
        }
        if (characterToCreate.equals("nails")) {
            nails = new LinkedList<>();
            for (int i = 0; i < images.size(); i++) {
                int enemyLevel = random((currentMapNumber - 1), (currentMapNumber + 1)); 
                Nail newNail = new Nail(images.get(i), 25, Directions.STOP, 4, 100, enemyLevel);
                nails.add(newNail);
            }
        }
        if (characterToCreate.equals("rampages")) {
            rampages = new LinkedList<>();
            for (int i = 0; i < images.size(); i++) {
                int enemyLevel = random((currentMapNumber - 1), (currentMapNumber + 1)); 
                Rampage newRampage = new Rampage(images.get(i), 25, Directions.STOP, 4, 100, enemyLevel);
                rampages.add(newRampage);
            }
        }
        if (characterToCreate.equals("tricksters")) {
            tricksters = new LinkedList<>();
            for (int i = 0; i < images.size(); i++) {
                int enemyLevel = random((currentMapNumber - 1), (currentMapNumber + 1)); 
                Trickster newTrickster = new Trickster(images.get(i), 25, Directions.STOP, 4, 100, enemyLevel);
                tricksters.add(newTrickster);
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
                currentMapNumber, previousMapNumber,
                trainers);
        hasBeenCreated = true;
        hero.update();
    }

    /**
     * Pauses the game
     */
    public void pause() {
        if (paused) {
            
            paused = false; 
            play();
        } else if (!paused) {
            //stop the animaitons and moving
            paused = true; 
            moveable = false;
            hero.heroClass.sprite.stop();
            hero.heroClass.mover.stop();
        }
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
    public void createMap(JFrame map, int formWidth, int formHeight, int mapNumber) {
        map.setSize(formWidth, formHeight);
        map.setResizable(false);
        map.setLocationRelativeTo(null);
        map.setVisible(true);
        previousMapNumber = currentMapNumber; 
        previousMap = currentMap;
        currentMap = map;
        currentMapNumber = mapNumber;
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
