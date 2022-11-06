import java.awt.*;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(Color color, int xCenter, int yCenter, boolean filled, int width , int height) {
        super(color, xCenter, yCenter, filled);
        this.height = width;
        this.width = height;
    }

    /*
    In this drawShape method for rectangle we pull half of the center (as center is in the middle of the shape)
    and we draw out the rectangle.
     */
    @Override
    public void drawShape(Graphics g, boolean drawBoundingBox, boolean drawName) {
        g.setColor(getColor());

        if (getFilled()) {
            g.fillRect(getxCenter() - width / 2, getyCenter() - height / 2, width, height);

        } else {
            g.drawRect(getxCenter() - width / 2, getyCenter() - height / 2, width , height );

        }
        if (drawBoundingBox)
            drawBoundingBox(g);
        if (drawName)
            setDisplayName(g);
    }

    @Override
    public BoundingBox getBoundingBox() {
        PointClass bottomLeft = new PointClass(getxCenter() - width /2, getyCenter() + height/2);
        PointClass topRight = new PointClass(getxCenter() + width/2, getyCenter() - height/2);

        BoundingBox box = new BoundingBox(bottomLeft, topRight);
        return box;
    }

    //Movement of the Rectangle is handled by the following logic
    @Override
    public void move(int x, int y) {

        int newX = getxCenter();
        int newY = getyCenter();

        newX += x;
        newY += y;

        setxCenter(newX);
        setyCenter(newY);

    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
