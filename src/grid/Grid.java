package grid; 

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import game.GameEngine;
import game.HeroCreator; 


public class Grid extends JFrame
{
    
    public static boolean done; 
    public int frameWidth;
    public int frameHeight;    
    public int tileWidth;
    public int tileHeight;
    private int rows;
    private int columns;

    private GameEngine engine; 
    private Location[][] locations;
    private Boundary     boundary; 
    private HeroCreator  heroCreator;
    
    public Grid(String selected, GameEngine engine) {
        this.engine = engine; 
        setDataStructures();
        setFrame();    
        setHero(); 
        setActions();
        trim();  
        done = true; 
    }

    private void setDataStructures() {
        frameWidth           = 1900;
        frameHeight          = 1000;
        tileWidth            = 90;
        tileHeight           = 90;
        rows                 = frameHeight / tileHeight;
        columns              = frameWidth  / tileWidth;
        setTiles();
        boundary             = new Boundary(locations);
    }
    
    private void setFrame() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setUndecorated(true);
        setBackground(Types.BACKGROUND);
        getContentPane().setBackground(Types.BACKGROUND);        
        setSize(frameWidth, frameHeight);
    }
    
    private void setTiles() {
        locations = new Location[rows][columns];
        int y = 0; 
        for (int r = 0; r < locations.length; r++) {
            int x = 0; 
            for (int c = 0; c < locations[0].length; c++) {
                locations[r][c] = new Location(r, c, x, y, tileWidth, tileHeight, Map.map[r][c], this); 
                locations[r][c].draw();
                x += tileWidth; 
            }
            y += tileWidth; 
        }
    }

    private void setActions() {
        this.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {  } 
            public void keyPressed(KeyEvent e) {                 
                heroCreator.keyPress(e);
            } 
            public void keyReleased(KeyEvent e) {
                heroCreator.stop();
            }
        });
    }

    public void trim() {
        frameHeight -= (frameHeight - (locations.length * tileHeight));
        frameWidth -= (frameWidth - (locations[0].length * tileWidth));
        this.setSize(frameWidth, frameHeight);
        this.setLocationRelativeTo(null);
    }

    private void setHero() {
        JLabel heroImage = new JLabel();
        this.getContentPane().add(heroImage);
        heroImage.setBounds(10, 10, tileWidth, tileHeight);
        heroImage.setOpaque(true);
        this.getContentPane().setComponentZOrder(heroImage, 0);
        heroCreator = new HeroCreator(locations, this, heroImage, engine, done);
    }
    
}