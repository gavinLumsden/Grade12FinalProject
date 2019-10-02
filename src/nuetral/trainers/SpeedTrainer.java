package nuetral.trainers;

import game.gametools.Directions;
import game.gametools.GameObject;
import javax.swing.JLabel;

/**
 * DamageTrainer.java - Represents a "Speed Trainer" object
 *
 * @author g.lumsden
 * @since 14-May-2019
 */
public class SpeedTrainer extends GameObject {

    /**
     * Constructor for the class
     *
     * @param image
     */
    public SpeedTrainer(JLabel image) {
        super(image, 0, Directions.STOP, 0);
        sprite.debug("");
    }

}
