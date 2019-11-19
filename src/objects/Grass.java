package objects;

import game.Icons;
import game.gametools.Directions;
import game.gametools.GameObject;
import java.net.MalformedURLException;
import java.net.URL;
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
    public Grass(JLabel image) throws MalformedURLException {
        super(image, 0, Directions.STOP, 0);
        sprite.setImage(Icons.GRASS);
        sprite.debug("");
        sprite.setBackground(0, 145, 0);
        sprite.removeBorder();
    }

}
