package objects;

import game.gametools.Directions;
import game.gametools.GameObject;
import java.awt.Color;
import javax.swing.JLabel;

/**
 * Wall.java - Represents a "wall" object
 *
 * @author g.lumsden
 * @since 14-May-2019
 */
public class Wall extends GameObject {
    
    /**
     * Constructor for the class
     *
     * @param image
     * @param x
     * @param y
     */
    public Wall(JLabel image, int x, int y) {
        super(image, 0, Directions.STOP, 0);
        super.coordinates.x = x; 
        super.coordinates.y = y; 
        sprite.debug("", Color.black);
    }

}
