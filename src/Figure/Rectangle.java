package Figure;

import Point.Point2D;

import java.util.List;

public class Rectangle extends  Figure {
    private List<Point2D> point2D;

    public Rectangle(List<Point2D> point2D) {
        super(point2D);
    }

    @Override
    public int getArea() {
        return 0;
    }
}
