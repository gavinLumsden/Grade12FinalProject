package jframes;

import game.GameEngine;
import game.HeroCreator; 
import grid.Grid;
import javax.swing.JLabel;

/**
 * @author g.lumsden
 */
public class Information extends javax.swing.JFrame {

    // width and height of the form
    private final int FORM_WIDTH  = 1376;  
    private final int FORM_HEIGHT = 808; 
    
    // private properties
    private CharacterSelect characterSelect; 
    private GameEngine      engine; 
    private JLabel[]        labels;
    private JLabel          label; 
    private boolean         isClicked;
        
    /**
     * Constructor for the class
     * 
     * @param engine
     * @param characterSelect
     */
    public Information(GameEngine engine, CharacterSelect characterSelect) {
        initComponents();
        this.engine          = engine; 
        this.characterSelect = characterSelect;
        JLabel[] labels = {
            lblBack, lblSelect
        };
        this.labels = labels;
        setupHero(); 
        engine.createJFrame(FORM_WIDTH, FORM_HEIGHT, this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSelect = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        lblHeroInformation = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblSelect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSelect.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSelectMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSelectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSelectMouseExited(evt);
            }
        });
        getContentPane().add(lblSelect);
        lblSelect.setBounds(909, 618, 395, 104);

        lblBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBackMouseExited(evt);
            }
        });
        getContentPane().add(lblBack);
        lblBack.setBounds(909, 495, 395, 104);

        lblHeroInformation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblHeroInformation);
        lblHeroInformation.setBounds(0, 0, 1360, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSelectMouseClicked
        label = lblSelect; 
        engine.click(labels, label, isClicked, null, 0);
        characterSelect.dispose();
        this.dispose();
        Grid grid = new Grid(engine);  
    }//GEN-LAST:event_lblSelectMouseClicked

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        label = lblBack; 
        engine.click(labels, label, isClicked, null, 0);
        this.setVisible(false);
        characterSelect.setVisible(true); 
    }//GEN-LAST:event_lblBackMouseClicked

    private void lblBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseEntered
        label = lblBack; 
        engine.hoverIn(labels, label, isClicked, null, 0); 
    }//GEN-LAST:event_lblBackMouseEntered

    private void lblBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseExited
        engine.hoverOut(labels, label, isClicked, null, 0); 
    }//GEN-LAST:event_lblBackMouseExited

    private void lblSelectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSelectMouseEntered
        label = lblSelect; 
        engine.hoverIn(labels, label, isClicked, null, 0); 
    }//GEN-LAST:event_lblSelectMouseEntered

    private void lblSelectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSelectMouseExited
        engine.hoverOut(labels, label, isClicked, null, 0); 
    }//GEN-LAST:event_lblSelectMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblHeroInformation;
    private javax.swing.JLabel lblSelect;
    // End of variables declaration//GEN-END:variables

    /**
     * setups the image and information for the hero
     */
    private void setupHero() {
        String image = HeroCreator.getInformationIcon(engine.selected); 
        engine.setImage(lblHeroInformation, image);
    }

}
