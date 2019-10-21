package nuetral.trainers;

import javax.swing.JLabel;

/**
 * DamageTrainer.java - Represents a "Damage Trainer" object
 *
 * @author g.lumsden
 * @since 14-May-2019
 */
public class HealthTrainer extends Trainer {

    public HealthTrainer(JLabel image) {
        super(image);
        super.sprite.setImage("/animations/trainers/health/down/healthIdle.png");
        super.stat = "health"; 
    }

}
