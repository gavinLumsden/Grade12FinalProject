package maps;

import collections.LinkedList;
import game.GameEngine;
import javax.swing.JLabel;
import objects.NextLevelBlock;

/**
 * PlayerVillage.java - A "map" where the hero can move around
 *
 * @author g.lumsden
 * @since 14-May-2019
 */
public class Map3 extends javax.swing.JFrame {

    // properties
    private GameEngine engine;

    // form width and height for map 3
    private final int FORM_WIDTH = 1300;
    private final int FORM_HEIGHT = 900;

    /**
     * Creates Map 3
     *
     * @param currentMapNumber
     * @param engine
     */
    public Map3(int currentMapNumber, GameEngine engine) {
        initComponents();
        this.engine = engine;

        LinkedList<JLabel> wallImages = new LinkedList<>();
        wallImages.add(wall1);
        wallImages.add(wall2);
        wallImages.add(wall3);
        wallImages.add(wall4);
        
        LinkedList<JLabel> houseImages = new LinkedList<>();
        houseImages.add(house1);
        houseImages.add(house2);
        houseImages.add(house3);
        houseImages.add(house4);
        houseImages.add(house5);
        houseImages.add(house6);
        houseImages.add(house7);
        houseImages.add(house8);
        houseImages.add(house9);
        houseImages.add(house10);
        houseImages.add(house11);

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

        LinkedList<NextLevelBlock> nextLevelBlocks = new LinkedList();
        NextLevelBlock toMap2 = new NextLevelBlock(lblToMap2, "2");
        nextLevelBlocks.add(toMap2);

        LinkedList<JLabel> shopkeeperImages = new LinkedList();
        shopkeeperImages.add(lblShopkeeper1);
        shopkeeperImages.add(lblDodgeTrainer);

        LinkedList<JLabel> trainerImages = new LinkedList();
        trainerImages.add(lblDamageTrainer);
        trainerImages.add(lblDodgeTrainer);
        trainerImages.add(lblHealthTrainer);
        trainerImages.add(lblSpeedTrainer);
        
        engine.createGameObject(wallImages,          "walls");
        engine.createGameObject(grassImages,         "grass"); 
        engine.createGameObject(houseImages,         "houses"); 
        engine.createGameCharacter(shopkeeperImages, "shopkeepers"); 
        engine.createGameCharacter(trainerImages,    "trainers"); 
        engine.createMap(this, FORM_WIDTH, FORM_HEIGHT, 3);
        engine.createHero(lblHero, nextLevelBlocks);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHero = new javax.swing.JLabel();
        lblToMap2 = new javax.swing.JLabel();
        wall1 = new javax.swing.JLabel();
        wall2 = new javax.swing.JLabel();
        wall3 = new javax.swing.JLabel();
        wall4 = new javax.swing.JLabel();
        house1 = new javax.swing.JLabel();
        house2 = new javax.swing.JLabel();
        house3 = new javax.swing.JLabel();
        house4 = new javax.swing.JLabel();
        house5 = new javax.swing.JLabel();
        house6 = new javax.swing.JLabel();
        house7 = new javax.swing.JLabel();
        house8 = new javax.swing.JLabel();
        house9 = new javax.swing.JLabel();
        house10 = new javax.swing.JLabel();
        house11 = new javax.swing.JLabel();
        lblShopkeeper1 = new javax.swing.JLabel();
        lblDodgeTrainer = new javax.swing.JLabel();
        lblDamageTrainer = new javax.swing.JLabel();
        lblShopkeeper2 = new javax.swing.JLabel();
        lblHealthTrainer = new javax.swing.JLabel();
        lblSpeedTrainer = new javax.swing.JLabel();
        grass1 = new javax.swing.JLabel();
        grass3 = new javax.swing.JLabel();
        grass4 = new javax.swing.JLabel();
        grass6 = new javax.swing.JLabel();
        grass5 = new javax.swing.JLabel();
        grass7 = new javax.swing.JLabel();
        grass8 = new javax.swing.JLabel();
        grass9 = new javax.swing.JLabel();
        grass10 = new javax.swing.JLabel();
        grass2 = new javax.swing.JLabel();
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
        lblHero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/playerclasses/bandit/up/banditIdle.png"))); // NOI18N
        lblHero.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblHero);
        lblHero.setBounds(80, 730, 100, 100);
        getContentPane().add(lblToMap2);
        lblToMap2.setBounds(30, 850, 200, 10);

        wall1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wall1.setText("Wall");
        wall1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(wall1);
        wall1.setBounds(1230, 0, 30, 860);

        wall2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wall2.setText("Wall");
        wall2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(wall2);
        wall2.setBounds(0, 0, 30, 860);

        wall3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wall3.setText("Wall");
        wall3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(wall3);
        wall3.setBounds(0, 0, 1260, 30);

        wall4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wall4.setText("Wall");
        wall4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(wall4);
        wall4.setBounds(230, 830, 1030, 30);

        house1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        house1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/objects/house.png"))); // NOI18N
        house1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        house1.setOpaque(true);
        getContentPane().add(house1);
        house1.setBounds(30, 30, 200, 200);

        house2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        house2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/objects/house.png"))); // NOI18N
        house2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        house2.setOpaque(true);
        getContentPane().add(house2);
        house2.setBounds(230, 30, 200, 200);

        house3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        house3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/objects/house.png"))); // NOI18N
        house3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        house3.setOpaque(true);
        getContentPane().add(house3);
        house3.setBounds(430, 30, 200, 200);

        house4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        house4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/objects/house.png"))); // NOI18N
        house4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        house4.setOpaque(true);
        getContentPane().add(house4);
        house4.setBounds(630, 30, 200, 200);

        house5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        house5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/objects/house.png"))); // NOI18N
        house5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        house5.setOpaque(true);
        getContentPane().add(house5);
        house5.setBounds(830, 30, 200, 200);

        house6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        house6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/objects/house.png"))); // NOI18N
        house6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        house6.setOpaque(true);
        getContentPane().add(house6);
        house6.setBounds(1030, 30, 200, 200);

        house7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        house7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/objects/houseBack.png"))); // NOI18N
        house7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        house7.setOpaque(true);
        getContentPane().add(house7);
        house7.setBounds(230, 630, 200, 200);

        house8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        house8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/objects/houseBack.png"))); // NOI18N
        house8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        house8.setOpaque(true);
        getContentPane().add(house8);
        house8.setBounds(630, 630, 200, 200);

        house9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        house9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/objects/houseBack.png"))); // NOI18N
        house9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        house9.setOpaque(true);
        getContentPane().add(house9);
        house9.setBounds(830, 630, 200, 200);

        house10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        house10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/objects/houseBack.png"))); // NOI18N
        house10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        house10.setOpaque(true);
        getContentPane().add(house10);
        house10.setBounds(1030, 630, 200, 200);

        house11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        house11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/objects/houseBack.png"))); // NOI18N
        house11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        house11.setOpaque(true);
        getContentPane().add(house11);
        house11.setBounds(430, 630, 200, 200);

        lblShopkeeper1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShopkeeper1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/shopkeepers/shopkeeper2/down/shopkeeperIdle.png"))); // NOI18N
        lblShopkeeper1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblShopkeeper1);
        lblShopkeeper1.setBounds(80, 240, 100, 100);

        lblDodgeTrainer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDodgeTrainer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/trainers/dodge/down/dodgeIdle.png"))); // NOI18N
        lblDodgeTrainer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblDodgeTrainer);
        lblDodgeTrainer.setBounds(880, 240, 100, 100);

        lblDamageTrainer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDamageTrainer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/trainers/damage/down/damageIdle.png"))); // NOI18N
        lblDamageTrainer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblDamageTrainer);
        lblDamageTrainer.setBounds(1080, 240, 100, 100);

        lblShopkeeper2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShopkeeper2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/shopkeepers/shopkeeper2/down/shopkeeperIdle.png"))); // NOI18N
        lblShopkeeper2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblShopkeeper2);
        lblShopkeeper2.setBounds(280, 240, 100, 100);

        lblHealthTrainer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHealthTrainer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/trainers/health/down/healthIdle.png"))); // NOI18N
        lblHealthTrainer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblHealthTrainer);
        lblHealthTrainer.setBounds(480, 240, 100, 100);

        lblSpeedTrainer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSpeedTrainer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/trainers/speed/down/speedIdle.png"))); // NOI18N
        lblSpeedTrainer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblSpeedTrainer);
        lblSpeedTrainer.setBounds(680, 240, 100, 100);

        grass1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass1);
        grass1.setBounds(230, 530, 100, 100);

        grass3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass3);
        grass3.setBounds(430, 530, 100, 100);

        grass4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass4);
        grass4.setBounds(530, 530, 100, 100);

        grass6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass6);
        grass6.setBounds(730, 530, 100, 100);

        grass5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass5);
        grass5.setBounds(630, 530, 100, 100);

        grass7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass7);
        grass7.setBounds(830, 530, 100, 100);

        grass8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass8);
        grass8.setBounds(930, 530, 100, 100);

        grass9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass9);
        grass9.setBounds(1030, 530, 100, 100);

        grass10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass10);
        grass10.setBounds(1130, 530, 100, 100);

        grass2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass2);
        grass2.setBounds(330, 530, 100, 100);

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
    private javax.swing.JLabel grass1;
    private javax.swing.JLabel grass10;
    private javax.swing.JLabel grass2;
    private javax.swing.JLabel grass3;
    private javax.swing.JLabel grass4;
    private javax.swing.JLabel grass5;
    private javax.swing.JLabel grass6;
    private javax.swing.JLabel grass7;
    private javax.swing.JLabel grass8;
    private javax.swing.JLabel grass9;
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
    private javax.swing.JLabel lblDamageTrainer;
    private javax.swing.JLabel lblDodgeTrainer;
    private javax.swing.JLabel lblHealthTrainer;
    private javax.swing.JLabel lblHero;
    private javax.swing.JLabel lblShopkeeper1;
    private javax.swing.JLabel lblShopkeeper2;
    private javax.swing.JLabel lblSpeedTrainer;
    private javax.swing.JLabel lblToMap2;
    private javax.swing.JLabel wall1;
    private javax.swing.JLabel wall2;
    private javax.swing.JLabel wall3;
    private javax.swing.JLabel wall4;
    // End of variables declaration//GEN-END:variables

}
