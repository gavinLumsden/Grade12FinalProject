package game;

/**
 * Introduction.java - A form that creates a new game or quits the program
 *
 * @author g.lumsden
 * @since 12-Jun-2019
 */
public class Introduction extends javax.swing.JFrame {

    // width and height for the form
    private GameEngine engine;

    /**
     * Default constructor for the class
     */
    public Introduction() {
        initComponents();
        engine = new GameEngine();
        engine.createIntro(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblGameTitle = new javax.swing.JLabel();
        btnQuit = new javax.swing.JLabel();
        btnNewGame = new javax.swing.JLabel();
        btnLoadGame = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);

        lblGameTitle.setBackground(new java.awt.Color(153, 255, 153));
        lblGameTitle.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblGameTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGameTitle.setText("MECHABOX");
        lblGameTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblGameTitle.setOpaque(true);
        getContentPane().add(lblGameTitle);
        lblGameTitle.setBounds(0, 0, 400, 70);

        btnQuit.setBackground(new java.awt.Color(255, 153, 153));
        btnQuit.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btnQuit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnQuit.setText("Quit");
        btnQuit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnQuit.setOpaque(true);
        btnQuit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuitMouseClicked(evt);
            }
        });
        getContentPane().add(btnQuit);
        btnQuit.setBounds(0, 210, 400, 70);

        btnNewGame.setBackground(new java.awt.Color(153, 255, 255));
        btnNewGame.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btnNewGame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNewGame.setText("New game");
        btnNewGame.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnNewGame.setOpaque(true);
        btnNewGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewGameMouseClicked(evt);
            }
        });
        getContentPane().add(btnNewGame);
        btnNewGame.setBounds(0, 70, 400, 70);

        btnLoadGame.setBackground(new java.awt.Color(255, 255, 153));
        btnLoadGame.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btnLoadGame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLoadGame.setText("Load game");
        btnLoadGame.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnLoadGame.setOpaque(true);
        btnLoadGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoadGameMouseClicked(evt);
            }
        });
        getContentPane().add(btnLoadGame);
        btnLoadGame.setBounds(0, 140, 400, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewGameMouseClicked
        CharacterSelect characterSelect = new CharacterSelect(engine); 
        this.dispose(); 
    }//GEN-LAST:event_btnNewGameMouseClicked

    private void btnLoadGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoadGameMouseClicked
        System.out.println("no");
    }//GEN-LAST:event_btnLoadGameMouseClicked

    private void btnQuitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnQuitMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnLoadGame;
    private javax.swing.JLabel btnNewGame;
    private javax.swing.JLabel btnQuit;
    private javax.swing.JLabel lblGameTitle;
    // End of variables declaration//GEN-END:variables

}
