package City_road;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class City {
    private String name;
    List<Way> ways = new ArrayList<>();

    public City(String name) {
        this.name = name;
    }

    public City(String name, List<Way> initialWays) {
        this.name = name;
        if (initialWays != null) {
            for (Way way : initialWays) {
                addWay(way);
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Way> getWays() {
        return new ArrayList<>(ways);
    }

    public void addWay(Way way) {
        for (Way existingWay : ways) {
            if (existingWay.leadsTo(way.getTargetCity())) {
                existingWay.setCost(way.getCost());
            }
        }
        ways.add(way);
    }

    public void removeWay(City targetCity) {
        ways.removeIf(way -> way.leadsTo(targetCity));
    }

    public void removeWay(Way way) {
        ways.remove(way);
    }

    public Way getWayTo(City targetCity) {
        for (Way way : ways) {
            if (way.leadsTo(targetCity)) {
                return way;
            }
        }
        return null;
    }

    public boolean hasWayTo(City targetCity) {
        return getWayTo(targetCity) != null;
    }

    @Override
    public String toString() {
        return name + " ведет в: " + ways;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}



