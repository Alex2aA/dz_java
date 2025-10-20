package Figure;

import Point.Point2D;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Point2D> point2Ds = new ArrayList<>();
        point2Ds.add(new Point2D(4,6));
        point2Ds.add(new Point2D(0,9));
        point2Ds.add(new Point2D(78,3));
        point2Ds.add(new Point2D(769,4));
        Rectangle rectangle = new Rectangle(point2Ds);
    }
}
