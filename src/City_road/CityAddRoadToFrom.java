package City_road;

//CityAddRoadToFrom
public class CityAddRoadToFrom extends City {

    public CityAddRoadToFrom(String name) {
        super(name);
    }

    public CityAddRoadToFrom(String name, Way... ways) {
        super(name);
        if (ways != null) {
            for (Way way : ways) {
                addWay(way);
            }
        }
    }

    @Override
    public void addWay(Way way) {
        boolean wayExists = false;
        for (Way existingWay : ways) {
            if (existingWay.leadsTo(way.getTargetCity())) {
                existingWay.setCost(way.getCost());
                wayExists = true;
                updateReverseWayCost(way.getTargetCity(), way.getCost());
                break;
            }
        }

        if (!wayExists) {
            ways.add(way);
            addReverseWay(way.getTargetCity(), way.getCost());
        }
    }


    @Override
    public void removeWay(City targetCity) {
        for (int i = ways.size() - 1; i >= 0; i--) {
            Way way = ways.get(i);
            if (way.leadsTo(targetCity)) {
                ways.remove(i);
            }
        }

        removeReverseWay(targetCity);
    }

    private void addReverseWay(City targetCity, int cost) {
        if (targetCity instanceof CityAddRoadToFrom) {
            CityAddRoadToFrom targetCity2 = (CityAddRoadToFrom) targetCity;
            if (!targetCity2.hasWayTo(this)) {
                Way reverseWay = new Way(this, cost);
                targetCity2.ways.add(reverseWay);
            }
        }
    }

    private void removeReverseWay(City targetCity) {
        if (targetCity instanceof CityAddRoadToFrom) {
            CityAddRoadToFrom targetCity2 = (CityAddRoadToFrom) targetCity;
            for (int i = targetCity2.ways.size() - 1; i >= 0; i--) {
                Way way = targetCity2.ways.get(i);
                if (way.leadsTo(this)) {
                    targetCity2.ways.remove(i);
                }
            }
        }
    }

    private void updateReverseWayCost(City targetCity, int cost) {
        if (targetCity instanceof CityAddRoadToFrom) {
            CityAddRoadToFrom targetCity2 = (CityAddRoadToFrom) targetCity;
            for (Way way : targetCity2.ways) {
                if (way.leadsTo(this)) {
                    way.setCost(cost);
                    break;
                }
            }
        }
    }
}

