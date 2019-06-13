package enemyClasses;

import game.Enemy;
import game.gametools.Directions;
import javax.swing.JLabel;

public class Kingpin extends Enemy
{

    public Kingpin(JLabel image, int amount, int direction, int numberOfDirections, int delay) {
        super(image, 0, Directions.STOP, 0, 0);
        sprite.setImage("/animations/kingpin/right/kingpinIdle.png");
        sprite.debug("");
        sprite.removeBorder();
    }

    @Override
    public void action() {
        
    }
    
}
