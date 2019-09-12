package enemyClasses;

import game.Enemy;
import game.gametools.Directions;
import javax.swing.JLabel;

public class Trickster extends Enemy {

    public final String NAME = "Trickster";

    public String attack1 = "trickster attack 1";
    public String attack2 = "trickster attack 2";
    public String attack3 = "trickster attack 3";
    public String attack4 = "trickster attack 4";

    public int health      = 100;  // how much health you have, can be increased
    public int punchSpeed  = 1000; // how fast you hit
    public int dodgeChance = 1;    // your chance of dodging
    public int damage      = 1;    // how much damage you do

    public Trickster(JLabel image, int amount, int direction, int numberOfDirections, int delay) {
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

        sprite.setImage("/animations/trickster/right/tricksterIdle.png");
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

}
