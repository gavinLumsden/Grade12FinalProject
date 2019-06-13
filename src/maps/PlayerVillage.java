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
            grass1, grass2, grass3, grass4, grass5, grass6, grass7, grass8, grass9, grass10,
            grass11, grass12, grass13, grass14, grass15, grass16, grass17, grass18, grass19, grass20,
            grass21, grass22, grass23, grass24, grass25, grass26, grass27
        };
//        engine = new GameEngine(wallImages, grassImages);
        this.engine = engine;
        engine.assign(wallImages, grassImages);
        engine.createPlayerVillage(this, lblToMain);
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
        grass1 = new javax.swing.JLabel();
        grass2 = new javax.swing.JLabel();
        grass3 = new javax.swing.JLabel();
        grass4 = new javax.swing.JLabel();
        grass5 = new javax.swing.JLabel();
        grass6 = new javax.swing.JLabel();
        grass7 = new javax.swing.JLabel();
        grass8 = new javax.swing.JLabel();
        grass9 = new javax.swing.JLabel();
        grass10 = new javax.swing.JLabel();
        grass11 = new javax.swing.JLabel();
        grass12 = new javax.swing.JLabel();
        grass13 = new javax.swing.JLabel();
        grass14 = new javax.swing.JLabel();
        grass15 = new javax.swing.JLabel();
        grass16 = new javax.swing.JLabel();
        grass17 = new javax.swing.JLabel();
        grass18 = new javax.swing.JLabel();
        grass19 = new javax.swing.JLabel();
        grass20 = new javax.swing.JLabel();
        grass21 = new javax.swing.JLabel();
        grass22 = new javax.swing.JLabel();
        grass23 = new javax.swing.JLabel();
        grass24 = new javax.swing.JLabel();
        grass25 = new javax.swing.JLabel();
        grass26 = new javax.swing.JLabel();
        grass27 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        lblHero.setBounds(80, 430, 100, 100);

        wall1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wall1.setText("Wall");
        wall1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(wall1);
        wall1.setBounds(1030, 230, 30, 330);

        wall2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wall2.setText("Wall");
        wall2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(wall2);
        wall2.setBounds(0, 0, 1060, 30);

        wall3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wall3.setText("Wall");
        wall3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(wall3);
        wall3.setBounds(0, 0, 30, 560);

        wall4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wall4.setText("Wall");
        wall4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(wall4);
        wall4.setBounds(230, 530, 830, 30);
        getContentPane().add(lblToMain);
        lblToMain.setBounds(30, 540, 200, 10);

        grass1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass1);
        grass1.setBounds(930, 430, 100, 100);

        grass2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass2);
        grass2.setBounds(230, 430, 100, 100);

        grass3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass3);
        grass3.setBounds(330, 430, 100, 100);

        grass4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass4);
        grass4.setBounds(430, 430, 100, 100);

        grass5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass5);
        grass5.setBounds(530, 430, 100, 100);

        grass6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass6);
        grass6.setBounds(630, 430, 100, 100);

        grass7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass7);
        grass7.setBounds(630, 430, 100, 100);

        grass8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass8);
        grass8.setBounds(730, 430, 100, 100);

        grass9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass9);
        grass9.setBounds(830, 430, 100, 100);

        grass10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass10);
        grass10.setBounds(930, 330, 100, 100);

        grass11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass11);
        grass11.setBounds(830, 230, 100, 100);

        grass12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass12);
        grass12.setBounds(830, 330, 100, 100);

        grass13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass13);
        grass13.setBounds(930, 230, 100, 100);

        grass14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass14);
        grass14.setBounds(30, 30, 100, 100);

        grass15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass15);
        grass15.setBounds(130, 30, 100, 100);

        grass16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass16);
        grass16.setBounds(230, 30, 100, 100);

        grass17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass17);
        grass17.setBounds(330, 30, 100, 100);

        grass18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass18);
        grass18.setBounds(430, 30, 100, 100);

        grass19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass19);
        grass19.setBounds(430, 30, 100, 100);

        grass20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass20.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass20);
        grass20.setBounds(530, 30, 100, 100);

        grass21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass21.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass21);
        grass21.setBounds(30, 130, 100, 100);

        grass22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass22);
        grass22.setBounds(130, 130, 100, 100);

        grass23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass23.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass23);
        grass23.setBounds(230, 130, 100, 100);

        grass24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass24.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass24);
        grass24.setBounds(330, 130, 100, 100);

        grass25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass25.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass25);
        grass25.setBounds(430, 130, 100, 100);

        grass26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass26.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass26);
        grass26.setBounds(430, 130, 100, 100);

        grass27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass27.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass27);
        grass27.setBounds(530, 130, 100, 100);

        background.setBackground(new java.awt.Color(102, 51, 0));
        background.setOpaque(true);
        getContentPane().add(background);
        background.setBounds(0, 0, 1060, 560);

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
    private javax.swing.JLabel grass1;
    private javax.swing.JLabel grass10;
    private javax.swing.JLabel grass11;
    private javax.swing.JLabel grass12;
    private javax.swing.JLabel grass13;
    private javax.swing.JLabel grass14;
    private javax.swing.JLabel grass15;
    private javax.swing.JLabel grass16;
    private javax.swing.JLabel grass17;
    private javax.swing.JLabel grass18;
    private javax.swing.JLabel grass19;
    private javax.swing.JLabel grass2;
    private javax.swing.JLabel grass20;
    private javax.swing.JLabel grass21;
    private javax.swing.JLabel grass22;
    private javax.swing.JLabel grass23;
    private javax.swing.JLabel grass24;
    private javax.swing.JLabel grass25;
    private javax.swing.JLabel grass26;
    private javax.swing.JLabel grass27;
    private javax.swing.JLabel grass3;
    private javax.swing.JLabel grass4;
    private javax.swing.JLabel grass5;
    private javax.swing.JLabel grass6;
    private javax.swing.JLabel grass7;
    private javax.swing.JLabel grass8;
    private javax.swing.JLabel grass9;
    private javax.swing.JLabel lblHero;
    private javax.swing.JLabel lblToMain;
    private javax.swing.JLabel wall1;
    private javax.swing.JLabel wall2;
    private javax.swing.JLabel wall3;
    private javax.swing.JLabel wall4;
    // End of variables declaration//GEN-END:variables

}
