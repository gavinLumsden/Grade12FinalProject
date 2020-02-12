package grid; 

import game.GameEngine;
import game.HeroCreator;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;


public class Grid extends JFrame
{
    
    private GameEngine engine; 
    
    public int frameWidth;
    public int frameHeight;    
    public int tileWidth;
    public int tileHeight;
    private int rows;
    private int columns;

    public Location[][] locations;
    public Boundary     boundary; 
    private HeroCreator  heroCreator;
    
    public Grid(GameEngine engine) {
        System.out.println("creating new grid");
        this.engine = engine; 
        setDataStructures();
        setTiles();
        setFrame();    
        engine.grid = this;
        engine.locations = locations; 
        newHero(); 
        setActions();
        trim();  
        System.out.println("new grid created");
        this.setVisible(true);
    }
    
    public Grid(GameEngine engine, String[] data) {
        System.out.println("loading grid");
        this.engine = engine; 
        setDataStructures();
        setTiles();
        setFrame();    
        engine.grid = this;
        engine.locations = locations; 
        loadHero(data); 
        setActions();
        trim();  
        System.out.println("grid loaded");
        this.setVisible(true);
        System.out.println("awret");
    }
    
    private void loadHero(String[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
        System.out.println("program will probably crash, will fix later with proper loading");
        engine.loadHero();
    }
    
    private void newHero() {
        System.out.println("setting hero");
        engine.newHero();
        System.out.println("hero set");
    }
    
    private void setDataStructures() {
        System.out.println("settings data structures");
        frameWidth           = Map.map.length;
        frameHeight          = Map.map[0].length;
        tileWidth            = 80;
        tileHeight           = 80;
        rows                 = Map.map.length;
        columns              = Map.map[0].length;
        System.out.println("data structures set");
    }
    
    private void setFrame() {
        System.out.println("setting frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setUndecorated(true);
        setBackground(Types.BACKGROUND);
        getContentPane().setBackground(Types.BACKGROUND);        
        setSize(frameWidth, frameHeight);
        System.out.println("frame set");
    }
    
    private void setTiles() {
        System.out.println("setting tiles");
        locations = new Location[rows][columns];
        
        Chunk1 chunk1 = new Chunk1(locations, this); 
        Chunk2 chunk2 = new Chunk2(locations, this); 
        Chunk3 chunk3 = new Chunk3(locations, this); 
        Chunk4 chunk4 = new Chunk4(locations, this); 
        
        chunk1.thread.start(); 
        chunk2.thread.start(); 
        chunk3.thread.start(); 
        chunk4.thread.start(); 
        
        boolean done = false; 
        
        while(done == false) {
            if (chunk1.thread.isAlive() == false && chunk2.thread.isAlive() == false && chunk3.thread.isAlive() == false && chunk4.thread.isAlive() == false) {
                for (int r = chunk1.ROW_SIZE_LOW; r < chunk1.ROW_SIZE_HIGH; r++) {
                    for (int c = chunk1.COLUMN_SIZE_LOW; c < chunk1.COLUMN_SIZE_HIGH; c++) {
                        Location newLocation = chunk1.getLocation(r, c);
                        if (newLocation != null) locations[chunk1.ROW_SIZE_LOW][chunk1.COLUMN_SIZE_LOW] = newLocation; 
                        else System.out.println("Location: row: " + r + " column: " + c + " is a null");
                    }
                }
                for (int r = chunk2.ROW_SIZE_LOW; r < chunk2.ROW_SIZE_HIGH; r++) {
                    for (int c = chunk2.COLUMN_SIZE_LOW; c < chunk2.COLUMN_SIZE_HIGH; c++) {
                        Location newLocation = chunk2.getLocation(r, c);
                        if (newLocation != null) locations[chunk2.ROW_SIZE_LOW][chunk2.COLUMN_SIZE_LOW] = newLocation; 
                        else System.out.println("Location: row: " + r + " column: " + c + " is a null");
                    }
                }
                for (int r = chunk3.ROW_SIZE_LOW; r < chunk3.ROW_SIZE_HIGH; r++) {
                    for (int c = chunk3.COLUMN_SIZE_LOW; c < chunk3.COLUMN_SIZE_HIGH; c++) {
                        Location newLocation = chunk3.getLocation(r, c);
                        if (newLocation != null) locations[chunk3.ROW_SIZE_LOW][chunk3.COLUMN_SIZE_LOW] = newLocation; 
                        else System.out.println("Location: row: " + r + " column: " + c + " is a null");
                    }
                }
                for (int r = chunk4.ROW_SIZE_LOW; r < chunk4.ROW_SIZE_HIGH; r++) {
                    for (int c = chunk4.COLUMN_SIZE_LOW; c < chunk4.COLUMN_SIZE_HIGH; c++) {
                        Location newLocation = chunk4.getLocation(r, c);
                        if (newLocation != null) locations[chunk4.ROW_SIZE_LOW][chunk4.COLUMN_SIZE_LOW] = newLocation; 
                        else System.out.println("Location: row: " + r + " column: " + c + " is a null");
                    }
                }
                for (int r = 0; r < locations.length; r++) {
                    for (int c = 0; c < locations[r].length; c++) {
                        System.out.println("Drawing: row: " + r + " column: " + c);
                        locations[r][c].draw();
                    }
                }

                done = true; 
                System.out.println("tiles set");
            }
        }
        generatePatterns(); 
    }

    private void generatePatterns() {
        for (int r = 0; r < locations.length; r++) {
            for (int c = 0; c < locations[r].length; c++) {
                if (locations[r][c].isSource == true) generateSource(r, c); 
            }
        }
    }
    
    private void generateSource(int r, int c) {
        Location source = locations[r][c]; 
        System.out.println("Source is located at: row: " + source.row + " column: " + source.column);
        if (source.type == Types.DIRT) {
            try {
                locations[r-1][c-1].type = source.type; 
                locations[r-1][c].type   = source.type; 
                locations[r-1][c+1].type = source.type; 
                locations[r][c-1].type   = source.type; 
                locations[r][c+1].type   = source.type; 
                locations[r+1][c-1].type = source.type; 
                locations[r+1][c].type   = source.type;
                locations[r+1][c+1].type = source.type;
            } catch (ArrayIndexOutOfBoundsException error) {}
        } 
        setTransitions(); 
        redraw(); 
    }
    
    public void setTransitions() {
        System.out.println("settings transitions");
        for (int r = 0; r < locations.length; r++) {
            for (int c = 0; c < locations[r].length; c++) {
                Location center = locations[r][c]; 
                if (center.type == Types.DIRT) {
                    if (locations[r-1][c-1].type == Types.GRASS && locations[r-1][c].type == Types.GRASS && locations[r][c-1].type == Types.GRASS) locations[r-1][c-1].type = Types.DIRT_DIAGONAL_BELOW_RIGHTOF_GRASS; 
                    if (locations[r-1][c+1].type == Types.GRASS && locations[r-1][c].type == Types.GRASS && locations[r][c+1].type == Types.GRASS) locations[r-1][c+1].type = Types.DIRT_DIAGONAL_BELOW_LEFTOF_GRASS; 
                    if (locations[r+1][c-1].type == Types.GRASS && locations[r+1][c].type == Types.GRASS && locations[r][c-1].type == Types.GRASS) locations[r+1][c-1].type = Types.DIRT_DIAGONAL_ABOVE_RIGHTOF_GRASS; 
                    if (locations[r+1][c+1].type == Types.GRASS && locations[r+1][c].type == Types.GRASS && locations[r][c+1].type == Types.GRASS) locations[r+1][c+1].type = Types.DIRT_DIAGONAL_ABOVE_LEFTOF_GRASS; 
                    if (locations[r-1][c].type   == Types.GRASS) locations[r-1][c].type   = Types.DIRT_BELOW_GRASS; 
                    if (locations[r][c-1].type   == Types.GRASS) locations[r][c-1].type   = Types.DIRT_RIGHTOF_GRASS; 
                    if (locations[r][c+1].type   == Types.GRASS) locations[r][c+1].type   = Types.DIRT_LEFTOF_GRASS; 
                    if (locations[r+1][c].type   == Types.GRASS) locations[r+1][c].type   = Types.DIRT_ABOVE_GRASS; 
                }
            }
        }
        System.out.println("transitions set");
    }
    
    public void redraw() {
        System.out.println("redrawing grid");
        for (int r = 0; r < locations.length; r++) {
            for (int c = 0; c < locations[r].length; c++) {
                locations[r][c].draw();
            }
        }
        System.out.println("grid drawn");
    }
    
    private void setActions() {
        this.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {  } 
            public void keyPressed(KeyEvent e) {                 
                engine.keyPress(e);
            } 
            public void keyReleased(KeyEvent e) {
                engine.keyRelease(e);
            }
        });
    }

    public void trim() {
        System.out.println("trimming form");
        frameHeight -= (frameHeight - (locations.length * tileHeight));
        frameWidth -= (frameWidth - (locations[0].length * tileWidth));
        this.setSize(frameWidth, frameHeight);
        this.setLocationRelativeTo(null);
        System.out.println("form trimmed");
    }
    
    /**
     * Generates a random number
     *
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @return the generated number
     */
    private int random(int low, int high) {
        double seed = Math.random();
        double L = (double) low;
        double H = (double) high;
        double number = (H - L + 1) * seed + L;
        int answer = (int) number;
        return answer;
    }

}
