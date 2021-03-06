package grid;

/**
 * @author g.lumsden
 */
public class Chunk3 implements Runnable {
    
    public Thread thread; 
    
    public Location[][] locations; 
    public Grid grid; 
    
    public int tileWidth = 80; 
    public int tileHeight = 80; 
    
    public final int MAP_ROW_LENGTH    = Map.map.length; 
    public final int MAP_COLUMN_LENGTH = Map.map[0].length; 
    
    public final int ROW_SIZE_LOW  = (MAP_ROW_LENGTH / 2);
    public final int ROW_SIZE_HIGH = MAP_ROW_LENGTH; 
    
    public final int COLUMN_SIZE_LOW  = MAP_COLUMN_LENGTH - MAP_COLUMN_LENGTH;
    public final int COLUMN_SIZE_HIGH = (MAP_COLUMN_LENGTH / 2);
    
    public Chunk3(Location[][] locations, Grid grid) {
        this.locations = locations; 
        this.grid      = grid;  
        thread = new Thread(this); 
    }

    @Override
    public void run() {
        int y = ROW_SIZE_LOW*tileWidth; 
        for (int r = ROW_SIZE_LOW; r < ROW_SIZE_HIGH; r++) {
            int x = COLUMN_SIZE_LOW*tileWidth; 
            for (int c = COLUMN_SIZE_LOW; c < COLUMN_SIZE_HIGH; c++) {
                System.out.println("setting tile: row: " + r + " column: " + c);
                locations[r][c] = new Location(r, c, x, y, tileWidth, tileHeight, grid); 
                locations[r][c].draw();
                x += tileWidth; 
            }
            y += tileHeight; 
        }
    }
    
    public Location getLocation(int row, int column) {
        if (locations[row][column] != null) return locations[row][column]; 
        else return null; 
    }
    
}
