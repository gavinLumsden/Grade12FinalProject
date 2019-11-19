package nuetral.trainers;

import game.Icons;
import java.net.MalformedURLException;
import javax.swing.JLabel;

/**
 * DamageTrainer.java - Represents a "Damage Trainer" object
 *
 * @author g.lumsden
 * @since 14-May-2019
 */
public class DodgeTrainer extends Trainer {

    public String stat = "dodge"; 
    public String quote = "Trainer Dodge says: move"; 
    public String price = "+1% dodge chance = 100 gold"; 

    public DodgeTrainer(JLabel image) throws MalformedURLException {
        super(image);
        super.sprite.setImage(Icons.TRAINER_DODGE_IDLE_DOWN);
        super.stat = stat; 
        super.quote = quote; 
        super.price = price; 
    }

}
