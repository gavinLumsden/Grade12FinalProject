package jframes;

import collections.LinkedList;
import game.GameEngine;
import game.Icons;
import game.gametools.Animation;
import javax.swing.JLabel;

/**
 * CharacterSelect.java - A form where the player selects their character
 *
 * @author g.lumsden
 * @since 12-Jun-2019
 */
public class CharacterSelect extends javax.swing.JFrame {

    // height and witdth of the form
    private final int FORM_WIDTH  = 576;
    private final int FORM_HEIGHT = 348;

    // properties
    private GameEngine   engine;
    private JLabel[]     labels;
    private Animation[]  animations;
    private boolean      isClicked;
    private JLabel       label; 
    private int          spot;
    public static String selected;

    /**
     * Creates new form CharacterSelect
     *
     * @param engine
     */
    public CharacterSelect(GameEngine engine) {
        initComponents();
        this.engine = engine;

        LinkedList<LinkedList<String>> imageFiles = new LinkedList<>();
        
        LinkedList<String> banditAnimations = new LinkedList<>();
        banditAnimations.add(Icons.BANDIT_WALK_RIGHT_1);
        banditAnimations.add(Icons.BANDIT_IDLE_RIGHT); 
        banditAnimations.add(Icons.BANDIT_WALK_RIGHT_2);
        banditAnimations.add(Icons.BANDIT_IDLE_RIGHT); 

        LinkedList<String> gamblerAnimations = new LinkedList<>();
        gamblerAnimations.add(Icons.GAMBLER_WALK_RIGHT_1);
        gamblerAnimations.add(Icons.GAMBLER_IDLE_RIGHT); 
        gamblerAnimations.add(Icons.GAMBLER_WALK_RIGHT_2);
        gamblerAnimations.add(Icons.GAMBLER_IDLE_RIGHT); 

        LinkedList<String> hackerAnimations = new LinkedList<>();
        hackerAnimations.add(Icons.HACKER_WALK_RIGHT_1);
        hackerAnimations.add(Icons.HACKER_IDLE_RIGHT); 
        hackerAnimations.add(Icons.HACKER_WALK_RIGHT_2);
        hackerAnimations.add(Icons.HACKER_IDLE_RIGHT); 

        LinkedList<String> juggernautAnimations = new LinkedList<>();
        juggernautAnimations.add(Icons.JUGGERNAUT_WALK_RIGHT_1);
        juggernautAnimations.add(Icons.JUGGERNAUT_IDLE_RIGHT); 
        juggernautAnimations.add(Icons.JUGGERNAUT_WALK_RIGHT_2);
        juggernautAnimations.add(Icons.JUGGERNAUT_IDLE_RIGHT); 

        LinkedList<String> mageAnimations = new LinkedList<>();
        mageAnimations.add(Icons.MAGE_WALK_RIGHT_1);
        mageAnimations.add(Icons.MAGE_IDLE_RIGHT_1); 
        mageAnimations.add(Icons.MAGE_WALK_RIGHT_2);
        mageAnimations.add(Icons.MAGE_IDLE_RIGHT_1); 

        LinkedList<String> vampireAnimations = new LinkedList<>();
        vampireAnimations.add(Icons.VAMPIRE_WALK_RIGHT_1);
        vampireAnimations.add(Icons.VAMPIRE_IDLE_RIGHT); 
        vampireAnimations.add(Icons.VAMPIRE_WALK_RIGHT_2);
        vampireAnimations.add(Icons.VAMPIRE_IDLE_RIGHT); 

        imageFiles.add(banditAnimations);
        imageFiles.add(gamblerAnimations);
        imageFiles.add(hackerAnimations);
        imageFiles.add(juggernautAnimations);
        imageFiles.add(mageAnimations);
        imageFiles.add(vampireAnimations);

        JLabel[] labels = {
            lblBandit, lblGambler, lblHacker,
            lblJuggernaut, lblMage, lblVampire
        };
        this.labels = labels;
        
        animations = new Animation[6];
        for (int i = 0; i < animations.length; i++) {
            animations[i] = new Animation(labels[i], imageFiles.get(i), 800, true);
        }
        
        engine.setImage(background, Icons.CHARACTER_SELECT_BACKGROUND);
        isClicked = false;
        selected = "";
        engine.createJFrame(FORM_WIDTH, FORM_HEIGHT, this); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblVampire = new javax.swing.JLabel();
        lblJuggernaut = new javax.swing.JLabel();
        lblHacker = new javax.swing.JLabel();
        lblBandit = new javax.swing.JLabel();
        lblMage = new javax.swing.JLabel();
        lblGambler = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(null);

        lblVampire.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVampire.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblVampire.setOpaque(true);
        lblVampire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVampireMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblVampireMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblVampireMouseExited(evt);
            }
        });
        getContentPane().add(lblVampire);
        lblVampire.setBounds(54, 70, 95, 97);

        lblJuggernaut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJuggernaut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblJuggernaut.setOpaque(true);
        lblJuggernaut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblJuggernautMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblJuggernautMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJuggernautMouseExited(evt);
            }
        });
        getContentPane().add(lblJuggernaut);
        lblJuggernaut.setBounds(237, 70, 95, 97);

        lblHacker.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHacker.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblHacker.setOpaque(true);
        lblHacker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHackerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHackerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblHackerMouseExited(evt);
            }
        });
        getContentPane().add(lblHacker);
        lblHacker.setBounds(412, 70, 95, 97);

        lblBandit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBandit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblBandit.setOpaque(true);
        lblBandit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBanditMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBanditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBanditMouseExited(evt);
            }
        });
        getContentPane().add(lblBandit);
        lblBandit.setBounds(54, 194, 95, 97);

        lblMage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblMage.setOpaque(true);
        lblMage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMageMouseExited(evt);
            }
        });
        getContentPane().add(lblMage);
        lblMage.setBounds(237, 194, 95, 97);

        lblGambler.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGambler.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblGambler.setOpaque(true);
        lblGambler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGamblerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblGamblerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblGamblerMouseExited(evt);
            }
        });
        getContentPane().add(lblGambler);
        lblGambler.setBounds(412, 194, 95, 97);

        background.setOpaque(true);
        getContentPane().add(background);
        background.setBounds(0, 0, 560, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblVampireMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVampireMouseClicked
        label = lblVampire; 
        spot = 5; 
        selected = "vampire"; 
        engine.click(labels, label, isClicked, animations, spot); 
        this.setVisible(false);
        Information info = new Information(selected, engine, this); 
    }//GEN-LAST:event_lblVampireMouseClicked

    private void lblJuggernautMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJuggernautMouseClicked
        label = lblJuggernaut; 
        spot = 3; 
        selected = "juggernaut"; 
        engine.click(labels, label, isClicked, animations, spot); 
        this.setVisible(false);
        Information info = new Information(selected, engine, this); 
    }//GEN-LAST:event_lblJuggernautMouseClicked

    private void lblHackerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHackerMouseClicked
        label = lblHacker; 
        spot = 2; 
        selected = "hacker"; 
        engine.click(labels, label, isClicked, animations, spot); 
        this.setVisible(false);
        Information info = new Information(selected, engine, this); 
    }//GEN-LAST:event_lblHackerMouseClicked

    private void lblBanditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBanditMouseClicked
        label = lblBandit; 
        spot = 0; 
        selected = "bandit"; 
        engine.click(labels, label, isClicked, animations, spot); 
        this.setVisible(false);
        Information info = new Information(selected, engine, this); 
    }//GEN-LAST:event_lblBanditMouseClicked

    private void lblMageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMageMouseClicked
        label = lblMage; 
        spot = 4; 
        selected = "mage"; 
        engine.click(labels, label, isClicked, animations, spot); 
        this.setVisible(false);
        Information info = new Information(selected, engine, this); 
    }//GEN-LAST:event_lblMageMouseClicked

    private void lblGamblerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGamblerMouseClicked
        label = lblGambler; 
        spot = 1; 
        selected = "gambler"; 
        engine.click(labels, label, isClicked, animations, spot); 
        this.setVisible(false);
        Information info = new Information(selected, engine, this); 
    }//GEN-LAST:event_lblGamblerMouseClicked

    private void lblVampireMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVampireMouseEntered
        label = lblVampire; 
        spot = 5; 
        engine.hoverIn(labels, label, isClicked, animations, spot); 
    }//GEN-LAST:event_lblVampireMouseEntered

    private void lblJuggernautMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJuggernautMouseEntered
        label = lblJuggernaut; 
        spot = 3; 
        engine.hoverIn(labels, label, isClicked, animations, spot); 
    }//GEN-LAST:event_lblJuggernautMouseEntered

    private void lblHackerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHackerMouseEntered
        label = lblHacker; 
        spot = 2; 
        engine.hoverIn(labels, label, isClicked, animations, spot); 
    }//GEN-LAST:event_lblHackerMouseEntered

    private void lblBanditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBanditMouseEntered
        label = lblBandit; 
        spot = 0; 
        engine.hoverIn(labels, label, isClicked, animations, spot); 
    }//GEN-LAST:event_lblBanditMouseEntered

    private void lblMageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMageMouseEntered
        label = lblMage; 
        spot = 4; 
        engine.hoverIn(labels, label, isClicked, animations, spot); 
    }//GEN-LAST:event_lblMageMouseEntered

    private void lblGamblerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGamblerMouseEntered
        label = lblGambler; 
        spot = 1; 
        engine.hoverIn(labels, label, isClicked, animations, spot); 
    }//GEN-LAST:event_lblGamblerMouseEntered

    private void lblVampireMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVampireMouseExited
        engine.hoverOut(labels, label, isClicked, animations, spot); 
    }//GEN-LAST:event_lblVampireMouseExited

    private void lblJuggernautMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJuggernautMouseExited
        engine.hoverOut(labels, label, isClicked, animations, spot); 
    }//GEN-LAST:event_lblJuggernautMouseExited

    private void lblHackerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHackerMouseExited
        engine.hoverOut(labels, label, isClicked, animations, spot); 
    }//GEN-LAST:event_lblHackerMouseExited

    private void lblBanditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBanditMouseExited
        engine.hoverOut(labels, label, isClicked, animations, spot); 
    }//GEN-LAST:event_lblBanditMouseExited

    private void lblMageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMageMouseExited
        engine.hoverOut(labels, label, isClicked, animations, spot); 
    }//GEN-LAST:event_lblMageMouseExited

    private void lblGamblerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGamblerMouseExited
        engine.hoverOut(labels, label, isClicked, animations, spot); 
    }//GEN-LAST:event_lblGamblerMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel lblBandit;
    private javax.swing.JLabel lblGambler;
    private javax.swing.JLabel lblHacker;
    private javax.swing.JLabel lblJuggernaut;
    private javax.swing.JLabel lblMage;
    private javax.swing.JLabel lblVampire;
    // End of variables declaration//GEN-END:variables

}
// make an absrtact class with all th pictures url linked to the google drive, make them static and public, use them across all classes!