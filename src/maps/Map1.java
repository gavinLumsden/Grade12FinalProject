package maps;

import collections.LinkedList;
import game.GameEngine;
import javax.swing.JLabel;
import objects.NextLevelBlock;

/**
 * Spawn.java - A "map" where the hero can move around and "fight" enemies
 *
 * @author g.lumsden
 * @since 14-May-2019
 */
public class Map1 extends javax.swing.JFrame {

    // properties
    private GameEngine engine;

    // form width and height for spawn
    private final int FORM_WIDTH = 1066;
    private final int FORM_HEIGHT = 589;

    // locations where the hero can "spawn" into
    private final int MAP_1_X = 890;
    private final int MAP_1_Y = 240;

    private final int MAP_2_X = 380;
    private final int MAP_2_Y = 30;

    /**
     * Creates Map 1
     *
     * @param currentMapNumber
     * @param engine
     */
    public Map1(int currentMapNumber, GameEngine engine) {
        initComponents();
        this.engine = engine;

        LinkedList<JLabel> wallImages = new LinkedList<>();
        wallImages.add(wall1);
        wallImages.add(wall2);
        wallImages.add(wall3);
        wallImages.add(wall4);
        wallImages.add(wall5);

        LinkedList<JLabel> grassImages = new LinkedList<>();
        grassImages.add(grass1);
        grassImages.add(grass2);
        grassImages.add(grass3);
        grassImages.add(grass4);
        grassImages.add(grass5);
        grassImages.add(grass6);
        grassImages.add(grass7);
        grassImages.add(grass8);
        grassImages.add(grass9);
        grassImages.add(grass10);
        grassImages.add(grass11);
        grassImages.add(grass12);
        grassImages.add(grass13);
        grassImages.add(grass14);
        grassImages.add(grass15);
        grassImages.add(grass16);
        grassImages.add(grass17);
        grassImages.add(grass18);
        grassImages.add(grass19);
        grassImages.add(grass20);
        grassImages.add(grass21);
        grassImages.add(grass22);
        grassImages.add(grass23);
        grassImages.add(grass24);
        grassImages.add(grass25);
        grassImages.add(grass26);
        grassImages.add(grass27);
        grassImages.add(grass28);
        grassImages.add(grass29);
        grassImages.add(grass30);
        grassImages.add(grass31);
        grassImages.add(grass32);
        grassImages.add(grass33);
        grassImages.add(grass34);
        grassImages.add(grass35);

        LinkedList<JLabel> cyborgImages = new LinkedList<>();
        cyborgImages.add(lblCyborg1);

        LinkedList<JLabel> houseImages = new LinkedList<>();
        houseImages.add(house1);

        LinkedList<NextLevelBlock> nextLevelBlocks = new LinkedList();
        NextLevelBlock toMap2 = new NextLevelBlock(lblToMap2, "2");
        nextLevelBlocks.add(toMap2);

        setSpawnLocation(currentMapNumber); 
        engine.createGameObject(grassImages, "grass");
        engine.createGameObject(wallImages, "walls");
        engine.createGameObject(houseImages, "houses");
        engine.createGameCharacter(cyborgImages, "cyborgs"); 
        engine.createMap(this, FORM_WIDTH, FORM_HEIGHT, 1);
        engine.createHero(lblHero, nextLevelBlocks);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHero = new javax.swing.JLabel();
        wall1 = new javax.swing.JLabel();
        wall2 = new javax.swing.JLabel();
        wall3 = new javax.swing.JLabel();
        wall4 = new javax.swing.JLabel();
        wall5 = new javax.swing.JLabel();
        lblToMap2 = new javax.swing.JLabel();
        lblCyborg1 = new javax.swing.JLabel();
        grass1 = new javax.swing.JLabel();
        grass2 = new javax.swing.JLabel();
        grass3 = new javax.swing.JLabel();
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
        grass28 = new javax.swing.JLabel();
        grass29 = new javax.swing.JLabel();
        grass30 = new javax.swing.JLabel();
        grass31 = new javax.swing.JLabel();
        grass32 = new javax.swing.JLabel();
        grass33 = new javax.swing.JLabel();
        grass34 = new javax.swing.JLabel();
        house1 = new javax.swing.JLabel();
        grass4 = new javax.swing.JLabel();
        grass5 = new javax.swing.JLabel();
        grass35 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(102, 51, 0));
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
        lblHero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/playerclasses/bandit/left/banditIdle.png"))); // NOI18N
        lblHero.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblHero);
        lblHero.setBounds(890, 240, 100, 100);

        wall1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wall1.setText("Wall");
        wall1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(wall1);
        wall1.setBounds(1030, 0, 30, 560);

        wall2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wall2.setText("Wall");
        wall2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(wall2);
        wall2.setBounds(0, 530, 1100, 30);

        wall3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wall3.setText("Wall");
        wall3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(wall3);
        wall3.setBounds(530, 0, 560, 30);

        wall4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wall4.setText("Wall");
        wall4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(wall4);
        wall4.setBounds(0, 0, 30, 560);

        wall5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wall5.setText("Wall");
        wall5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(wall5);
        wall5.setBounds(0, 0, 330, 30);
        getContentPane().add(lblToMap2);
        lblToMap2.setBounds(330, 0, 200, 10);

        lblCyborg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCyborg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/enemyclasses/cyborg/down/cyborgIdle.png"))); // NOI18N
        lblCyborg1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblCyborg1);
        lblCyborg1.setBounds(380, 30, 100, 100);

        grass1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass1);
        grass1.setBounds(630, 30, 100, 100);

        grass2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass2);
        grass2.setBounds(530, 30, 100, 100);

        grass3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass3);
        grass3.setBounds(730, 30, 100, 100);

        grass6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass6);
        grass6.setBounds(630, 430, 100, 100);

        grass7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass7);
        grass7.setBounds(530, 430, 100, 100);

        grass8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass8);
        grass8.setBounds(930, 430, 100, 100);

        grass9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass9);
        grass9.setBounds(730, 430, 100, 100);

        grass10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass10);
        grass10.setBounds(830, 430, 100, 100);

        grass11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass11);
        grass11.setBounds(530, 330, 100, 100);

        grass12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass12);
        grass12.setBounds(830, 330, 100, 100);

        grass13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass13);
        grass13.setBounds(630, 330, 100, 100);

        grass14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass14);
        grass14.setBounds(930, 330, 100, 100);

        grass15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass15);
        grass15.setBounds(730, 330, 100, 100);

        grass16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass16);
        grass16.setBounds(130, 430, 100, 100);

        grass17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass17);
        grass17.setBounds(30, 430, 100, 100);

        grass18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass18);
        grass18.setBounds(430, 430, 100, 100);

        grass19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass19);
        grass19.setBounds(230, 430, 100, 100);

        grass20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass20.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass20);
        grass20.setBounds(330, 430, 100, 100);

        grass21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass21.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass21);
        grass21.setBounds(30, 330, 100, 100);

        grass22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass22);
        grass22.setBounds(330, 330, 100, 100);

        grass23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass23.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass23);
        grass23.setBounds(130, 330, 100, 100);

        grass24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass24.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass24);
        grass24.setBounds(430, 330, 100, 100);

        grass25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass25.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass25);
        grass25.setBounds(230, 330, 100, 100);

        grass26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass26.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass26);
        grass26.setBounds(130, 230, 100, 100);

        grass27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass27.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass27);
        grass27.setBounds(30, 230, 100, 100);

        grass28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass28.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass28);
        grass28.setBounds(30, 130, 100, 100);

        grass29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass29.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass29);
        grass29.setBounds(130, 130, 100, 100);

        grass30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass30.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass30);
        grass30.setBounds(30, 30, 100, 100);

        grass31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass31.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass31);
        grass31.setBounds(230, 230, 100, 100);

        grass32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass32.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass32);
        grass32.setBounds(130, 30, 100, 100);

        grass33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass33.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass33);
        grass33.setBounds(230, 30, 100, 100);

        grass34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass34.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass34);
        grass34.setBounds(230, 130, 100, 100);

        house1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        house1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/objects/house.png"))); // NOI18N
        getContentPane().add(house1);
        house1.setBounds(830, 30, 200, 200);

        grass4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass4);
        grass4.setBounds(530, 130, 100, 100);

        grass5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass5);
        grass5.setBounds(630, 130, 100, 100);

        grass35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass35.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass35);
        grass35.setBounds(730, 130, 100, 100);

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
    private javax.swing.JLabel grass28;
    private javax.swing.JLabel grass29;
    private javax.swing.JLabel grass3;
    private javax.swing.JLabel grass30;
    private javax.swing.JLabel grass31;
    private javax.swing.JLabel grass32;
    private javax.swing.JLabel grass33;
    private javax.swing.JLabel grass34;
    private javax.swing.JLabel grass35;
    private javax.swing.JLabel grass4;
    private javax.swing.JLabel grass5;
    private javax.swing.JLabel grass6;
    private javax.swing.JLabel grass7;
    private javax.swing.JLabel grass8;
    private javax.swing.JLabel grass9;
    private javax.swing.JLabel house1;
    private javax.swing.JLabel lblCyborg1;
    private javax.swing.JLabel lblHero;
    private javax.swing.JLabel lblToMap2;
    private javax.swing.JLabel wall1;
    private javax.swing.JLabel wall2;
    private javax.swing.JLabel wall3;
    private javax.swing.JLabel wall4;
    private javax.swing.JLabel wall5;
    // End of variables declaration//GEN-END:variables

    private void setSpawnLocation(int currentMapName) {
        if (currentMapName == 1) {
            lblHero.setLocation(MAP_1_X, MAP_1_Y);
        } else if (currentMapName == 2) {
            lblHero.setLocation(MAP_2_X, MAP_2_Y);
        }
    }
    
}
