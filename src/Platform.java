import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Platform extends Sprite{

    // Tracks the change in x
    private int dx;

    // Image file location
    // src/foldername/file.png
    private String imageLocation;

    // Initalizes the platform
    private void initPlatform() {
        loadImage();
        getImageDimensions();

        resetState();
    }

    // Loads the image
    private void loadImage() {
        var ii = new ImageIcon(imageLocation);
        image = ii.getImage();
    }


    // Methods for moving the platform
    void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT) {
            dx = -1;
        }
        if (key == KeyEvent.VK_RIGHT) {
            dx = 1;
        }
    }
    void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if ((key == KeyEvent.VK_LEFT) || (key == KeyEvent.VK_RIGHT)) {
            dx = 0;
        } 
    }
    //Resets the platform to it's starting position
    private void resetState() {
        
    }

}