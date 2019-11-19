package nuetral.shopkeeper;

import game.Icons;
import game.gametools.Directions;
import game.gametools.GameObject;
import javax.swing.JLabel;

/**
 * DamageTrainer.java - Represents a "Shopkeeper" object
 *
 * @author g.lumsden
 * @since 14-May-2019
 */
public class Shopkeeper extends GameObject {

    /**
     * Constructor for the class
     *
     * @param image
     */
    public Shopkeeper(JLabel image) {
        super(image, 0, Directions.STOP, 0);
        sprite.setImage(Icons.SHOPKEEPER_2_IDLE_DOWN);
        sprite.debug("");
        sprite.removeBorder();
    }

}
