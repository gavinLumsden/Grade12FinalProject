package enemyClasses;

import game.Enemy;
import game.Icons;
import game.gametools.Directions;
import javax.swing.JLabel;

public class Engineer extends Enemy {

    public final String NAME = "Engineer";
    
    public int level; 

    public String attack1 = "Engineer attack 1";
    public String attack2 = "Engineer attack 2";
    public String attack3 = "Engineer attack 3";
    public String attack4 = "Engineer attack 4";

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

    public Engineer(JLabel image, int amount, int direction, int numberOfDirections, int delay, int level) {
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

        sprite.setImage(Icons.ENGINEER_IDLE_DOWN);
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
