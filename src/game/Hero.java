package game;

import objects.NextLevelBlock;
import objects.Wall;
import enemyClasses.Cyborg;
import enemyClasses.Nail;
import enemyClasses.Rampage;
import playerClasses.Vampire;
import playerClasses.Trickster;
import playerClasses.Hammer;
import playerClasses.Mage;
import playerClasses.Juggernaut;
import playerClasses.Hacker;
import playerClasses.Engineer;
import playerClasses.Bandit;
import playerClasses.Gambler;
import playerClasses.Mimic;
import game.gametools.GameCharacter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;

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
     * @param cyborgs
     * @param nails
     * @param rampages
     * @param toMain
     * @param toSpawn
     * @param toEnemyVillage
     * @param toPlayerVillage
     * @param engine
     */
    public Hero(
            JLabel heroImage,
            Wall[] walls,
            Cyborg[] cyborgs, Nail[] nails, Rampage[] rampages,
            NextLevelBlock toMain, NextLevelBlock toSpawn, NextLevelBlock toEnemyVillage, NextLevelBlock toPlayerVillage,
            GameEngine engine) {
        if (CharacterSelect.selected.equals("bandit")) {
            heroClass = new Bandit(heroImage, walls, cyborgs, nails, rampages, toMain, toSpawn, toEnemyVillage, toPlayerVillage, engine);
        } else if (CharacterSelect.selected.equals("engineer")) {
            heroClass = new Engineer(heroImage, walls, cyborgs, nails, rampages, toMain, toSpawn, toEnemyVillage, toPlayerVillage, engine);
        } else if (CharacterSelect.selected.equals("gambler")) {
            heroClass = new Gambler(heroImage, walls, cyborgs, nails, rampages, toMain, toSpawn, toEnemyVillage, toPlayerVillage, engine);
        } else if (CharacterSelect.selected.equals("hacker")) {
            heroClass = new Hacker(heroImage, walls, cyborgs, nails, rampages, toMain, toSpawn, toEnemyVillage, toPlayerVillage, engine);
        } else if (CharacterSelect.selected.equals("hammer")) {
            heroClass = new Hammer(heroImage, walls, cyborgs, nails, rampages, toMain, toSpawn, toEnemyVillage, toPlayerVillage, engine);
        } else if (CharacterSelect.selected.equals("juggernaut")) {
            heroClass = new Juggernaut(heroImage, walls, cyborgs, nails, rampages, toMain, toSpawn, toEnemyVillage, toPlayerVillage, engine);
        } else if (CharacterSelect.selected.equals("mage")) {
            heroClass = new Mage(heroImage, walls, cyborgs, nails, rampages, toMain, toSpawn, toEnemyVillage, toPlayerVillage, engine);
        } else if (CharacterSelect.selected.equals("mimic")) {
            heroClass = new Mimic(heroImage, walls, cyborgs, nails, rampages, toMain, toSpawn, toEnemyVillage, toPlayerVillage, engine);
        } else if (CharacterSelect.selected.equals("trickster")) {
            heroClass = new Trickster(heroImage, walls, cyborgs, nails, rampages, toMain, toSpawn, toEnemyVillage, toPlayerVillage, engine);
        } else if (CharacterSelect.selected.equals("vampire")) {
            heroClass = new Vampire(heroImage, walls, cyborgs, nails, rampages, toMain, toSpawn, toEnemyVillage, toPlayerVillage, engine);
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
