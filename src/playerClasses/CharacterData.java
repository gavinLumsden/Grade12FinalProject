/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playerClasses;

import game.gametools.FileHandler;
import game.gametools.GameCharacter;

/**
 *
 * @author g.lumsden
 */
public class CharacterData {

    private static final String DATA_FILE = "data.txt";
    private static FileHandler fileHandler;
    
    
    public static void update(GameCharacter character) {
        fileHandler = new FileHandler(DATA_FILE);
        String[] data = fileHandler.read();
        character.save(data);
    }
    
    
    public static void save(GameCharacter character) {
        fileHandler = new FileHandler(DATA_FILE);
        String[] data = character.getData();
        fileHandler.write(data);
    }
    
}
