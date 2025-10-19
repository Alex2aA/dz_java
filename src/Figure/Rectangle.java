package Figure;

public class Rectangle extends  Figure {
    private int a;
    private int b;
    private int c;
    private int d;

    public Rectangle(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public int getArea() {
        return a*b;
    }
}
