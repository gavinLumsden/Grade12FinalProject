package game;

import objects.NextLevelBlock;
import objects.Grass;
import objects.Wall;
import maps.EnemyVillage;
import maps.PlayerVillage;
import maps.Spawn;
import maps.Main;
import enemyClasses.Cyborg;
import enemyClasses.Nail;
import enemyClasses.Rampage;
import game.gametools.MediaPlayer;
import java.awt.event.KeyEvent;
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
    private Cyborg[] cyborgs;
    private Nail[] nails;
    private Rampage[] rampages;

    // maps
    private Main main;
    private Spawn spawn;
    private EnemyVillage enemyVillage;
    private PlayerVillage playerVillage;

    // hero
    public Hero hero;

    // objects
    private Wall[] walls;
    private Grass[] grass;
    private House[] houses; 
    private NextLevelBlock toSpawn;
    private NextLevelBlock toEnemyVillage;
    private NextLevelBlock toPlayerVillage;
    private NextLevelBlock toMain;

    // used to play music
    public MediaPlayer mediaPlayer;

    // used to determine wether or not a certain soundtrack is playing
    public boolean isPlayingWalkingMusic;
    public boolean isPlayingFightingMusic;
    public boolean isPlayingIntroMusic;

    // form width and height for main
    private final int MAIN_FORM_WIDTH = 1765;
    private final int MAIN_FORM_HEIGHT = 888;

    // form width and height for spawn
    private final int SPAWN_FORM_WIDTH = 1066;
    private final int SPAWN_FORM_HEIGHT = 589;

    // form width and height for enemy village 
    private final int ENEMY_VILLAGE_FORM_WIDTH = 1065;
    private final int ENEMY_VILLAGE_FORM_HEIGHT = 589;

    // form width and height for player village 
    private final int PLAYER_VILLAGE_FORM_WIDTH = 1300;
    private final int PLAYER_VILLAGE_FORM_HEIGHT = 900;

    // form width and height for the introduction
    private final int INTRO_FORM_WIDTH = 416;
    private final int INTRO_FORM_HEIGHT = 319;

    // what map the player is on
    public String map = "";
    
    private boolean movable; 

    /**
     * creates a game engine
     */
    public GameEngine() {
        mediaPlayer = new MediaPlayer();
    }

    /**
     * assigns the walls and grass
     *
     * @param wallImages
     * @param grassImages
     */
    public void assign(JLabel[] wallImages, JLabel[] grassImages) {
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
     * creates the spawn form
     *
     * @param spawn
     * @param toMainImage
     */
    public void createSpawn(Spawn spawn, JLabel toMainImage) {
        this.spawn = spawn;
        map = "spawn";
        toMain = new NextLevelBlock(toMainImage);
        spawn.setSize(SPAWN_FORM_WIDTH, SPAWN_FORM_HEIGHT);
        spawn.setResizable(false);
        spawn.setLocationRelativeTo(null);
        spawn.setVisible(true);
        if (isPlayingIntroMusic == true) {
            mediaPlayer.stop();
            isPlayingIntroMusic = false;
            mediaPlayer.playWAV("/sounds/walkingSoundtrack.wav");
            isPlayingWalkingMusic = true;
        }
        movable = true; 
    }

    /**
     * creates the main form
     *
     * @param main
     * @param toSpawnImage
     * @param toEnemyVillageImage
     * @param toPlayerVillageImage
     */
    public void createMain(Main main, JLabel toSpawnImage, JLabel toEnemyVillageImage, JLabel toPlayerVillageImage) {
        this.main = main;
        map = "main";
        toSpawn = new NextLevelBlock(toSpawnImage);
        toEnemyVillage = new NextLevelBlock(toEnemyVillageImage);
        toPlayerVillage = new NextLevelBlock(toPlayerVillageImage);
        main.setSize(MAIN_FORM_WIDTH, MAIN_FORM_HEIGHT);
        main.setResizable(false);
        main.setLocationRelativeTo(null);
        main.setVisible(true);
        if (isPlayingFightingMusic == true) {
            mediaPlayer.stop();
            isPlayingFightingMusic = false;
            mediaPlayer.playWAV("/sounds/walkingSoundtrack.wav");
            isPlayingWalkingMusic = true;
        }
        movable = true; 
    }

    /**
     * creates the enemy village form
     *
     * @param enemyVillage
     * @param toMainImage
     */
    public void createEnemyVillage(EnemyVillage enemyVillage, JLabel toMainImage) {
        this.enemyVillage = enemyVillage;
        map = "enemy village";
        toMain = new NextLevelBlock(toMainImage);
        enemyVillage.setSize(ENEMY_VILLAGE_FORM_WIDTH, ENEMY_VILLAGE_FORM_HEIGHT);
        enemyVillage.setResizable(false);
        enemyVillage.setLocationRelativeTo(null);
        enemyVillage.setVisible(true);
        mediaPlayer.stop();
        isPlayingWalkingMusic = false;
        isPlayingFightingMusic = true;
        movable = true; 
    }

    /**
     * creates the player village form
     *
     * @param playerVillage
     * @param toMainImage
     */
    public void createPlayerVillage(PlayerVillage playerVillage, JLabel toMainImage) {
        this.playerVillage = playerVillage;
        map = "player village";
        toMain = new NextLevelBlock(toMainImage);
        playerVillage.setSize(PLAYER_VILLAGE_FORM_WIDTH, PLAYER_VILLAGE_FORM_HEIGHT);
        playerVillage.setResizable(false);
        playerVillage.setLocationRelativeTo(null);
        playerVillage.setVisible(true);
        movable = true; 
    }

    /**
     * creates the intro form
     *
     * @param intro
     */
    public void createIntro(Introduction intro) {
        mediaPlayer.playWAV("/sounds/introSoundtrack.wav");
        isPlayingIntroMusic = true;
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
    public void createGrass(JLabel[] grassImages) {
        if (grassImages[0] != null) {
            grass = new Grass[grassImages.length];
            for (int i = 0; i < grass.length; i++) {
                grass[i] = new Grass(grassImages[i]);
            }
        } else System.out.println("error creating grass");
    }

    /**
     * creates the walls on the form
     *
     * @param wallImages
     */
    public void createWalls(JLabel[] wallImages) {
        if (wallImages[0] != null) {
            walls = new Wall[wallImages.length];
            for (int i = 0; i < walls.length; i++) {
                walls[i] = new Wall(wallImages[i]);
            }
        } else System.out.println("error creating walls");
    }

    public void createHouse(JLabel[] houseImages) {
        if (houseImages[0] != null) {
            houses = new House[houseImages.length];
            for (int i = 0; i < houses.length; i++) {
                houses[i] = new House(houseImages[i]);
            }
        } else System.out.println("error creating house");
    }

    /**
     * creates the hero on the form
     *
     * @param heroImage
     */
    public void createHero(JLabel heroImage) {
        hero = new Hero(heroImage, walls, houses, cyborgs, nails, rampages, toMain, toSpawn, toEnemyVillage, toPlayerVillage, this);
        hero.update();
    }

    /**
     * clears the spawn form
     */
    public void clearSpawn() {
        if (spawn != null) {
            spawn.dispose();
        }
    }

    /**
     * clears the main form
     */
    public void clearMain() {
        if (main != null) {
            main.dispose();
        }
    }

    /**
     * clears the player village form
     */
    public void clearPlayerVillage() {
        if (playerVillage != null) {
            playerVillage.dispose();
        }
    }

    /**
     * clears the enemy village form
     */
    public void clearEnemyVillage() {
        if (enemyVillage != null) {
            enemyVillage.dispose();
        }
    }
    
    public void clearBattle(BattleUI battle) {
        battle.dispose(); 
    }

    /**
     * creates the enemies on the form
     *
     * @param rampageImages
     * @param nailImages
     * @param cyborgImages
     */
    public void createEnemies(JLabel[] rampageImages, JLabel[] nailImages, JLabel[] cyborgImages) {
        if (rampageImages != null) {
            rampages = new Rampage[rampageImages.length];
            for (int i = 0; i < rampages.length; i++) {
                rampages[i] = new Rampage(rampageImages[i], 0, 0, 0, 0);
            }
        }
        if (nailImages != null) {
            nails = new Nail[nailImages.length];
            for (int i = 0; i < nails.length; i++) {
                nails[i] = new Nail(nailImages[i], 0, 0, 0, 0);
            }
        }
        if (cyborgImages != null) {
            cyborgs = new Cyborg[cyborgImages.length];
            for (int i = 0; i < cyborgs.length; i++) {
                cyborgs[i] = new Cyborg(cyborgImages[i], 0, 0, 0, 0);
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
    
}
