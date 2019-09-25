package enemyClasses;

import game.Enemy;
import game.gametools.Directions;
import javax.swing.JLabel;

public class Kingpin extends Enemy {

    public final String NAME = "Kingpin";

    public String attack1 = "kingpin attack 1";
    public String attack2 = "kingpin attack 2";
    public String attack3 = "kingpin attack 3";
    public String attack4 = "kingpin attack 4";

    public int health      = 100;  // how much health you have, can be increased
    public int punchSpeed  = 1000; // how fast you hit
    public int dodgeChance = 1;    // your chance of dodging
    public int damage      = 1;    // how much damage you do

    public Kingpin(JLabel image, int amount, int direction, int numberOfDirections, int delay) {
        super(image, 0, Directions.STOP, 0, 0);

        super.attack1 = attack1;
        super.attack2 = attack2;
        super.attack3 = attack3;
        super.attack4 = attack4;

        super.damage      = damage;
        super.dodgeChance = dodgeChance;
        super.health      = health;
        super.punchSpeed  = punchSpeed;

        super.name = NAME;

        sprite.setImage("/animations/kingpin/right/kingpinIdle.png");
        sprite.debug("");
        sprite.removeBorder();
    }

    @Override
    public void action() {

    }

    @Override
    public void attack1() {

    }

    @Override
    public void attack2() {

    }

    @Override
    public void attack3() {

    }

    @Override
    public void attack4() {

    }

    @Override
    public void resetAttack1() {
   
    }

    @Override
    public void resetAttack2() {
   
    }

    @Override
    public void resetAttack3() {
  
    }

    @Override
    public void resetAttack4() {
   
    }

}
