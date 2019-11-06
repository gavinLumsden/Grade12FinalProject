package jframes;

import collections.LinkedList;
import game.GameEngine;
import game.gametools.Animation;
import maps.Map1;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
    private GameEngine  engine;
    private JLabel[]    labels;
    private Animation[] animations;

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
        banditAnimations.add("/animations/playerClasses/bandit/right/banditWalk1.png");
        banditAnimations.add("/animations/playerClasses/bandit/right/banditIdle.png");
        banditAnimations.add("/animations/playerClasses/bandit/right/banditWalk2.png");
        banditAnimations.add("/animations/playerClasses/bandit/right/banditIdle.png");

        LinkedList<String> gamblerAnimations = new LinkedList<>();
        gamblerAnimations.add("/animations/playerClasses/gambler/right/gamblerWalk1.png");
        gamblerAnimations.add("/animations/playerClasses/gambler/right/gamblerIdle.png");
        gamblerAnimations.add("/animations/playerClasses/gambler/right/gamblerWalk2.png");
        gamblerAnimations.add("/animations/playerClasses/gambler/right/gamblerIdle.png");

        LinkedList<String> hackerAnimations = new LinkedList<>();
        hackerAnimations.add("/animations/playerClasses/hacker/right/hackerWalk1.png");
        hackerAnimations.add("/animations/playerClasses/hacker/right/hackerIdle.png");
        hackerAnimations.add("/animations/playerClasses/hacker/right/hackerWalk2.png");
        hackerAnimations.add("/animations/playerClasses/hacker/right/hackerIdle.png");

        LinkedList<String> juggernautAnimations = new LinkedList<>();
        juggernautAnimations.add("/animations/playerClasses/juggernaut/right/juggernautWalk1.png");
        juggernautAnimations.add("/animations/playerClasses/juggernaut/right/juggernautIdle.png");
        juggernautAnimations.add("/animations/playerClasses/juggernaut/right/juggernautWalk2.png");
        juggernautAnimations.add("/animations/playerClasses/juggernaut/right/juggernautIdle.png");

        LinkedList<String> mageAnimations = new LinkedList<>();
        mageAnimations.add("/animations/playerClasses/mage/right/mageWalk1.png");
        mageAnimations.add("/animations/playerClasses/mage/right/mageIdle1.png");
        mageAnimations.add("/animations/playerClasses/mage/right/mageWalk2.png");
        mageAnimations.add("/animations/playerClasses/mage/right/mageIdle1.png");

        LinkedList<String> vampireAnimations = new LinkedList<>();
        vampireAnimations.add("/animations/playerClasses/vampire/right/vampireWalk1.png");
        vampireAnimations.add("/animations/playerClasses/vampire/right/vampireIdle.png");
        vampireAnimations.add("/animations/playerClasses/vampire/right/vampireWalk2.png");
        vampireAnimations.add("/animations/playerClasses/vampire/right/vampireIdle.png");

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

        isClicked = false;
        selected = "";
        
        setupForm();
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
        lblVampire.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/playerclasses/vampire/right/vampireIdle.png"))); // NOI18N
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
        lblJuggernaut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/playerclasses/juggernaut/right/juggernautIdle.png"))); // NOI18N
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
        lblHacker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/playerclasses/hacker/right/hackerIdle.png"))); // NOI18N
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
        lblBandit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/playerclasses/bandit/right/banditIdle.png"))); // NOI18N
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
        lblMage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/playerclasses/mage/right/mageIdle1.png"))); // NOI18N
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
        lblGambler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/playerclasses/gambler/right/gamblerIdle.png"))); // NOI18N
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

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/formBackgrounds/characterSelectBackground.png"))); // NOI18N
        background.setOpaque(true);
        getContentPane().add(background);
        background.setBounds(0, 0, 560, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblVampireMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVampireMouseClicked
        label = lblVampire; 
        spot = 5; 
        selected = "vampire"; 
        click(); 
    }//GEN-LAST:event_lblVampireMouseClicked

    private void lblJuggernautMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJuggernautMouseClicked
        label = lblJuggernaut; 
        spot = 3; 
        selected = "juggernaut"; 
        click(); 
    }//GEN-LAST:event_lblJuggernautMouseClicked

    private void lblHackerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHackerMouseClicked
        label = lblHacker; 
        spot = 2; 
        selected = "hacker"; 
        click(); 
    }//GEN-LAST:event_lblHackerMouseClicked

    private void lblBanditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBanditMouseClicked
        label = lblBandit; 
        spot = 0; 
        selected = "bandit"; 
        click(); 
    }//GEN-LAST:event_lblBanditMouseClicked

    private void lblMageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMageMouseClicked
        label = lblMage; 
        spot = 4; 
        selected = "mage"; 
        click(); 
    }//GEN-LAST:event_lblMageMouseClicked

    private void lblGamblerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGamblerMouseClicked
        label = lblGambler; 
        spot = 1; 
        selected = "gambler"; 
        click(); 
    }//GEN-LAST:event_lblGamblerMouseClicked

    private void lblVampireMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVampireMouseEntered
        label = lblVampire; 
        spot = 5; 
        hoverIn(); 
    }//GEN-LAST:event_lblVampireMouseEntered

    private void lblJuggernautMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJuggernautMouseEntered
        label = lblJuggernaut; 
        spot = 3; 
        hoverIn(); 
    }//GEN-LAST:event_lblJuggernautMouseEntered

    private void lblHackerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHackerMouseEntered
        label = lblHacker; 
        spot = 2; 
        hoverIn(); 
    }//GEN-LAST:event_lblHackerMouseEntered

    private void lblBanditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBanditMouseEntered
        label = lblBandit; 
        spot = 0; 
        hoverIn(); 
    }//GEN-LAST:event_lblBanditMouseEntered

    private void lblMageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMageMouseEntered
        label = lblMage; 
        spot = 4; 
        hoverIn(); 
    }//GEN-LAST:event_lblMageMouseEntered

    private void lblGamblerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGamblerMouseEntered
        label = lblGambler; 
        spot = 1; 
        hoverIn(); 
    }//GEN-LAST:event_lblGamblerMouseEntered

    private void lblVampireMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVampireMouseExited
        hoverOut(); 
    }//GEN-LAST:event_lblVampireMouseExited

    private void lblJuggernautMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJuggernautMouseExited
        hoverOut(); 
    }//GEN-LAST:event_lblJuggernautMouseExited

    private void lblHackerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHackerMouseExited
        hoverOut(); 
    }//GEN-LAST:event_lblHackerMouseExited

    private void lblBanditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBanditMouseExited
        hoverOut(); 
    }//GEN-LAST:event_lblBanditMouseExited

    private void lblMageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMageMouseExited
        hoverOut(); 
    }//GEN-LAST:event_lblMageMouseExited

    private void lblGamblerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGamblerMouseExited
        hoverOut(); 
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
            this.setVisible(false);
            Information info = new Information(selected, engine, this); 
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
            for (int i = 0; i < animations.length; i++) {
                animations[i].stop(); 
            }
            for (int i = 0; i < labels.length; i++) {
                labels[i].setBorder(BorderFactory.createLineBorder(Color.black));
            }
            label = null; 
            spot = 0; 
            selected = ""; 
        }
    }

    /**
     * highlights a jlabel
     */
    private void set() {
        if (label != null) {
            label.setBorder(BorderFactory.createBevelBorder(1, Color.yellow, Color.yellow));
            if (animations[spot].isRunning() == false) {
                animations[spot].run();
            }
        }
    }
    
}
