package maps;

import collections.LinkedList;
import game.GameEngine;
import game.Hero;
import game.gametools.Mover;
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
    private final int MAP_3_FORM_WIDTH = 1300;
    private final int MAP_3_FORM_HEIGHT = 900;

    /**
     * Creates the player village form
     *
     * @param engine
     */
    public Map3(GameEngine engine) {
        initComponents();
        
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
        
        LinkedList<NextLevelBlock> nextLevelBlocks = new LinkedList(); 
        NextLevelBlock toMap2 = new NextLevelBlock(lblToMap2, "2"); 
        nextLevelBlocks.add(toMap2); 
        
        this.engine = engine;
        engine.createWalls(wallImages); 
        engine.createMap(this, MAP_3_FORM_WIDTH, MAP_3_FORM_HEIGHT, "map 3"); 
        engine.createHouse(houseImages);
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
        lblHealthTrainer = new javax.swing.JLabel();
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

        house1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/objects/house.png"))); // NOI18N
        getContentPane().add(house1);
        house1.setBounds(30, 30, 200, 200);

        house2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/objects/house.png"))); // NOI18N
        getContentPane().add(house2);
        house2.setBounds(230, 30, 200, 200);

        house3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/objects/house.png"))); // NOI18N
        getContentPane().add(house3);
        house3.setBounds(430, 30, 200, 200);

        house4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/objects/house.png"))); // NOI18N
        getContentPane().add(house4);
        house4.setBounds(630, 30, 200, 200);

        house5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/objects/house.png"))); // NOI18N
        getContentPane().add(house5);
        house5.setBounds(830, 30, 200, 200);

        house6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/objects/house.png"))); // NOI18N
        getContentPane().add(house6);
        house6.setBounds(1030, 30, 200, 200);

        house7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/objects/houseBack.png"))); // NOI18N
        getContentPane().add(house7);
        house7.setBounds(230, 630, 200, 200);

        house8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/objects/houseBack.png"))); // NOI18N
        getContentPane().add(house8);
        house8.setBounds(630, 630, 200, 200);

        house9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/objects/houseBack.png"))); // NOI18N
        getContentPane().add(house9);
        house9.setBounds(830, 630, 200, 200);

        house10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/objects/houseBack.png"))); // NOI18N
        getContentPane().add(house10);
        house10.setBounds(1030, 630, 200, 200);

        house11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/objects/houseBack.png"))); // NOI18N
        getContentPane().add(house11);
        house11.setBounds(430, 630, 200, 200);

        lblHealthTrainer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHealthTrainer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/shopkeepers/shopkeeper.png"))); // NOI18N
        lblHealthTrainer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblHealthTrainer);
        lblHealthTrainer.setBounds(80, 230, 100, 100);

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
    private javax.swing.JLabel lblHealthTrainer;
    private javax.swing.JLabel lblHero;
    private javax.swing.JLabel lblToMap2;
    private javax.swing.JLabel wall1;
    private javax.swing.JLabel wall2;
    private javax.swing.JLabel wall3;
    private javax.swing.JLabel wall4;
    // End of variables declaration//GEN-END:variables

}
