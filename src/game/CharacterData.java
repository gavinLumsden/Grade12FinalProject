package game;

import game.gametools.FileHandler;
import game.gametools.GameCharacter;

/**
 * @author g.lumsden
 */
public class CharacterData {

    private static final String DATA_FILE = "/filedata/data.txt";
    private static FileHandler fileHandler;
    
    public static int[] check(GameCharacter character, boolean hasBeenCreated, 
            int[] stats, int[] defaults) {
        if (hasBeenCreated) {
            //recreating, read data from persistant storage (file)
            stats = update(character);
        }
        else {
            for (int i = 0; i < stats.length; i++) {
                stats[i] = defaults[i];
            }
        }        
        save(character,stats);
        return stats;
    }
    
    public static int[] saveData(GameCharacter character, int[] stats) {  
        save(character,stats);
        return stats;
    }
    
    
    
    public static int[] update(GameCharacter character) {
        fileHandler = new FileHandler(DATA_FILE);
        String[] values = fileHandler.read();
        int[] stats = new int[values.length];
        for (int i = 0; i < stats.length; i++) {
            stats[i] = Integer.parseInt(values[i]);
        }
        return stats;
    }
    
    
    public static void save(GameCharacter character, int[] stats) {
        String[] values = new String[stats.length];
        for (int i = 0; i < values.length; i++) {
            values[i] = stats[i] + "";
        }        
        fileHandler = new FileHandler(DATA_FILE);
        fileHandler.write(values);
    }
    
}
