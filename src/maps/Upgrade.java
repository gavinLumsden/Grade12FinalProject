package maps;

import nuetral.trainers.Trainer;

/**
 * @author g.lumsden
 */
public class Upgrade extends javax.swing.JFrame {

    // width and height of the form
    private final int FORM_WIDTH = 500; 
    private final int FORM_HEIGHT = 420; 
    
    private int statToUpgrade; 
    
    /**
     * Constructor for the class
     * @param trainer 
     */
    public Upgrade(Trainer trainer) {
        initComponents();
        setupAnimations(trainer); 
        setupText(trainer); 
        setupForm(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTrainerText = new javax.swing.JLabel();
        lblPicture = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        btnUpgrade = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblTrainerText.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTrainerText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTrainerText.setText("Trainer Dan says: something idk");
        lblTrainerText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblTrainerText);
        lblTrainerText.setBounds(130, 0, 350, 130);

        lblPicture.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/trainers/damage/right/damageIdle.png"))); // NOI18N
        lblPicture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblPicture);
        lblPicture.setBounds(0, 0, 130, 130);

        lblPrice.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrice.setText("+1 damage = 100 gold");
        lblPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblPrice);
        lblPrice.setBounds(0, 130, 480, 70);

        btnUpgrade.setFont(new java.awt.Font("Times New Roman", 1, 75)); // NOI18N
        btnUpgrade.setText("Upgrade");
        btnUpgrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpgradeMouseClicked(evt);
            }
        });
        getContentPane().add(btnUpgrade);
        btnUpgrade.setBounds(30, 240, 420, 130);

        lblBackground.setBackground(new java.awt.Color(0, 204, 204));
        lblBackground.setOpaque(true);
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 480, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpgradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpgradeMouseClicked
        
    }//GEN-LAST:event_btnUpgradeMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpgrade;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblTrainerText;
    // End of variables declaration//GEN-END:variables

    /**
     * setups the animations for the selected trainer
     * @param trainer 
     */
    private void setupAnimations(Trainer trainer) {
        
    }

    /**
     * setups the text (specific to each trainer)
     * @param trainer 
     */
    private void setupText(Trainer trainer) {
        lblTrainerText.setText(trainer.quote);
        lblPrice.setText(trainer.price);
    }

    /**
     * setups the form
     */
    private void setupForm() {
        this.setSize(FORM_WIDTH, FORM_HEIGHT);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }
    
}
