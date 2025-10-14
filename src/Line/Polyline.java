package Line;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Polyline{
    private List<Point> points;

    public Polyline() {
        this.points = new ArrayList<>();
    }

    public Polyline(List<Point> points) {
        this.points = new ArrayList<>(points);
    }

    public void addPoint(Point... points){
        if (points == null){
            throw new IllegalArgumentException();
        }
        for (Point point:points){
            this.points.add(point);
        }
    }

    public List<Point> getPoints() {
        return new ArrayList<>(points);
    }

    public Point getLastPoint() {
        if (points.isEmpty()) {
            return null;
        }
        return points.get(points.size() - 1);
    }

    public void setLastPoint(Point point) {
        if (!points.isEmpty()) {
            points.set(points.size() - 1, point);
        }
    }

    public void delPoint(int index){
        points.remove(index);
    }

    public double length() {
        if (points.size() < 2) {
            return 0.0;
        }

        double totalLength = 0.0;
        for (int i = 0; i < points.size() - 1; i++) {
            Point p1 = points.get(i);
            Point p2 = points.get(i + 1);

            double dx = p2.getX() - p1.getX();
            double dy = p2.getY() - p1.getY();
            totalLength += Math.sqrt(dx * dx + dy * dy);

        }

        return totalLength;
    }

    @Override
    public String toString() {
        return "Ломаная с " + points.size() + " точками";
    }

    protected void setPoint(Point first, int i) {

    }
}