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
import objects.House;

/**
 * GameEngine.java - Represents an "engine" that controls many things to do with forms,
 * heros and enemies
 *
 * @author g.lumsden
 * @since 12-Jun-2019
 */
public class GameEngine {

    // enemies
    private LinkedList<Cyborg>  cyborgs;
    private LinkedList<Nail>    nails;
    private LinkedList<Rampage> rampages; 

    // hero
    public Hero hero;

    // objects
    private LinkedList<Wall>  walls;
    private LinkedList<Grass> grass;
    private LinkedList<House> houses; 

    // used to play music
    public MediaPlayer mediaPlayer;
    
    // form width and height for the introduction
    private final int INTRO_FORM_WIDTH = 416;
    private final int INTRO_FORM_HEIGHT = 319;

    // what map the player is on
    public String currentMap;
    public String previousMap;
    
    private boolean movable; 
    private boolean hasBeenCreated;

    /**
     * creates a game engine
     */
    public GameEngine() {
        mediaPlayer = new MediaPlayer();
        hasBeenCreated = false;
    }

    /**
     * assigns the walls and grass
     *
     * @param wallImages
     * @param grassImages
     */
    public void assign(LinkedList<JLabel> wallImages, LinkedList<JLabel> grassImages) {
        createWalls(wallImages);
        createGrass(grassImages);
    }

    /**
     * when the player presses a key
     *
     * @param evt
     */
    public void keyPress(KeyEvent evt) {
        if (movable == true) hero.keyPress(evt);
    }

    /**
     * when the player releases a key
     *
     * @param evt
     */
    public void keyRelease(KeyEvent evt) {
        if (movable == true) hero.keyRelease(evt);
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
     * creates the grass on the form
     *
     * @param grassImages
     */
    public void createGrass(LinkedList<JLabel> grassImages) {
        grass = new LinkedList<>(); 
        for (int i = 0; i < grassImages.size(); i++) {
            Grass newGrass = new Grass(grassImages.get(i)); 
            grass.add(newGrass); 
        }
    }

    /**
     * creates the walls on the form
     *
     * @param wallImages
     */
    public void createWalls(LinkedList<JLabel> wallImages) {
        walls = new LinkedList<>(); 
        for (int i = 0; i < wallImages.size(); i++) {
            Wall newWall = new Wall(wallImages.get(i)); 
            walls.add(newWall); 
        }
    }

    /**
     * creates the houses 
     * 
     * @param houseImages 
     */
    public void createHouse(LinkedList<JLabel> houseImages) {
        houses = new LinkedList<>(); 
        for (int i = 0; i < houseImages.size(); i++) {
            House newHouse = new House(houseImages.get(i)); 
            houses.add(newHouse); 
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
                currentMap, previousMap); 
        hasBeenCreated = true;
        hero.update();
    }

    /**
     * creates the enemies on the form
     *
     * @param rampageImages
     * @param nailImages
     * @param cyborgImages
     */
    public void createEnemies(LinkedList<JLabel> rampageImages, LinkedList<JLabel> nailImages, LinkedList<JLabel> cyborgImages)     {
        if (cyborgImages != null) {
            cyborgs = new LinkedList<>(); 
            for (int i = 0; i < cyborgImages.size(); i++) {
                Cyborg newCyborg = new Cyborg(cyborgImages.get(i), 25, Directions.STOP, 4, 100); 
                cyborgs.add(newCyborg); 
            }
        }
        if (nailImages != null) {
            nails = new LinkedList<>(); 
            for (int i = 0; i < nailImages.size(); i++) {
                Nail newNail = new Nail(nailImages.get(i), 25, Directions.STOP, 4, 100); 
                nails.add(newNail); 
            }
        }
        if (rampageImages != null) {
            rampages = new LinkedList<>(); 
            for (int i = 0; i < rampageImages.size(); i++) {
                Rampage newRampage = new Rampage(rampageImages.get(i), 25, Directions.STOP, 4, 100); 
                rampages.add(newRampage); 
            }
        }
    }

    /**
     * Pauses the game 
     */
    public void pause() {
        //stop the animaitons and moving
        movable = false; 
        hero.heroClass.sprite.stop();
        hero.heroClass.mover.stop();
    }
    
    /**
     * Plays the game 
     */
    public void play() {
        movable = true; 
    }

    public void createMap(JFrame map, int formWidth, int formHeight, String mapName) {
        previousMap = currentMap; 
        currentMap = mapName; 
        map.setSize(formWidth, formHeight);
        map.setResizable(false);
        map.setLocationRelativeTo(null);
        map.setVisible(true);
    }
    
    public void clearMap(JFrame map) {
        map.dispose();
    }
    
}
