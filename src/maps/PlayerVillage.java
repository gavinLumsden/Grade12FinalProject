package maps;

import game.GameEngine;
import game.Hero;
import game.gametools.Mover;
import javax.swing.JLabel;

/**
 * PlayerVillage.java - A "map" where the hero can move around
 *
 * @author g.lumsden
 * @since 14-May-2019
 */
public class PlayerVillage extends javax.swing.JFrame {

    // properties
    private GameEngine engine;

    /**
     * Creates the player village form
     *
     * @param engine
     */
    public PlayerVillage(GameEngine engine) {
        initComponents();
        JLabel[] wallImages = {
            wall1, wall2, wall3, wall4
        };
        JLabel[] grassImages = {
            
        };
        JLabel[] houseImages = {
            house1, house2, house3, house4, house5, house6, 
        };
//        engine = new GameEngine(wallImages, grassImages);
        this.engine = engine;
        engine.createPlayerVillage(this, lblToMain);
        engine.createHouse(houseImages);
        engine.createHero(lblHero);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHero = new javax.swing.JLabel();
        wall1 = new javax.swing.JLabel();
        wall2 = new javax.swing.JLabel();
        wall3 = new javax.swing.JLabel();
        wall4 = new javax.swing.JLabel();
        lblToMain = new javax.swing.JLabel();
        house6 = new javax.swing.JLabel();
        house1 = new javax.swing.JLabel();
        house2 = new javax.swing.JLabel();
        house3 = new javax.swing.JLabel();
        house4 = new javax.swing.JLabel();
        house5 = new javax.swing.JLabel();
        house7 = new javax.swing.JLabel();
        house8 = new javax.swing.JLabel();
        house9 = new javax.swing.JLabel();
        house10 = new javax.swing.JLabel();
        house11 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });
        getContentPane().setLayout(null);

        lblHero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/bandit/right/banditIdle.png"))); // NOI18N
        lblHero.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblHero);
        lblHero.setBounds(90, 730, 100, 100);

        wall1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wall1.setText("Wall");
        wall1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(wall1);
        wall1.setBounds(1230, 0, 30, 860);

        wall2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wall2.setText("Wall");
        wall2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(wall2);
        wall2.setBounds(0, 0, 1230, 30);

        wall3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wall3.setText("Wall");
        wall3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(wall3);
        wall3.setBounds(0, 0, 30, 860);

        wall4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wall4.setText("Wall");
        wall4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(wall4);
        wall4.setBounds(230, 830, 1000, 30);
        getContentPane().add(lblToMain);
        lblToMain.setBounds(30, 850, 200, 10);

        house6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/house.png"))); // NOI18N
        getContentPane().add(house6);
        house6.setBounds(1030, 30, 200, 200);

        house1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/house.png"))); // NOI18N
        getContentPane().add(house1);
        house1.setBounds(30, 30, 200, 200);

        house2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/house.png"))); // NOI18N
        getContentPane().add(house2);
        house2.setBounds(230, 30, 200, 200);

        house3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/house.png"))); // NOI18N
        getContentPane().add(house3);
        house3.setBounds(430, 30, 200, 200);

        house4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/house.png"))); // NOI18N
        getContentPane().add(house4);
        house4.setBounds(630, 30, 200, 200);

        house5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/house.png"))); // NOI18N
        getContentPane().add(house5);
        house5.setBounds(830, 30, 200, 200);

        house7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/houseBack.png"))); // NOI18N
        getContentPane().add(house7);
        house7.setBounds(230, 630, 200, 200);

        house8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/houseBack.png"))); // NOI18N
        getContentPane().add(house8);
        house8.setBounds(630, 630, 200, 200);

        house9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/houseBack.png"))); // NOI18N
        getContentPane().add(house9);
        house9.setBounds(830, 630, 200, 200);

        house10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/houseBack.png"))); // NOI18N
        getContentPane().add(house10);
        house10.setBounds(1030, 630, 200, 200);

        house11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/houseBack.png"))); // NOI18N
        getContentPane().add(house11);
        house11.setBounds(430, 630, 200, 200);

        background.setBackground(new java.awt.Color(102, 51, 0));
        background.setOpaque(true);
        getContentPane().add(background);
        background.setBounds(0, 0, 1260, 860);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * when a key is pressed
     *
     * @param evt
     */
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        engine.keyPress(evt);
    }//GEN-LAST:event_formKeyPressed

    /**
     * when a key is released
     *
     * @param evt
     */
    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        engine.keyRelease(evt);
    }//GEN-LAST:event_formKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel house1;
    private javax.swing.JLabel house10;
    private javax.swing.JLabel house11;
    private javax.swing.JLabel house2;
    private javax.swing.JLabel house3;
    private javax.swing.JLabel house4;
    private javax.swing.JLabel house5;
    private javax.swing.JLabel house6;
    private javax.swing.JLabel house7;
    private javax.swing.JLabel house8;
    private javax.swing.JLabel house9;
    private javax.swing.JLabel lblHero;
    private javax.swing.JLabel lblToMain;
    private javax.swing.JLabel wall1;
    private javax.swing.JLabel wall2;
    private javax.swing.JLabel wall3;
    private javax.swing.JLabel wall4;
    // End of variables declaration//GEN-END:variables

}
