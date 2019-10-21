package nuetral.trainers;

import javax.swing.JLabel;

/**
 * DamageTrainer.java - Represents a "Damage Trainer" object
 *
 * @author g.lumsden
 * @since 14-May-2019
 */
public class SpeedTrainer extends Trainer {

    public String stat = "speed"; 
    public String quote = "Trainer Speed says: fast"; 
    public String price = "+1 punch speed = 100 gold"; 

    public SpeedTrainer(JLabel image) {
        super(image);
        super.sprite.setImage("/animations/trainers/speed/down/speedIdle.png");
        super.stat = stat; 
        super.quote = quote; 
        super.price = price; 
    }

}
