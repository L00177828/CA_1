import java.awt.*;

public abstract class Shape implements Move {

    public boolean isFilled() {
        return filled;
    }

    public boolean filled;

    private int xCenter, yCenter;
    private Color color;

    public Shape(Color color,int xCenter, int yCenter,boolean filled){
        this.color = color;
        this.xCenter = xCenter;
        this.yCenter = yCenter;
        this.filled = filled;
    }



    public void setDisplayName(Graphics g) {
            g.drawString(this.getClass().getSimpleName(), xCenter, yCenter);
        }

    public void drawBoundingBox(Graphics g){
        BoundingBox boundingBox = getBoundingBox();

        g.drawRect(boundingBox.getBottomLeft().getX(),boundingBox.getTopRight().getY(),
        boundingBox.getTopRight().getX() - boundingBox.getBottomLeft().getX(),
                boundingBox.getBottomLeft().getY() - boundingBox.getTopRight().getY());
    }

    //Setters and getters as well as color and drawShape comonent
    public abstract void drawShape(Graphics g,boolean drawBoundingBox, boolean drawName);
    public abstract BoundingBox getBoundingBox();
    public Color getColor(){
        return color;
    }
    public boolean getFilled(){
        return filled;
    }

    public int getxCenter() {
        return xCenter;
    }
    public int getyCenter() {
        return yCenter;
    }

    public void setxCenter(int xCenter) {
        this.xCenter = xCenter;
    }

    public void setyCenter(int yCenter) {
        this.yCenter = yCenter;
    }
}
