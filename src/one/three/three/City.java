package one.three.three;

import java.util.ArrayList;
import java.util.List;

class City {
    private String name;
    private List<Road> roads;

    public City(String name) {
        this.name = name;
        this.roads = new ArrayList<>();
    }

    public void addRoad(String cityTo, int price) {
        roads.add(new Road(cityTo, price));
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Город: ").append(name).append("\n");

        if (roads.isEmpty()) {
            result.append("  Нет связанных городов");
        } else {
            result.append("  Связанные города:\n");
            roads.forEach(road -> {
                result.append("    ")
                        .append(road.cityTo)
                        .append(": ")
                        .append(road.price)
                        .append("\n");
            });
        }

        return result.toString();
    }
}
