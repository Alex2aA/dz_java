package Point;

public class SizeFeature extends AbstractFeature{
    private double size;
    public SizeFeature(double size) {
        super("Размер");
        this.size = size;
    }

    @Override
    public Object getValue() {
        return size;
    }
}
