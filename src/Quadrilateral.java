import java.awt.*;

public class Quadrilateral extends Shape {

    private PointClass[] points;


    public Quadrilateral(PointClass centerPoint, PointClass[] points) {
        super(Color.BLUE,centerPoint.getX(),centerPoint.getY(),false);
        this.points = points;
    }
    public Quadrilateral(PointClass centerPoint, PointClass p1, PointClass p2, PointClass p3, PointClass p4) {
        super(Color.BLUE,centerPoint.getX(),centerPoint.getY(),false);
        this.points =  new PointClass[]{
                p1,p2,p3,p4
        };
    }
    public Quadrilateral(Rectangle rectangle) {
        super(Color.BLUE, rectangle.getxCenter(), rectangle.getyCenter(), false);
        PointClass p1 = new PointClass(rectangle.getxCenter() - (rectangle.getWidth()/2),
                rectangle.getyCenter() - (rectangle.getHeight()/2));

        PointClass p2 = new PointClass(rectangle.getxCenter() + (rectangle.getWidth()/2),
                rectangle.getyCenter() - (rectangle.getHeight()/2));

        PointClass p3 = new PointClass(rectangle.getxCenter() + (rectangle.getWidth()/2),
                rectangle.getyCenter() + (rectangle.getHeight()/2));

        PointClass p4 = new PointClass(rectangle.getxCenter() - (rectangle.getWidth()/2),
                rectangle.getyCenter() + (rectangle.getHeight()/2));

        this.points = new PointClass[]{
                p1,p2,p3,p4
        };

    }
    @Override
    public void move(int x, int y) {
        //todo
    }

    @Override
    public void drawShape(Graphics g, boolean drawBoundingBox, boolean drawName) {
        int [] xArray = new int []{
            points [0].getX(),
            points [1].getX(),
            points [2].getX(),
            points [3].getX()


        };
        int [] yArray = new int []{
            points [0].getY(),
            points [1].getY(),
            points [2].getY(),
            points [3].getY()

        };

        g.fillPolygon(xArray,yArray,4);

    }

     @Override
        public BoundingBox getBoundingBox() {

        /*
        This boundingBox does not work as I ran out of time to figure out the drawing of it, idea was to get the 4
        points and draw it based on those from above, apologies for not completing :)

        This is the same for Rotate of the Quadrilateral
         */
         PointClass bottomLeft = new PointClass(getxCenter(), getyCenter());
         PointClass topRight = new PointClass(getxCenter(), getyCenter());

        BoundingBox box = new BoundingBox(bottomLeft, topRight);
        return box;
    }

}
