package nuetral.trainers;

import game.Icons;
import javax.swing.JLabel;

/**
 * DamageTrainer.java - Represents a "Damage Trainer" object
 *
 * @author g.lumsden
 * @since 14-May-2019
 */
public class HealthTrainer extends Trainer {

    public String stat = "health"; 
    public String quote = "Trainer Health says: heros sometimes die"; 
    public String price = "+1 health = 100 gold"; 

    public HealthTrainer(JLabel image) {
        super(image);
        super.sprite.setImage(Icons.TRAINER_HEALTH_IDLE_DOWN);
        super.stat = stat; 
        super.quote = quote; 
        super.price = price; 
    }

}
