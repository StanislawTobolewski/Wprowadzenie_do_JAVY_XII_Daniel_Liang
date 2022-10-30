package chapter_IV;

public class Point_04_02 {

    private double x;
    private double y;

    public Point_04_02(){
    }

    public Point_04_02(double x, double y){
        this.x = Math.toRadians(x);
        this.y = Math.toRadians(y);
    }

    public static double calculateDistance(Point_04_02 point1, Point_04_02 point2, double earthRadius){
        double distance = 0.0;
        distance = earthRadius * Math.acos(Math.sin(point1.getX()) * Math.sin(point2.getX()) + Math.cos(point1.getX()) * Math.cos(point2.getX()) * Math.cos(point1.getY() - point2.getY()));
        return distance;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = Math.toRadians(x);
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = Math.toRadians(y);
    }
}
