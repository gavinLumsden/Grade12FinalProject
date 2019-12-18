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
import jframes.CharacterSelect;

public class HeroCreator 
{
    
    // properties
    public GameCharacter heroClass;

    /**
     * Creates a "hero"
    */
    public HeroCreator(Location[][] locations, Grid grid, JLabel heroImage, GameEngine engine) {
        if (CharacterSelect.selected.equals("bandit")) {
            heroClass = new Bandit(locations, grid, heroImage, engine);
        }  else if (CharacterSelect.selected.equals("gambler")) {
            heroClass = new Gambler(locations, grid, heroImage, engine);
        } else if (CharacterSelect.selected.equals("hacker")) {
            heroClass = new Hacker(locations, grid, heroImage, engine);
        }  else if (CharacterSelect.selected.equals("juggernaut")) {
            heroClass = new Juggernaut(locations, grid, heroImage, engine);
        } else if (CharacterSelect.selected.equals("mage")) {
            heroClass = new Mage(locations, grid, heroImage, engine);
        }   else if (CharacterSelect.selected.equals("vampire")) {
            heroClass = new Vampire(locations, grid, heroImage, engine);
        }
        heroClass.spawn();
        heroClass.sprite.animate(5);
    }
    
    /**
     * Creates a "hero"
    */
    public HeroCreator(Location[][] locations, Grid grid, JLabel heroImage, GameEngine engine, String[] data) {
        if (data[data.length].equals("bandit")) {
            heroClass = new Bandit(locations, grid, heroImage, engine, data);
        }  else if (data[data.length].equals("gambler")) {
            heroClass = new Gambler(locations, grid, heroImage, engine, data);
        } else if (data[data.length].equals("hacker")) {
            heroClass = new Hacker(locations, grid, heroImage, engine, data);
        }  else if (data[data.length].equals("juggernaut")) {
            heroClass = new Juggernaut(locations, grid, heroImage, engine, data);
        } else if (data[data.length].equals("mage")) {
            heroClass = new Mage(locations, grid, heroImage, engine, data);
        }   else if (data[data.length].equals("vampire")) {
            heroClass = new Vampire(locations, grid, heroImage, engine, data);
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
    
    public static String getIdleIcon(String selected) {
        if      (selected.equals("bandit"))     return game.Icons.BANDIT_IDLE_RIGHT; 
        else if (selected.equals("gambler"))    return game.Icons.GAMBLER_IDLE_RIGHT; 
        else if (selected.equals("hacker"))     return game.Icons.HACKER_IDLE_RIGHT; 
        else if (selected.equals("juggernaut")) return game.Icons.JUGGERNAUT_IDLE_RIGHT; 
        else if (selected.equals("mage"))       return game.Icons.MAGE_IDLE_RIGHT_1; 
        else if (selected.equals("vampire"))    return game.Icons.VAMPIRE_IDLE_RIGHT; 
        else                                    return null; 
    }
    
    public static String getInformationIcon(String selected) {
        if      (selected.equals("bandit"))     return game.Icons.CHARACTER_INFORMATION_BANDIT; 
        else if (selected.equals("gambler"))    return game.Icons.CHARACTER_INFORMATION_GAMBLER; 
        else if (selected.equals("hacker"))     return game.Icons.CHARACTER_INFORMATION_HACKER; 
        else if (selected.equals("juggernaut")) return game.Icons.CHARACTER_INFORMATION_JUGGERNAUT; 
        else if (selected.equals("mage"))       return game.Icons.CHARACTER_INFORMATION_MAGE; 
        else if (selected.equals("vampire"))    return game.Icons.CHARACTER_INFORMATION_VAMPIRE; 
        else                                    return null; 
    }
    
    public static void load(String[] data) {
        if (data[data.length].equals("bandit")) {
            Bandit bandit = new Bandit(data); 
        } 
        else if (data[data.length].equals("gambler")) {
            
        } 
        else if (data[data.length].equals("hacker")) {
            
        } 
        else if (data[data.length].equals("juggernaut")) {
            
        } 
        else if (data[data.length].equals("mage")) {
            
        } 
        else if (data[data.length].equals("vampire")) {
            
        } 
    }
    
}