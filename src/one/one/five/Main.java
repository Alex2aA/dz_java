package one.one.five;

public class Main {
    public static void main(String[] args) {
        House house1 = new House(1);
        House house2 = new House(5);
        House house3 = new House(23);

        System.out.println(house1.getFormattedDescription());
        System.out.println(house2.getFormattedDescription());
        System.out.println(house3.getFormattedDescription());

    }
}
