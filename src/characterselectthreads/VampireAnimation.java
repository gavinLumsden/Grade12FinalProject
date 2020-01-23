package characterselectthreads;

import collections.LinkedList;
import game.gametools.Animation;
import javax.swing.JLabel;

/**
 * @author g.lumsden
 */
public class VampireAnimation implements Runnable {
    
    public Thread thread; 
    public Animation animation; 
    
    private LinkedList<String> animations; 
    private JLabel label; 

    public VampireAnimation(LinkedList<String> animations, JLabel label) {
        this.label = label; 
        this.animations = animations; 
        thread = new Thread(this); 
    }
    
    @Override
    public void run() {
        System.out.println("setting vamprie animations");
        animation = new Animation(label, animations, 800, true);
        System.out.println("vamprie animations set");
    }
    
}
