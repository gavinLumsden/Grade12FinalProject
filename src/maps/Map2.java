package maps;

import collections.LinkedList;
import game.GameEngine;
import javax.swing.JLabel;
import objects.NextLevelBlock;

/**
 * Main.java - A "map" where the hero can move around and "fight" enemies
 *
 * @author g.lumsden
 * @since 14-May-2019
 */
public class Map2 extends javax.swing.JFrame {

    // properties
    private GameEngine engine;

    // form width and height for main
    private final int FORM_WIDTH = 1765;
    private final int FORM_HEIGHT = 888;

    // locations where the hero can "spawn" into
    private final int MAP_1_X = 1180;
    private final int MAP_1_Y = 730;

    private final int MAP_3_X = 1380;
    private final int MAP_3_Y = 30;

    private final int MAP_4_X = 280;
    private final int MAP_4_Y = 30;

    /**
     * Creates Map 2
     *
     * @param currentMapName
     * @param engine
     */
    public Map2(String currentMapName, GameEngine engine) {
        LoadingScreen loadingScreen = new LoadingScreen(); 
        initComponents();
        this.engine = engine;

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
        
        setSpawnLocation(currentMapName); 
        engine.createGameObject(grassImages, "grass");
        engine.createGameObject(wallImages, "walls");
        engine.createGameCharacter(cyborgImages, "cyborgs");
        engine.createGameCharacter(nailImages, "nails");
        engine.createGameCharacter(rampageImages, "rampages");
        engine.createMap(this, FORM_WIDTH, FORM_HEIGHT, "map 2");
        engine.createHero(lblHero, nextLevelBlocks);
        
        loadingScreen.dispose();
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
        wall6 = new javax.swing.JLabel();
        wall7 = new javax.swing.JLabel();
        lblToMap1 = new javax.swing.JLabel();
        lblToMap3 = new javax.swing.JLabel();
        lblToMap4 = new javax.swing.JLabel();
        lblNail1 = new javax.swing.JLabel();
        lblRampage1 = new javax.swing.JLabel();
        lblRampage2 = new javax.swing.JLabel();
        lblCyborg1 = new javax.swing.JLabel();
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
        grass28 = new javax.swing.JLabel();
        grass29 = new javax.swing.JLabel();
        grass30 = new javax.swing.JLabel();
        grass31 = new javax.swing.JLabel();
        grass32 = new javax.swing.JLabel();
        grass33 = new javax.swing.JLabel();
        grass34 = new javax.swing.JLabel();
        grass35 = new javax.swing.JLabel();
        grass36 = new javax.swing.JLabel();
        grass37 = new javax.swing.JLabel();
        grass38 = new javax.swing.JLabel();
        grass39 = new javax.swing.JLabel();
        grass40 = new javax.swing.JLabel();
        grass41 = new javax.swing.JLabel();
        grass42 = new javax.swing.JLabel();
        grass43 = new javax.swing.JLabel();
        grass44 = new javax.swing.JLabel();
        grass45 = new javax.swing.JLabel();
        grass46 = new javax.swing.JLabel();
        grass47 = new javax.swing.JLabel();
        grass48 = new javax.swing.JLabel();
        grass49 = new javax.swing.JLabel();
        grass50 = new javax.swing.JLabel();
        grass51 = new javax.swing.JLabel();
        grass52 = new javax.swing.JLabel();
        grass53 = new javax.swing.JLabel();
        grass54 = new javax.swing.JLabel();
        grass55 = new javax.swing.JLabel();
        grass56 = new javax.swing.JLabel();
        grass57 = new javax.swing.JLabel();
        grass58 = new javax.swing.JLabel();
        grass59 = new javax.swing.JLabel();
        grass60 = new javax.swing.JLabel();
        grass61 = new javax.swing.JLabel();
        grass62 = new javax.swing.JLabel();
        grass63 = new javax.swing.JLabel();
        grass64 = new javax.swing.JLabel();
        grass65 = new javax.swing.JLabel();
        grass66 = new javax.swing.JLabel();
        grass67 = new javax.swing.JLabel();
        grass68 = new javax.swing.JLabel();
        grass69 = new javax.swing.JLabel();
        grass70 = new javax.swing.JLabel();
        grass71 = new javax.swing.JLabel();
        grass72 = new javax.swing.JLabel();
        grass73 = new javax.swing.JLabel();
        grass74 = new javax.swing.JLabel();
        grass75 = new javax.swing.JLabel();
        grass76 = new javax.swing.JLabel();
        grass77 = new javax.swing.JLabel();
        grass78 = new javax.swing.JLabel();
        grass79 = new javax.swing.JLabel();
        grass80 = new javax.swing.JLabel();
        grass81 = new javax.swing.JLabel();
        grass82 = new javax.swing.JLabel();
        grass83 = new javax.swing.JLabel();
        grass84 = new javax.swing.JLabel();
        grass85 = new javax.swing.JLabel();
        grass87 = new javax.swing.JLabel();
        grass93 = new javax.swing.JLabel();
        grass94 = new javax.swing.JLabel();
        grass95 = new javax.swing.JLabel();
        grass96 = new javax.swing.JLabel();
        grass97 = new javax.swing.JLabel();
        grass98 = new javax.swing.JLabel();
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
        lblHero.setBounds(1180, 730, 100, 100);

        wall1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wall1.setText("Wall");
        wall1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(wall1);
        wall1.setBounds(1730, 0, 30, 1000);

        wall2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wall2.setText("Wall");
        wall2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(wall2);
        wall2.setBounds(1330, 830, 430, 30);

        wall3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wall3.setText("Wall");
        wall3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(wall3);
        wall3.setBounds(0, 0, 230, 30);

        wall4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wall4.setText("Wall");
        wall4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(wall4);
        wall4.setBounds(0, 0, 30, 1000);

        wall5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wall5.setText("Wall");
        wall5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(wall5);
        wall5.setBounds(1530, 0, 230, 30);

        wall6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wall6.setText("Wall");
        wall6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(wall6);
        wall6.setBounds(0, 830, 1130, 30);

        wall7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wall7.setText("Wall");
        wall7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(wall7);
        wall7.setBounds(430, 0, 900, 30);
        getContentPane().add(lblToMap1);
        lblToMap1.setBounds(1130, 850, 200, 10);
        getContentPane().add(lblToMap3);
        lblToMap3.setBounds(1330, 0, 200, 10);
        getContentPane().add(lblToMap4);
        lblToMap4.setBounds(230, 0, 200, 10);

        lblNail1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNail1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/enemyclasses/nail/left/nailIdle.png"))); // NOI18N
        lblNail1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblNail1);
        lblNail1.setBounds(1330, 380, 100, 100);

        lblRampage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRampage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/enemyclasses/rampage/down/rampageIdle.png"))); // NOI18N
        lblRampage1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblRampage1);
        lblRampage1.setBounds(280, 30, 100, 100);

        lblRampage2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRampage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/enemyclasses/rampage/down/rampageIdle.png"))); // NOI18N
        lblRampage2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblRampage2);
        lblRampage2.setBounds(1380, 30, 100, 100);

        lblCyborg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCyborg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/enemyclasses/cyborg/right/cyborgIdle.png"))); // NOI18N
        lblCyborg1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblCyborg1);
        lblCyborg1.setBounds(430, 280, 100, 100);

        grass1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass1);
        grass1.setBounds(1430, 730, 100, 100);

        grass2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass2);
        grass2.setBounds(1330, 730, 100, 100);

        grass3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass3);
        grass3.setBounds(1630, 730, 100, 100);

        grass4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass4);
        grass4.setBounds(1530, 730, 100, 100);

        grass5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass5);
        grass5.setBounds(1430, 630, 100, 100);

        grass6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass6);
        grass6.setBounds(1330, 630, 100, 100);

        grass7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass7);
        grass7.setBounds(1630, 630, 100, 100);

        grass8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass8);
        grass8.setBounds(1530, 630, 100, 100);

        grass9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass9);
        grass9.setBounds(1330, 530, 100, 100);

        grass10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass10);
        grass10.setBounds(1430, 530, 100, 100);

        grass11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass11);
        grass11.setBounds(1630, 530, 100, 100);

        grass12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass12);
        grass12.setBounds(1530, 530, 100, 100);

        grass13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass13);
        grass13.setBounds(1630, 430, 100, 100);

        grass14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass14);
        grass14.setBounds(1530, 430, 100, 100);

        grass15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass15);
        grass15.setBounds(1630, 330, 100, 100);

        grass16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass16);
        grass16.setBounds(1530, 330, 100, 100);

        grass17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass17);
        grass17.setBounds(1630, 230, 100, 100);

        grass18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass18);
        grass18.setBounds(1530, 230, 100, 100);

        grass19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass19);
        grass19.setBounds(1630, 130, 100, 100);

        grass20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass20.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass20);
        grass20.setBounds(1530, 130, 100, 100);

        grass21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass21.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass21);
        grass21.setBounds(1630, 30, 100, 100);

        grass22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass22);
        grass22.setBounds(1530, 30, 100, 100);

        grass23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass23.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass23);
        grass23.setBounds(1230, 130, 100, 100);

        grass24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass24.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass24);
        grass24.setBounds(1130, 130, 100, 100);

        grass25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass25.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass25);
        grass25.setBounds(1230, 30, 100, 100);

        grass26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass26.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass26);
        grass26.setBounds(1130, 30, 100, 100);

        grass27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass27.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass27);
        grass27.setBounds(1030, 130, 100, 100);

        grass28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass28.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass28);
        grass28.setBounds(1030, 30, 100, 100);

        grass29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass29.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass29);
        grass29.setBounds(930, 30, 100, 100);

        grass30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass30.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass30);
        grass30.setBounds(930, 130, 100, 100);

        grass31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass31.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass31);
        grass31.setBounds(830, 130, 100, 100);

        grass32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass32.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass32);
        grass32.setBounds(730, 130, 100, 100);

        grass33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass33.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass33);
        grass33.setBounds(830, 30, 100, 100);

        grass34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass34.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass34);
        grass34.setBounds(730, 30, 100, 100);

        grass35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass35.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass35);
        grass35.setBounds(630, 130, 100, 100);

        grass36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass36.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass36);
        grass36.setBounds(630, 30, 100, 100);

        grass37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass37.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass37);
        grass37.setBounds(530, 30, 100, 100);

        grass38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass38.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass38);
        grass38.setBounds(530, 130, 100, 100);

        grass39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass39.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass39);
        grass39.setBounds(430, 30, 100, 100);

        grass40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass40.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass40);
        grass40.setBounds(430, 130, 100, 100);

        grass41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass41.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass41);
        grass41.setBounds(130, 30, 100, 100);

        grass42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass42.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass42);
        grass42.setBounds(130, 130, 100, 100);

        grass43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass43.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass43);
        grass43.setBounds(30, 30, 100, 100);

        grass44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass44.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass44);
        grass44.setBounds(30, 130, 100, 100);

        grass45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass45.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass45);
        grass45.setBounds(130, 330, 100, 100);

        grass46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass46.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass46);
        grass46.setBounds(30, 330, 100, 100);

        grass47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass47.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass47);
        grass47.setBounds(130, 230, 100, 100);

        grass48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass48.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass48);
        grass48.setBounds(30, 230, 100, 100);

        grass49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass49.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass49);
        grass49.setBounds(130, 430, 100, 100);

        grass50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass50.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass50);
        grass50.setBounds(130, 530, 100, 100);

        grass51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass51.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass51);
        grass51.setBounds(30, 430, 100, 100);

        grass52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass52.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass52);
        grass52.setBounds(30, 530, 100, 100);

        grass53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass53.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass53);
        grass53.setBounds(130, 730, 100, 100);

        grass54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass54.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass54);
        grass54.setBounds(30, 730, 100, 100);

        grass55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass55.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass55);
        grass55.setBounds(130, 630, 100, 100);

        grass56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass56.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass56);
        grass56.setBounds(30, 630, 100, 100);

        grass57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass57.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass57);
        grass57.setBounds(330, 530, 100, 100);

        grass58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass58.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass58);
        grass58.setBounds(230, 530, 100, 100);

        grass59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass59.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass59);
        grass59.setBounds(330, 730, 100, 100);

        grass60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass60.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass60);
        grass60.setBounds(230, 730, 100, 100);

        grass61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass61.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass61);
        grass61.setBounds(330, 630, 100, 100);

        grass62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass62.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass62);
        grass62.setBounds(230, 630, 100, 100);

        grass63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass63.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass63);
        grass63.setBounds(530, 530, 100, 100);

        grass64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass64.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass64);
        grass64.setBounds(430, 530, 100, 100);

        grass65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass65.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass65);
        grass65.setBounds(530, 730, 100, 100);

        grass66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass66.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass66);
        grass66.setBounds(430, 730, 100, 100);

        grass67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass67.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass67);
        grass67.setBounds(530, 630, 100, 100);

        grass68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass68.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass68);
        grass68.setBounds(430, 630, 100, 100);

        grass69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass69.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass69);
        grass69.setBounds(730, 530, 100, 100);

        grass70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass70.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass70);
        grass70.setBounds(630, 530, 100, 100);

        grass71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass71.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass71);
        grass71.setBounds(730, 730, 100, 100);

        grass72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass72.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass72);
        grass72.setBounds(630, 730, 100, 100);

        grass73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass73.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass73);
        grass73.setBounds(730, 630, 100, 100);

        grass74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass74.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass74);
        grass74.setBounds(630, 630, 100, 100);

        grass75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass75.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass75);
        grass75.setBounds(830, 530, 100, 100);

        grass76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass76.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass76);
        grass76.setBounds(830, 730, 100, 100);

        grass77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass77.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass77);
        grass77.setBounds(830, 630, 100, 100);

        grass78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass78.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass78);
        grass78.setBounds(1030, 530, 100, 100);

        grass79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass79.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass79);
        grass79.setBounds(930, 530, 100, 100);

        grass80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass80.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass80);
        grass80.setBounds(1030, 730, 100, 100);

        grass81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass81.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass81);
        grass81.setBounds(930, 730, 100, 100);

        grass82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass82.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass82);
        grass82.setBounds(1030, 630, 100, 100);

        grass83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass83.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass83);
        grass83.setBounds(930, 630, 100, 100);

        grass84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass84.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass84);
        grass84.setBounds(330, 430, 100, 100);

        grass85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass85.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass85);
        grass85.setBounds(230, 430, 100, 100);

        grass87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass87.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass87);
        grass87.setBounds(430, 430, 100, 100);

        grass93.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass93.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass93);
        grass93.setBounds(1230, 230, 100, 100);

        grass94.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass94.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass94);
        grass94.setBounds(1130, 230, 100, 100);

        grass95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass95.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass95);
        grass95.setBounds(1030, 230, 100, 100);

        grass96.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass96.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass96);
        grass96.setBounds(930, 230, 100, 100);

        grass97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass97.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass97);
        grass97.setBounds(830, 230, 100, 100);

        grass98.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grass98.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(grass98);
        grass98.setBounds(730, 230, 100, 100);

        background.setBackground(new java.awt.Color(102, 51, 0));
        background.setOpaque(true);
        getContentPane().add(background);
        background.setBounds(0, 0, 1760, 860);

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
    private javax.swing.JLabel grass36;
    private javax.swing.JLabel grass37;
    private javax.swing.JLabel grass38;
    private javax.swing.JLabel grass39;
    private javax.swing.JLabel grass4;
    private javax.swing.JLabel grass40;
    private javax.swing.JLabel grass41;
    private javax.swing.JLabel grass42;
    private javax.swing.JLabel grass43;
    private javax.swing.JLabel grass44;
    private javax.swing.JLabel grass45;
    private javax.swing.JLabel grass46;
    private javax.swing.JLabel grass47;
    private javax.swing.JLabel grass48;
    private javax.swing.JLabel grass49;
    private javax.swing.JLabel grass5;
    private javax.swing.JLabel grass50;
    private javax.swing.JLabel grass51;
    private javax.swing.JLabel grass52;
    private javax.swing.JLabel grass53;
    private javax.swing.JLabel grass54;
    private javax.swing.JLabel grass55;
    private javax.swing.JLabel grass56;
    private javax.swing.JLabel grass57;
    private javax.swing.JLabel grass58;
    private javax.swing.JLabel grass59;
    private javax.swing.JLabel grass6;
    private javax.swing.JLabel grass60;
    private javax.swing.JLabel grass61;
    private javax.swing.JLabel grass62;
    private javax.swing.JLabel grass63;
    private javax.swing.JLabel grass64;
    private javax.swing.JLabel grass65;
    private javax.swing.JLabel grass66;
    private javax.swing.JLabel grass67;
    private javax.swing.JLabel grass68;
    private javax.swing.JLabel grass69;
    private javax.swing.JLabel grass7;
    private javax.swing.JLabel grass70;
    private javax.swing.JLabel grass71;
    private javax.swing.JLabel grass72;
    private javax.swing.JLabel grass73;
    private javax.swing.JLabel grass74;
    private javax.swing.JLabel grass75;
    private javax.swing.JLabel grass76;
    private javax.swing.JLabel grass77;
    private javax.swing.JLabel grass78;
    private javax.swing.JLabel grass79;
    private javax.swing.JLabel grass8;
    private javax.swing.JLabel grass80;
    private javax.swing.JLabel grass81;
    private javax.swing.JLabel grass82;
    private javax.swing.JLabel grass83;
    private javax.swing.JLabel grass84;
    private javax.swing.JLabel grass85;
    private javax.swing.JLabel grass87;
    private javax.swing.JLabel grass9;
    private javax.swing.JLabel grass93;
    private javax.swing.JLabel grass94;
    private javax.swing.JLabel grass95;
    private javax.swing.JLabel grass96;
    private javax.swing.JLabel grass97;
    private javax.swing.JLabel grass98;
    private javax.swing.JLabel lblCyborg1;
    private javax.swing.JLabel lblHero;
    private javax.swing.JLabel lblNail1;
    private javax.swing.JLabel lblRampage1;
    private javax.swing.JLabel lblRampage2;
    private javax.swing.JLabel lblToMap1;
    private javax.swing.JLabel lblToMap3;
    private javax.swing.JLabel lblToMap4;
    private javax.swing.JLabel wall1;
    private javax.swing.JLabel wall2;
    private javax.swing.JLabel wall3;
    private javax.swing.JLabel wall4;
    private javax.swing.JLabel wall5;
    private javax.swing.JLabel wall6;
    private javax.swing.JLabel wall7;
    // End of variables declaration//GEN-END:variables

    private void setSpawnLocation(String currentMapName) {
        if (currentMapName.equals("map 1")) {
            lblHero.setLocation(MAP_1_X, MAP_1_Y);
        } else if (currentMapName.equals("map 3")) {
            lblHero.setLocation(MAP_3_X, MAP_3_Y);
        } else if (currentMapName.equals("map 4")) {
            lblHero.setLocation(MAP_4_X, MAP_4_Y);
        }
    }

}
