package Point;

public class ColorFeature extends AbstractFeature{
    private String color;
    public ColorFeature(String color) {
        super("Цвет");
        this.color = color;
    }

    @Override
    public Object getValue() {
        return color;
    }
}
