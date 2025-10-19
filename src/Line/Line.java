package Line;

import java.awt.*;

public class Line {
    Point pointStart;
    Point pointEnd;

    public Line(int xStart, int yStart, int xEnd, int yEnd) {
        if (xStart == xEnd && yStart == yEnd) throw new IllegalArgumentException();
        this.pointStart = new Point(xStart,yStart);

        this.pointEnd = new Point(xEnd, yEnd);
    }

    public double len (){
        return Math.sqrt( (pointStart.getX() + pointEnd.getX())*(pointStart.getX() + pointEnd.getX())+(pointStart.getY()+ pointEnd.getY())*(pointStart.getY()+ pointEnd.getY())  );
    }

    @Override
    public String toString() {
        return "Линия от " + pointStart + " до " + pointEnd;
    }
}
