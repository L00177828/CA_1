/*
Our Circle class which draws a full circle (fillOval) or empty circle(drawOval)
 */

import java.awt.*;

public class Circle extends Shape {
    private int radius;

    public Circle(Color color, int xCenter, int yCenter, boolean filled, int radius) {
        super(color, xCenter, yCenter, filled);
        this.radius = radius;
    }

    @Override
    public void drawShape(Graphics g,boolean drawBoundingBox,boolean drawName) {
        g.setColor(getColor());
        if (getFilled()) {
            g.fillOval(getxCenter() - radius, getyCenter() - radius, radius * 2, radius * 2);

        } else {
            g.drawOval(getxCenter() - radius, getyCenter() - radius, radius * 2, radius * 2);

        }
        if(drawBoundingBox)
            drawBoundingBox(g);
        if(drawName)
            setDisplayName(g);
    }



    @Override
    public BoundingBox getBoundingBox() {
        PointClass bottomLeft = new PointClass(getxCenter() - radius,getyCenter()+radius);
        PointClass topRight = new PointClass(getxCenter() + radius,getyCenter()-radius);

        BoundingBox box = new BoundingBox(bottomLeft,topRight);
        return box;

    }
    @Override
    public void move(int x, int y) {

    }
}
