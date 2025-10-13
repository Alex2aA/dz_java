package City_road;

import java.util.Objects;

public class Way {
    private City targetCity;
    private int cost;



    public Way(City targetCity, int cost) {
        this.targetCity = targetCity;
        this.cost = cost;
    }

    public City getTargetCity() {
        return targetCity;
    }

    public void setTargetCity(City targetCity) {
        this.targetCity = targetCity;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean leadsTo(City city) {
        return this.targetCity.equals(city);
    }

    @Override
    public String toString() {
        return targetCity.getName() + "(" + cost + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Way way = (Way) o;
        return Objects.equals(targetCity, way.targetCity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetCity);
    }
}

