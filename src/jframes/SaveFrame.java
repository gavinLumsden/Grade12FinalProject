package jframes;

import game.GameEngine;
import game.Icons;

/**
 * @author g.lumsden
 */
public class SaveFrame extends javax.swing.JFrame {

    public static final int FORM_WIDTH = 500; 
    public static final int FORM_HEIGT = 500; 
    
    public GameEngine engine; 
    public Menu menu; 
    
    public SaveFrame(GameEngine engine, Menu menu) {
        initComponents();
        this.engine = engine; 
        this.menu = menu; 
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
        lblNo.setText("                        NO");
        lblNo.setOpaque(true);
        lblNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNoMouseClicked(evt);
            }
        });
        getContentPane().add(lblNo);
        lblNo.setBounds(390, 150, 180, 120);

        lblYes.setBackground(new java.awt.Color(0, 0, 0));
        lblYes.setForeground(new java.awt.Color(255, 255, 255));
        lblYes.setText("                        YES");
        lblYes.setOpaque(true);
        lblYes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblYesMouseClicked(evt);
            }
        });
        getContentPane().add(lblYes);
        lblYes.setBounds(90, 150, 180, 120);

        lblBackground.setText("background");
        lblBackground.setOpaque(true);
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 610, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblYesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblYesMouseClicked
        menu.dispose();
        this.dispose();
        engine.save();
    }//GEN-LAST:event_lblYesMouseClicked

    private void lblNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNoMouseClicked
        this.dispose();
        menu.dispose(); 
        MainMenu main = new MainMenu(engine); 
    }//GEN-LAST:event_lblNoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblNo;
    private javax.swing.JLabel lblYes;
    // End of variables declaration//GEN-END:variables

}
