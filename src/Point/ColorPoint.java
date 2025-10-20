package Point;

public class ColorPoint extends AbstractFeature{
    private String color;
    public ColorPoint(String color) {
        super("Color");
        this.color = color;
    }

    @Override
    public Object getValue() {
        return color;
    }
}
