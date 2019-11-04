package game;

import maps.Map1;
import playerClasses.Bandit;

/**
 * @author g.lumsden
 */
public class Information extends javax.swing.JFrame {

    // the height and width of the form
    private final int FORM_WIDTH  = 770;  
    private final int FORM_HEIGHT = 510; 
    
    private String          selected; 
    private GameEngine      engine; 
    private CharacterSelect cs; 
        
    /**
     * Constructor for the class
     * @param selected
     * @param engine
     * @param cs 
     */
    public Information(String selected, GameEngine engine, CharacterSelect cs) {
        initComponents();
        this.selected = selected; 
        this.engine   = engine; 
        this.cs       = cs; 
        setupHero(); 
        setupForm(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSelect = new javax.swing.JLabel();
        lblHeroImage = new javax.swing.JLabel();
        lblHeroInformation = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblSelect.setBackground(new java.awt.Color(255, 255, 0));
        lblSelect.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblSelect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSelect.setText("Select");
        lblSelect.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblSelect.setOpaque(true);
        lblSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSelectMouseClicked(evt);
            }
        });
        getContentPane().add(lblSelect);
        lblSelect.setBounds(310, 370, 100, 100);

        lblHeroImage.setBackground(new java.awt.Color(0, 153, 51));
        lblHeroImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeroImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/playerclasses/bandit/down/banditIdle.png"))); // NOI18N
        lblHeroImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblHeroImage.setOpaque(true);
        getContentPane().add(lblHeroImage);
        lblHeroImage.setBounds(310, 10, 100, 100);

        lblHeroInformation.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblHeroInformation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeroInformation.setText("Name: Bandit");
        lblHeroInformation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblHeroInformation);
        lblHeroInformation.setBounds(10, 10, 290, 460);

        lblBack.setBackground(new java.awt.Color(255, 255, 0));
        lblBack.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBack.setText("Back");
        lblBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblBack.setOpaque(true);
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        getContentPane().add(lblBack);
        lblBack.setBounds(310, 190, 100, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSelectMouseClicked
        this.dispose();
        cs.dispose();
        Map1 map1 = new Map1(1, engine);
    }//GEN-LAST:event_lblSelectMouseClicked

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        this.setVisible(false);
        cs.setVisible(true); 
    }//GEN-LAST:event_lblBackMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblHeroImage;
    private javax.swing.JLabel lblHeroInformation;
    private javax.swing.JLabel lblSelect;
    // End of variables declaration//GEN-END:variables

    /**
     * setups the image and information for the hero
     */
    private void setupHero() {
        lblHeroInformation.setText(Bandit.abilitiesInformation); 
    }

    /**
     * setups the form
     */
    private void setupForm() {
        this.setSize(FORM_WIDTH, FORM_HEIGHT);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
