package jframes;

import game.GameEngine;
import game.gametools.Animation;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import static jframes.CharacterSelect.selected;

/**
 * Introduction.java - A form that creates a new game or quits the program
 *
 * @author g.lumsden
 * @since 12-Jun-2019
 */
public class Introduction extends javax.swing.JFrame {

    // width and height for the form
    private GameEngine engine;
    private JLabel[]   labels;

    private boolean isClicked;
    private JLabel  label; 

    // form width and height for the introduction
    private final int FORM_WIDTH  = 686;
    private final int FORM_HEIGHT = 808;

    /**
     * Default constructor for the class
     */
    public Introduction() {
        initComponents();
        engine = new GameEngine();
        JLabel[] labels = {
            btnNewGame, btnLoadGame, btnQuit
        };
        this.labels = labels;
        isClicked = false;
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/formBackgrounds/mainMenu.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 670, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewGameMouseClicked
        label = btnNewGame; 
        click(); 
        this.setVisible(false);
        CharacterSelect characterSelect = new CharacterSelect(engine); 
    }//GEN-LAST:event_btnNewGameMouseClicked

    private void btnLoadGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoadGameMouseClicked
        label = btnLoadGame; 
        click(); 
        System.out.println("no");
    }//GEN-LAST:event_btnLoadGameMouseClicked

    private void btnQuitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitMouseClicked
        label = btnQuit; 
        click(); 
        System.exit(0);
    }//GEN-LAST:event_btnQuitMouseClicked

    private void btnNewGameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewGameMouseEntered
        label = btnNewGame; 
        hoverIn(); 
    }//GEN-LAST:event_btnNewGameMouseEntered

    private void btnNewGameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewGameMouseExited
        hoverOut(); 
    }//GEN-LAST:event_btnNewGameMouseExited

    private void btnLoadGameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoadGameMouseEntered
        label = btnLoadGame; 
        hoverIn(); 
    }//GEN-LAST:event_btnLoadGameMouseEntered

    private void btnLoadGameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoadGameMouseExited
        hoverOut(); 
    }//GEN-LAST:event_btnLoadGameMouseExited

    private void btnQuitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitMouseEntered
        label = btnQuit; 
        hoverIn(); 
    }//GEN-LAST:event_btnQuitMouseEntered

    private void btnQuitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitMouseExited
        hoverOut(); 
    }//GEN-LAST:event_btnQuitMouseExited

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
    
    /**
     * When the user clicks on a jlabel
     */
    private void click() {
        if (isClicked) {
            unClick(); 
        } else {
            isClicked = true; 
            set(); 
        }
    }
    
    /**
     * when the user has already clicked on a jlabel
     */
    private void unClick() {
        if (label != null) {
            isClicked = false; 
            reset(); 
        }
    }

    /**
     * when the user moves the mouse over a jlabel
     */
    private void hoverIn() {
        if (!isClicked) {
            set(); 
        }
    }
    
    /**
     * when the user moves the mouse off of a jlabel
     */
    private void hoverOut() {
        if (!isClicked) {
            reset(); 
        }
    }
    
    /**
     * resets all of the jlabels
     */
    private void reset() {
        if (label != null) {
            for (int i = 0; i < labels.length; i++) {
                labels[i].setBorder(BorderFactory.createLineBorder(Color.black));
            }
            label = null; 
            selected = ""; 
        }
    }

    /**
     * highlights a jlabel
     */
    private void set() {
        if (label != null) {
            label.setBorder(BorderFactory.createBevelBorder(1, Color.yellow, Color.yellow));
        }
    }
    
}
