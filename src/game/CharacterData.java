package game;

import game.gametools.FileHandler;
import game.gametools.GameCharacter;

/**
 * @author g.lumsden
 */
public class CharacterData {
    
    private static final String DATA_FILE = "/filedata/data.txt";
    private static FileHandler fileHandler;
    
    public static void save(GameCharacter character, int[] stats) {
        String[] newSave = new String[stats.length+1];
        for (int i = 0; i < stats.length; i++) {
            newSave[i] = stats[i] + "";
        } 
        newSave[newSave.length-1] = character.playerName; 
        fileHandler = new FileHandler(DATA_FILE); 
        fileHandler.write(newSave);
    }
    
    public static String[] load() {
        try {
            return fileHandler.read(); 
        } catch (NullPointerException error) {
            System.out.println("null file (there is no save file)");
            return null; 
        }
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
