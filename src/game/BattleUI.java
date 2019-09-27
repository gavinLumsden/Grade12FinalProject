package game;

import game.gametools.GameCharacter;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import playerClasses.CharacterData;

/**
 * This is a JFrame that is used for the hero and the enemies to "battle"
 * 
 * @author g.lumsden
 */
public class BattleUI extends javax.swing.JFrame {

    // used to determine if the player is currently using attacks or items
    private boolean onItem = false;
    private boolean onAttack = false;

    private final int FORM_WIDTH = 1020; // width of the form
    private final int FORM_HEIGHT = 540; // height of the form

    private GameCharacter heroClass; // the hero
    private Enemy enemy;             // the enemy to fight
    private GameEngine engine;       // used to run the battling 

    public int playerHealth;      // how much health the player has
    public int playerPunchSpeed;  // how fast the player punchs
    public int playerDodgeChance; // how much the player can dodge enemy attacks
    public int playerDamage;      // how much damage the player does

    public int playerBaseHealth;      // the original amount of health the player had                           (at the begining of the game) 
    public int playerBasePunchSpeed;  // the original speed of how fast the player punchs                       (at the begining of the game)  
    public int playerBaseDodgeChance; // the original percentage of how much the player can dodge enemy attacks (at the begining of the game) 
    public int playerBaseDamage;      // the original amount of damage the player had                           (at the begining of the game) 

    public int playerMaxHealth; // the maximum amount of health the player can have
    private String playerName;  // the name of the class the player is using 

    public int enemyHealth;      // how much health the enemy has
    public int enemyPunchSpeed;  // how fast the enemy punchs
    public int enemyDodgeChance; // how much the enemy can dodge enemy attacks
    public int enemyDamage;      // how much damage the enemy does

    public int enemyBaseHealth;      // the original amount of health the enemy had                           (at the begining of the game) 
    public int enemyBasePunchSpeed;  // the original speed of how fast the enemy punchs                       (at the begining of the game)  
    public int enemyBaseDodgeChance; // the original percentage of how much the enemy can dodge enemy attacks (at the begining of the game) 
    public int enemyBaseDamage;      // the original amount of damage the enemy had                           (at the begining of the game) 

    public int enemyMaxHealth; // the maximum amount of health the enemy can have
    private String enemyName;  // the name of the class of the enemy 

    private String playerAttack1; // the players first attack
    private String playerAttack2; // the players second attack
    private String playerAttack3; // the players third attack
    private String playerAttack4; // the players fourth attack

    private String enemyAttack1; // the enemy first attack
    private String enemyAttack2; // the enemy second attack
    private String enemyAttack3; // the enemy third attack
    private String enemyAttack4; // the enemy fourth attack

    private Timer playerPunching; // the timer used for the player to "punch"
    private Timer enemyPunching;  // the timer used for the enemy to "punch"
    private Timer update;         // the timer used to update the stats of the player and enemy

    // the timer used to add a "cooldown" effect to the players abilities
    private Timer attack1Cooldown;
    private Timer attack2Cooldown;
    private Timer attack3Cooldown;
    private Timer attack4Cooldown;

    // the timer used to add a "duration" effect to the players abilities
    private Timer attack1Duration;
    private Timer attack2Duration;
    private Timer attack3Duration;
    private Timer attack4Duration;

    // "effects" that can be used on the enemy and player
    private Timer playerBleed;
    private Timer playerStun;
    private Timer playerDisablePunch;
    private Timer playerDisableAbilities;
    private Timer enemyBleed;
    private Timer enemyStun;
    private Timer enemyDisablePunch;
    private Timer enemyDisableAbilities;

    // used while the players attacks are on "cooldown"
    private boolean attack1Usable;
    private boolean attack2Usable;
    private boolean attack3Usable;
    private boolean attack4Usable;

    /**
     * Constructor for the battle UI
     * @param engine the Game Engine
     * @param heroClass the hero
     * @param enemy the enemy to fight
     */
    public BattleUI(GameEngine engine, GameCharacter heroClass, Enemy enemy) {
        initComponents();
        this.engine = engine;
        this.heroClass = heroClass;
        this.enemy = enemy;
        setupEnemy();
        setupPlayer();
        setupMusic();
        setupPlayerAttacks();
        setupEffects(); 
        setupPunching();
        update();
        setupForm();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRun = new javax.swing.JButton();
        enemyHealthBar = new javax.swing.JProgressBar();
        bossOnlyUltimate = new javax.swing.JProgressBar();
        playerUltimate = new javax.swing.JProgressBar();
        playerHealthBar = new javax.swing.JProgressBar();
        btnAttackOrItem2 = new javax.swing.JLabel();
        btnAttackOrItem4 = new javax.swing.JLabel();
        btnAttackOrItem1 = new javax.swing.JLabel();
        btnAttackOrItem3 = new javax.swing.JLabel();
        btnSwitchBetweenItemsAndAttacks = new javax.swing.JLabel();
        notPokemonPicture1 = new javax.swing.JLabel();
        notPokemonPicture2 = new javax.swing.JLabel();
        lblPlayerNameAndStats = new javax.swing.JLabel();
        lblEnemyNameAndStats = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        btnRun.setText("Run");
        btnRun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRunMouseClicked(evt);
            }
        });
        getContentPane().add(btnRun);
        btnRun.setBounds(903, 10, 90, 23);

        enemyHealthBar.setForeground(new java.awt.Color(0, 255, 51));
        enemyHealthBar.setValue(100);
        enemyHealthBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        enemyHealthBar.setOpaque(true);
        getContentPane().add(enemyHealthBar);
        enemyHealthBar.setBounds(10, 10, 240, 18);

        bossOnlyUltimate.setForeground(new java.awt.Color(0, 255, 51));
        bossOnlyUltimate.setValue(100);
        bossOnlyUltimate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bossOnlyUltimate.setOpaque(true);
        getContentPane().add(bossOnlyUltimate);
        bossOnlyUltimate.setBounds(10, 30, 120, 18);

        playerUltimate.setForeground(new java.awt.Color(0, 255, 51));
        playerUltimate.setValue(100);
        playerUltimate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        playerUltimate.setOpaque(true);
        getContentPane().add(playerUltimate);
        playerUltimate.setBounds(870, 330, 120, 18);

        playerHealthBar.setForeground(new java.awt.Color(0, 255, 51));
        playerHealthBar.setValue(100);
        playerHealthBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        playerHealthBar.setOpaque(true);
        getContentPane().add(playerHealthBar);
        playerHealthBar.setBounds(750, 310, 240, 18);

        btnAttackOrItem2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAttackOrItem2.setText("Attack 2");
        btnAttackOrItem2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAttackOrItem2.setOpaque(true);
        btnAttackOrItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAttackOrItem2MouseClicked(evt);
            }
        });
        getContentPane().add(btnAttackOrItem2);
        btnAttackOrItem2.setBounds(760, 370, 230, 60);

        btnAttackOrItem4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAttackOrItem4.setText("Attack 4");
        btnAttackOrItem4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAttackOrItem4.setOpaque(true);
        btnAttackOrItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAttackOrItem4MouseClicked(evt);
            }
        });
        getContentPane().add(btnAttackOrItem4);
        btnAttackOrItem4.setBounds(760, 440, 230, 60);

        btnAttackOrItem1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAttackOrItem1.setText("Attack 1");
        btnAttackOrItem1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAttackOrItem1.setOpaque(true);
        btnAttackOrItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAttackOrItem1MouseClicked(evt);
            }
        });
        getContentPane().add(btnAttackOrItem1);
        btnAttackOrItem1.setBounds(510, 370, 230, 60);

        btnAttackOrItem3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAttackOrItem3.setText("Attack 3");
        btnAttackOrItem3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAttackOrItem3.setOpaque(true);
        btnAttackOrItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAttackOrItem3MouseClicked(evt);
            }
        });
        getContentPane().add(btnAttackOrItem3);
        btnAttackOrItem3.setBounds(510, 440, 230, 60);

        btnSwitchBetweenItemsAndAttacks.setBackground(new java.awt.Color(255, 255, 153));
        btnSwitchBetweenItemsAndAttacks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSwitchBetweenItemsAndAttacks.setText("Items");
        btnSwitchBetweenItemsAndAttacks.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSwitchBetweenItemsAndAttacks.setOpaque(true);
        btnSwitchBetweenItemsAndAttacks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSwitchBetweenItemsAndAttacksMouseClicked(evt);
            }
        });
        btnSwitchBetweenItemsAndAttacks.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSwitchBetweenItemsAndAttacksKeyPressed(evt);
            }
        });
        getContentPane().add(btnSwitchBetweenItemsAndAttacks);
        btnSwitchBetweenItemsAndAttacks.setBounds(130, 400, 230, 60);

        notPokemonPicture1.setBackground(new java.awt.Color(255, 204, 204));
        notPokemonPicture1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notPokemonPicture1.setText("totally not pokemon");
        notPokemonPicture1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        notPokemonPicture1.setOpaque(true);
        getContentPane().add(notPokemonPicture1);
        notPokemonPicture1.setBounds(500, 0, 500, 210);

        notPokemonPicture2.setBackground(new java.awt.Color(255, 204, 204));
        notPokemonPicture2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notPokemonPicture2.setText("totally not pokemon");
        notPokemonPicture2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        notPokemonPicture2.setOpaque(true);
        getContentPane().add(notPokemonPicture2);
        notPokemonPicture2.setBounds(0, 150, 500, 210);

        lblPlayerNameAndStats.setBackground(new java.awt.Color(204, 255, 204));
        lblPlayerNameAndStats.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayerNameAndStats.setText("pidgey level 11");
        lblPlayerNameAndStats.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblPlayerNameAndStats.setOpaque(true);
        getContentPane().add(lblPlayerNameAndStats);
        lblPlayerNameAndStats.setBounds(500, 210, 240, 150);

        lblEnemyNameAndStats.setBackground(new java.awt.Color(204, 255, 204));
        lblEnemyNameAndStats.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnemyNameAndStats.setText("pidgey level 11");
        lblEnemyNameAndStats.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblEnemyNameAndStats.setOpaque(true);
        getContentPane().add(lblEnemyNameAndStats);
        lblEnemyNameAndStats.setBounds(260, 0, 240, 150);

        background.setBackground(new java.awt.Color(204, 255, 255));
        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.setOpaque(true);
        getContentPane().add(background);
        background.setBounds(0, 0, 1000, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSwitchBetweenItemsAndAttacksKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSwitchBetweenItemsAndAttacksKeyPressed

    }//GEN-LAST:event_btnSwitchBetweenItemsAndAttacksKeyPressed

    /**
     * used to switch between the players attacks and items
     * 
     * @param evt 
     */
    private void btnSwitchBetweenItemsAndAttacksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSwitchBetweenItemsAndAttacksMouseClicked
        switchAttackOrItem();
    }//GEN-LAST:event_btnSwitchBetweenItemsAndAttacksMouseClicked

    /**
     * uses the players first item or attack
     * 
     * @param evt 
     */
    private void btnAttackOrItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAttackOrItem1MouseClicked
        if (onItem == true)
            useItem(1);
        else if (onAttack == true) {
            if (attack1Usable == true) {
                useAttack(1);
            }
        }
    }//GEN-LAST:event_btnAttackOrItem1MouseClicked

    /**
     * uses the players second item or attack
     * 
     * @param evt 
     */
    private void btnAttackOrItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAttackOrItem2MouseClicked
        if (onItem == true)
            useItem(2);
        else if (onAttack == true) {
            if (attack2Usable == true) {
                useAttack(2);
            }
        }
    }//GEN-LAST:event_btnAttackOrItem2MouseClicked

    /**
     * uses the players third item or attack
     * 
     * @param evt 
     */
    private void btnAttackOrItem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAttackOrItem3MouseClicked
        if (onItem == true)
            useItem(3);
        else if (onAttack == true) {
            if (attack3Usable == true) {
                useAttack(3);
            }
        }
    }//GEN-LAST:event_btnAttackOrItem3MouseClicked

    /**
     * uses the players fourth item or attack
     * 
     * @param evt 
     */
    private void btnAttackOrItem4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAttackOrItem4MouseClicked
        if (onItem == true)
            useItem(4);
        else if (onAttack == true) {
            if (attack4Usable == true) {
                useAttack(4);
            }
        }
    }//GEN-LAST:event_btnAttackOrItem4MouseClicked

    /**
     * used to "run away from" (end) a battle
     * 
     * @param evt 
     */
    private void btnRunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRunMouseClicked
        run();
    }//GEN-LAST:event_btnRunMouseClicked

    /**
     * Makes sure the player either has to battle or run
     * 
     * @param evt 
     */
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JProgressBar bossOnlyUltimate;
    private javax.swing.JLabel btnAttackOrItem1;
    private javax.swing.JLabel btnAttackOrItem2;
    private javax.swing.JLabel btnAttackOrItem3;
    private javax.swing.JLabel btnAttackOrItem4;
    private javax.swing.JButton btnRun;
    private javax.swing.JLabel btnSwitchBetweenItemsAndAttacks;
    private javax.swing.JProgressBar enemyHealthBar;
    private javax.swing.JLabel lblEnemyNameAndStats;
    private javax.swing.JLabel lblPlayerNameAndStats;
    private javax.swing.JLabel notPokemonPicture1;
    private javax.swing.JLabel notPokemonPicture2;
    private javax.swing.JProgressBar playerHealthBar;
    private javax.swing.JProgressBar playerUltimate;
    // End of variables declaration//GEN-END:variables

    /**
     * switches between the players attacks or items
     */
    private void switchAttackOrItem() {
        if (onItem == true) {
            switchToAttack();
        } else if (onAttack == true) {
            switchToItem();
        } else {
            System.out.println("error");
        }
    }

    /**
     * switches to the players attacks
     */
    private void switchToAttack() {
        onItem = false;
        onAttack = true;
        btnSwitchBetweenItemsAndAttacks.setText("Items");
        btnAttackOrItem1.setText(playerAttack1);
        btnAttackOrItem2.setText(playerAttack2);
        btnAttackOrItem3.setText(playerAttack3);
        btnAttackOrItem4.setText(playerAttack4);
    }

    /**
     * switches to the players items
     */
    private void switchToItem() {
        onItem = true;
        onAttack = false;
        btnSwitchBetweenItemsAndAttacks.setText("Attacks");
        btnAttackOrItem1.setText("Item 1");
        btnAttackOrItem2.setText("Item 2");
        btnAttackOrItem3.setText("Item 3");
        btnAttackOrItem4.setText("Item 4");
    }

    /**
     * setups the form
     */
    private void setupForm() {
        this.setSize(FORM_WIDTH, FORM_HEIGHT);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * uses an item
     * @param itemToUse the item to use
     */
    private void useItem(int itemToUse) {
        if (itemToUse == 1) {
            System.out.println("item 1");
        } else if (itemToUse == 2) {
            System.out.println("item 2");
        } else if (itemToUse == 3) {
            System.out.println("item 3");
        } else if (itemToUse == 4) {
            System.out.println("item 4");
        } else {
            System.out.println("error using item");
        }
    }

    /**
     * uses an attack
     * @param attackToUse the attack to use
     */
    private void useAttack(int attackToUse) {
        if (attackToUse == 1) {
            btnAttackOrItem1.setBackground(Color.red);
            attack1Usable = false;
            heroClass.attack1();
            attack1Duration.start();
            attack1Cooldown.start();
            System.out.println(playerName + " used: " + heroClass.playerAttack1 + "!");
        } else if (attackToUse == 2) {
            btnAttackOrItem2.setBackground(Color.red);
            attack2Usable = false;
            heroClass.attack2();
            attack2Duration.start();
            attack2Cooldown.start();
            System.out.println(playerName + " used: " + heroClass.playerAttack2 + "!");
        } else if (attackToUse == 3) {
            btnAttackOrItem3.setBackground(Color.red);
            attack3Usable = false;
            heroClass.attack3();
            attack3Duration.start();
            attack3Cooldown.start();
            System.out.println(playerName + " used: " + heroClass.playerAttack3 + "!");
        } else if (attackToUse == 4) {
            btnAttackOrItem4.setBackground(Color.red);
            attack4Usable = false;
            heroClass.attack4();
            attack4Duration.start();
            attack4Cooldown.start();
            System.out.println(playerName + " used: " + heroClass.playerAttack4 + "!");
        } else {
            System.out.println("error using attack");
        }
    }

    /**
     * Generates a random number
     *
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @return the generated number
     */
    private int random(int low, int high) {
        double seed = Math.random();
        double L = (double) low;
        double H = (double) high;
        double number = (H - L + 1) * seed + L;
        int answer = (int) number;
        return answer;
    }

    /**
     * setups the music for the battle
     */
    private void setupMusic() {
        engine.mediaPlayer.stop();
        engine.mediaPlayer.playWAV("/sounds/fightSoundtrack.wav");
    }

    /**
     * setups the players attacks
     */
    private void setupPlayerAttacks() {
        if (heroClass.level >= 1) {
            heroClass.attack1HasBeenUnlocked = true; 
        } else if (heroClass.level >= 2) {
            heroClass.attack2HasBeenUnlocked = true; 
        } else if (heroClass.level >= 5) {
            heroClass.attack3HasBeenUnlocked = true; 
        } else if (heroClass.level >= 10) {
            heroClass.attack4HasBeenUnlocked = true; 
        }
        
        playerAttack1 = heroClass.playerAttack1;
        playerAttack2 = heroClass.playerAttack2;
        playerAttack3 = heroClass.playerAttack3;
        playerAttack4 = heroClass.playerAttack4;

        onAttack = true;

        btnAttackOrItem1.setText(playerAttack1);
        btnAttackOrItem2.setText(playerAttack2);
        btnAttackOrItem3.setText(playerAttack3);
        btnAttackOrItem4.setText(playerAttack4);

        if (heroClass.attack1HasBeenUnlocked == true) {
            btnAttackOrItem1.setBackground(Color.green);
            attack1Usable = true;
        } else if (heroClass.attack1HasBeenUnlocked == false) {
            btnAttackOrItem1.setBackground(Color.red);
            attack1Usable = false;
        }
        
        if (heroClass.attack2HasBeenUnlocked == true) {
            btnAttackOrItem2.setBackground(Color.green);
            attack2Usable = true;
        } else if (heroClass.attack2HasBeenUnlocked == false) {
            btnAttackOrItem2.setBackground(Color.red);
            attack2Usable = false;
        }
        
        if (heroClass.attack3HasBeenUnlocked == true) {
            btnAttackOrItem3.setBackground(Color.green);
            attack3Usable = true;
        } else if (heroClass.attack3HasBeenUnlocked == false) {
            btnAttackOrItem3.setBackground(Color.red);
            attack3Usable = false;
        }
        
        if (heroClass.attack4HasBeenUnlocked == true) {
            btnAttackOrItem4.setBackground(Color.green);
            attack4Usable = true;
        } else if (heroClass.attack4HasBeenUnlocked == false) {
            btnAttackOrItem4.setBackground(Color.red);
            attack4Usable = false;
        }

        attack1Cooldown = new Timer(heroClass.attack1Cooldown, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                btnAttackOrItem1.setBackground(Color.green);
                attack1Usable = true;
                attack1Cooldown.stop();
            }
        });
        attack2Cooldown = new Timer(heroClass.attack2Cooldown, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                btnAttackOrItem2.setBackground(Color.green);
                attack2Usable = true;
                attack2Cooldown.stop();
            }
        });
        attack3Cooldown = new Timer(heroClass.attack3Cooldown, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                btnAttackOrItem3.setBackground(Color.green);
                attack3Usable = true;
                attack3Cooldown.stop();
            }
        });
        attack4Cooldown = new Timer(heroClass.attack4Cooldown, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                btnAttackOrItem4.setBackground(Color.green);
                attack4Usable = true;
                attack4Cooldown.stop();
            }
        });

        attack1Duration = new Timer(heroClass.attack1Duration, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                heroClass.resetAttack1();
                attack1Duration.stop();
            }
        });
        attack2Duration = new Timer(heroClass.attack2Duration, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                heroClass.resetAttack2();
                attack2Duration.stop();
            }
        });
        attack3Duration = new Timer(heroClass.attack3Duration, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                heroClass.resetAttack3();
                attack3Duration.stop();
            }
        });
        attack4Duration = new Timer(heroClass.attack4Duration, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                heroClass.resetAttack4();
                attack4Duration.stop();
            }
        });
    }

    /**
     * setups the enemy and their stats
     */
    private void setupEnemy() {
        enemyDamage          = enemy.damage;
        enemyDodgeChance     = enemy.dodgeChance;
        enemyHealth          = enemy.health;
        enemyMaxHealth       = enemy.maxHealth; 
        enemyPunchSpeed      = enemy.punchSpeed;
        enemyBaseDamage      = enemy.damage;
        enemyBaseDodgeChance = enemy.dodgeChance;
        enemyBaseHealth      = enemy.health;
        enemyBasePunchSpeed  = enemy.punchSpeed;
        lblEnemyNameAndStats.setText(enemyName);
        enemyHealthBar.setValue(enemyMaxHealth);
        lblEnemyNameAndStats.setText(
                "<html><head></head><body>"
                + "Name: " + enemyName
                + "<br>"
                + "Damage: " + enemyDamage
                + "<br>"
                + "Dodge Chance: " + enemyDodgeChance
                + "<br>"
                + "Health: " + enemyHealth
                + "<br>"
                + "Punch Speed: " + enemyPunchSpeed
                + "</body></html>");
        System.out.println("You've encountered " + enemyName + "!");
    }

    /**
     * setups the player and their stats
     */
    private void setupPlayer() {
        playerDamage          = heroClass.playerDamage;
        playerDodgeChance     = heroClass.playerDodgeChance;
        playerHealth          = heroClass.playerHealth;
        playerMaxHealth       = heroClass.playerMaxHealth; 
        playerPunchSpeed      = heroClass.playerPunchSpeed;
        playerName            = heroClass.playerName;
        playerBaseDamage      = heroClass.playerDamage;
        playerBaseDodgeChance = heroClass.playerDodgeChance;
        playerBaseHealth      = heroClass.playerHealth;
        playerBasePunchSpeed  = heroClass.playerPunchSpeed;
        playerHealthBar.setValue(playerMaxHealth);
        lblPlayerNameAndStats.setText(
                "<html><head></head><body>"
                + "Name: " + playerName
                + "<br>"
                + "Damage: " + playerDamage
                + "<br>"
                + "Dodge Chance: " + playerDodgeChance
                + "<br>"
                + "Health: " + playerHealth
                + "<br>"
                + "Punch Speed: " + playerPunchSpeed
                + "</body></html>");
    }

    /**
     * setups the punching for the enemy and the player
     */
    private void setupPunching() {
        playerPunching = new Timer(playerPunchSpeed, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (enemyDodgeChance != 0) {
                    int hit = random(enemyDodgeChance, 100);
                    if (hit < 90) {
                        enemyHealth -= playerDamage;
                    } else {
                        System.out.println("enemy dodge!");
                    }
                } else {
                    enemyHealth -= playerDamage;
                }
            }
        });
        enemyPunching = new Timer(enemyPunchSpeed, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (playerDodgeChance != 0) {
                    int hit = random(playerDodgeChance, 100);
                    if (hit < 90) {
                        playerHealth -= enemyDamage;
                    } else {
                        System.out.println("player dodge!");
                    }
                } else {
                    playerHealth -= enemyDamage;
                }
            }
        });
        playerPunching.start();
        enemyPunching.start();
    }

    /**
     * updates the stats constantly
     */
    private void update() {
        update = new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (playerHealth <= 0) {
                    enemyWin();
                } else if (enemyHealth <= 0) {
                    playerWin();
                } else {
                    lblPlayerNameAndStats.setText(
                            "<html><head></head><body>"
                            + "Name: " + playerName
                            + "<br>"
                            + "Damage: " + playerDamage
                            + "<br>"
                            + "Dodge Chance: " + playerDodgeChance
                            + "<br>"
                            + "Health: " + playerHealth
                            + "<br>"
                            + "Punch Speed: " + playerPunchSpeed
                            + "</body></html>");
                    lblEnemyNameAndStats.setText(
                            "<html><head></head><body>"
                            + "Name: " + enemyName
                            + "<br>"
                            + "Damage: " + enemyDamage
                            + "<br>"
                            + "Dodge Chance: " + enemyDodgeChance
                            + "<br>"
                            + "Health: " + enemyHealth
                            + "<br>"
                            + "Punch Speed: " + enemyPunchSpeed
                            + "</body></html>");
                    playerHealthBar.setValue(playerHealth);
                    enemyHealthBar.setValue(enemyHealth);
                }
            }
        });
        update.start();
    }

    /**
     * when the player presses the run button (stops the battle)
     */
    private void run() {
        if (btnRun.isEnabled()) {
            int chance = random(1, 5); 
            if (chance != 5) {
                stopTimers(); 
                resetAbilities(); 
                engine.clearBattle(this);
                engine.play();
                int stats[] = {
                    playerDamage,
                    playerDodgeChance,
                    playerHealth,
                    playerMaxHealth, 
                    playerPunchSpeed, 
                    heroClass.level, 
                    heroClass.exp, 
                    heroClass.gold
                };
                stats = CharacterData.saveData(heroClass, stats);
            } else {
                btnRun.setEnabled(false);
                System.out.println("Oh no! You couldn't get away!");
            }
        } else {
            System.out.println("You coudln't get away!");
        }
    }

    /**
     * when the enemy wins
     */
    private void enemyWin() {
        stopTimers(); 
        resetAbilities(); 
        engine.clearAll(this); 
        JOptionPane.showMessageDialog(null, "Oh no, you died!");
        JOptionPane.showMessageDialog(null, "GAME OVER");
        Introduction introduction = new Introduction(); 
    }

    /**
     * when the player wins
     */
    private void playerWin() {
        giveExp();
        giveGold();
        stopTimers(); 
        resetAbilities(); 
        engine.clearBattle(this);
        engine.play();
        engine.clearBattle(this);
        engine.play();
        int random = random(1, 2);
        if (random == 1) {
            engine.mediaPlayer.stop();
            engine.mediaPlayer.playWAV("/sounds/walkingSoundtrack.wav");
        } else if (random == 2) {
            engine.mediaPlayer.stop();
            engine.mediaPlayer.playWAV("/sounds/introSoundtrack.wav");
        }
        int stats[] = {
            playerDamage,
            playerDodgeChance,
            playerHealth,
            playerMaxHealth, 
            playerPunchSpeed, 
            heroClass.level, 
            heroClass.exp, 
            heroClass.gold
        };
        stats = CharacterData.saveData(heroClass, stats);
    }

    /**
     * gives the player experience
     */
    private void giveExp() {
        heroClass.exp += 50;
        System.out.println("You got " + 50 + " exp!");
        if (heroClass.exp >= 100) {
            LevelUp levelUp = new LevelUp(heroClass); 
            heroClass.level++; 
            heroClass.exp -= 100; 
        }
    }

    /**
     * gives the player gold
     */
    private void giveGold() {
        heroClass.gold += 10; 
        System.out.println("You got " + 10 + " gold!");
    }

    /**
     * puts "effects" on the enemy
     * @param effect the effect to put on
     */
    public void enemyEffects(String effect) {
        if (effect.equals("bleed")) {
            enemyBleed.start();
        } else if (effect.equals("stop bleed")) {
            enemyBleed.stop();
        } else if (effect.equals("stun")) {
            enemyStun.start();
        } else if (effect.equals("stop stun")) {
            enemyStun.stop();
            enemyPunching.start();
        } else if (effect.equals("disable abilities")) {
            enemyDisableAbilities.start();
        } else if (effect.equals("enable abilities")) {
            enemyDisableAbilities.stop();
        }
    }

    /**
     * puts "effects" on the player
     * @param effect the effect to put on
     */
    public void playerEffects(String effect) {
        if (effect.equals("bleed")) {
            playerBleed.start();
        } else if (effect.equals("stop bleed")) {
            playerBleed.stop();
        } else if (effect.equals("stun")) {
            playerStun.start();
        } else if (effect.equals("stop stun")) {
            playerStun.stop();
            playerPunching.start();
        } else if (effect.equals("disable abilities")) {
            playerDisableAbilities.start();
        } else if (effect.equals("enable abilities")) {
            playerDisableAbilities.stop();
        }
    }

    /**
     * stops all the running timers
     */
    private void stopTimers() {
        playerPunching.stop();
        enemyPunching.stop();
        update.stop();
    }
    
    /**
     * resets the players abilities
     */
    private void resetAbilities() {
        heroClass.resetAttack1();
        heroClass.resetAttack2();
        heroClass.resetAttack3();
        heroClass.resetAttack4();
    }
    
    private void setupEffects() {
        enemyBleed = new Timer(playerPunchSpeed, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enemyHealth--;
            }
        });
        enemyStun = new Timer(playerPunchSpeed, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enemyPunching.stop();
            }
        });
        enemyDisableAbilities = new Timer(playerPunchSpeed, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {

            }
        });

        playerBleed = new Timer(enemyPunchSpeed, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playerHealth--;
            }
        });
        playerStun = new Timer(enemyPunchSpeed, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playerPunching.stop();
            }
        });
        playerDisableAbilities = new Timer(enemyPunchSpeed, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {

            }
        });
    }
    
}
