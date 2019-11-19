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
public class DamageTrainer extends Trainer {

    public String stat = "damage"; 
    public String quote = "Trainer Damage says: now that's a lot of damage!"; 
    public String price = "+1 damage = 100 gold"; 

    public DamageTrainer(JLabel image) throws MalformedURLException {
        super(image);
        super.sprite.setImage(Icons.TRAINER_DAMAGE_IDLE_DOWN);
        super.stat = stat; 
        super.quote = quote; 
        super.price = price; 
    }

}
