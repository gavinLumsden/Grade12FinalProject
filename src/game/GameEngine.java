package game;

import jframes.Menu;
import game.gametools.Animation;
import game.gametools.MediaPlayer;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import grid.Grid; 
import grid.Location;
import jframes.CharacterSelect;
import jframes.MainMenu;

/**
 * GameEngine.java - Represents an "engine" that controls many things to do with
 * maps, heros and enemies
 *
 * @author g.lumsden
 * @since 12-Jun-2019
 */
public class GameEngine {

    public String[]      data; 
    public Grid          grid; 
    public Menu          menu;
    public Location[][]  locations; 
    public HeroCreator   heroCreator;
    public MediaPlayer   mediaPlayer;
    public String        selected; 
    public boolean       moveable;
    public boolean       paused;
    
    private final int SPAWN_X = 500; 
    private final int SPAWN_Y = 500; 

    /**
     * creates a game engine
     */
    public GameEngine() {
        MainMenu mainMenu  = new MainMenu(this); 
    }
    
    /**
     * when the player presses a key
     *
     * @param evt
     */
    public void keyPress(KeyEvent evt) {
        int key = evt.getKeyCode();
        if      (key == 27) pause();
        else if (moveable == true) heroCreator.keyPress(evt);
    }

    /**
     * when the player releases a key
     *
     * @param evt
     */
    public void keyRelease(KeyEvent evt) {
        if (moveable == true) {
            heroCreator.keyRelease(evt);
        }
    }

    /**
     * 
     * @param menu
     */
    public void newGame(MainMenu menu) {
        mediaPlayer        = new MediaPlayer();
        runMusic("introSoundtrack.wav"); 
        paused             = false;
        moveable           = true; 
        menu.dispose(); 
        CharacterSelect cs = new CharacterSelect(this); 
    }
    
    /**
     * 
     * @param intro
     */
    public void loadGame(MainMenu intro) {
        data = CharacterData.load(); 
        if (data != null) {
            intro.dispose();
            grid = new Grid(this, data);
        }
    }
    
    /**
     * 
     */
    public void quit() {
        System.exit(0); 
    }
    
    public void runMusic(String filename) {
        mediaPlayer.playWAV(filename); 
    }
    
    /**
     * 
     */
    public void newHero() {
        JLabel heroImage = new JLabel();
        grid.getContentPane().add(heroImage);
        heroImage.setBounds(SPAWN_X, SPAWN_Y, grid.tileWidth, grid.tileHeight);
        heroImage.setOpaque(true);
        grid.getContentPane().setComponentZOrder(heroImage, 0);
        heroCreator = new HeroCreator(locations, grid, heroImage, this); 
    }
    
    /**
     * 
     */
    public void loadHero() {
        JLabel heroImage = new JLabel();
        grid.getContentPane().add(heroImage);
        heroImage.setBounds(100, 100, grid.tileWidth, grid.tileHeight);
        heroImage.setOpaque(true);
        grid.getContentPane().setComponentZOrder(heroImage, 0);
        heroCreator = new HeroCreator(locations, grid, heroImage, this, data); 
    }
    
    /**
     * Pauses the game
     */
    public void pause() {
        if (paused) {
            play();
        } else if (!paused) {
            //stop the animaitons and moving
            paused = true;
            moveable = false;
            heroCreator.heroClass.sprite.stop();
            heroCreator.heroClass.mover.stop();
            grid.setVisible(false);
            menu = new Menu(this);
        }
    }

    /**
     * Plays the game
     */
    public void play() {
        menu.dispose();
        grid.setVisible(true);
        paused = false;
        moveable = true;
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
    
    /**
     * 
     * @param formWidth
     * @param formHeight
     * @param frame 
     */
    public void createJFrame(int formWidth, int formHeight, JFrame frame) {
        System.out.println("setting form");
        frame.setSize(formWidth, formHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        System.out.println("form set");
    }
    
    /**
     *
     * @param frame 
     */
    public void clearJFrame(JFrame frame) {
        frame.dispose();
    }
    
    /**
     * Used when the user clicks on a jlabel
     * @param labels
     * @param label
     * @param isClicked
     * @param animations
     * @param spot
     * @return 
     */
    public boolean click(JLabel[] labels, JLabel label, boolean isClicked, Animation[] animations, int spot) {
        if (isClicked) {
            unClick(labels, label, isClicked, animations, spot);
            return false;
        } else {
            isClicked = true;
            set(labels, label, isClicked, animations, spot);
            return true;
        }
    }

    /**
     * Used to "unclick" a jlabel
     * @param labels
     * @param label
     * @param isClicked
     * @param animations
     * @param spot 
     */
    public void unClick(JLabel[] labels, JLabel label, boolean isClicked, Animation[] animations, int spot) {
        if (label != null) {
            isClicked = false;
            reset(labels, label, isClicked, animations, spot);
        }
    }

    /**
     * Used when the user hover overs a jlabel
     * @param labels
     * @param label
     * @param isClicked
     * @param animations
     * @param spot 
     */
    public void hoverIn(JLabel[] labels, JLabel label, boolean isClicked, Animation[] animations, int spot) {
        if (!isClicked) {
            set(labels, label, isClicked, animations, spot);
        }
    }

    /**
     * Used when the user hovers away from a jlabel
     * @param labels
     * @param label
     * @param isClicked
     * @param animations
     * @param spot 
     */
    public void hoverOut(JLabel[] labels, JLabel label, boolean isClicked, Animation[] animations, int spot) {
        if (!isClicked) {
            reset(labels, label, isClicked, animations, spot);
        }
    }

    /**
     * Used to "unclick" all the jlabels
     * @param labels
     * @param label
     * @param isClicked
     * @param animations
     * @param spot 
     */
    public void reset(JLabel[] labels, JLabel label, boolean isClicked, Animation[] animations, int spot) {
        if (animations == null) {
            if (label != null) {
                for (int i = 0; i < labels.length; i++) {
                    labels[i].setBorder(BorderFactory.createLineBorder(Color.black));
                }
                label = null;
            }
        }
        if (animations != null) {
            for (int i = 0; i < animations.length; i++) {
                animations[i].stop();
            }
            for (int i = 0; i < labels.length; i++) {
                labels[i].setBorder(BorderFactory.createLineBorder(Color.black));
            }
            label = null;
            spot = 0;
        }
    }

    /**
     * Used to highlight a jlabel and run the corresponding animation
     * @param labels
     * @param label
     * @param isClicked
     * @param animations
     * @param spot 
     */
    public void set(JLabel[] labels, JLabel label, boolean isClicked, Animation[] animations, int spot) {
        if (animations == null) {
            if (label != null) {
                label.setBorder(BorderFactory.createBevelBorder(1, Color.yellow, Color.yellow));
            }
        } else if (animations != null) {
            if (label != null) {
                label.setBorder(BorderFactory.createBevelBorder(1, Color.yellow, Color.yellow));
            }
            if (animations[spot].isRunning() == false) {
                animations[spot].run();
            }
        }
    }

    /**
     * 
     * @param label
     * @param imageFile 
     */
    public void setImage(JLabel label, String imageFile) {
        try {
            Icon icon; 
            URL url = new URL(imageFile);                     // set property to parameter
            if (url == null) icon = new ImageIcon(imageFile); // set icon
            else             icon = new ImageIcon(url);       // set icon
            label.setIcon(icon);                              // set icon to label
        } catch (MalformedURLException ex) {
            System.out.println("url error");
        }
    }

    public void save() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
