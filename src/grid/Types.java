package grid; 

import java.awt.Color;

public class Types 
{
    
    public static int BLANK   = 0;
    public static int GRASS   = 1;
    public static int DIRT    = 2;
    public static int WATER   = 3;
    public static int ENEMY   = 4;
    public static int BOUNDRY = 6;
    
    public static int DIRT_ABOVE_GRASS   = 10;
    public static int DIRT_BELOW_GRASS   = 11;
    public static int DIRT_LEFTOF_GRASS  = 12;
    public static int DIRT_RIGHTOF_GRASS = 13;
    public static int DIRT_DIAGONAL_ABOVE_LEFTOF_GRASS  = 14;
    public static int DIRT_DIAGONAL_BELOW_LEFTOF_GRASS  = 15;
    public static int DIRT_DIAGONAL_ABOVE_RIGHTOF_GRASS = 16;
    public static int DIRT_DIAGONAL_BELOW_RIGHTOF_GRASS = 17;
    
    public static int GRASS_ABOVE_DIRT   = 20;
    public static int GRASS_BELOW_DIRT   = 21;
    public static int GRASS_LEFTOF_DIRT  = 22;
    public static int GRASS_RIGHTOF_DIRT = 23;
    public static int GRASS_DIAGONAL_ABOVE_LEFTOF_DIRT  = 24;
    public static int GRASS_DIAGONAL_BELOW_LEFTOF_DIRT  = 25;
    public static int GRASS_DIAGONAL_ABOVE_RIGHTOF_DIRT = 26;
    public static int GRASS_DIAGONAL_BELOW_RIGHTOF_DIRT = 27;
    
    public static Color  BACKGROUND    = Color.WHITE;
    
}
