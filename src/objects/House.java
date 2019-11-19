package objects;

import game.Icons;
import game.gametools.Directions;
import game.gametools.GameObject;
import java.net.MalformedURLException;
import java.net.URL;
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
    public House(JLabel image) throws MalformedURLException {
        super(image, 0, Directions.STOP, 0);
        sprite.setImage(Icons.HOUSE);
        sprite.debug("");
        sprite.setBackground(0, 0, 255);
        sprite.removeBorder();
    }

}
