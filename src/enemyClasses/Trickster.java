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

    public int damage;      // how much damage you do (can be increased)
    public int dodgeChance; // your chance of dodging  (can be increased)
    public int maxHealth;   // the maximum amount of health you can have (can be increased) 
    public int health;      // how much health you have (can be increased)
    public int punchSpeed;  // how fast you hit (can be increased)
    
    public int attack1Cooldown;
    public int attack2Cooldown;    
    public int attack3Cooldown;   
    public int attack4Cooldown;
    
    public int attack1Duration;     
    public int attack2Duration;     
    public int attack3Duration;   
    public int attack4Duration;

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
