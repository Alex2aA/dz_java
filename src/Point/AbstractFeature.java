package Point;

abstract public class AbstractFeature {
    String name;

    public AbstractFeature(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public abstract Object getValue();

    @Override
    public String toString() {
        return name + ": " + getValue();
    }
}
