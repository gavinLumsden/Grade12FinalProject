package jframes;

import game.GameEngine;
import game.Hero;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import maps.Map1;

/**
 * @author g.lumsden
 */
public class Information extends javax.swing.JFrame {

    // the height and width of the form
    private final int FORM_WIDTH  = 1500;  
    private final int FORM_HEIGHT = 900; 
    
    private String          selected; 
    private GameEngine      engine; 
    private CharacterSelect cs; 
        
    /**
     * Constructor for the class
     * @param selected
     * @param engine
     * @param cs 
     */
    public Information(String selected, GameEngine engine, CharacterSelect cs) {
        initComponents();
        this.selected = selected; 
        this.engine   = engine; 
        this.cs       = cs; 
        setupHero(); 
        setupForm(); 
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
        lblSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSelectMouseClicked(evt);
            }
        });
        getContentPane().add(lblSelect);
        lblSelect.setBounds(920, 630, 380, 90);

        lblBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        getContentPane().add(lblBack);
        lblBack.setBounds(920, 500, 390, 100);

        lblHeroInformation.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblHeroInformation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeroInformation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/formBackgrounds/characterInformationBandit.png"))); // NOI18N
        getContentPane().add(lblHeroInformation);
        lblHeroInformation.setBounds(0, 0, 1370, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSelectMouseClicked
        cs.dispose();
        this.dispose();
        Map1 map1 = new Map1(1, engine);
    }//GEN-LAST:event_lblSelectMouseClicked

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        this.setVisible(false);
        cs.setVisible(true); 
    }//GEN-LAST:event_lblBackMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblHeroInformation;
    private javax.swing.JLabel lblSelect;
    // End of variables declaration//GEN-END:variables

    /**
     * setups the image and information for the hero
     */
    private void setupHero() {
        String informationIcon = Hero.getInformationIcon(selected); 
        if (informationIcon != null) {
            Icon icon = new ImageIcon(getClass().getResource(informationIcon)); 
            lblHeroInformation.setIcon(icon); 
        } else {
            System.out.println("error assigning hero information");
        }
    }

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
