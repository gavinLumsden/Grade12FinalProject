package jframes;

import game.GameEngine;

/**
 * @author g.lumsden
 */
public class Menu extends javax.swing.JFrame {

    private final int FORM_WIDTH = 416; 
    private final int FORM_HEIGHT = 249; 
    
    private GameEngine engine; 
    
    public Menu(GameEngine engine) {
        initComponents();
        this.engine = engine; 
        setupForm(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblGameTitle = new javax.swing.JLabel();
        lblPlay = new javax.swing.JLabel();
        lblQuit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        lblGameTitle.setBackground(new java.awt.Color(51, 255, 255));
        lblGameTitle.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblGameTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGameTitle.setText("Pause Menu");
        lblGameTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblGameTitle.setOpaque(true);
        getContentPane().add(lblGameTitle);
        lblGameTitle.setBounds(0, 0, 400, 70);

        lblPlay.setBackground(new java.awt.Color(0, 255, 0));
        lblPlay.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblPlay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlay.setText("Play");
        lblPlay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblPlay.setOpaque(true);
        lblPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPlayMouseClicked(evt);
            }
        });
        getContentPane().add(lblPlay);
        lblPlay.setBounds(0, 70, 400, 70);

        lblQuit.setBackground(new java.awt.Color(255, 153, 153));
        lblQuit.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblQuit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuit.setText("Quit");
        lblQuit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblQuit.setOpaque(true);
        lblQuit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQuitMouseClicked(evt);
            }
        });
        getContentPane().add(lblQuit);
        lblQuit.setBounds(0, 140, 400, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblPlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlayMouseClicked
        engine.play(); 
    }//GEN-LAST:event_lblPlayMouseClicked

    private void lblQuitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblQuitMouseClicked

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        int key = evt.getKeyCode(); 
        if (key == 27) engine.play();
    }//GEN-LAST:event_formKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblGameTitle;
    private javax.swing.JLabel lblPlay;
    private javax.swing.JLabel lblQuit;
    // End of variables declaration//GEN-END:variables

    /**
     * setups the form
     */
    private void setupForm() {
        this.setSize(FORM_WIDTH, FORM_HEIGHT);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
}
