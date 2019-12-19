package game;

import grid.Location;
import grid.Grid;
import game.gametools.GameCharacter;
import playerClasses.Bandit;
import playerClasses.Gambler;
import playerClasses.Hacker;
import playerClasses.Juggernaut;
import playerClasses.Mage;
import playerClasses.Vampire;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;

public class HeroCreator {

    // properties
    public GameCharacter heroClass;

    /**
     * Constructor for the class
     *
     * @param locations
     * @param grid
     * @param heroImage
     * @param engine
     * @param selected
     */
    public HeroCreator(Location[][] locations, Grid grid, JLabel heroImage, GameEngine engine, String selected) {
        if (selected.equals("bandit")) {
            heroClass = new Bandit(locations, grid, heroImage, engine);
        } else if (selected.equals("gambler")) {
            heroClass = new Gambler(locations, grid, heroImage, engine);
        } else if (selected.equals("hacker")) {
            heroClass = new Hacker(locations, grid, heroImage, engine);
        } else if (selected.equals("juggernaut")) {
            heroClass = new Juggernaut(locations, grid, heroImage, engine);
        } else if (selected.equals("mage")) {
            heroClass = new Mage(locations, grid, heroImage, engine);
        } else if (selected.equals("vampire")) {
            heroClass = new Vampire(locations, grid, heroImage, engine);
        }
        heroClass.spawn();
        heroClass.sprite.animate(5);
    }

    /**
     * Constructor for the class
     *
     * @param locations
     * @param grid
     * @param heroImage
     * @param engine
     * @param data
     */
    public HeroCreator(Location[][] locations, Grid grid, JLabel heroImage, GameEngine engine, String[] data) {
        if (data[data.length-1].equals("bandit")) {
            heroClass = new Bandit(locations, grid, heroImage, engine, data);
        } else if (data[data.length-1].equals("gambler")) {
            heroClass = new Gambler(locations, grid, heroImage, engine, data);
        } else if (data[data.length-1].equals("hacker")) {
            heroClass = new Hacker(locations, grid, heroImage, engine, data);
        } else if (data[data.length-1].equals("juggernaut")) {
            heroClass = new Juggernaut(locations, grid, heroImage, engine, data);
        } else if (data[data.length-1].equals("mage")) {
            heroClass = new Mage(locations, grid, heroImage, engine, data);
        } else if (data[data.length-1].equals("vampire")) {
            heroClass = new Vampire(locations, grid, heroImage, engine, data);
        } else {
            System.out.println("error creating hero");; 
        }
        heroClass.spawn();
        heroClass.sprite.animate(5);
    }

    /**
     * sets the label of a hero
     *
     * @param heroImage
     */
    public void setLabel(JLabel heroImage) {
        heroClass.sprite.setLabel(heroImage);
    }

    /**
     * updates the heros coordinates
     */
    public void update() {
        heroClass.update();
    }

    /**
     *
     */
    public void stop() {
        heroClass.mover.stop();
    }

    /**
     * when a key is pressed
     *
     * @param evt
     */
    public void keyPress(KeyEvent evt) {
        heroClass.keyPress(evt);
    }

    /**
     * when a key is released
     *
     * @param evt
     */
    public void keyRelease(KeyEvent evt) {
        heroClass.mover.stop();
    }

    /**
     *
     * @param selected
     * @return
     */
    public static String getIdleIcon(String selected) {
        if (selected.equals("bandit")) {
            return game.Icons.BANDIT_IDLE_RIGHT;
        } else if (selected.equals("gambler")) {
            return game.Icons.GAMBLER_IDLE_RIGHT;
        } else if (selected.equals("hacker")) {
            return game.Icons.HACKER_IDLE_RIGHT;
        } else if (selected.equals("juggernaut")) {
            return game.Icons.JUGGERNAUT_IDLE_RIGHT;
        } else if (selected.equals("mage")) {
            return game.Icons.MAGE_IDLE_RIGHT_1;
        } else if (selected.equals("vampire")) {
            return game.Icons.VAMPIRE_IDLE_RIGHT;
        } else {
            return null;
        }
    }

    /**
     *
     * @param selected
     * @return
     */
    public static String getInformationIcon(String selected) {
        if (selected.equals("bandit")) {
            return game.Icons.CHARACTER_INFORMATION_BANDIT;
        } else if (selected.equals("gambler")) {
            return game.Icons.CHARACTER_INFORMATION_GAMBLER;
        } else if (selected.equals("hacker")) {
            return game.Icons.CHARACTER_INFORMATION_HACKER;
        } else if (selected.equals("juggernaut")) {
            return game.Icons.CHARACTER_INFORMATION_JUGGERNAUT;
        } else if (selected.equals("mage")) {
            return game.Icons.CHARACTER_INFORMATION_MAGE;
        } else if (selected.equals("vampire")) {
            return game.Icons.CHARACTER_INFORMATION_VAMPIRE;
        } else {
            return null;
        }
    }

    /**
     *
     * @param locations
     * @param grid
     * @param heroImage
     * @param engine
     * @param data
     */
    public void load(Location[][] locations, Grid grid, JLabel heroImage, GameEngine engine, String[] data) {
        if (data[data.length-1].equals("bandit")) {
            heroClass = new Bandit(locations, grid, heroImage, engine, data);
        } else if (data[data.length-1].equals("gambler")) {
            heroClass = new Gambler(locations, grid, heroImage, engine, data);
        } else if (data[data.length-1].equals("hacker")) {
            heroClass = new Hacker(locations, grid, heroImage, engine, data);
        } else if (data[data.length-1].equals("juggernaut")) {
            heroClass = new Juggernaut(locations, grid, heroImage, engine, data);
        } else if (data[data.length-1].equals("mage")) {
            heroClass = new Mage(locations, grid, heroImage, engine, data);
        } else if (data[data.length-1].equals("vampire")) {
            heroClass = new Vampire(locations, grid, heroImage, engine, data);
        }
    }

}
