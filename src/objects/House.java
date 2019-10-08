package objects;

import game.gametools.Directions;
import game.gametools.GameObject;
import javax.swing.JLabel;

/**
 * Wall.java - Represents a "wall" object
 *
 * @author g.lumsden
 * @since 14-May-2019
 */
public class House extends GameObject {

    /**
     * Constructor for the class
     *
     * @param image
     */
    public House(JLabel image) {
        super(image, 0, Directions.STOP, 0);
        sprite.setImage("/animations/objects/house.png");
        sprite.debug("");
        sprite.removeBorder();
    }

}
