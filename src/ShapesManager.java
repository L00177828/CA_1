import java.awt.*;
import java.util.ArrayList;

public class ShapesManager {

    //Array of shapes is kept in this Array
    private ArrayList<Shape> shapes =new ArrayList<>();
    private boolean displayName, displayBoundingBox = true;

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    //
    public void drawShape(Graphics g){
     for(var shape:shapes) {
         shape.drawShape(g, displayBoundingBox,displayName);
     }
    }

    //Set the value to display or not display BoundingBox
    public void setDisplayBoundingBox(boolean displayBoundingBox){
        this.displayBoundingBox = displayBoundingBox;
    }

    //Set the value to display or not the shape name
    public void setDisplayName(boolean displayName){
        this.displayName = displayName;
    }
    public ArrayList<Shape> getShapes() {
        return shapes;
    }
}
