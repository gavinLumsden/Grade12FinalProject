package objects;

import game.Icons;
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
     * @param x
     * @param y
     */
    public Grass(JLabel image, int x, int y) {
        super(image, 0, Directions.STOP, 0);
        super.coordinates.x = x; 
        super.coordinates.y = y; 
        sprite.setImage(Icons.GRASS_IMAGES[0]);
        sprite.debug("");
        sprite.setBackground(0, 145, 0);
        sprite.removeBorder();
    }

}
