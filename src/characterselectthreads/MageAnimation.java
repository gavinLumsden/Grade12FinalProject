package characterselectthreads;

import collections.LinkedList;
import game.gametools.Animation;
import javax.swing.JLabel;

/**
 * @author g.lumsden
 */
public class MageAnimation implements Runnable {
    
    public Thread thread; 
    public Animation animation; 
    
    private LinkedList<String> animations; 
    private JLabel label; 

    public MageAnimation(LinkedList<String> animations, JLabel label) {
        this.label = label; 
        this.animations = animations; 
        thread = new Thread(this); 
    }
    
    @Override
    public void run() {
        System.out.println("setting mage animations");
        animation = new Animation(label, animations, 800, true);
        System.out.println("mage animations set");
    }
    
}
