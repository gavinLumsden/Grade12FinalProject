package maps;

import collections.LinkedList;
import game.GameEngine;
import javax.swing.JLabel;
import objects.NextLevelBlock;

/**
 * @author g.lumsden
 */
public class Map extends javax.swing.JFrame {

    private GameEngine engine; 
    
    /**
     * Creates new form Map
     * @param engine
     */
    public Map(GameEngine engine) {
        initComponents();
        this.engine = engine;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    private void createMap(String map) {
        
    }
    
    private void map1Properties() {
        final int FORM_WIDTH = 1066;
        final int FORM_HEIGHT = 589;
        final int FROM_MAP_1_X = 890;
        final int FROM_MAP_1_Y = 240;
        final int FROM_MAP_2_X = 380;
        final int FROM_MAP_2_Y = 30;
        JLabel lblHero = new JLabel();
        JLabel wall1 = new JLabel();
        JLabel wall2 = new JLabel();
        JLabel wall3 = new JLabel();
        JLabel wall4 = new JLabel();
        JLabel wall5 = new JLabel();
        JLabel grass1 = new JLabel();
        JLabel grass2 = new JLabel();
        JLabel grass3 = new JLabel();
        JLabel grass4 = new JLabel();
        JLabel grass5 = new JLabel();
        JLabel grass6 = new JLabel();
        JLabel grass7 = new JLabel();
        JLabel grass8 = new JLabel();
        JLabel grass9 = new JLabel();
        JLabel grass10 = new JLabel();
        JLabel grass11 = new JLabel();
        JLabel grass12 = new JLabel();
        JLabel grass13 = new JLabel();
        JLabel grass14 = new JLabel();
        JLabel grass15 = new JLabel();
        JLabel grass16 = new JLabel();
        JLabel grass17 = new JLabel();
        JLabel grass18 = new JLabel();
        JLabel grass19 = new JLabel();
        JLabel grass20 = new JLabel();
        JLabel grass21 = new JLabel();
        JLabel grass22 = new JLabel();
        JLabel grass23 = new JLabel();
        JLabel grass24 = new JLabel();
        JLabel grass25 = new JLabel();
        JLabel grass26 = new JLabel();
        JLabel grass27 = new JLabel();
        JLabel grass28 = new JLabel();
        JLabel grass29 = new JLabel();
        JLabel grass30 = new JLabel();
        JLabel grass31 = new JLabel();
        JLabel grass32 = new JLabel();
        JLabel grass33 = new JLabel();
        JLabel grass34 = new JLabel();
        JLabel grass35 = new JLabel();
        JLabel lblToMap2 = new JLabel();
        JLabel lblCyborg=  new JLabel();
        JLabel lblHouse = new JLabel();
        JLabel lblBackground = new JLabel();
        
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
        cyborgImages.add(lblCyborg);

        LinkedList<JLabel> houseImages = new LinkedList<>();
        houseImages.add(lblHouse);

        LinkedList<NextLevelBlock> nextLevelBlocks = new LinkedList();
        NextLevelBlock toMap2 = new NextLevelBlock(lblToMap2, "2");
        nextLevelBlocks.add(toMap2);
    }
    
    private void map2Properties() {
        final int FORM_WIDTH = 1765;
        final int FORM_HEIGHT = 888;
        final int FROM_MAP_1_X = 1180;
        final int FROM_MAP_1_Y = 730;
        final int FROM_MAP_3_X = 1380;
        final int FROM_MAP_3_Y = 30;
        final int FROM_MAP_4_X = 280;
        final int FROM_MAP_4_Y = 30;
        
        JLabel lblHero = new JLabel(); 
        JLabel wall1 = new JLabel(); 
        JLabel wall2 = new JLabel(); 
        JLabel wall3 = new JLabel(); 
        JLabel wall4 = new JLabel(); 
        JLabel wall5 = new JLabel(); 
        JLabel wall6 = new JLabel(); 
        JLabel wall7 = new JLabel(); 
        JLabel grass1 = new JLabel(); 
        JLabel grass2 = new JLabel(); 
        JLabel grass3 = new JLabel(); 
        JLabel grass4 = new JLabel(); 
        JLabel grass5 = new JLabel(); 
        JLabel grass6 = new JLabel(); 
        JLabel grass7 = new JLabel(); 
        JLabel grass8 = new JLabel(); 
        JLabel grass9 = new JLabel(); 
        JLabel grass10 = new JLabel(); 
        JLabel grass11 = new JLabel(); 
        JLabel grass12 = new JLabel(); 
        JLabel grass13 = new JLabel(); 
        JLabel grass14 = new JLabel(); 
        JLabel grass15 = new JLabel(); 
        JLabel grass16 = new JLabel(); 
        JLabel grass17 = new JLabel(); 
        JLabel grass18 = new JLabel(); 
        JLabel grass19 = new JLabel(); 
        JLabel grass20 = new JLabel(); 
        JLabel grass21 = new JLabel(); 
        JLabel grass22 = new JLabel(); 
        JLabel grass23 = new JLabel(); 
        JLabel grass24 = new JLabel(); 
        JLabel grass25 = new JLabel(); 
        JLabel grass26 = new JLabel(); 
        JLabel grass27 = new JLabel(); 
        JLabel grass28 = new JLabel(); 
        JLabel grass29 = new JLabel(); 
        JLabel grass30 = new JLabel(); 
        JLabel grass31 = new JLabel(); 
        JLabel grass32 = new JLabel(); 
        JLabel grass33 = new JLabel(); 
        JLabel grass34 = new JLabel(); 
        JLabel grass35 = new JLabel(); 
        JLabel grass36 = new JLabel(); 
        JLabel grass37 = new JLabel(); 
        JLabel grass38 = new JLabel(); 
        JLabel grass39 = new JLabel(); 
        JLabel grass40 = new JLabel(); 
        JLabel grass41 = new JLabel(); 
        JLabel grass42 = new JLabel(); 
        JLabel grass43 = new JLabel(); 
        JLabel grass44 = new JLabel(); 
        JLabel grass45 = new JLabel(); 
        JLabel grass46 = new JLabel(); 
        JLabel grass47 = new JLabel(); 
        JLabel grass48 = new JLabel(); 
        JLabel grass49 = new JLabel(); 
        JLabel grass50 = new JLabel(); 
        JLabel grass51 = new JLabel(); 
        JLabel grass52 = new JLabel(); 
        JLabel grass53 = new JLabel(); 
        JLabel grass54 = new JLabel(); 
        JLabel grass55 = new JLabel(); 
        JLabel grass56 = new JLabel(); 
        JLabel grass57 = new JLabel(); 
        JLabel grass58 = new JLabel(); 
        JLabel grass59 = new JLabel(); 
        JLabel grass60 = new JLabel(); 
        JLabel grass61 = new JLabel(); 
        JLabel grass62 = new JLabel(); 
        JLabel grass63 = new JLabel(); 
        JLabel grass64 = new JLabel(); 
        JLabel grass65 = new JLabel(); 
        JLabel grass66 = new JLabel(); 
        JLabel grass67 = new JLabel(); 
        JLabel grass68 = new JLabel(); 
        JLabel grass69 = new JLabel(); 
        JLabel grass70 = new JLabel(); 
        JLabel grass71 = new JLabel(); 
        JLabel grass72 = new JLabel(); 
        JLabel grass73 = new JLabel(); 
        JLabel grass74 = new JLabel(); 
        JLabel grass75 = new JLabel(); 
        JLabel grass76 = new JLabel(); 
        JLabel grass77 = new JLabel(); 
        JLabel grass78 = new JLabel(); 
        JLabel grass79 = new JLabel(); 
        JLabel grass80 = new JLabel(); 
        JLabel grass81 = new JLabel(); 
        JLabel grass82 = new JLabel(); 
        JLabel grass83 = new JLabel(); 
        JLabel grass84 = new JLabel(); 
        JLabel grass85 = new JLabel(); 
        JLabel grass87 = new JLabel(); 
        JLabel grass93 = new JLabel(); 
        JLabel grass94 = new JLabel(); 
        JLabel grass95 = new JLabel(); 
        JLabel grass96 = new JLabel(); 
        JLabel grass97 = new JLabel(); 
        JLabel grass98 = new JLabel(); 
        JLabel lblToMap1 = new JLabel(); 
        JLabel lblToMap3 = new JLabel(); 
        JLabel lblToMap4 = new JLabel(); 
        JLabel lblNail1 = new JLabel(); 
        JLabel lblRampage1 = new JLabel(); 
        JLabel lblRampage2 = new JLabel(); 
        JLabel lblCyborg1 = new JLabel(); 
        JLabel background = new JLabel(); 
        
        LinkedList<JLabel> wallImages = new LinkedList<>();
        wallImages.add(wall1);
        wallImages.add(wall2);
        wallImages.add(wall3);
        wallImages.add(wall4);
        wallImages.add(wall5);
        wallImages.add(wall6);
        wallImages.add(wall7);

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
        grassImages.add(grass36);
        grassImages.add(grass37);
        grassImages.add(grass38);
        grassImages.add(grass39);
        grassImages.add(grass40);
        grassImages.add(grass41);
        grassImages.add(grass42);
        grassImages.add(grass43);
        grassImages.add(grass44);
        grassImages.add(grass45);
        grassImages.add(grass46);
        grassImages.add(grass47);
        grassImages.add(grass48);
        grassImages.add(grass49);
        grassImages.add(grass50);
        grassImages.add(grass51);
        grassImages.add(grass52);
        grassImages.add(grass53);
        grassImages.add(grass54);
        grassImages.add(grass55);
        grassImages.add(grass56);
        grassImages.add(grass57);
        grassImages.add(grass58);
        grassImages.add(grass59);
        grassImages.add(grass60);
        grassImages.add(grass61);
        grassImages.add(grass62);
        grassImages.add(grass63);
        grassImages.add(grass64);
        grassImages.add(grass65);
        grassImages.add(grass66);
        grassImages.add(grass67);
        grassImages.add(grass68);
        grassImages.add(grass69);
        grassImages.add(grass70);
        grassImages.add(grass71);
        grassImages.add(grass72);
        grassImages.add(grass73);
        grassImages.add(grass74);
        grassImages.add(grass75);
        grassImages.add(grass76);
        grassImages.add(grass77);
        grassImages.add(grass78);
        grassImages.add(grass79);
        grassImages.add(grass80);
        grassImages.add(grass81);
        grassImages.add(grass82);
        grassImages.add(grass83);
        grassImages.add(grass84);
        grassImages.add(grass85);
//        grassImages.add(grass86);
        grassImages.add(grass87);
//        grassImages.add(grass88);
//        grassImages.add(grass89);
//        grassImages.add(grass90);
//        grassImages.add(grass91); 
//        grassImages.add(grass92); 
        grassImages.add(grass93);
        grassImages.add(grass94);
        grassImages.add(grass95);
        grassImages.add(grass96);
        grassImages.add(grass97);
        grassImages.add(grass98);
//        grassImages.add(grass99);
//        grassImages.add(grass100); 

        LinkedList<JLabel> rampageImages = new LinkedList<>();
        rampageImages.add(lblRampage1);
        rampageImages.add(lblRampage2);

        LinkedList<JLabel> nailImages = new LinkedList<>();
        nailImages.add(lblNail1);

        LinkedList<JLabel> cyborgImages = new LinkedList<>();
        cyborgImages.add(lblCyborg1);

        LinkedList<NextLevelBlock> nextLevelBlocks = new LinkedList();
        NextLevelBlock toMap1 = new NextLevelBlock(lblToMap1, "1");
        NextLevelBlock toMap3 = new NextLevelBlock(lblToMap3, "3");
        NextLevelBlock toMap4 = new NextLevelBlock(lblToMap4, "4");
        nextLevelBlocks.add(toMap1);
        nextLevelBlocks.add(toMap3);
        nextLevelBlocks.add(toMap4);
    }
    
    private void map3Properties() {
        final int FORM_WIDTH = 1300;
        final int FORM_HEIGHT = 900;
        
        JLabel lblHero = new JLabel(); 
        JLabel lblToMap2 = new JLabel(); 
        JLabel wall1 = new JLabel(); 
        JLabel wall2 = new JLabel(); 
        JLabel wall3 = new JLabel(); 
        JLabel wall4 = new JLabel(); 
        JLabel house1 = new JLabel(); 
        JLabel house2 = new JLabel(); 
        JLabel house3 = new JLabel(); 
        JLabel house4 = new JLabel(); 
        JLabel house5 = new JLabel(); 
        JLabel house6 = new JLabel(); 
        JLabel house7 = new JLabel(); 
        JLabel house8 = new JLabel(); 
        JLabel house9 = new JLabel(); 
        JLabel house10 = new JLabel(); 
        JLabel house11 = new JLabel(); 
        JLabel lblShopkeeper1 = new JLabel(); 
        JLabel lblDodgeTrainer = new JLabel(); 
        JLabel lblDamageTrainer = new JLabel(); 
        JLabel lblShopkeeper2 = new JLabel(); 
        JLabel lblHealthTrainer = new JLabel(); 
        JLabel lblSpeedTrainer = new JLabel(); 
        JLabel grass1 = new JLabel(); 
        JLabel grass2 = new JLabel(); 
        JLabel grass3 = new JLabel(); 
        JLabel grass4 = new JLabel(); 
        JLabel grass6 = new JLabel(); 
        JLabel grass5 = new JLabel(); 
        JLabel grass7 = new JLabel(); 
        JLabel grass8 = new JLabel(); 
        JLabel grass9 = new JLabel(); 
        JLabel grass10 = new JLabel(); 
        JLabel background = new JLabel(); 
        
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
    }
    
    private void map4Properties() {
        final int FORM_WIDTH = 1065;
        final int FORM_HEIGHT = 589;
        final int FROM_MAP_2_X = 880;
        final int FROM_MAP_2_Y = 430;
        final int FROM_MAP_5_X = 30;
        final int FROM_MAP_5_Y = 180;
        
        JLabel lblHero = new JLabel(); 
        JLabel wall1 = new JLabel(); 
        JLabel wall2 = new JLabel(); 
        JLabel wall3 = new JLabel(); 
        JLabel wall4 = new JLabel(); 
        JLabel wall5 = new JLabel(); 
        JLabel lblCyborg2 = new JLabel(); 
        JLabel lblNail2 = new JLabel(); 
        JLabel lblRampage1 = new JLabel(); 
        JLabel grass1 = new JLabel(); 
        JLabel grass2 = new JLabel(); 
        JLabel grass3 = new JLabel(); 
        JLabel grass4 = new JLabel(); 
        JLabel grass5 = new JLabel(); 
        JLabel grass6 = new JLabel(); 
        JLabel grass7 = new JLabel(); 
        JLabel grass8 = new JLabel(); 
        JLabel grass9 = new JLabel(); 
        JLabel grass10 = new JLabel(); 
        JLabel grass11 = new JLabel(); 
        JLabel grass12 = new JLabel(); 
        JLabel grass13 = new JLabel(); 
        JLabel grass14 = new JLabel(); 
        JLabel grass15 = new JLabel(); 
        JLabel grass16 = new JLabel(); 
        JLabel grass17 = new JLabel(); 
        JLabel grass18 = new JLabel(); 
        JLabel grass19 = new JLabel(); 
        JLabel grass20 = new JLabel(); 
        JLabel grass21 = new JLabel(); 
        JLabel grass22 = new JLabel(); 
        JLabel grass23 = new JLabel(); 
        JLabel grass24 = new JLabel(); 
        JLabel grass25 = new JLabel(); 
        JLabel grass26 = new JLabel(); 
        JLabel lblToMap2 = new JLabel(); 
        JLabel lblToMap5 = new JLabel(); 
        JLabel background = new JLabel(); 
        
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

        LinkedList<JLabel> rampageImages = new LinkedList<>();
        rampageImages.add(lblRampage1);

        LinkedList<JLabel> nailImages = new LinkedList<>();
        nailImages.add(lblNail2);

        LinkedList<JLabel> cyborgImages = new LinkedList<>();
        cyborgImages.add(lblCyborg2);

        LinkedList<NextLevelBlock> nextLevelBlocks = new LinkedList();
        NextLevelBlock toMap2 = new NextLevelBlock(lblToMap2, "2");
        NextLevelBlock toMap5 = new NextLevelBlock(lblToMap5, "5");
        nextLevelBlocks.add(toMap2);
        nextLevelBlocks.add(toMap5);
    }
    
    private void map5Properties() {
        final int FORM_WIDTH = 1765;
        final int FORM_HEIGHT = 888;
        final int FROM_MAP_4_X = 1630;
        final int FROM_MAP_4_Y = 380;
        final int FROM_MAP_6_X = 580;
        final int FROM_MAP_6_Y = 730;
        final int FROM_MAP_7_X = 30;
        final int FROM_MAP_7_Y = 280;
        final int FROM_MAP_8_X = 780;
        final int FROM_MAP_8_Y = 30;
        
        JLabel lblHero = new javax.swing.JLabel();
        JLabel grass1 = new javax.swing.JLabel();
        JLabel grass2 = new javax.swing.JLabel();
        JLabel grass3 = new javax.swing.JLabel();
        JLabel grass4 = new javax.swing.JLabel();
        JLabel grass5 = new javax.swing.JLabel();
        JLabel grass6 = new javax.swing.JLabel();
        JLabel grass7 = new javax.swing.JLabel();
        JLabel grass8 = new javax.swing.JLabel();
        JLabel grass9 = new javax.swing.JLabel();
        JLabel grass10 = new javax.swing.JLabel();
        JLabel grass11 = new javax.swing.JLabel();
        JLabel grass12 = new javax.swing.JLabel();
        JLabel grass13 = new javax.swing.JLabel();
        JLabel grass14 = new javax.swing.JLabel();
        JLabel grass15 = new javax.swing.JLabel();
        JLabel grass16 = new javax.swing.JLabel();
        JLabel grass17 = new javax.swing.JLabel();
        JLabel grass18 = new javax.swing.JLabel();
        JLabel grass19 = new javax.swing.JLabel();
        JLabel grass20 = new javax.swing.JLabel();
        JLabel grass21 = new javax.swing.JLabel();
        JLabel grass22 = new javax.swing.JLabel();
        JLabel grass23 = new javax.swing.JLabel();
        JLabel grass24 = new javax.swing.JLabel();
        JLabel grass25 = new javax.swing.JLabel();
        JLabel grass26 = new javax.swing.JLabel();
        JLabel grass27 = new javax.swing.JLabel();
        JLabel grass28 = new javax.swing.JLabel();
        JLabel grass29 = new javax.swing.JLabel();
        JLabel grass30 = new javax.swing.JLabel();
        JLabel grass31 = new javax.swing.JLabel();
        JLabel grass32 = new javax.swing.JLabel();
        JLabel grass33 = new javax.swing.JLabel();
        JLabel grass34 = new javax.swing.JLabel();
        JLabel grass35 = new javax.swing.JLabel();
        JLabel grass36 = new javax.swing.JLabel();
        JLabel grass37 = new javax.swing.JLabel();
        JLabel grass38 = new javax.swing.JLabel();
        JLabel grass39 = new javax.swing.JLabel();
        JLabel grass40 = new javax.swing.JLabel();
        JLabel grass41 = new javax.swing.JLabel();
        JLabel grass42 = new javax.swing.JLabel();
        JLabel grass43 = new javax.swing.JLabel();
        JLabel grass44 = new javax.swing.JLabel();
        JLabel grass45 = new javax.swing.JLabel();
        JLabel grass46 = new javax.swing.JLabel();
        JLabel grass47 = new javax.swing.JLabel();
        JLabel grass48 = new javax.swing.JLabel();
        JLabel grass49 = new javax.swing.JLabel();
        JLabel grass50 = new javax.swing.JLabel();
        JLabel grass51 = new javax.swing.JLabel();
        JLabel grass52 = new javax.swing.JLabel();
        JLabel grass53 = new javax.swing.JLabel();
        JLabel grass54 = new javax.swing.JLabel();
        JLabel grass55 = new javax.swing.JLabel();
        JLabel grass56 = new javax.swing.JLabel();
        JLabel grass57 = new javax.swing.JLabel();
        JLabel grass58 = new javax.swing.JLabel();
        JLabel grass59 = new javax.swing.JLabel();
        JLabel grass60 = new javax.swing.JLabel();
        JLabel grass61 = new javax.swing.JLabel();
        JLabel grass62 = new javax.swing.JLabel();
        JLabel grass63 = new javax.swing.JLabel();
        JLabel grass64 = new javax.swing.JLabel();
        JLabel grass65 = new javax.swing.JLabel();
        JLabel grass66 = new javax.swing.JLabel();
        JLabel grass67 = new javax.swing.JLabel();
        JLabel grass68 = new javax.swing.JLabel();
        JLabel grass69 = new javax.swing.JLabel();
        JLabel grass70 = new javax.swing.JLabel();
        JLabel grass71 = new javax.swing.JLabel();
        JLabel grass72 = new javax.swing.JLabel();
        JLabel grass73 = new javax.swing.JLabel();
        JLabel grass74 = new javax.swing.JLabel();
        JLabel grass75 = new javax.swing.JLabel();
        JLabel grass76 = new javax.swing.JLabel();
        JLabel grass77 = new javax.swing.JLabel();
        JLabel grass78 = new javax.swing.JLabel();
        JLabel grass79 = new javax.swing.JLabel();
        JLabel grass80 = new javax.swing.JLabel();
        JLabel grass81 = new javax.swing.JLabel();
        JLabel grass82 = new javax.swing.JLabel();
        JLabel grass83 = new javax.swing.JLabel();
        JLabel grass84 = new javax.swing.JLabel();
        JLabel grass85 = new javax.swing.JLabel();
        JLabel grass86 = new javax.swing.JLabel();
        JLabel grass87 = new javax.swing.JLabel();
        JLabel grass88 = new javax.swing.JLabel();
        JLabel lblNail1 = new javax.swing.JLabel();
        JLabel lblCyborg1 = new javax.swing.JLabel();
        JLabel lblRampage1 = new javax.swing.JLabel();
        JLabel lblRampage2 = new javax.swing.JLabel();
        JLabel lblRampage3 = new javax.swing.JLabel();
        JLabel wall1 = new javax.swing.JLabel();
        JLabel wall2 = new javax.swing.JLabel();
        JLabel wall3 = new javax.swing.JLabel();
        JLabel wall4 = new javax.swing.JLabel();
        JLabel wall5 = new javax.swing.JLabel();
        JLabel wall6 = new javax.swing.JLabel();
        JLabel wall7 = new javax.swing.JLabel();
        JLabel wall8 = new javax.swing.JLabel();
        JLabel lblToMap4 = new javax.swing.JLabel();
        JLabel lblToMap6 = new javax.swing.JLabel();
        JLabel lblToMap7 = new javax.swing.JLabel();
        JLabel lblToMap8 = new javax.swing.JLabel();
        JLabel background = new javax.swing.JLabel();
        
        LinkedList<JLabel> wallImages = new LinkedList<>();
        wallImages.add(wall1);
        wallImages.add(wall2);
        wallImages.add(wall3);
        wallImages.add(wall4);
        wallImages.add(wall5);
        wallImages.add(wall6);
        wallImages.add(wall7);
        wallImages.add(wall8);

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
        grassImages.add(grass36); 
        grassImages.add(grass37); 
        grassImages.add(grass38); 
        grassImages.add(grass39); 
        grassImages.add(grass40); 
        grassImages.add(grass41); 
        grassImages.add(grass42); 
        grassImages.add(grass43); 
        grassImages.add(grass44); 
        grassImages.add(grass45); 
        grassImages.add(grass46); 
        grassImages.add(grass47); 
        grassImages.add(grass48); 
        grassImages.add(grass49); 
        grassImages.add(grass50); 
        grassImages.add(grass51); 
        grassImages.add(grass52); 
        grassImages.add(grass53); 
        grassImages.add(grass54); 
        grassImages.add(grass55); 
        grassImages.add(grass56); 
        grassImages.add(grass57); 
        grassImages.add(grass58); 
        grassImages.add(grass59); 
        grassImages.add(grass60); 
        grassImages.add(grass61); 
        grassImages.add(grass62); 
        grassImages.add(grass63); 
        grassImages.add(grass64); 
        grassImages.add(grass65); 
        grassImages.add(grass66); 
        grassImages.add(grass67); 
        grassImages.add(grass68); 
        grassImages.add(grass69); 
        grassImages.add(grass70); 
        grassImages.add(grass71); 
        grassImages.add(grass72); 
        grassImages.add(grass73); 
        grassImages.add(grass74); 
        grassImages.add(grass75); 
        grassImages.add(grass76); 
        grassImages.add(grass77); 
        grassImages.add(grass78); 
        grassImages.add(grass79); 
        grassImages.add(grass80); 
        grassImages.add(grass81); 
        grassImages.add(grass82); 
        grassImages.add(grass83); 
        grassImages.add(grass84); 
        grassImages.add(grass85); 
        grassImages.add(grass86); 
        grassImages.add(grass87); 
        grassImages.add(grass88); 
        
        LinkedList<JLabel> rampageImages = new LinkedList<>();
        rampageImages.add(lblRampage1);
        rampageImages.add(lblRampage2);
        rampageImages.add(lblRampage3);

        LinkedList<JLabel> nailImages = new LinkedList<>();
        nailImages.add(lblNail1);

        LinkedList<JLabel> cyborgImages = new LinkedList<>();
        cyborgImages.add(lblCyborg1);

        LinkedList<NextLevelBlock> nextLevelBlocks = new LinkedList();
        NextLevelBlock toMap4 = new NextLevelBlock(lblToMap4, "4");
        NextLevelBlock toMap6 = new NextLevelBlock(lblToMap6, "6");
        NextLevelBlock toMap7 = new NextLevelBlock(lblToMap7, "7");
        NextLevelBlock toMap8 = new NextLevelBlock(lblToMap8, "8");
        nextLevelBlocks.add(toMap4);
        nextLevelBlocks.add(toMap6);
        nextLevelBlocks.add(toMap7);
        nextLevelBlocks.add(toMap8);
    }
    
    private void map6Properties() {
        
    }
    
    private void map7Properties() {
        
    }
    
    private void map8Properties() {
        
    }
     
}
