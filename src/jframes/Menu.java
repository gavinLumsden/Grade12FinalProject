package jframes;

import game.GameEngine;
import javax.swing.JLabel;

/**
 * @author g.lumsden
 */
public class Menu extends javax.swing.JFrame {

    // width and height of the form
    private final int FORM_WIDTH = 686; 
    private final int FORM_HEIGHT = 771; 
    
    // properties of the class
    private GameEngine engine; 
    private JLabel[]   labels;
    private boolean isClicked;
    private JLabel  label; 
    
    public Menu(GameEngine engine) {
        initComponents();
        this.engine = engine; 
        JLabel[] labels = {
            lblItems, lblQuit, lblResume, lblUpgrades
        };
        this.labels = labels;
        isClicked = false;
        engine.createJFrame(FORM_WIDTH, FORM_HEIGHT, this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblResume = new javax.swing.JLabel();
        lblItems = new javax.swing.JLabel();
        lblUpgrades = new javax.swing.JLabel();
        lblQuit = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        lblResume.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResume.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblResume.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblResumeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblResumeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblResumeMouseExited(evt);
            }
        });
        getContentPane().add(lblResume);
        lblResume.setBounds(83, 65, 505, 111);

        lblItems.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItems.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblItemsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblItemsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblItemsMouseExited(evt);
            }
        });
        getContentPane().add(lblItems);
        lblItems.setBounds(83, 226, 505, 120);

        lblUpgrades.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUpgrades.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblUpgrades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUpgradesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblUpgradesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblUpgradesMouseExited(evt);
            }
        });
        getContentPane().add(lblUpgrades);
        lblUpgrades.setBounds(83, 394, 505, 113);

        lblQuit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblQuit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQuitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblQuitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblQuitMouseExited(evt);
            }
        });
        getContentPane().add(lblQuit);
        lblQuit.setBounds(83, 555, 505, 113);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/formBackgrounds/menu.png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 670, 732);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblResumeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblResumeMouseClicked
        label = lblResume; 
        engine.click(labels, label, isClicked, null, 0); 
        engine.play(); 
    }//GEN-LAST:event_lblResumeMouseClicked

    private void lblQuitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuitMouseClicked
        label = lblQuit; 
        engine.click(labels, label, isClicked, null, 0); 
        this.dispose();
        engine.currentMap.dispose();
        Introduction intro = new Introduction(); 
    }//GEN-LAST:event_lblQuitMouseClicked

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        int key = evt.getKeyCode(); 
        if (key == 27) engine.play();
    }//GEN-LAST:event_formKeyPressed

    private void lblItemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblItemsMouseClicked
        label = lblItems; 
        engine.click(labels, label, isClicked, null, 0); 
        System.out.println("no");
    }//GEN-LAST:event_lblItemsMouseClicked

    private void lblUpgradesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUpgradesMouseClicked
        label = lblUpgrades; 
        engine.click(labels, label, isClicked, null, 0); 
        System.out.println("no");
    }//GEN-LAST:event_lblUpgradesMouseClicked

    private void lblResumeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblResumeMouseEntered
        label = lblResume; 
        engine.hoverIn(labels, label, isClicked, null, 0);
    }//GEN-LAST:event_lblResumeMouseEntered

    private void lblResumeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblResumeMouseExited
        engine.hoverOut(labels, label, isClicked, null, 0);
    }//GEN-LAST:event_lblResumeMouseExited

    private void lblItemsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblItemsMouseEntered
        label = lblItems; 
        engine.hoverIn(labels, label, isClicked, null, 0);
    }//GEN-LAST:event_lblItemsMouseEntered

    private void lblItemsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblItemsMouseExited
        engine.hoverOut(labels, label, isClicked, null, 0);
    }//GEN-LAST:event_lblItemsMouseExited

    private void lblUpgradesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUpgradesMouseEntered
        label = lblUpgrades; 
        engine.hoverIn(labels, label, isClicked, null, 0);
    }//GEN-LAST:event_lblUpgradesMouseEntered

    private void lblUpgradesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUpgradesMouseExited
        engine.hoverOut(labels, label, isClicked, null, 0);
    }//GEN-LAST:event_lblUpgradesMouseExited

    private void lblQuitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuitMouseEntered
        label = lblQuit; 
        engine.hoverIn(labels, label, isClicked, null, 0);
    }//GEN-LAST:event_lblQuitMouseEntered

    private void lblQuitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuitMouseExited
        engine.hoverOut(labels, label, isClicked, null, 0);
    }//GEN-LAST:event_lblQuitMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel lblItems;
    private javax.swing.JLabel lblQuit;
    private javax.swing.JLabel lblResume;
    private javax.swing.JLabel lblUpgrades;
    // End of variables declaration//GEN-END:variables
    
}
