package Point;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract public class AbstractPoint {
    protected List<Integer> coordinates;

    public AbstractPoint(Integer... coordinates) {
        this.coordinates = new ArrayList<>(Arrays.asList(coordinates));
    }

    public List<Integer> getCoordinates() {
        return coordinates;
    }

    public int getDimension() {
        return coordinates.size();
    }

}
