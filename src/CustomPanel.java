
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CustomPanel extends JPanel {

    private ShapesManager shapeManager;

    /*
    Here we handle mouse inputs. Because we already have a boundingBox we can check if the mouse is inside the
     coordinates of the boundingBox
     */
    private void addListener (){
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);

                for(Shape currShape:shapeManager.getShapes()){

                    BoundingBox box = currShape.getBoundingBox();

                            if(e.getX()>=box.getBottomLeft().getX() && e.getX()<= box.getTopRight().getX()
                            && e.getY()>=box.getTopRight().getY() && e.getY()<=box.getBottomLeft().getY())
                            {
                                if(e.getButton()==MouseEvent.BUTTON1)
                                currShape.filled = !currShape.filled;

                                if(e.getButton()==MouseEvent.BUTTON3){
                                    currShape.move(10,0);
                                }
                            }

                }
                CustomPanel.super.repaint();
            }
        });
    }
    public CustomPanel(ShapesManager shapeManager){
        this.shapeManager = shapeManager;
        addListener();
    }



    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        shapeManager.drawShape(g);

    }

    public void addMouse(){
        //todo add mouse clicker.
    }
}
