package jframes;

import game.GameEngine;
import game.Icons;
import javax.swing.JLabel;

/**
 * @author g.lumsden
 */
public class SaveFrame extends javax.swing.JFrame {

    public static final int FORM_WIDTH = 716; 
    public static final int FORM_HEIGT = 265; 
    
    public GameEngine engine; 
    public Menu       menu; 
    private JLabel[]  labels;
    private JLabel    label; 
    private boolean   isClicked;
    
    public SaveFrame(GameEngine engine, Menu menu) {
        initComponents();
        this.engine = engine; 
        this.menu = menu; 
        JLabel[] labels = {
            lblNo, lblYes
        };
        this.labels = labels;
        isClicked = false;
        engine.createJFrame(FORM_WIDTH, FORM_HEIGT, this);
        engine.setImage(lblBackground, Icons.SAVE_MENU_BACKGROUND);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNo = new javax.swing.JLabel();
        lblYes = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblNo.setBackground(new java.awt.Color(0, 0, 0));
        lblNo.setForeground(new java.awt.Color(255, 255, 255));
        lblNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNoMouseExited(evt);
            }
        });
        getContentPane().add(lblNo);
        lblNo.setBounds(139, 154, 199, 59);

        lblYes.setBackground(new java.awt.Color(0, 0, 0));
        lblYes.setForeground(new java.awt.Color(255, 255, 255));
        lblYes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblYesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblYesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblYesMouseExited(evt);
            }
        });
        getContentPane().add(lblYes);
        lblYes.setBounds(354, 154, 199, 59);
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 700, 230);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblYesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblYesMouseClicked
        label = lblYes; 
        engine.click(labels, label, isClicked, null, 0); 
        menu.dispose();
        this.dispose();
        engine.save();
    }//GEN-LAST:event_lblYesMouseClicked

    private void lblNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNoMouseClicked
        label = lblNo; 
        engine.click(labels, label, isClicked, null, 0); 
        this.dispose();
        menu.dispose(); 
        MainMenu main = new MainMenu(engine); 
    }//GEN-LAST:event_lblNoMouseClicked

    private void lblNoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNoMouseEntered
        label = lblNo; 
        engine.hoverIn(labels, label, isClicked, null, 0);
    }//GEN-LAST:event_lblNoMouseEntered

    private void lblNoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNoMouseExited
        label = lblNo; 
        engine.hoverOut(labels, label, isClicked, null, 0);
    }//GEN-LAST:event_lblNoMouseExited

    private void lblYesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblYesMouseEntered
        label = lblYes; 
        engine.hoverIn(labels, label, isClicked, null, 0);
    }//GEN-LAST:event_lblYesMouseEntered

    private void lblYesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblYesMouseExited
        label = lblYes; 
        engine.hoverOut(labels, label, isClicked, null, 0);
    }//GEN-LAST:event_lblYesMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblNo;
    private javax.swing.JLabel lblYes;
    // End of variables declaration//GEN-END:variables

}
