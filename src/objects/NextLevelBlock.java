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
     */
    public NextLevelBlock(JLabel image, String mapToGoTo) {
        super(image, 0, Directions.STOP, 0);
        this.mapToGoTo = mapToGoTo; 
        sprite.debug("", Color.WHITE);
        sprite.removeBorder();
    }

}
