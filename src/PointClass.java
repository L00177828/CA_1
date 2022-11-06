
/*
We use this PointClass to store x and y values for the draw space.
With setters and getters
 */
public class PointClass {
    private int x;
    private int y;
    public PointClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
