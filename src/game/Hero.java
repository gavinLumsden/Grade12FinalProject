package game;

import collections.LinkedList;
import objects.NextLevelBlock;
import objects.Wall;
import enemyClasses.Cyborg;
import enemyClasses.Nail;
import enemyClasses.Rampage;
import playerClasses.Vampire;
import playerClasses.Mage;
import playerClasses.Juggernaut;
import playerClasses.Hacker;
import playerClasses.Bandit;
import playerClasses.Gambler;
import game.gametools.GameCharacter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import nuetral.trainers.Trainer;
import objects.House;

/**
 * Hero.java - Represents a "hero"
 *
 * @author g.lumsden
 * @since 12-Jun-2019
 */
public class Hero {

    // properties
    public GameCharacter heroClass;

    /**
     * Creates a "hero"
     *
     * @param heroImage
     * @param walls
     * @param houses
     * @param cyborgs
     * @param nails
     * @param rampages
     * @param nextLevelBlocks
     * @param engine
     * @param hasBeenCreated
     * @param currentMap
     * @param previousMap
     * @param currentMapNumber
     * @param previousMapNumber
     * @param trainers
     */
    public Hero(
            JLabel heroImage,
            LinkedList<Wall> walls, LinkedList<House> houses, 
            LinkedList<Cyborg> cyborgs, LinkedList<Nail> nails, LinkedList<Rampage> rampages, 
            LinkedList<NextLevelBlock> nextLevelBlocks, 
            GameEngine engine, boolean hasBeenCreated,
            JFrame currentMap, JFrame previousMap,
            int currentMapNumber, int previousMapNumber,
            LinkedList<Trainer> trainers) {
        if (CharacterSelect.selected.equals("bandit")) {
            heroClass = new Bandit(heroImage, walls, houses, cyborgs, nails, rampages, nextLevelBlocks,  engine, hasBeenCreated, currentMap, previousMap, currentMapNumber, previousMapNumber, trainers);
        }  else if (CharacterSelect.selected.equals("gambler")) {
            heroClass = new Gambler(heroImage, walls, houses, cyborgs, nails, rampages, nextLevelBlocks,  engine, hasBeenCreated, currentMap, previousMap, currentMapNumber, previousMapNumber, trainers);
        } else if (CharacterSelect.selected.equals("hacker")) {
            heroClass = new Hacker(heroImage, walls, houses, cyborgs, nails, rampages, nextLevelBlocks,  engine, hasBeenCreated, currentMap, previousMap, currentMapNumber, previousMapNumber, trainers);
        }  else if (CharacterSelect.selected.equals("juggernaut")) {
            heroClass = new Juggernaut(heroImage, walls, houses, cyborgs, nails, rampages, nextLevelBlocks,  engine, hasBeenCreated, currentMap, previousMap, currentMapNumber, previousMapNumber, trainers);
        } else if (CharacterSelect.selected.equals("mage")) {
            heroClass = new Mage(heroImage, walls, houses, cyborgs, nails, rampages, nextLevelBlocks,  engine, hasBeenCreated, currentMap, previousMap, currentMapNumber, previousMapNumber, trainers);
        }   else if (CharacterSelect.selected.equals("vampire")) {
            heroClass = new Vampire(heroImage, walls, houses, cyborgs, nails, rampages, nextLevelBlocks,  engine, hasBeenCreated, currentMap, previousMap, currentMapNumber, previousMapNumber, trainers);
        }
        heroClass.spawn();
        heroClass.sprite.animate(1);
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

}
