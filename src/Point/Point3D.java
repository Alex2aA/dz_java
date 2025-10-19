package Point;

public class Point3D extends AbstractPoint{
    public Point3D(int x, int y, int z) {
        super(x, y, z);
    }

    public int getX() { return coordinates.get(0); }
    public int getY() { return coordinates.get(1); }
    public int getZ() { return coordinates.get(2); }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + getZ() + ")";
    }
}
