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
                    + "Ability 1: Boost, increases dodge stat for _ seconds\n"
                    + "Ability 2: Stab, does x1.5 damage\n"
                    + "Ablilty 3: Cut, makes the enemy bleed (loses more health over time)\n"
                    + "Ability 4: 100% to dodge the next 3 attacks\n"
                    + "Passive: Evasive, back stab, when you dodge an attack you have a _% chance to hit the enemy back\n"
                    + "Ultimate: NAME_HERE, raises dodge stat for the rest of the battle");
        } else if (selected.equals("gambler")) {
            JOptionPane.showMessageDialog(null, "Class: Gambler\n\n"
                    + "Ability 1: \n"
                    + "Ability 2: \n"
                    + "Ablilty 3: \n"
                    + "Ability 4: \n"
                    + "Passive: \n"
                    + "Ultimate: ");
        } else if (selected.equals("hacker")) {
            JOptionPane.showMessageDialog(null, "Class: Hacker\n\n"
                    + "Ability 1: Hack, disables enemy punch for _ seconds \n"
                    + "Ability 2: Cheater, increases damage for _ seconds\n"
                    + "Ablilty 3: Cheat code, replaces this ability with one from your enemy\n"
                    + "Ability 4: 'Why you hittin yourself?', next time the enemy uses an ability they hit themself\n"
                    + "Passive: Matrix, enemy abilities have a higher chance of missing you\n"
                    + "Ultimate: EMP, disables all enemy abilities for _ seconds");
        } else if (selected.equals("juggernaut")) {
            JOptionPane.showMessageDialog(null, "Class: Juggernaut\n\n"
                    + "Ability 1: Harden, raises defence stat\n"
                    + "Ability 2: Intimidate, lowers the enemies attack by _\n"
                    + "Ablilty 3: Hold, next punch cannnot be dodged, does x2 damage\n"
                    + "Ability 4: Bash, stuns the enemy for _ seconds\n"
                    + "Passive: Big boi, cannot dodge, defence is doubled\n"
                    + "Ultimate: Iron skin, immune to damage for _ seconds");
        } else if (selected.equals("mage")) {
            JOptionPane.showMessageDialog(null, "Class: Mage\n\n"
                    + "Ability 1: \n"
                    + "Ability 2: \n"
                    + "Ablilty 3: \n"
                    + "Ability 4: \n"
                    + "Passive: \n"
                    + "Ultimate: ");
        }  else if (selected.equals("vampire")) {
            JOptionPane.showMessageDialog(null, "Class: Vampire\n\n"
                    + "Ability 1: Leech, get _ (possibly 10) % more health (based on the damage you deal next punch)\n"
                    + "Ability 2: Bite, makes the enemy bleed\n"
                    + "Ablilty 3: Bats, stuns enemy for _ seconds\n"
                    + "Ability 4: Coffin, raises your defence for 3 attacks, \n"
                    + "after the third attack *jump* out of your coffin and do x3 more damage\n"
                    + "Passive: Every 5th hit has life steal\n"
                    + "Ultimate: NAME_HERE, steals a _% of the enemies health (based on your damage stat)\n"
                    + "*Ult removes passive while active*");
        } 
    }

}
