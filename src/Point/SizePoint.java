package Point;

public class SizePoint extends AbstractFeature{
    private double size;
    public SizePoint(double size) {
        super("size");
        this.size = size;
    }

    @Override
    public Object getValue() {
        return size;
    }
}
