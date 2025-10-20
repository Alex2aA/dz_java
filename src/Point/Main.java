package Point;

public class Main {
    public static void main(String[] args) {
        Point2D p2 = new Point2D(3, 5);
        Point3D p3 = new Point3D(4, 2, 5);

        CustomPoint pColor = new CustomPoint(3);
        pColor.addFeature(new ColorPoint("red"));

        CustomPoint pBig = new CustomPoint(4, 2, 5);
        pBig.addFeature(new SizePoint(20));

        CustomPoint pFancy = new CustomPoint(7, 7);
        pFancy.addFeature(new ColorPoint("yellow"));
        pFancy.addFeature(new AbstractFeature("obod") {
            @Override
            public Object getValue() {
                return "red obodok v forme sobaki";
            }
        });

        System.out.println(p2);
        System.out.println(p3);
        System.out.println(pColor);
        System.out.println(pBig);
        System.out.println(pFancy);
    }
}