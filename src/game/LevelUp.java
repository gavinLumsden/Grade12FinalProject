package game;

import game.gametools.GameCharacter;

public class LevelUp extends javax.swing.JFrame {

    private final int FORM_WIDTH = 420; 
    private final int FORM_HEIGHT = 320; 
    
    private final int DAMAGE_UPGRADE_AMOUNT = 1; 
    private final int DODGE_CHANCE_UPGRADE_AMOUNT = 2; 
    private final int HEALTH_UPGRADE_AMOUNT = 2; 
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
        btnLvlUpPunchSpeed = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnLvlUpDamage = new javax.swing.JLabel();
        btnLvlUpDodgeChance = new javax.swing.JLabel();
        btnLvlUpHealth = new javax.swing.JLabel();

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

        btnLvlUpPunchSpeed.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnLvlUpPunchSpeed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLvlUpPunchSpeed.setText("+");
        btnLvlUpPunchSpeed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnLvlUpPunchSpeed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLvlUpPunchSpeedKeyPressed(evt);
            }
        });
        getContentPane().add(btnLvlUpPunchSpeed);
        btnLvlUpPunchSpeed.setBounds(260, 210, 20, 20);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Dodge Chance");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 140, 150, 29);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Health");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 170, 80, 29);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("Damage");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(100, 110, 90, 29);

        btnLvlUpDamage.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnLvlUpDamage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLvlUpDamage.setText("+");
        btnLvlUpDamage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnLvlUpDamage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLvlUpDamageKeyPressed(evt);
            }
        });
        getContentPane().add(btnLvlUpDamage);
        btnLvlUpDamage.setBounds(260, 120, 20, 20);

        btnLvlUpDodgeChance.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnLvlUpDodgeChance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLvlUpDodgeChance.setText("+");
        btnLvlUpDodgeChance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnLvlUpDodgeChance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLvlUpDodgeChanceKeyPressed(evt);
            }
        });
        getContentPane().add(btnLvlUpDodgeChance);
        btnLvlUpDodgeChance.setBounds(260, 150, 20, 20);

        btnLvlUpHealth.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnLvlUpHealth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLvlUpHealth.setText("+");
        btnLvlUpHealth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnLvlUpHealth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLvlUpHealthKeyPressed(evt);
            }
        });
        getContentPane().add(btnLvlUpHealth);
        btnLvlUpHealth.setBounds(260, 180, 20, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLvlUpDamageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLvlUpDamageKeyPressed
        heroClass.playerDamage += DAMAGE_UPGRADE_AMOUNT; 
        this.dispose();
    }//GEN-LAST:event_btnLvlUpDamageKeyPressed

    private void btnLvlUpDodgeChanceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLvlUpDodgeChanceKeyPressed
        heroClass.playerDodgeChance += DODGE_CHANCE_UPGRADE_AMOUNT; 
        this.dispose();
    }//GEN-LAST:event_btnLvlUpDodgeChanceKeyPressed

    private void btnLvlUpHealthKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLvlUpHealthKeyPressed
        heroClass.playerHealth += HEALTH_UPGRADE_AMOUNT; 
        this.dispose();
    }//GEN-LAST:event_btnLvlUpHealthKeyPressed

    private void btnLvlUpPunchSpeedKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLvlUpPunchSpeedKeyPressed
        heroClass.playerPunchSpeed += PUNCH_SPEED_UPGRADE_AMOUNT; 
        this.dispose();
    }//GEN-LAST:event_btnLvlUpPunchSpeedKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnLvlUpDamage;
    private javax.swing.JLabel btnLvlUpDodgeChance;
    private javax.swing.JLabel btnLvlUpHealth;
    private javax.swing.JLabel btnLvlUpPunchSpeed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

    private void setupForm() {
        this.setSize(FORM_WIDTH, FORM_HEIGHT);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }
    
}
