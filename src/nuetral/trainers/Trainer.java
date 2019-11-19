package nuetral.trainers;

import game.gametools.Directions;
import game.gametools.GameObject;
import java.net.MalformedURLException;
import javax.swing.JLabel;

/**
 * DamageTrainer.java - Represents a "Damage Trainer" object
 *
 * @author g.lumsden
 * @since 14-May-2019
 */
public class Trainer extends GameObject {

    public String stat; 
    public String quote; 
    public String price; 
    
    /**
     * Constructor for the class
     *
     * @param image
     */
    public Trainer(JLabel image) throws MalformedURLException {
        super(image, 0, Directions.STOP, 0);
        sprite.debug("");
    }

}
