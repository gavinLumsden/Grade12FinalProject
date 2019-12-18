package game;

import collections.LinkedList;
import game.gametools.FileHandler;
import game.gametools.GameCharacter;

/**
 * @author g.lumsden
 */
public class CharacterData <T> {
    
    private static final String DATA_FILE = "/filedata/data.txt";
    private static FileHandler fileHandler;
    
    public static void save(GameCharacter character, int[] stats) {
        String[] newSave = new String[stats.length+1];
        for (int i = 0; i < newSave.length; i++) {
            newSave[i] = stats[i] + "";
        }        
        newSave[newSave.length] = character.playerName; 
        fileHandler = new FileHandler(DATA_FILE); 
        fileHandler.write(newSave);
    }
    
    public static String[] getSave() {
        return fileHandler.read(); 
    }
    
    public static int[] check(GameCharacter character, 
            int[] stats, int[] defaults) {
        for (int i = 0; i < stats.length; i++) {
            stats[i] = defaults[i];
        }
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
    
}
