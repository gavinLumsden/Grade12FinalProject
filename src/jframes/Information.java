package jframes;

import game.GameEngine;
import game.Hero;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import static jframes.CharacterSelect.selected;
import maps.Map1;

/**
 * @author g.lumsden
 */
public class Information extends javax.swing.JFrame {

    // the height and width of the form
    private final int FORM_WIDTH  = 1376;  
    private final int FORM_HEIGHT = 808; 
    
    private String          selected; 
    private GameEngine      engine; 
    private CharacterSelect cs; 
    
    private JLabel[]   labels;
    private boolean isClicked;
    private JLabel  label; 
        
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
        JLabel[] labels = {
            lblBack, lblSelect
        };
        this.labels = labels;
        isClicked = false;
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
        lblHeroInformation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/formBackgrounds/characterInformationBandit.png"))); // NOI18N
        getContentPane().add(lblHeroInformation);
        lblHeroInformation.setBounds(0, 0, 1360, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSelectMouseClicked
        label = lblSelect; 
        click(); 
        cs.dispose();
        this.dispose();
        Map1 map1 = new Map1(1, engine);
    }//GEN-LAST:event_lblSelectMouseClicked

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        label = lblBack; 
        click(); 
        this.setVisible(false);
        cs.setVisible(true); 
    }//GEN-LAST:event_lblBackMouseClicked

    private void lblBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseEntered
        label = lblBack; 
        hoverIn(); 
    }//GEN-LAST:event_lblBackMouseEntered

    private void lblBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseExited
        hoverOut(); 
    }//GEN-LAST:event_lblBackMouseExited

    private void lblSelectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSelectMouseEntered
        label = lblSelect; 
        hoverIn();
    }//GEN-LAST:event_lblSelectMouseEntered

    private void lblSelectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSelectMouseExited
        hoverOut();
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
