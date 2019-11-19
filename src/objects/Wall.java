package objects;

import game.gametools.Directions;
import game.gametools.GameObject;
import java.awt.Color;
import java.net.MalformedURLException;
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
     */
    public Wall(JLabel image) throws MalformedURLException {
        super(image, 0, Directions.STOP, 0);
        sprite.debug("", Color.black);
    }

}
