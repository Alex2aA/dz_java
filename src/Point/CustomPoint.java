package Point;

import java.util.ArrayList;
import java.util.List;

public class CustomPoint extends AbstractPoint{
    private List<AbstractFeature> features = new ArrayList<>();

    public CustomPoint(Integer... coordinates) {
        super(coordinates);
    }

    public void addFeature(AbstractFeature feature) {
        features.add(feature);
    }

    public List<AbstractFeature> getFeatures() {
        return features;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Точка " + super.toString());
        if (!features.isEmpty()) {
            sb.append(" с характеристиками: ");
            for (AbstractFeature f : features) {
                sb.append(f).append("; ");
            }
        }
        return sb.toString();
    }
}
