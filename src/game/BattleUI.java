package game;

import game.gametools.GameCharacter;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * This is a JFrame that is used for the hero and the enemies to "battle"
 * 
 * @author g.lumsden
 */
public class BattleUI extends javax.swing.JFrame {

    // used to determine if the player is currently using attacks or items
    private boolean onItem = false;
    private boolean onAttack = false;

    private final int FORM_WIDTH = 1382; // width of the form
    private final int FORM_HEIGHT = 807; // height of the form

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
        setupAnimations(); 
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

        playerHealthBar = new javax.swing.JProgressBar();
        enemyHealthBar = new javax.swing.JProgressBar();
        enemyUltimateBar = new javax.swing.JProgressBar();
        playerUltimateBar = new javax.swing.JProgressBar();
        playerSpeed = new javax.swing.JProgressBar();
        lblPlayerDodgeChance = new javax.swing.JLabel();
        lblPlayerDamage = new javax.swing.JLabel();
        btnRun = new javax.swing.JLabel();
        btnSwitch = new javax.swing.JLabel();
        btnUltimate = new javax.swing.JLabel();
        btnAttackOrItem1 = new javax.swing.JLabel();
        btnAttackOrItem2 = new javax.swing.JLabel();
        btnAttackOrItem4 = new javax.swing.JLabel();
        btnAttackOrItem3 = new javax.swing.JLabel();
        lblEnemyUltimate = new javax.swing.JLabel();
        lblPlayerUltimate = new javax.swing.JLabel();
        lblEnemyHealth = new javax.swing.JLabel();
        lblPlayerHealth = new javax.swing.JLabel();
        lblStatsBackground = new javax.swing.JLabel();
        lblEnemyFront = new javax.swing.JLabel();
        lblPlayerBack = new javax.swing.JLabel();
        lblWhiteBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        playerHealthBar.setForeground(new java.awt.Color(0, 255, 51));
        playerHealthBar.setValue(100);
        playerHealthBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        playerHealthBar.setOpaque(true);
        getContentPane().add(playerHealthBar);
        playerHealthBar.setBounds(930, 410, 376, 45);

        enemyHealthBar.setForeground(new java.awt.Color(0, 255, 51));
        enemyHealthBar.setValue(100);
        enemyHealthBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        enemyHealthBar.setOpaque(true);
        getContentPane().add(enemyHealthBar);
        enemyHealthBar.setBounds(59, 59, 365, 45);

        enemyUltimateBar.setForeground(new java.awt.Color(0, 255, 51));
        enemyUltimateBar.setValue(100);
        enemyUltimateBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        enemyUltimateBar.setOpaque(true);
        getContentPane().add(enemyUltimateBar);
        enemyUltimateBar.setBounds(60, 115, 212, 30);

        playerUltimateBar.setForeground(new java.awt.Color(0, 255, 51));
        playerUltimateBar.setValue(100);
        playerUltimateBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        playerUltimateBar.setOpaque(true);
        getContentPane().add(playerUltimateBar);
        playerUltimateBar.setBounds(1095, 370, 212, 30);

        playerSpeed.setForeground(new java.awt.Color(0, 255, 51));
        playerSpeed.setValue(100);
        playerSpeed.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        playerSpeed.setOpaque(true);
        getContentPane().add(playerSpeed);
        playerSpeed.setBounds(205, 702, 230, 30);

        lblPlayerDodgeChance.setBackground(new java.awt.Color(255, 255, 255));
        lblPlayerDodgeChance.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblPlayerDodgeChance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayerDodgeChance.setText("5%");
        lblPlayerDodgeChance.setOpaque(true);
        getContentPane().add(lblPlayerDodgeChance);
        lblPlayerDodgeChance.setBounds(222, 533, 145, 45);

        lblPlayerDamage.setBackground(new java.awt.Color(255, 255, 255));
        lblPlayerDamage.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblPlayerDamage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayerDamage.setText("2");
        lblPlayerDamage.setOpaque(true);
        getContentPane().add(lblPlayerDamage);
        lblPlayerDamage.setBounds(243, 618, 95, 45);

        btnRun.setBackground(new java.awt.Color(255, 255, 255));
        btnRun.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnRun.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRun.setText("Run");
        btnRun.setOpaque(true);
        btnRun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRunMouseClicked(evt);
            }
        });
        btnRun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnRunKeyPressed(evt);
            }
        });
        getContentPane().add(btnRun);
        btnRun.setBounds(1172, 50, 125, 15);

        btnSwitch.setBackground(new java.awt.Color(255, 255, 255));
        btnSwitch.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btnSwitch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSwitch.setText("Switch");
        btnSwitch.setOpaque(true);
        btnSwitch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSwitchMouseClicked(evt);
            }
        });
        btnSwitch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSwitchKeyPressed(evt);
            }
        });
        getContentPane().add(btnSwitch);
        btnSwitch.setBounds(476, 560, 250, 56);

        btnUltimate.setBackground(new java.awt.Color(255, 255, 255));
        btnUltimate.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btnUltimate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnUltimate.setText("Ultimate");
        btnUltimate.setOpaque(true);
        btnUltimate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUltimateMouseClicked(evt);
            }
        });
        btnUltimate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnUltimateKeyPressed(evt);
            }
        });
        getContentPane().add(btnUltimate);
        btnUltimate.setBounds(476, 655, 250, 56);

        btnAttackOrItem1.setBackground(new java.awt.Color(255, 255, 255));
        btnAttackOrItem1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btnAttackOrItem1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAttackOrItem1.setText("Attack 1");
        btnAttackOrItem1.setOpaque(true);
        btnAttackOrItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAttackOrItem1MouseClicked(evt);
            }
        });
        btnAttackOrItem1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAttackOrItem1KeyPressed(evt);
            }
        });
        getContentPane().add(btnAttackOrItem1);
        btnAttackOrItem1.setBounds(766, 560, 250, 56);

        btnAttackOrItem2.setBackground(new java.awt.Color(255, 255, 255));
        btnAttackOrItem2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btnAttackOrItem2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAttackOrItem2.setText("Attack 2");
        btnAttackOrItem2.setOpaque(true);
        btnAttackOrItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAttackOrItem2MouseClicked(evt);
            }
        });
        btnAttackOrItem2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAttackOrItem2KeyPressed(evt);
            }
        });
        getContentPane().add(btnAttackOrItem2);
        btnAttackOrItem2.setBounds(1057, 560, 250, 56);

        btnAttackOrItem4.setBackground(new java.awt.Color(255, 255, 255));
        btnAttackOrItem4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btnAttackOrItem4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAttackOrItem4.setText("Attack 4");
        btnAttackOrItem4.setOpaque(true);
        btnAttackOrItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAttackOrItem4MouseClicked(evt);
            }
        });
        btnAttackOrItem4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAttackOrItem4KeyPressed(evt);
            }
        });
        getContentPane().add(btnAttackOrItem4);
        btnAttackOrItem4.setBounds(1057, 655, 250, 56);

        btnAttackOrItem3.setBackground(new java.awt.Color(255, 255, 255));
        btnAttackOrItem3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btnAttackOrItem3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAttackOrItem3.setText("Attack 3");
        btnAttackOrItem3.setOpaque(true);
        btnAttackOrItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAttackOrItem3MouseClicked(evt);
            }
        });
        btnAttackOrItem3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAttackOrItem3KeyPressed(evt);
            }
        });
        getContentPane().add(btnAttackOrItem3);
        btnAttackOrItem3.setBounds(766, 655, 250, 56);

        lblEnemyUltimate.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblEnemyUltimate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnemyUltimate.setText("100");
        lblEnemyUltimate.setToolTipText("");
        getContentPane().add(lblEnemyUltimate);
        lblEnemyUltimate.setBounds(280, 115, 56, 27);

        lblPlayerUltimate.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblPlayerUltimate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayerUltimate.setText("100");
        lblPlayerUltimate.setToolTipText("");
        getContentPane().add(lblPlayerUltimate);
        lblPlayerUltimate.setBounds(1027, 370, 55, 30);

        lblEnemyHealth.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblEnemyHealth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnemyHealth.setText("100");
        getContentPane().add(lblEnemyHealth);
        lblEnemyHealth.setBounds(437, 60, 75, 45);

        lblPlayerHealth.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblPlayerHealth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayerHealth.setText("100");
        getContentPane().add(lblPlayerHealth);
        lblPlayerHealth.setBounds(844, 410, 75, 45);

        lblStatsBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/battling/statsBackground.png"))); // NOI18N
        lblStatsBackground.setToolTipText("");
        getContentPane().add(lblStatsBackground);
        lblStatsBackground.setBounds(0, 0, 1370, 770);

        lblEnemyFront.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/playerclasses/vampire/fightFront/fightFront.png"))); // NOI18N
        getContentPane().add(lblEnemyFront);
        lblEnemyFront.setBounds(10, 10, 1350, 750);

        lblPlayerBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/playerclasses/bandit/fightBack/fightBack.png"))); // NOI18N
        getContentPane().add(lblPlayerBack);
        lblPlayerBack.setBounds(10, 10, 1350, 750);

        lblWhiteBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/battling/whiteBackground.png"))); // NOI18N
        lblWhiteBackground.setToolTipText("");
        getContentPane().add(lblWhiteBackground);
        lblWhiteBackground.setBounds(0, 0, 1370, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAttackOrItem1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAttackOrItem1KeyPressed
        
    }//GEN-LAST:event_btnAttackOrItem1KeyPressed

    /**
     * used to switch between the players attacks and items
     * 
     * @param evt 
     */
    private void btnAttackOrItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAttackOrItem1MouseClicked
        if (attack1Usable == true) {
            if (onAttack == true) {
                useAttack(1); 
            }
        } else {
            if (onItem == true) {
                useItem(1); 
            }
        }
    }//GEN-LAST:event_btnAttackOrItem1MouseClicked

    
    /**
     * Makes sure the player either has to battle or run
     * 
     * @param evt 
     */
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void btnRunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRunMouseClicked
        run(); 
    }//GEN-LAST:event_btnRunMouseClicked

    private void btnRunKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRunKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRunKeyPressed

    private void btnSwitchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSwitchMouseClicked
        switchAttackOrItem(); 
    }//GEN-LAST:event_btnSwitchMouseClicked

    private void btnSwitchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSwitchKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSwitchKeyPressed

    private void btnUltimateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUltimateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUltimateMouseClicked

    private void btnUltimateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnUltimateKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUltimateKeyPressed

    private void btnAttackOrItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAttackOrItem2MouseClicked
        if (attack2Usable == true) {
            if (onAttack == true) {
                useAttack(2); 
            }
        } else {
            if (onItem == true) {
                useItem(2); 
            }
        }
    }//GEN-LAST:event_btnAttackOrItem2MouseClicked

    private void btnAttackOrItem2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAttackOrItem2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAttackOrItem2KeyPressed

    private void btnAttackOrItem4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAttackOrItem4MouseClicked
        if (attack4Usable == true) {
            if (onAttack == true) {
                useAttack(4); 
            }
        } else {
            if (onItem == true) {
                useItem(4); 
            }
        }
    }//GEN-LAST:event_btnAttackOrItem4MouseClicked

    private void btnAttackOrItem4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAttackOrItem4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAttackOrItem4KeyPressed

    private void btnAttackOrItem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAttackOrItem3MouseClicked
        if (attack3Usable == true) {
            if (onAttack == true) {
                useAttack(3); 
            }
        } else {
            if (onItem == true) {
                useItem(3); 
            }
        }
    }//GEN-LAST:event_btnAttackOrItem3MouseClicked

    private void btnAttackOrItem3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAttackOrItem3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAttackOrItem3KeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAttackOrItem1;
    private javax.swing.JLabel btnAttackOrItem2;
    private javax.swing.JLabel btnAttackOrItem3;
    private javax.swing.JLabel btnAttackOrItem4;
    private javax.swing.JLabel btnRun;
    private javax.swing.JLabel btnSwitch;
    private javax.swing.JLabel btnUltimate;
    private javax.swing.JProgressBar enemyHealthBar;
    private javax.swing.JProgressBar enemyUltimateBar;
    private javax.swing.JLabel lblEnemyFront;
    private javax.swing.JLabel lblEnemyHealth;
    private javax.swing.JLabel lblEnemyUltimate;
    private javax.swing.JLabel lblPlayerBack;
    private javax.swing.JLabel lblPlayerDamage;
    private javax.swing.JLabel lblPlayerDodgeChance;
    private javax.swing.JLabel lblPlayerHealth;
    private javax.swing.JLabel lblPlayerUltimate;
    private javax.swing.JLabel lblStatsBackground;
    private javax.swing.JLabel lblWhiteBackground;
    private javax.swing.JProgressBar playerHealthBar;
    private javax.swing.JProgressBar playerSpeed;
    private javax.swing.JProgressBar playerUltimateBar;
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
            System.out.println("error switching attacks and items");
        }
    }

    /**
     * switches to the players attacks
     */
    private void switchToAttack() {
        onItem = false;
        onAttack = true;
        btnAttackOrItem1.setText("Items");
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
        btnAttackOrItem1.setText("Attacks");
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
        } 
        if (heroClass.level >= 2) {
            heroClass.attack2HasBeenUnlocked = true; 
        } 
        if (heroClass.level >= 5) {
            heroClass.attack3HasBeenUnlocked = true; 
        } 
        if (heroClass.level >= 10) {
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
        lblPlayerDamage.setText(enemyName);
        enemyHealthBar.setValue(enemyMaxHealth);
        lblPlayerDamage.setText(
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
        lblPlayerDodgeChance.setText(playerDodgeChance + "");
        lblPlayerDamage.setText(playerDamage + "");
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
                    lblPlayerDodgeChance.setText(playerDodgeChance + "%");
                    lblPlayerDamage.setText(playerDamage + "");
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
                engine.clearMap(this);
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
        engine.clearMap(this);
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
    
    private void setupAnimations() {
        Icon icon = new ImageIcon(getClass().getResource(heroClass.playerBattleBack)); 
        lblPlayerBack.setIcon(icon);
    }
    
}
