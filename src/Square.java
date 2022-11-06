import java.awt.*;


public class Square extends Rectangle {
    private int squareDimension;

    //This class is almost identical to "Rectangle" where we do most of the heavy lifting
    public Square(Color color, int xCenter, int yCenter, boolean filled, int squareDimension) {
        super(color, xCenter, yCenter, filled, squareDimension, squareDimension);
        this.squareDimension = squareDimension;
    }
}
