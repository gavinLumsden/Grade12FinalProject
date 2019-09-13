package game;

import game.gametools.GameCharacter; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * @author g.lumsden
 */
public class BattleUI extends javax.swing.JFrame {
    
    private boolean onItem = false; 
    private boolean onAttack = false;    
    
    private final int FORM_WIDTH = 1020; 
    private final int FORM_HEIGHT = 540; 
    
    private GameCharacter heroClass; 
    private Enemy enemy;
    private GameEngine engine; 
    
    private int    playerHealth; 
    private int    playerPunchSpeed;
    private int    playerDodgeChance; 
    private int    playerDamage; 
    private String playerName; 
    
    private int    playerBaseHealth; 
    private int    playerBasePunchSpeed;
    private int    playerBaseDodgeChance; 
    private int    playerBaseDamage; 
    private String playerBaseName; 
    
    private int    enemyHealth; 
    private int    enemyPunchSpeed;
    private int    enemyDodgeChance; 
    private int    enemyDamage; 
    private String enemyName; 
    
    private int    enemyBaseHealth; 
    private int    enemyBasePunchSpeed;
    private int    enemyBaseDodgeChance; 
    private int    enemyBaseDamage; 
    private String enemyBaseName; 
    
    private String playerAttack1;
    private String playerAttack2;
    private String playerAttack3;
    private String playerAttack4;
    
    private String enemyAttack1;
    private String enemyAttack2;
    private String enemyAttack3;
    private String enemyAttack4;
    
    private Timer playerPunching; 
    private Timer enemyPunching; 
    private Timer update; 
        
    public BattleUI(GameEngine engine, GameCharacter heroClass, Enemy enemy) {
        initComponents();
        this.engine = engine; 
        this.heroClass = heroClass; 
        this.enemy = enemy; 
        setupEnemy(); 
        setupPlayer(); 
        setupMusic(); 
        setupAttacks(); 
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
        lblPlayerNameAndStats.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPlayerNameAndStats.setText("pidgey level 11");
        lblPlayerNameAndStats.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblPlayerNameAndStats.setOpaque(true);
        getContentPane().add(lblPlayerNameAndStats);
        lblPlayerNameAndStats.setBounds(500, 210, 240, 150);

        lblEnemyNameAndStats.setBackground(new java.awt.Color(204, 255, 204));
        lblEnemyNameAndStats.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
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

    private void btnSwitchBetweenItemsAndAttacksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSwitchBetweenItemsAndAttacksMouseClicked
        switchAttackOrItem(); 
    }//GEN-LAST:event_btnSwitchBetweenItemsAndAttacksMouseClicked

    private void btnAttackOrItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAttackOrItem1MouseClicked
        if      (onItem   == true) useItem(1); 
        else if (onAttack == true) useAttack(1); 
    }//GEN-LAST:event_btnAttackOrItem1MouseClicked

    private void btnAttackOrItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAttackOrItem2MouseClicked
        if      (onItem   == true) useItem(2); 
        else if (onAttack == true) useAttack(2); 
    }//GEN-LAST:event_btnAttackOrItem2MouseClicked

    private void btnAttackOrItem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAttackOrItem3MouseClicked
        if      (onItem   == true) useItem(3); 
        else if (onAttack == true) useAttack(3); 
    }//GEN-LAST:event_btnAttackOrItem3MouseClicked

    private void btnAttackOrItem4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAttackOrItem4MouseClicked
        if      (onItem   == true) useItem(4); 
        else if (onAttack == true) useAttack(4); 
    }//GEN-LAST:event_btnAttackOrItem4MouseClicked

    private void btnRunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRunMouseClicked
        end(); 
    }//GEN-LAST:event_btnRunMouseClicked

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

    private void switchAttackOrItem() {
       if      (onItem   == true) switchToAttack(); 
       else if (onAttack == true) switchToItem(); 
       else                       System.out.println("error");
    }

    private void switchToAttack() {
        onItem   = false; 
        onAttack = true; 
        btnSwitchBetweenItemsAndAttacks.setText("Items"); 
        btnAttackOrItem1.setText(playerAttack1);
        btnAttackOrItem2.setText(playerAttack2);
        btnAttackOrItem3.setText(playerAttack3);
        btnAttackOrItem4.setText(playerAttack4);
    }

    private void switchToItem() {
        onItem   = true; 
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
    
    private void useItem(int itemToUse) {
        if      (itemToUse == 1) System.out.println("item 1");
        else if (itemToUse == 2) System.out.println("item 2");
        else if (itemToUse == 3) System.out.println("item 3");
        else if (itemToUse == 4) System.out.println("item 4");
        else                     System.out.println("error using item");
    }
    
    private void useAttack(int attackToUse) {
        if (attackToUse == 1) {
            heroClass.attack1();
        } else if (attackToUse == 2) {
            heroClass.attack2();
        } else if (attackToUse == 3) {
            heroClass.attack3();
        } else if (attackToUse == 4) {
            heroClass.attack4();
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
        double seed   = Math.random();
        double L      = (double) low;
        double H      = (double) high;
        double number = (H - L + 1) * seed + L;
        int answer    = (int) number;
        return answer;
    }

    private void setupMusic() {
        engine.mediaPlayer.stop();
        engine.mediaPlayer.playWAV("/sounds/fightSoundtrack.wav");
    }

    private void setupAttacks() {
        playerAttack1 = heroClass.playerAttack1; 
        playerAttack2 = heroClass.playerAttack2; 
        playerAttack3 = heroClass.playerAttack3; 
        playerAttack4 = heroClass.playerAttack4; 
        onAttack = true; 
        btnAttackOrItem1.setText(playerAttack1);
        btnAttackOrItem2.setText(playerAttack2);
        btnAttackOrItem3.setText(playerAttack3);
        btnAttackOrItem4.setText(playerAttack4);
    }

    private void setupEnemy() {
        enemyDamage          = enemy.damage;
        enemyDodgeChance     = enemy.dodgeChance;
        enemyHealth          = enemy.health;
        enemyPunchSpeed      = enemy.punchSpeed;
        enemyName            = enemy.name; 
        enemyBaseDamage      = enemy.damage;
        enemyBaseDodgeChance = enemy.dodgeChance;
        enemyBaseHealth      = enemy.health;
        enemyBasePunchSpeed  = enemy.punchSpeed;
        enemyBaseName        = enemy.name; 
        lblEnemyNameAndStats.setText(enemyName);
        System.out.println("You've encountered " + enemyName + "!");
    }

    private void setupPlayer() {
        playerDamage          = heroClass.playerDamage;
        playerDodgeChance     = heroClass.playerDodgeChance;
        playerHealth          = heroClass.playerHealth;
        playerPunchSpeed      = heroClass.playerPunchSpeed;
        playerName            = heroClass.playerName; 
        playerBaseDamage      = heroClass.playerDamage;
        playerBaseDodgeChance = heroClass.playerDodgeChance;
        playerBaseHealth      = heroClass.playerHealth;
        playerBasePunchSpeed  = heroClass.playerPunchSpeed;
        playerBaseName        = heroClass.playerName; 
    }

    private void setupPunching() {
        playerPunching = new Timer(playerPunchSpeed, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                int hit = random(enemyDodgeChance, 10); 
                if (hit != 10) {
                    enemyHealth = enemyHealth - playerDamage; 
                    System.out.println("Player hit!");
                } else {
                    System.out.println("Enemy dodge!");
                }
            }
        }); 
        enemyPunching = new Timer(enemyPunchSpeed, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (playerDodgeChance != 0) {
                    int hit = random(playerDodgeChance, 10); 
                    if (hit != 10) {
                        playerHealth = playerHealth - enemyDamage; 
                        System.out.println("Enemy hit!");
                    } else {
                        System.out.println("Player dodge!");
                    }
                }
                System.out.println("\n");
            }
        }); 
        playerPunching.start();
        enemyPunching.start();
    }

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
                            "<html><head></head><body>"          +                        
                            "Name: "         + playerName        + 
                            "<br>"           +
                            "Damage: "       + playerDamage      + 
                            "<br>"           +
                            "Dodge Chance: " + playerDodgeChance + 
                            "<br>"           +
                            "Health: "       + playerHealth      + 
                            "<br>"           +
                            "Punch Speed: "  + playerPunchSpeed  +
                            "</body></html>");
                    lblEnemyNameAndStats.setText(
                            "<html><head></head><body>"          +                        
                            "Name: "         + enemyName        + 
                            "<br>"           +
                            "Damage: "       + enemyDamage      + 
                            "<br>"           +
                            "Dodge Chance: " + enemyDodgeChance + 
                            "<br>"           +
                            "Health: "       + enemyHealth      + 
                            "<br>"           +
                            "Punch Speed: "  + enemyPunchSpeed  +
                            "</body></html>");
                    playerHealthBar.setValue(playerHealth);
                    enemyHealthBar.setValue(enemyHealth);
                }
            }
        }); 
        update.start();
    }
    
    private void resetStats() {
        heroClass.playerDamage      = playerBaseDamage;
        heroClass.playerDodgeChance = playerBaseDodgeChance;
        heroClass.playerHealth      = playerBaseHealth;
        heroClass.playerPunchSpeed  = playerBasePunchSpeed;
        heroClass.playerName        = playerBaseName; 
    }
 
    private void end() {
        playerPunching.stop();
        enemyPunching.stop();
        update.stop(); 
        resetStats(); 
        engine.clearBattle(this); 
        engine.play();
        int random = random(1,2); 
        if (random == 1) {
            engine.mediaPlayer.stop();
            engine.mediaPlayer.playWAV("/sounds/walkingSoundtrack.wav");
        } 
        else if (random == 2) {
            engine.mediaPlayer.stop();
            engine.mediaPlayer.playWAV("/sounds/introSoundtrack.wav");
        }
    }
    
    private void enemyWin() {
        System.out.println("trash");
        end(); 
    }
    
    private void playerWin() {
        giveExp();
        giveGold(); 
        // check to see if the player can level up
        end(); 
    }
    
    private void giveExp() {
        System.out.println("heres some exp");
    }
    
    private void giveGold() {
        System.out.println("heres some gold");
    } 
    
}
