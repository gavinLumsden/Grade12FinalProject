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

    /**
     * Constructor for the class
     *
     * @param image
     */
    public NextLevelBlock(JLabel image) {
        super(image, 0, Directions.STOP, 0);
        sprite.debug("", Color.WHITE);
        sprite.removeBorder();
    }

}
