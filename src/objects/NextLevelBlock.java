package objects;

import game.gametools.Directions;
import game.gametools.GameObject;
import java.awt.Color;
import javax.swing.JLabel;

/**
 * NextLevelBlock.java - Used to travel between "maps"
 *
 * @author g.lumsden
 * @since 14-May-2019
 */
public class NextLevelBlock extends GameObject {
    
    public String mapToGoTo; 
    
    /**
     * Constructor for the class
     *
     * @param image
     * @param mapToGoTo
     * @param x
     * @param y
     */
    public NextLevelBlock(JLabel image, String mapToGoTo, int x, int y) {
        super(image, 0, Directions.STOP, 0);
        this.mapToGoTo = mapToGoTo; 
        super.coordinates.x = x; 
        super.coordinates.y = y; 
        sprite.debug("", Color.WHITE);
        sprite.removeBorder();
    }

}
