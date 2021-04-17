import java.awt.Image;
import java.awt.Rectangle;

public class Sprite {
    int x;
    int y;
    int width;
    int height;
    Image image;

    // Setters
    void setX(int newX) {
        x = newX;
    }
    void setY(int newY) {
        x = newY;
    }

    // Getters
    int getX() {
        return x;
    }
    int getY() {
        return y;
    }
    int getWidth() {
        return width;
    }
    int getHeight() {
        return height;
    }
    Image getImage() {
        return image;
    }
    Rectangle getRect() {
        return new Rectangle(x, y, image.getWidth(null), image.getHeight(null));
    }

    // Sets the height and width accurate to that of the image
    void getImageDimensions() {
        width = image.getWidth(null);
        height = image.getHeight(null);
    }
}
