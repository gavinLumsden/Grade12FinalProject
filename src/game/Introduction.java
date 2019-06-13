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
        btnQuit = new javax.swing.JButton();
        btnNewGame = new javax.swing.JButton();
        btnLoadGame = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblGameTitle.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblGameTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGameTitle.setText("Title of Game");
        lblGameTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblGameTitle);
        lblGameTitle.setBounds(0, 0, 400, 70);

        btnQuit.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btnQuit.setText("Quit");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });
        getContentPane().add(btnQuit);
        btnQuit.setBounds(0, 210, 400, 70);

        btnNewGame.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btnNewGame.setText("New game");
        btnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewGameActionPerformed(evt);
            }
        });
        getContentPane().add(btnNewGame);
        btnNewGame.setBounds(0, 70, 400, 70);

        btnLoadGame.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btnLoadGame.setText("Load game");
        getContentPane().add(btnLoadGame);
        btnLoadGame.setBounds(0, 140, 400, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * when the player clicks the quit button
     *
     * @param evt
     */
    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnQuitActionPerformed

    /**
     * when the player clicks the new game button
     *
     * @param evt
     */
    private void btnNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewGameActionPerformed
        this.dispose();
        CharacterSelect select = new CharacterSelect(engine);
    }//GEN-LAST:event_btnNewGameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoadGame;
    private javax.swing.JButton btnNewGame;
    private javax.swing.JButton btnQuit;
    private javax.swing.JLabel lblGameTitle;
    // End of variables declaration//GEN-END:variables

}
