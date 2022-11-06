import javax.swing.*;
import java.awt.*;
/*
BoudingBox class to draw a BoudingBox
 */
public class BoundingBox{
    private PointClass bottomLeft;
    private PointClass topRight;



    public BoundingBox(PointClass bottomLeft, PointClass topRight){
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        }

        //Here we provide setters and getters for the bottomLeft and topRight as they are defines as private
    public void setBottomLeft(PointClass bottomLeft) {
        this.bottomLeft = bottomLeft;
    }
    public void setTopRight(PointClass topRight) {
        this.topRight = topRight;
    }
    public PointClass getBottomLeft() {
        return bottomLeft;
    }
    public PointClass getTopRight() {
        return topRight;
    }
}

