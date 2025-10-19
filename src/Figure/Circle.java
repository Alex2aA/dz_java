package Figure;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int)Math.PI * (radius * radius);
    }
}
