package Point;

public class Point2D extends AbstractPoint{
    public Point2D(int x, int y) {
        super(x, y);
    }

    public int getX() { return coordinates.get(0); }
    public int getY() { return coordinates.get(1); }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ")";
    }
}
