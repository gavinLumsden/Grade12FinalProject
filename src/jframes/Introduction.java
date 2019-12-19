package jframes;

import game.CharacterData;
import game.GameEngine;
import game.HeroCreator;
import game.Icons;
import javax.swing.JLabel;

/**
 * Introduction.java - A form that creates a new game or quits the program
 *
 * @author g.lumsden
 * @since 12-Jun-2019
 */
public class Introduction extends javax.swing.JFrame {

    // properties 
    
    private GameEngine engine;
    private JLabel[]   labels;
    private JLabel     label; 
    private boolean    isClicked;

    // width and height of the form
    private final int FORM_WIDTH  = 686;
    private final int FORM_HEIGHT = 808;

    /**
     * Constructor for the class
     * 
     * @param engine
     */
    public Introduction(GameEngine engine) {
        initComponents();
        this.engine = engine; 
        JLabel[] labels = {
            btnNewGame, btnLoadGame, btnQuit
        };
        this.labels = labels;
        isClicked = false;
        engine.setImage(background, Icons.MAIN_MENU_BACKGROUND);  
        engine.createJFrame(FORM_WIDTH, FORM_HEIGHT, this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnQuit = new javax.swing.JLabel();
        btnNewGame = new javax.swing.JLabel();
        btnLoadGame = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);

        btnQuit.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btnQuit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnQuit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnQuit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnQuitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnQuitMouseExited(evt);
            }
        });
        getContentPane().add(btnQuit);
        btnQuit.setBounds(83, 592, 505, 112);

        btnNewGame.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btnNewGame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNewGame.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnNewGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewGameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNewGameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNewGameMouseExited(evt);
            }
        });
        getContentPane().add(btnNewGame);
        btnNewGame.setBounds(83, 261, 505, 113);

        btnLoadGame.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btnLoadGame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLoadGame.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnLoadGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoadGameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoadGameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoadGameMouseExited(evt);
            }
        });
        getContentPane().add(btnLoadGame);
        btnLoadGame.setBounds(83, 423, 505, 120);

        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(background);
        background.setBounds(0, 0, 670, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewGameMouseClicked
        label = btnNewGame; 
        isClicked = engine.click(labels, label, isClicked, null, 0); 
        engine.newGame(this);
    }//GEN-LAST:event_btnNewGameMouseClicked

    private void btnLoadGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoadGameMouseClicked
        label = btnLoadGame; 
        isClicked = engine.click(labels, label, isClicked, null, 0); 
        engine.loadGame(this); 
    }//GEN-LAST:event_btnLoadGameMouseClicked

    private void btnQuitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitMouseClicked
        label = btnQuit; 
        isClicked = engine.click(labels, label, isClicked, null, 0); 
        engine.quit(); 
    }//GEN-LAST:event_btnQuitMouseClicked

    private void btnNewGameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewGameMouseEntered
        label = btnNewGame; 
        engine.hoverIn(labels, label, isClicked, null, 0); 
    }//GEN-LAST:event_btnNewGameMouseEntered

    private void btnNewGameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewGameMouseExited
        engine.hoverOut(labels, label, isClicked, null, 0); 
    }//GEN-LAST:event_btnNewGameMouseExited

    private void btnLoadGameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoadGameMouseEntered
        label = btnLoadGame; 
        engine.hoverIn(labels, label, isClicked, null, 0); 
    }//GEN-LAST:event_btnLoadGameMouseEntered

    private void btnLoadGameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoadGameMouseExited
        engine.hoverOut(labels, label, isClicked, null, 0); 
    }//GEN-LAST:event_btnLoadGameMouseExited

    private void btnQuitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitMouseEntered
        label = btnQuit; 
        engine.hoverIn(labels, label, isClicked, null, 0); 
    }//GEN-LAST:event_btnQuitMouseEntered

    private void btnQuitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitMouseExited
        engine.hoverOut(labels, label, isClicked, null, 0); 
    }//GEN-LAST:event_btnQuitMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel btnLoadGame;
    private javax.swing.JLabel btnNewGame;
    private javax.swing.JLabel btnQuit;
    // End of variables declaration//GEN-END:variables
     
}
