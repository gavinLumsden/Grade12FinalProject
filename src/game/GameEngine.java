package game;

import jframes.Menu;
import collections.LinkedList;
import objects.NextLevelBlock;
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

/**
 * GameEngine.java - Represents an "engine" that controls many things to do with
 * maps, heros and enemies
 *
 * @author g.lumsden
 * @since 12-Jun-2019
 */
public class GameEngine {

    public Grid grid; 
    public HeroCreator heroCreator;
    public MediaPlayer mediaPlayer;
    public Menu menu;

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
        if (key == 27) {
            pause();
        } else if (moveable == true) {
            heroCreator.keyPress(evt);
        }
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
     * creates the hero on the form
     *
     * @param heroImage
     * @param nextLevelBlocks
     */
    public void createHero(JLabel heroImage, LinkedList<NextLevelBlock> nextLevelBlocks) {
        heroCreator = new HeroCreator(); 
        hasBeenCreated = true;
        heroCreator.update();
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
            menu = new Menu(this);
        }
    }

    /**
     * Plays the game
     */
    public void play() {
        menu.dispose();
        grid.set
        paused = false;
        moveable = true;
    }

    /**
     * creates a map
     *
     * @param map
     * @param formWidth
     * @param formHeight
     * @param mapNumber
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

    /**
     * Creates a JFrame using the parameters
     * @param width
     * @param height
     * @param jframe 
     */
    public void createJFrame(int width, int height, JFrame jframe) {
        jframe.setSize(width, height);
        jframe.setResizable(false);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
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

}
