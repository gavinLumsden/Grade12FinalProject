package game;

import game.gametools.GameCharacter;

public class LevelUp extends javax.swing.JFrame {

    private final int FORM_WIDTH = 420; 
    private final int FORM_HEIGHT = 320; 
    
    private final int DAMAGE_UPGRADE_AMOUNT = 1; 
    private final int DODGE_CHANCE_UPGRADE_AMOUNT = 2; 
    private final int MAX_HEALTH_UPGRADE_AMOUNT = 2; 
    private final int PUNCH_SPEED_UPGRADE_AMOUNT = -50; 
    
    private GameCharacter heroClass; 
    
    public LevelUp(GameCharacter heroClass) {
        initComponents();
        this.heroClass = heroClass; 
        setupForm(); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnPunchSpeed = new javax.swing.JLabel();
        btnUpgradeDamage = new javax.swing.JLabel();
        btnUpgradeDodgeChance = new javax.swing.JLabel();
        btnUpgradeHealth = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Punch Speed");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 200, 140, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("you leveled up yay");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 30, 191, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("what do you want to upgrade?");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 60, 320, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Dodge Chance");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 140, 150, 29);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Health");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 170, 80, 29);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("Damage");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(100, 110, 90, 29);

        btnPunchSpeed.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnPunchSpeed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPunchSpeed.setText("+");
        btnPunchSpeed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPunchSpeed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPunchSpeedMouseClicked(evt);
            }
        });
        getContentPane().add(btnPunchSpeed);
        btnPunchSpeed.setBounds(270, 210, 20, 20);

        btnUpgradeDamage.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnUpgradeDamage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnUpgradeDamage.setText("+");
        btnUpgradeDamage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnUpgradeDamage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpgradeDamageMouseClicked(evt);
            }
        });
        getContentPane().add(btnUpgradeDamage);
        btnUpgradeDamage.setBounds(270, 120, 20, 20);

        btnUpgradeDodgeChance.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnUpgradeDodgeChance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnUpgradeDodgeChance.setText("+");
        btnUpgradeDodgeChance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnUpgradeDodgeChance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpgradeDodgeChanceMouseClicked(evt);
            }
        });
        getContentPane().add(btnUpgradeDodgeChance);
        btnUpgradeDodgeChance.setBounds(270, 150, 20, 20);

        btnUpgradeHealth.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnUpgradeHealth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnUpgradeHealth.setText("+");
        btnUpgradeHealth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnUpgradeHealth.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpgradeHealthMouseClicked(evt);
            }
        });
        getContentPane().add(btnUpgradeHealth);
        btnUpgradeHealth.setBounds(270, 180, 20, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpgradeDamageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpgradeDamageMouseClicked
        heroClass.playerDamage += DAMAGE_UPGRADE_AMOUNT; 
        System.out.println("You upgraded your damage! You now do " + heroClass.playerDamage + " damage!");
        this.dispose();
    }//GEN-LAST:event_btnUpgradeDamageMouseClicked

    private void btnUpgradeDodgeChanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpgradeDodgeChanceMouseClicked
        heroClass.playerDodgeChance += DODGE_CHANCE_UPGRADE_AMOUNT; 
        System.out.println("You upgraded your dodge chance! Your dodge chance is now " + heroClass.playerDodgeChance + "!");
        this.dispose();
    }//GEN-LAST:event_btnUpgradeDodgeChanceMouseClicked

    private void btnUpgradeHealthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpgradeHealthMouseClicked
        heroClass.playerMaxHealth += MAX_HEALTH_UPGRADE_AMOUNT; 
        System.out.println("You upgraded your max health! Your max health is now " + heroClass.playerMaxHealth + "!");
        this.dispose();
    }//GEN-LAST:event_btnUpgradeHealthMouseClicked

    private void btnPunchSpeedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPunchSpeedMouseClicked
        heroClass.playerPunchSpeed += PUNCH_SPEED_UPGRADE_AMOUNT; 
        System.out.println("You upgraded your punch speed! Your punch speed is now " + heroClass.playerPunchSpeed + "!");
        this.dispose();
    }//GEN-LAST:event_btnPunchSpeedMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnPunchSpeed;
    private javax.swing.JLabel btnUpgradeDamage;
    private javax.swing.JLabel btnUpgradeDodgeChance;
    private javax.swing.JLabel btnUpgradeHealth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables

    private void setupForm() {
        this.setSize(FORM_WIDTH, FORM_HEIGHT);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }
    
}
