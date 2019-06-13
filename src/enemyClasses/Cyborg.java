package enemyClasses;

import game.Enemy;
import game.gametools.Directions;
import javax.swing.JLabel;

public class Cyborg extends Enemy
{

    public Cyborg(JLabel image, int amount, int direction, int numberOfDirections, int delay) {
        super(image, 0, Directions.STOP, 0, 0);
        sprite.setImage("/animations/cyborg/right/cyborgIdle.png");
        sprite.debug("");
        sprite.removeBorder();
    }

    @Override
    public void action() {
        
    }
    
}
