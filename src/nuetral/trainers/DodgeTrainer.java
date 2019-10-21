package nuetral.trainers;

import javax.swing.JLabel;

/**
 * DamageTrainer.java - Represents a "Damage Trainer" object
 *
 * @author g.lumsden
 * @since 14-May-2019
 */
public class DodgeTrainer extends Trainer {

    public DodgeTrainer(JLabel image) {
        super(image);
        super.sprite.setImage("/animations/trainers/dodge/down/dodgeIdle.png");
        super.stat = "dodge"; 
    }

}
