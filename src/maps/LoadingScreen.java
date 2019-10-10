package maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 * @author g.lumsden
 */
public class LoadingScreen extends javax.swing.JFrame {

    // form width and height for main
    private final int FORM_WIDTH = 500;
    private final int FORM_HEIGHT = 200;
    
    private Timer dots; 
    private int numberOfDots; 

    
    public LoadingScreen() {
        initComponents();       
        initLook();
        setDots(); 
        showFrame();
    }
    

    private void showFrame() {
        System.out.println("show");
        this.setVisible(true);
    }

    private void setDots() {
        numberOfDots = 0;
        dots = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if      (numberOfDots == 0) lblLoading.setText("Loading");
                else if (numberOfDots == 1) lblLoading.setText("Loading.");
                else if (numberOfDots == 2) lblLoading.setText("Loading..");
                else if (numberOfDots == 3) {
                    lblLoading.setText("Loading...");
                    numberOfDots = -1; 
                }
                numberOfDots++; 
            }
        }); 
        dots.start();
    }

    private void initLook() {
        this.setSize(FORM_WIDTH, FORM_HEIGHT);
        this.setLocationRelativeTo(null);
        this.setResizable(false);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLoading = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblLoading.setBackground(new java.awt.Color(0, 0, 0));
        lblLoading.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblLoading.setForeground(new java.awt.Color(255, 255, 255));
        lblLoading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoading.setText("Loading");
        lblLoading.setOpaque(true);
        getContentPane().add(lblLoading);
        lblLoading.setBounds(0, 0, 470, 180);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblLoading;
    // End of variables declaration//GEN-END:variables

    
    @Override
    public void dispose() {
        dots.stop();
        System.out.println("dispose");
        this.setVisible(false);
        super.dispose();
    }
    
}
