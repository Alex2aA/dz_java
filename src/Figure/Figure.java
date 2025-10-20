package Figure;

import Point.Point2D;

import java.util.List;

abstract class Figure {
    private List<Point2D> point2D;
    public Figure(List<Point2D> point2D) {
        this.point2D = point2D;
    }
    abstract public int getArea();
}
