package game;

import game.gametools.GameCharacter;
import javax.swing.JLabel;

public abstract class Enemy extends GameCharacter {

    public String name; 
    
    public String attack1;
    public String attack2;
    public String attack3;
    public String attack4;
    
    public int health; 
    public int maxHealth;
    public int punchSpeed;
    public int dodgeChance; 
    public int damage; 
    
    /**
     * Constructor for the class
     *
     * @param image
     * @param amount
     * @param direction
     * @param numberOfDirections
     * @param delay
     */
    public Enemy(JLabel image, int amount, int direction, int numberOfDirections, int delay) {
        super(image, amount, direction, numberOfDirections, delay);
    }

}
