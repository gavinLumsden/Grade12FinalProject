package jframes;

import game.GameEngine;

/**
 * Introduction.java - A form that creates a new game or quits the program
 *
 * @author g.lumsden
 * @since 12-Jun-2019
 */
public class Introduction extends javax.swing.JFrame {

    // width and height for the form
    private GameEngine engine;

    // form width and height for the introduction
    private final int FORM_WIDTH = 686;
    private final int FORM_HEIGHT = 808;

    /**
     * Default constructor for the class
     */
    public Introduction() {
        initComponents();
        engine = new GameEngine();
        setupForm();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnQuit = new javax.swing.JLabel();
        btnNewGame = new javax.swing.JLabel();
        btnLoadGame = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);

        btnQuit.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btnQuit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnQuit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuitMouseClicked(evt);
            }
        });
        getContentPane().add(btnQuit);
        btnQuit.setBounds(90, 600, 490, 95);

        btnNewGame.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btnNewGame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNewGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewGameMouseClicked(evt);
            }
        });
        getContentPane().add(btnNewGame);
        btnNewGame.setBounds(90, 270, 490, 95);

        btnLoadGame.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btnLoadGame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLoadGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoadGameMouseClicked(evt);
            }
        });
        getContentPane().add(btnLoadGame);
        btnLoadGame.setBounds(90, 430, 490, 105);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/formBackgrounds/mainMenu.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 670, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewGameMouseClicked
        CharacterSelect characterSelect = new CharacterSelect(engine); 
        this.dispose(); 
    }//GEN-LAST:event_btnNewGameMouseClicked

    private void btnLoadGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoadGameMouseClicked
        System.out.println("no");
    }//GEN-LAST:event_btnLoadGameMouseClicked

    private void btnQuitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnQuitMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnLoadGame;
    private javax.swing.JLabel btnNewGame;
    private javax.swing.JLabel btnQuit;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private void setupForm() {
        engine.mediaPlayer.playWAV("/sounds/introSoundtrack.wav");
        this.setSize(FORM_WIDTH, FORM_HEIGHT);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

}
