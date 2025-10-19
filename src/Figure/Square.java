package Figure;

public class Square extends Figure{
    private int a;
    private int b;
    private int c;
    private int d;

    public Square(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public int getArea() {
        return a*a;
    }
}
