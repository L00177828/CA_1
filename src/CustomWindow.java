import javax.swing.*;
import java.awt.*;

public class CustomWindow extends JFrame {

    private CustomPanel mainPanel;
    private ShapesManager shapeManager;


    public CustomWindow(ShapesManager shapeManager) {
        this.shapeManager = shapeManager;

        mainPanel = new CustomPanel(shapeManager);

        //add our new panel to the frame
        add(mainPanel, BorderLayout.CENTER);

        //set the dimensions of the frame/window
        setSize(Consts.FRAME_WIDTH, Consts.FRAME_HEIGHT);
    }

}
