package City_road;

public class Main {
    public static void main(String[] args) {
        CityAddRoadToFrom moscow = new CityAddRoadToFrom("Москва");
        CityAddRoadToFrom spb = new CityAddRoadToFrom("СПб");

        moscow.addWay(new Way(spb, 700));

    }
}