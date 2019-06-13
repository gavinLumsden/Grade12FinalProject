package objects;

import game.gametools.Directions;
import game.gametools.GameObject;
import javax.swing.JLabel;

/**
 * Grass.java - Represents a "grass" object
 *
 * @author g.lumsden
 * @since 14-May-2019
 */
public class Grass extends GameObject {

    /**
     * Constructor for the class
     *
     * @param image
     */
    public Grass(JLabel image) {
        super(image, 0, Directions.STOP, 0);
        sprite.setImage("/animations/grass.png");
        sprite.debug("");
        sprite.setBackground(0, 145, 0);
        sprite.removeBorder();
    }

}
