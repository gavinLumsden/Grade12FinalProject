package objects;

import game.Icons;
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
     * @param x
     * @param y
     */
    public House(JLabel image, int x, int y) {
        super(image, 0, Directions.STOP, 0);
        super.coordinates.x = x; 
        super.coordinates.y = y; 
        sprite.setImage(Icons.HOUSE);
        sprite.debug("");
        sprite.setBackground(0, 0, 255);
        sprite.removeBorder();
    }

}
