package nuetral.trainers;

import javax.swing.JLabel;

/**
 * DamageTrainer.java - Represents a "Damage Trainer" object
 *
 * @author g.lumsden
 * @since 14-May-2019
 */
public class DamageTrainer extends Trainer {

    public DamageTrainer(JLabel image) {
        super(image);
        super.sprite.setImage("/animations/trainers/damage/down/damageIdle.png");
        super.stat = "damage"; 
    }

}
