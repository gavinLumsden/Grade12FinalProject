package game;

import javax.swing.JOptionPane;

public class Abilities {

    /**
     * Default constructor for the class, sets class properties
     *
     * @param selected
     */
    public Abilities(String selected) {
        if (selected.equals("bandit")) {
            JOptionPane.showMessageDialog(null, "Class: Bandit\n\n"
                    + "Ability 1: Swift,     increases dodge stat for _ seconds\n"
                    + "Ability 2: Poison,    slows the enemy down for _ seconds\n"
                    + "Ablilty 3: Stab,      makes the enemy bleed\n"
                    + "Ability 4: Evade,     100% to dodge the next _ attacks\n"
                    + "Passive:   Back Stab, when you dodge an attack you have a _% chance to hit the enemy back\n"
                    + "Ultimate:  Elusive,   raises dodge stat for the rest of the battle");
        } else if (selected.equals("gambler")) {
            JOptionPane.showMessageDialog(null, "Class: Gambler\n\n"
                    + "Ability 1: NAME_HERE, ABILITY_HERE\n"
                    + "Ability 2: NAME_HERE, ABILITY_HERE\n"
                    + "Ablilty 3: NAME_HERE, ABILITY_HERE\n"
                    + "Ability 4: NAME_HERE, ABILITY_HERE\n"
                    + "Passive:   NAME_HERE, PASSIVE_HERE\n"
                    + "Ultimate:  NAME_HERE, ULTIMATE_HERE");
        } else if (selected.equals("hacker")) {
            JOptionPane.showMessageDialog(null, "Class: Hacker\n\n"
                    + "Ability 1: Crash,       disables enemy punch for _ seconds \n"
                    + "Ability 2: Virus,       increases damage for _ seconds\n"
                    + "Ablilty 3: Copy,        replaces this ability with one from your enemy\n"
                    + "Ability 4: Reflect.exe, next time the enemy uses an ability they hit themself\n"
                    + "Passive:   Evasive,     enemy abilities have a higher chance of missing you\n"
                    + "Ultimate:  EMP,         disables all enemy abilities for _ seconds");
        } else if (selected.equals("juggernaut")) {
            JOptionPane.showMessageDialog(null, "Class: Juggernaut\n\n"
                    + "Ability 1: Unbreakable, take less damage\n"
                    + "Ability 2: Intimidate,  lowers the enemies attack by _%\n"
                    + "Ablilty 3: Unstoppable, next punch cannnot be dodged, does x_ damage\n"
                    + "Ability 4: Bash,        stuns the enemy for _ seconds\n"
                    + "Passive:   Iron Skin,   has more health\n"
                    + "Ultimate:  Invincible,  immune to damage for _ seconds");
        } else if (selected.equals("mage")) {
            JOptionPane.showMessageDialog(null, "Class: Mage\n\n"
                    + "Ability 1: Burn,     Burns the enemy\n"
                    + "Ability 2: Freeze,   slows the enemy down\n"
                    + "Ablilty 3: NAME_HERE, ABILITY_HERE\n"
                    + "Ability 4: NAME_HERE, ABILITY_HERE\n"
                    + "Passive:   Incinerator, every hit burns the enemy (very low damage)\n"
                    + "Ultimate:  ULTIMATE_HERE, ULTIMATE_HERE");
        }  else if (selected.equals("vampire")) {
            JOptionPane.showMessageDialog(null, "Class: Vampire\n\n"
                    + "Ability 1: Absorb,    get _% of your next punchs damage as health\n"
                    + "Ability 2: Bite,      makes the enemy bleed for _ seconds\n"
                    + "Ablilty 3: Frighten,  stuns enemy for _ seconds\n"
                    + "Ability 4: Coffin,    invulnerable for _ attacks, on the last attack do _x more damage"
                    + "Passive:   Leech,     every _ hit has life steal\n"
                    + "Ultimate:  Consume,   get _% of your next punchs damage as health");
        } 
    }

}

// kevin is gay and wants to add upgrading abilities