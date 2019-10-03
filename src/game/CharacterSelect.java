package game;

import collections.LinkedList;
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
    private final int FORM_WIDTH = 575;
    private final int FORM_HEIGHT = 430;

    // properties
    private GameEngine engine;
    private JLabel[] labels;
    private Animation[] animations;

    // used to determine if a label is clicked
    private boolean isClicked;

    // stores the class the player has selected
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
        banditAnimations.add("/animations/bandit/right/banditWalk1.png");
        banditAnimations.add("/animations/bandit/right/banditIdle.png");
        banditAnimations.add("/animations/bandit/right/banditWalk2.png");
        banditAnimations.add("/animations/bandit/right/banditIdle.png");

        LinkedList<String> gamblerAnimations = new LinkedList<>();
        gamblerAnimations.add("/animations/gambler/right/gamblerWalk1.png");
        gamblerAnimations.add("/animations/gambler/right/gamblerIdle.png");
        gamblerAnimations.add("/animations/gambler/right/gamblerWalk2.png");
        gamblerAnimations.add("/animations/gambler/right/gamblerIdle.png");

        LinkedList<String> hackerAnimations = new LinkedList<>();
        hackerAnimations.add("/animations/hacker/right/hackerWalk1.png");
        hackerAnimations.add("/animations/hacker/right/hackerIdle.png");
        hackerAnimations.add("/animations/hacker/right/hackerWalk2.png");
        hackerAnimations.add("/animations/hacker/right/hackerIdle.png");

        LinkedList<String> juggernautAnimations = new LinkedList<>();
        juggernautAnimations.add("/animations/juggernaut/right/juggernautWalk1.png");
        juggernautAnimations.add("/animations/juggernaut/right/juggernautIdle.png");
        juggernautAnimations.add("/animations/juggernaut/right/juggernautWalk2.png");
        juggernautAnimations.add("/animations/juggernaut/right/juggernautIdle.png");

        LinkedList<String> mageAnimations = new LinkedList<>();
        mageAnimations.add("/animations/mage/right/mageWalk1.png");
        mageAnimations.add("/animations/mage/right/mageIdle1.png");
        mageAnimations.add("/animations/mage/right/mageWalk2.png");
        mageAnimations.add("/animations/mage/right/mageIdle1.png");

        LinkedList<String> vampireAnimations = new LinkedList<>();
        vampireAnimations.add("/animations/vampire/right/vampireWalk1.png");
        vampireAnimations.add("/animations/vampire/right/vampireIdle.png");
        vampireAnimations.add("/animations/vampire/right/vampireWalk2.png");
        vampireAnimations.add("/animations/vampire/right/vampireIdle.png");

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
        btnSelect.setEnabled(false);
        btnAbilities.setEnabled(false);
        selected = "";
        unClick();
        setupForm();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAbilities = new javax.swing.JLabel();
        btnSelect = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblGambler = new javax.swing.JLabel();
        lblMage = new javax.swing.JLabel();
        lblJuggernaut = new javax.swing.JLabel();
        lblVampire = new javax.swing.JLabel();
        lblBandit = new javax.swing.JLabel();
        lblHacker = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(null);

        btnAbilities.setBackground(new java.awt.Color(153, 255, 153));
        btnAbilities.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btnAbilities.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAbilities.setText("Abilities");
        btnAbilities.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAbilities.setOpaque(true);
        btnAbilities.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAbilitiesMouseClicked(evt);
            }
        });
        getContentPane().add(btnAbilities);
        btnAbilities.setBounds(280, 290, 270, 100);

        btnSelect.setBackground(new java.awt.Color(153, 255, 153));
        btnSelect.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btnSelect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSelect.setText("Select");
        btnSelect.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSelect.setOpaque(true);
        btnSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSelectMouseClicked(evt);
            }
        });
        getContentPane().add(btnSelect);
        btnSelect.setBounds(10, 290, 270, 100);

        lblTitle.setBackground(new java.awt.Color(255, 255, 153));
        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 102, 102));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Choose your Character!");
        lblTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTitle.setOpaque(true);
        getContentPane().add(lblTitle);
        lblTitle.setBounds(4, 2, 550, 58);

        lblGambler.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGambler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/gambler/right/gamblerIdle.png"))); // NOI18N
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
        lblGambler.setBounds(340, 180, 100, 100);

        lblMage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/mage/right/mageIdle1.png"))); // NOI18N
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
        lblMage.setBounds(230, 180, 100, 100);

        lblJuggernaut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJuggernaut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/juggernaut/right/juggernautIdle.png"))); // NOI18N
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
        lblJuggernaut.setBounds(230, 70, 100, 100);

        lblVampire.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVampire.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/vampire/right/vampireIdle.png"))); // NOI18N
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
        lblVampire.setBounds(120, 70, 100, 100);

        lblBandit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBandit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/bandit/right/banditIdle.png"))); // NOI18N
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
        lblBandit.setBounds(120, 180, 100, 100);

        lblHacker.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHacker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/hacker/right/hackerIdle.png"))); // NOI18N
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
        lblHacker.setBounds(340, 70, 100, 100);

        background.setBackground(new java.awt.Color(204, 255, 255));
        background.setOpaque(true);
        getContentPane().add(background);
        background.setBounds(0, 0, 560, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * when the player clicks on the label
     *
     * @param evt
     */
    private void lblVampireMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVampireMouseClicked
        if (isClicked == false) {
            click("vampire");
            isClicked = true;
        } else {
            unClick();
            isClicked = false;
        }
    }//GEN-LAST:event_lblVampireMouseClicked

    /**
     * when the player clicks on the label
     *
     * @param evt
     */
    private void lblJuggernautMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJuggernautMouseClicked
        if (isClicked == false) {
            click("juggernaut");
            isClicked = true;
        } else {
            unClick();
            isClicked = false;
        }
    }//GEN-LAST:event_lblJuggernautMouseClicked

    /**
     * when the player clicks on the label
     *
     * @param evt
     */
    private void lblGamblerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGamblerMouseClicked
        if (isClicked == false) {
            click("gambler");
            isClicked = true;
        } else {
            unClick();
            isClicked = false;
        }
    }//GEN-LAST:event_lblGamblerMouseClicked

    /**
     * when the player clicks on the label
     *
     * @param evt
     */
    private void lblBanditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBanditMouseClicked
        if (isClicked == false) {
            click("bandit");
            isClicked = true;
        } else {
            unClick();
            isClicked = false;
        }
    }//GEN-LAST:event_lblBanditMouseClicked

    /**
     * when the player clicks on the label
     *
     * @param evt
     */
    private void lblMageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMageMouseClicked
        if (isClicked == false) {
            click("mage");
            isClicked = true;
        } else {
            unClick();
            isClicked = false;
        }
    }//GEN-LAST:event_lblMageMouseClicked

    /**
     * when the player clicks on the label
     *
     * @param evt
     */
    private void lblHackerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHackerMouseClicked
        if (isClicked == false) {
            click("hacker");
            isClicked = true;
        } else {
            unClick();
            isClicked = false;
        }
    }//GEN-LAST:event_lblHackerMouseClicked

    /**
     * when the player hovers over the label
     *
     * @param evt
     */
    private void lblVampireMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVampireMouseEntered
        hover("vampire in");
    }//GEN-LAST:event_lblVampireMouseEntered

    /**
     * when the player hovers over the label
     *
     * @param evt
     */
    private void lblJuggernautMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJuggernautMouseEntered
        hover("juggernaut in");
    }//GEN-LAST:event_lblJuggernautMouseEntered

    /**
     * when the player hovers over the label
     *
     * @param evt
     */
    private void lblHackerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHackerMouseEntered
        hover("hacker in");
    }//GEN-LAST:event_lblHackerMouseEntered

    /**
     * when the player hovers over the label
     *
     * @param evt
     */
    private void lblBanditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBanditMouseEntered
        hover("bandit in");
    }//GEN-LAST:event_lblBanditMouseEntered

    /**
     * when the player hovers over the label
     *
     * @param evt
     */
    private void lblMageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMageMouseEntered
        hover("mage in");
    }//GEN-LAST:event_lblMageMouseEntered

    /**
     * when the player hovers over the label
     *
     * @param evt
     */
    private void lblGamblerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGamblerMouseEntered
        hover("gambler in");
    }//GEN-LAST:event_lblGamblerMouseEntered

    /**
     * when the player leaves the label
     *
     * @param evt
     */
    private void lblBanditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBanditMouseExited
        hover("bandit out");
    }//GEN-LAST:event_lblBanditMouseExited

    /**
     * when the player leaves the label
     *
     * @param evt
     */
    private void lblMageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMageMouseExited
        hover("mage out");
    }//GEN-LAST:event_lblMageMouseExited

    /**
     * when the player leaves the label
     *
     * @param evt
     */
    private void lblGamblerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGamblerMouseExited
        hover("gambler out");
    }//GEN-LAST:event_lblGamblerMouseExited

    /**
     * when the player leaves the label
     *
     * @param evt
     */
    private void lblVampireMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVampireMouseExited
        hover("vampire out");
    }//GEN-LAST:event_lblVampireMouseExited

    /**
     * when the player leaves the label
     *
     * @param evt
     */
    private void lblJuggernautMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJuggernautMouseExited
        hover("juggernaut out");
    }//GEN-LAST:event_lblJuggernautMouseExited

    /**
     * when the player leaves the label
     *
     * @param evt
     */
    private void lblHackerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHackerMouseExited
        hover("hacker out");
    }//GEN-LAST:event_lblHackerMouseExited

    private void btnSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectMouseClicked
        if (selected.equals("")) {
            JOptionPane.showMessageDialog(null, "Please select a character!");
        } else {
            Map1 spawn = new Map1("", engine);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnSelectMouseClicked

    private void btnAbilitiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbilitiesMouseClicked
        if (selected.equals("")) {
            JOptionPane.showMessageDialog(null, "Please select a character!");
        } else {
            Abilities abilities = new Abilities(selected); 
        }
    }//GEN-LAST:event_btnAbilitiesMouseClicked

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
     *
     * @param hoveredLabel
     */
    public void hover(String hoveredLabel) {
        if (hoveredLabel.equals("bandit in")) {
            if (isClicked == false) {
                animations[0].run();
                lblBandit.setBorder(BorderFactory.createBevelBorder(1, Color.green, Color.red));
            }
        } else if (hoveredLabel.equals("bandit out")) {
            if (isClicked == false) {
                animations[0].stop();
                lblBandit.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }
        } else if (hoveredLabel.equals("gambler in")) {
            if (isClicked == false) {
                animations[1].run();
                lblGambler.setBorder(BorderFactory.createBevelBorder(1, Color.green, Color.red));
            }
        } else if (hoveredLabel.equals("gambler out")) {
            if (isClicked == false) {
                animations[1].stop();
                lblGambler.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }
        } else if (hoveredLabel.equals("hacker in")) {
            if (isClicked == false) {
                animations[2].run();
                lblHacker.setBorder(BorderFactory.createBevelBorder(1, Color.green, Color.red));
            }
        } else if (hoveredLabel.equals("hacker out")) {
            if (isClicked == false) {
                animations[2].stop();
                lblHacker.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }
        } else if (hoveredLabel.equals("juggernaut in")) {
            if (isClicked == false) {
                animations[3].run();
                lblJuggernaut.setBorder(BorderFactory.createBevelBorder(1, Color.green, Color.red));
            }
        } else if (hoveredLabel.equals("juggernaut out")) {
            if (isClicked == false) {
                animations[3].stop();
                lblJuggernaut.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }
        } else if (hoveredLabel.equals("mage in")) {
            if (isClicked == false) {
                animations[4].run();
                lblMage.setBorder(BorderFactory.createBevelBorder(1, Color.green, Color.red));
            }
        } else if (hoveredLabel.equals("mage out")) {
            if (isClicked == false) {
                animations[4].stop();
                lblMage.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }
        } else if (hoveredLabel.equals("vampire in")) {
            if (isClicked == false) {
                animations[5].run();
                lblVampire.setBorder(BorderFactory.createBevelBorder(1, Color.green, Color.red));
            }
        } else if (hoveredLabel.equals("vampire out")) {
            if (isClicked == false) {
                animations[5].stop();
                lblVampire.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }
        }
    }

    /**
     *
     * @param selectedLabel
     */
    private void click(String clickedLabel) {
        if (clickedLabel.equals("bandit")) {
            selected = "bandit";
            lblBandit.setBorder(BorderFactory.createBevelBorder(1, Color.green, Color.red));
            if (animations[0].isRunning() == false) {
                animations[0].run();
            }
            btnSelect.setEnabled(true);
            btnAbilities.setEnabled(true);
        } else if (clickedLabel.equals("gambler")) {
            selected = "gambler";
            lblGambler.setBorder(BorderFactory.createBevelBorder(1, Color.green, Color.red));
            if (animations[1].isRunning() == false) {
                animations[1].run();
            }
            btnSelect.setEnabled(true);
            btnAbilities.setEnabled(true);
        } else if (clickedLabel.equals("hacker")) {
            selected = "hacker";
            lblHacker.setBorder(BorderFactory.createBevelBorder(1, Color.green, Color.red));
            if (animations[2].isRunning() == false) {
                animations[2].run();
            }
            btnSelect.setEnabled(true);
            btnAbilities.setEnabled(true);
        } else if (clickedLabel.equals("juggernaut")) {
            selected = "juggernaut";
            lblJuggernaut.setBorder(BorderFactory.createBevelBorder(1, Color.green, Color.red));
            if (animations[3].isRunning() == false) {
                animations[3].run();
            }
            btnSelect.setEnabled(true);
            btnAbilities.setEnabled(true);
        } else if (clickedLabel.equals("mage")) {
            selected = "mage";
            lblMage.setBorder(BorderFactory.createBevelBorder(1, Color.green, Color.red));
            if (animations[4].isRunning() == false) {
                animations[4].run();
            }
            btnSelect.setEnabled(true);
            btnAbilities.setEnabled(true);
        } else if (clickedLabel.equals("vampire")) {
            selected = "vampire";
            lblVampire.setBorder(BorderFactory.createBevelBorder(1, Color.green, Color.red));
            if (animations[5].isRunning() == false) {
                animations[5].run();
            }
            btnSelect.setEnabled(true);
            btnAbilities.setEnabled(true);
        }
    }

    /**
     *
     */
    private void unClick() {
        selected = "";
        for (JLabel label : labels) {
            label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        }
        for (Animation animation : animations) {
            animation.stop();
        }
        btnSelect.setEnabled(false);
        btnAbilities.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel btnAbilities;
    private javax.swing.JLabel btnSelect;
    private javax.swing.JLabel lblBandit;
    private javax.swing.JLabel lblGambler;
    private javax.swing.JLabel lblHacker;
    private javax.swing.JLabel lblJuggernaut;
    private javax.swing.JLabel lblMage;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblVampire;
    // End of variables declaration//GEN-END:variables

}
