package enemyClasses;

import game.Icons; 
import game.Enemy;
import game.gametools.Directions;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JLabel;

public class Trickster extends Enemy {

    public final String NAME = "Trickster";
    
    public int level; 

    public String attack1 = "Trickster attack 1";
    public String attack2 = "Trickster attack 2";
    public String attack3 = "Trickster attack 3";
    public String attack4 = "Trickster attack 4";

    public int damage;      // how much damage you do (can be increased)
    public int dodgeChance; // your chance of dodging  (can be increased)
    public int maxHealth;   // the maximum amount of health you can have (can be increased) 
    public int health;      // how much health you have (can be increased)
    public int punchSpeed;  // how fast you hit (can be increased)
    
    private int baseDamage      = 1; 
    private int baseDodgeChance = 5;
    private int baseHealth      = 100; 
    private int baseMaxHealth   = 100; 
    private int basePunchSpeed  = 1000; 
    
    public int attack1Cooldown;
    public int attack2Cooldown;    
    public int attack3Cooldown;   
    public int attack4Cooldown;
    
    public int attack1Duration;     
    public int attack2Duration;     
    public int attack3Duration;   
    public int attack4Duration;

    public Trickster(JLabel image, int amount, int direction, int numberOfDirections, int delay, int level) throws MalformedURLException {
        super(image, 0, Directions.STOP, 0, 0);

        this.level = level; 
        
        attack1Cooldown = 3000; 
        attack2Cooldown = 3000; 
        attack3Cooldown = 5000; 
        attack4Cooldown = 10000; 
        
        attack1Duration = punchSpeed; 
        attack2Duration = punchSpeed; 
        attack3Duration = punchSpeed; 
        attack4Duration = punchSpeed; 
        
        damage      = (baseDamage      + level); 
        dodgeChance = (baseDodgeChance + level); 
        health      = (baseHealth      + level); 
        maxHealth   = (baseMaxHealth   + level); 
        punchSpeed  = (basePunchSpeed  + level); 
        
        super.attack1 = attack1;
        super.attack2 = attack2;
        super.attack3 = attack3;
        super.attack4 = attack4;

        super.damage      = damage;
        super.dodgeChance = dodgeChance;
        super.health      = health;
        super.punchSpeed  = punchSpeed;
        super.name        = NAME;
        super.level       = this.level; 

        sprite.setImage(Icons.TRICKSTER_IDLE_DOWN);
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
