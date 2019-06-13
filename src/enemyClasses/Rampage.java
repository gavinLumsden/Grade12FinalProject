package enemyClasses;

import game.Enemy;
import game.gametools.Directions;
import javax.swing.JLabel;

public class Rampage extends Enemy
{

    public Rampage(JLabel image, int amount, int direction, int numberOfDirections, int delay) {
        super(image, 0, Directions.STOP, 0, 0);
        sprite.setImage("/animations/rampage/right/rampageIdle.png");
        sprite.debug("");
        sprite.removeBorder();
    }

    @Override
    public void action() {
        
    }
    
}
