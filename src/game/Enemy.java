package game;

import game.gametools.GameCharacter;
import javax.swing.JLabel;

public abstract class Enemy extends GameCharacter {

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
