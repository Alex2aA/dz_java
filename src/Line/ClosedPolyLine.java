//package Line;
//
//import java.awt.*;
//import java.util.List;
//
//public class ClosedPolyLine extends Polyline{
//
//    public ClosedPolyLine(Point... points) {
//        super(List.of(points));
//        super.addPoint(points[0]);
//    }
//
//    @Override
//    public void addPoint(Point... points) {
//        Point firstPoint = getPoints().get(0);
//
//        if (!getPoints().isEmpty()) {
//            super.delPoint(getPoints().size()-1);
//        }
//
//        for (Point point : points) {
//            super.addPoint(point);
//        }
//
//        super.addPoint(firstPoint);
//    }
//    @Override
//    public void delPoint(int index) {
//        if (index > super.getPoints().size()-1 || index < 0) throw new ArrayIndexOutOfBoundsException();
//        super.delPoint(index);
//        if(index == 0){
//            super.setPoint(getPoints().getFirst(),getPoints().size()-1);
//        }
//        if (index == getPoints().size() ){
//            super.setPoint(getPoints().getLast(),0);
//        }
//    }
//
//    @Override
//    public void setPoint(Point point, int index) {
//        super.setPoint(point, index);
//        if(index == 0){
//            super.setPoint(point,getPoints().size()-1);
//        }
//        if (index == getPoints().size()-1){
//            super.setPoint(point,0);
//        }
//    }
//
//}
