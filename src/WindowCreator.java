import javax.swing.*;
import java.awt.*;

public class WindowCreator {
    public static void main(String[] args) {

        ShapesManager shapeManager = new ShapesManager();
        //BoundingBox boundingBox = new BoundingBox();

        shapeManager.setDisplayName(true);
        shapeManager.setDisplayBoundingBox(true);


        //testing and drawing shapes here :
        shapeManager.addShape(new Circle(Color.BLACK,50,50,false,25));
        shapeManager.addShape(new Rectangle(Color.RED,100,100,false,20,40));
        shapeManager.addShape(new Square(Color.BLUE, 150,150,false,20));
        shapeManager.addShape(new Quadrilateral(new PointClass(50,150),new PointClass(50,150),new PointClass(120,170),
                new PointClass(100,220), new PointClass(40,190)));



        //Window creation
        CustomWindow customWindow = new CustomWindow(shapeManager);
        customWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        customWindow.setTitle("CA_1");
        customWindow.setVisible(true);
    }
}
