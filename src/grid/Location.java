package grid; 

import game.Icons;

public class Location
{

    public boolean isSource; 
    public int row;
    public int column;
    public int type;
    public Tile tile;
    
    public Location(int row, int column, int x, int y, 
                    int tileWidth, int tileHeight, Grid grid) {
        this.row    = row;
        this.column = column;   
        this.type   = Map.map[row][column];
        this.tile   = new Tile(tileWidth, tileHeight, x, y, grid);
    }
    
    public void draw() {
        if      (type == Types.BLANK)   tile.setImage(Icons.BLANK_IMAGE);
        else if (type == Types.GRASS)   {
            int random = random(0, Icons.GRASS_IMAGES.length-1); 
            tile.setImage(Icons.GRASS_IMAGES[random]);
        }
        else if (type == Types.GRASS_ABOVE_DIRT) {
            int random = random(0, Icons.GRASS_ABOVE_DIRT_IMAGES.length-1); 
            tile.setImage(Icons.GRASS_ABOVE_DIRT_IMAGES[random]);
        }
        else if (type == Types.GRASS_BELOW_DIRT) {
            int random = random(0, Icons.GRASS_BELOW_DIRT_IMAGES.length-1); 
            tile.setImage(Icons.GRASS_BELOW_DIRT_IMAGES[random]);
        }
        else if (type == Types.GRASS_LEFTOF_DIRT) {
            int random = random(0, Icons.GRASS_LEFTOF_DIRT_IMAGES.length-1); 
            tile.setImage(Icons.GRASS_LEFTOF_DIRT_IMAGES[random]);
        }
        else if (type == Types.GRASS_RIGHTOF_DIRT) {
            int random = random(0, Icons.GRASS_RIGHTOF_DIRT_IMAGES.length-1); 
            tile.setImage(Icons.GRASS_RIGHTOF_DIRT_IMAGES[random]);
        }
        else if (type == Types.GRASS_DIAGONAL_ABOVE_LEFTOF_DIRT) {
            int random = random(0, Icons.GRASS_DIAGONAL_ABOVE_LEFTOF_DIRT_IMAGES.length-1); 
            tile.setImage(Icons.GRASS_DIAGONAL_ABOVE_LEFTOF_DIRT_IMAGES[random]);
        }
        else if (type == Types.GRASS_DIAGONAL_ABOVE_RIGHTOF_DIRT) {
            int random = random(0, Icons.GRASS_DIAGONAL_ABOVE_RIGHTOF_DIRT_IMAGES.length-1); 
            tile.setImage(Icons.GRASS_DIAGONAL_ABOVE_RIGHTOF_DIRT_IMAGES[random]);
        }
        else if (type == Types.GRASS_DIAGONAL_BELOW_LEFTOF_DIRT) {
            int random = random(0, Icons.GRASS_DIAGONAL_BELOW_LEFTOF_DIRT_IMAGES.length-1); 
            tile.setImage(Icons.GRASS_DIAGONAL_BELOW_LEFTOF_DIRT_IMAGES[random]);
        }
        else if (type == Types.GRASS_DIAGONAL_BELOW_RIGHTOF_DIRT) {
            int random = random(0, Icons.GRASS_DIAGONAL_BELOW_RIGHTOF_DIRT_IMAGES.length-1); 
            tile.setImage(Icons.GRASS_DIAGONAL_BELOW_RIGHTOF_DIRT_IMAGES[random]);
        }
        
        else if (type == Types.DIRT)   {
            int random = random(0, Icons.DIRT_IMAGES.length-1); 
            tile.setImage(Icons.DIRT_IMAGES[random]);
        }
        else if (type == Types.DIRT_ABOVE_GRASS) {
            int random = random(0, Icons.DIRT_ABOVE_GRASS_IMAGES.length-1); 
            tile.setImage(Icons.DIRT_ABOVE_GRASS_IMAGES[random]);
        }
        else if (type == Types.DIRT_BELOW_GRASS) {
            int random = random(0, Icons.DIRT_BELOW_GRASS_IMAGES.length-1); 
            tile.setImage(Icons.DIRT_BELOW_GRASS_IMAGES[random]);
        }
        else if (type == Types.DIRT_LEFTOF_GRASS) {
            int random = random(0, Icons.DIRT_LEFTOF_GRASS_IMAGES.length-1); 
            tile.setImage(Icons.DIRT_LEFTOF_GRASS_IMAGES[random]);
        }
        else if (type == Types.DIRT_RIGHTOF_GRASS) {
            int random = random(0, Icons.DIRT_RIGHTOF_GRASS_IMAGES.length-1); 
            tile.setImage(Icons.DIRT_RIGHTOF_GRASS_IMAGES[random]);
        }
        else if (type == Types.DIRT_DIAGONAL_ABOVE_LEFTOF_GRASS) {
            int random = random(0, Icons.DIRT_DIAGONAL_ABOVE_LEFTOF_GRASS_IMAGES.length-1); 
            tile.setImage(Icons.DIRT_DIAGONAL_ABOVE_LEFTOF_GRASS_IMAGES[random]);
        }
        else if (type == Types.DIRT_DIAGONAL_ABOVE_RIGHTOF_GRASS) {
            int random = random(0, Icons.DIRT_DIAGONAL_ABOVE_RIGHTOF_GRASS_IMAGES.length-1); 
            tile.setImage(Icons.DIRT_DIAGONAL_ABOVE_RIGHTOF_GRASS_IMAGES[random]);
        }
        else if (type == Types.DIRT_DIAGONAL_BELOW_LEFTOF_GRASS) {
            int random = random(0, Icons.DIRT_DIAGONAL_BELOW_LEFTOF_GRASS_IMAGES.length-1); 
            tile.setImage(Icons.DIRT_DIAGONAL_BELOW_LEFTOF_GRASS_IMAGES[random]);
        }
        else if (type == Types.DIRT_DIAGONAL_BELOW_RIGHTOF_GRASS) {
            int random = random(0, Icons.DIRT_DIAGONAL_BELOW_RIGHTOF_GRASS_IMAGES.length-1); 
            tile.setImage(Icons.DIRT_DIAGONAL_BELOW_RIGHTOF_GRASS_IMAGES[random]);
        }
        
        else if (type == Types.WATER)   {
            int random = random(0, Icons.WATER_IMAGES.length-1); 
            tile.setImage(Icons.WATER_IMAGES[random]);
        }
        else if (type == Types.ENEMY)   tile.setImage(Icons.ENEMY_IMAGE);
        else if (type == Types.BOUNDRY) tile.setImage(Icons.BLANK_IMAGE);
        tile.tile.setText("" + type); 
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