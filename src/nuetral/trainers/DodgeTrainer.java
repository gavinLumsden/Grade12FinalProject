package nuetral.trainers;

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

    public DodgeTrainer(JLabel image) {
        super(image);
        super.sprite.setImage("/animations/trainers/dodge/down/dodgeIdle.png");
        super.stat = stat; 
        super.quote = quote; 
        super.price = price; 
    }

}
