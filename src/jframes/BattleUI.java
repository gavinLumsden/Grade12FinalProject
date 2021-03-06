package jframes;

import collections.LinkedList;
import game.CharacterData;
import enemyClasses.Enemy;
import game.GameEngine;
import game.gametools.GameCharacter;
import java.awt.Color;
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
    public int enemyMaxHealth; // the maximum amount of health the enemy can have
    public int enemyLevel; 
    private String enemyName;  // the name of the class of the enemy 

    public int enemyBaseHealth;      // the original amount of health the enemy had                           (at the begining of the game) 
    public int enemyBasePunchSpeed;  // the original speed of how fast the enemy punchs                       (at the begining of the game)  
    public int enemyBaseDodgeChance; // the original percentage of how much the enemy can dodge enemy attacks (at the begining of the game) 
    public int enemyBaseDamage;      // the original amount of damage the enemy had                           (at the begining of the game) 

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
    private LinkedList<Timer> attackCooldowns;

    // the timer used to add a "duration" effect to the players abilities
    private Timer attack1Duration;
    private Timer attack2Duration;
    private Timer attack3Duration;
    private Timer attack4Duration;
    private LinkedList<Timer> attackDurations;

    // "effects" that can be used on the enemy and player
    private Timer playerBleed;
    private Timer playerStun;
    private Timer playerDisableAbilities;
    private LinkedList<Timer> playerEffects;
    
    private Timer enemyBleed;
    private Timer enemyStun;
    private Timer enemyDisableAbilities;
    private LinkedList<Timer> enemyEffects;

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
        engine.menu.dispose(); 
        setupEnemy();
        setupPlayer();
        setupAnimations(); 
        setupMusic();
        setupPlayerAttacks();
        setupEffects(); 
        setupArrays(); 
        setupPunching();
        update();
        engine.createJFrame(FORM_WIDTH, FORM_HEIGHT, this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enemyHealthBar = new javax.swing.JProgressBar();
        enemyUltimateBar = new javax.swing.JProgressBar();
        playerSpeed = new javax.swing.JProgressBar();
        playerHealthBar = new javax.swing.JProgressBar();
        playerUltimateBar = new javax.swing.JProgressBar();
        btnSwitch = new javax.swing.JLabel();
        btnUltimate = new javax.swing.JLabel();
        btnAttackOrItem1 = new javax.swing.JLabel();
        btnAttackOrItem2 = new javax.swing.JLabel();
        btnAttackOrItem3 = new javax.swing.JLabel();
        btnAttackOrItem4 = new javax.swing.JLabel();
        lblEnemyUltimate = new javax.swing.JLabel();
        lblEnemyHealth = new javax.swing.JLabel();
        lblPlayerDodgeChance = new javax.swing.JLabel();
        lblPlayerDamage = new javax.swing.JLabel();
        lblPlayerUltimate = new javax.swing.JLabel();
        lblPlayerHealth = new javax.swing.JLabel();
        btnRun = new javax.swing.JLabel();
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
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

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

        playerSpeed.setForeground(new java.awt.Color(0, 255, 51));
        playerSpeed.setValue(100);
        playerSpeed.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        playerSpeed.setOpaque(true);
        getContentPane().add(playerSpeed);
        playerSpeed.setBounds(205, 702, 230, 30);

        playerHealthBar.setForeground(new java.awt.Color(0, 255, 51));
        playerHealthBar.setValue(100);
        playerHealthBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        playerHealthBar.setOpaque(true);
        getContentPane().add(playerHealthBar);
        playerHealthBar.setBounds(930, 410, 376, 45);

        playerUltimateBar.setForeground(new java.awt.Color(0, 255, 51));
        playerUltimateBar.setValue(100);
        playerUltimateBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        playerUltimateBar.setOpaque(true);
        getContentPane().add(playerUltimateBar);
        playerUltimateBar.setBounds(1095, 370, 212, 30);

        btnSwitch.setBackground(new java.awt.Color(255, 255, 255));
        btnSwitch.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btnSwitch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSwitch.setText("Switch");
        btnSwitch.setOpaque(true);
        getContentPane().add(btnSwitch);
        btnSwitch.setBounds(476, 560, 250, 56);

        btnUltimate.setBackground(new java.awt.Color(255, 255, 255));
        btnUltimate.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btnUltimate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnUltimate.setText("Ultimate");
        btnUltimate.setOpaque(true);
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
        getContentPane().add(btnAttackOrItem2);
        btnAttackOrItem2.setBounds(1057, 560, 250, 56);

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
        getContentPane().add(btnAttackOrItem3);
        btnAttackOrItem3.setBounds(766, 655, 250, 56);

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
        getContentPane().add(btnAttackOrItem4);
        btnAttackOrItem4.setBounds(1057, 655, 250, 56);

        lblEnemyUltimate.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblEnemyUltimate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnemyUltimate.setText("100");
        lblEnemyUltimate.setToolTipText("");
        getContentPane().add(lblEnemyUltimate);
        lblEnemyUltimate.setBounds(280, 115, 56, 27);

        lblEnemyHealth.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblEnemyHealth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnemyHealth.setText("100");
        getContentPane().add(lblEnemyHealth);
        lblEnemyHealth.setBounds(437, 60, 75, 45);

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

        lblPlayerUltimate.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblPlayerUltimate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayerUltimate.setText("100");
        lblPlayerUltimate.setToolTipText("");
        getContentPane().add(lblPlayerUltimate);
        lblPlayerUltimate.setBounds(1027, 370, 55, 30);

        lblPlayerHealth.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblPlayerHealth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayerHealth.setText("100");
        getContentPane().add(lblPlayerHealth);
        lblPlayerHealth.setBounds(844, 410, 75, 45);

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
        getContentPane().add(btnRun);
        btnRun.setBounds(1172, 50, 125, 15);

        lblStatsBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/battling/statsBackground.png"))); // NOI18N
        lblStatsBackground.setToolTipText("");
        getContentPane().add(lblStatsBackground);
        lblStatsBackground.setBounds(0, 0, 1370, 770);

        lblEnemyFront.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblEnemyFront);
        lblEnemyFront.setBounds(10, 10, 1350, 750);

        lblPlayerBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblPlayerBack);
        lblPlayerBack.setBounds(10, 10, 1350, 750);

        lblWhiteBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/battling/whiteBackground.png"))); // NOI18N
        lblWhiteBackground.setToolTipText("");
        getContentPane().add(lblWhiteBackground);
        lblWhiteBackground.setBounds(0, 0, 1370, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
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

    private void btnAttackOrItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAttackOrItem1MouseClicked
        click(1); 
    }//GEN-LAST:event_btnAttackOrItem1MouseClicked

    private void btnAttackOrItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAttackOrItem2MouseClicked
        click(2); 
    }//GEN-LAST:event_btnAttackOrItem2MouseClicked

    private void btnAttackOrItem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAttackOrItem3MouseClicked
        click(3); 
    }//GEN-LAST:event_btnAttackOrItem3MouseClicked

    private void btnAttackOrItem4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAttackOrItem4MouseClicked
        click(4); 
    }//GEN-LAST:event_btnAttackOrItem4MouseClicked

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        int key = evt.getKeyCode(); 
        if (engine.menu != null) {
            if (key == 27) {
                pause(); 
                Menu menu = new Menu(engine); 
                engine.menu = menu; 
            }
        } 
    }//GEN-LAST:event_formKeyPressed

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
        btnAttackOrItem1.setText("Item 1");
        btnAttackOrItem2.setText("Item 2");
        btnAttackOrItem3.setText("Item 3");
        btnAttackOrItem4.setText("Item 4");
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
            if (attack1Usable) {
                btnAttackOrItem1.setBackground(Color.red);
                attack1Usable = false;
                heroClass.attack1();
                attack1Duration.start();
                attack1Cooldown.start();
                System.out.println(playerName + " used: " + heroClass.playerAttack1Name + "!");
            }
        } else if (attackToUse == 2) {
            if (attack2Usable) {
                btnAttackOrItem2.setBackground(Color.red);
                attack2Usable = false;
                heroClass.attack2();
                attack2Duration.start();
                attack2Cooldown.start();
                System.out.println(playerName + " used: " + heroClass.playerAttack2Name + "!");
            }
        } else if (attackToUse == 3) {
            if (attack3Usable) {
                btnAttackOrItem3.setBackground(Color.red);
                attack3Usable = false;
                heroClass.attack3();
                attack3Duration.start();
                attack3Cooldown.start();
                System.out.println(playerName + " used: " + heroClass.playerAttack3Name + "!");
            }
        } else if (attackToUse == 4) {
            if (attack4Usable) {
                btnAttackOrItem4.setBackground(Color.red);
                attack4Usable = false;
                heroClass.attack4();
                attack4Duration.start();
                attack4Cooldown.start();
                System.out.println(playerName + " used: " + heroClass.playerAttack4Name + "!");
            }
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
        playerAttack1 = heroClass.playerAttack1Name;
        playerAttack2 = heroClass.playerAttack2Name;
        playerAttack3 = heroClass.playerAttack3Name;
        playerAttack4 = heroClass.playerAttack4Name;

        onAttack = true;

        btnAttackOrItem1.setText(playerAttack1);
        btnAttackOrItem2.setText(playerAttack2);
        btnAttackOrItem3.setText(playerAttack3);
        btnAttackOrItem4.setText(playerAttack4);

        if (heroClass.playerLevel >= 1) {
            btnAttackOrItem1.setBackground(Color.green);
            attack1Usable = true; 
        } else {
            btnAttackOrItem1.setBackground(Color.black); 
        }
        
        if (heroClass.playerLevel >= 2) {
            btnAttackOrItem2.setBackground(Color.green);
            attack2Usable = true; 
        } else {
            btnAttackOrItem2.setBackground(Color.black); 
        }
        
        if (heroClass.playerLevel >= 5) {
            btnAttackOrItem3.setBackground(Color.green);
            attack3Usable = true; 
        } else {
            btnAttackOrItem3.setBackground(Color.black); 
        }
        
        if (heroClass.playerLevel >= 10) {
            btnAttackOrItem4.setBackground(Color.green);
            attack4Usable = true; 
        } else {
            btnAttackOrItem4.setBackground(Color.black); 
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
        enemyName            = enemy.name; 
        enemyLevel           = enemy.level; 
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
        System.out.println("You've encountered a level " + enemyLevel + " " + enemyName + "!");
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
        
        attack1Usable = false; 
        attack2Usable = false; 
        attack3Usable = false; 
        attack4Usable = false; 
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
                save(); 
                engine.clearJFrame(this);
                engine.play();
                engine.mediaPlayer.playWAV("/sounds/walkingSoundtrack.wav");
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
        MainMenu introduction = new MainMenu(engine); 
    }

    /**
     * when the player wins
     */
    private void playerWin() {
        stopTimers(); 
        resetAbilities(); 
        giveExp();
        giveGold();
        save(); 
        engine.clearJFrame(this);
        engine.play();
        engine.mediaPlayer.playWAV("/sounds/walkingSoundtrack.wav");
    }

    /**
     * gives the player experience
     */
    private void giveExp() {
        int expToGive = (50 + (enemyLevel * 2)); 
        heroClass.exp += expToGive; 
        System.out.println("You got " + expToGive + " exp! You know have " + heroClass.exp + " exp!"); 
        if (heroClass.exp >= 100) {
            LevelUp levelUp = new LevelUp(heroClass); 
            heroClass.playerLevel++; 
            heroClass.exp -= 100; 
        }
    }

    /**
     * gives the player gold
     */
    private void giveGold() {
        int goldToGive = (10 + (enemyLevel * 2)); 
        heroClass.gold += goldToGive; 
        System.out.println("You got " + goldToGive + " gold! You know have " + heroClass.gold + " gold!"); 
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
        
        attack1Cooldown.stop();
        attack1Duration.stop(); 
        attack2Cooldown.stop();
        attack2Duration.stop(); 
        attack3Cooldown.stop();
        attack3Duration.stop(); 
        attack4Cooldown.stop();
        attack4Duration.stop(); 
        
        enemyBleed.stop();
        enemyDisableAbilities.stop(); 
        enemyStun.stop(); 
        
        playerBleed.stop();
        playerDisableAbilities.stop(); 
        playerStun.stop(); 
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

    private void click(int number) {
        if (onAttack) useAttack(number); 
        if (onItem)   useItem(number); 
    }

    private void save() {
        int stats[] = {
            playerDamage,
            playerDodgeChance,
            playerHealth,
            playerMaxHealth, 
            playerPunchSpeed, 
            heroClass.playerLevel, 
            heroClass.exp, 
            heroClass.gold
        };
        CharacterData.save(heroClass, stats);
    }

    private void pause() {
        for (int i = 0; i < attackCooldowns.size(); i++) {
            if (attackCooldowns.get(i).isRunning()) attackCooldowns.get(i).stop(); 
        }
        for (int i = 0; i < attackDurations.size(); i++) {
            if (attackDurations.get(i).isRunning()) attackDurations.get(i).stop(); 
        }
        for (int i = 0; i < playerEffects.size(); i++) {
            if (playerEffects.get(i).isRunning()) playerEffects.get(i).stop(); 
        }
        for (int i = 0; i < enemyEffects.size(); i++) {
            if (enemyEffects.get(i).isRunning()) enemyEffects.get(i).stop(); 
        }           
        
        playerPunching.stop();
        enemyPunching.stop();
        update.stop();
    }
    
    private void play() {
        playerPunching.start();
        enemyPunching.start();
        update.start();
    }

    private void setupArrays() {
        attackCooldowns = new LinkedList<>(); 
        attackCooldowns.add(attack1Cooldown); 
        attackCooldowns.add(attack2Cooldown); 
        attackCooldowns.add(attack3Cooldown); 
        attackCooldowns.add(attack4Cooldown); 
        
        attackDurations = new LinkedList<>(); 
        attackDurations.add(attack1Duration); 
        attackDurations.add(attack2Duration); 
        attackDurations.add(attack3Duration); 
        attackDurations.add(attack4Duration); 
        
        playerEffects = new LinkedList<>(); 
        playerEffects.add(playerBleed); 
        playerEffects.add(playerDisableAbilities); 
        playerEffects.add(playerStun); 
        
        enemyEffects = new LinkedList<>(); 
        enemyEffects.add(enemyBleed); 
        enemyEffects.add(enemyDisableAbilities); 
        enemyEffects.add(enemyStun); 
    }
    
}
