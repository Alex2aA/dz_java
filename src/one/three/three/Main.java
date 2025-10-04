package one.three.three;

public class Main {
    public static void main(String[] args) {
        City a = new City("A");
        City b = new City("B");
        City c = new City("C");
        City f = new City("F");
        City e = new City("E");
        City d = new City("D");

        a.addRoad("b",5);
        a.addRoad("d",6);
        a.addRoad("f",1);

        b.addRoad("a",5);
        b.addRoad("f",1);
        b.addRoad("c",3);

        f.addRoad("b", 1);
        f.addRoad("a", 1);
        f.addRoad("e", 2);

        e.addRoad("f", 2);
        e.addRoad("d", 2);

        c.addRoad("b",3);
        c.addRoad("d",4);

        d.addRoad("c",4);
        d.addRoad("e",2);
        d.addRoad("a",6);

        System.out.println(a);
        System.out.println(b);
        System.out.println(f);
        System.out.println(e);
        System.out.println(c);
        System.out.println(d);
    }
}
