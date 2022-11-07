package chapter_II;
//For exercise 2_19
public class MyPoint {
    private double x;
    private double y;
    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }
    public static double calcTriangleArea(MyPoint p1, MyPoint p2, MyPoint p3){
        double side1 = 0.0;  //(x1,y1) -> (x2,y2)
        double side2 = 0.0;  //(x2,y2) -> (x3,y3)
        double side3 = 0.0;  //(x3-y3) -> (x1,y1)

        side1 = Math.sqrt(Math.pow((p2.getX()- p1.getX()), 2) + Math.pow((p2.getY()- p1.getY()), 2));
        side2 = Math.sqrt(Math.pow((p3.getX()- p2.getX()), 2) + Math.pow((p3.getY()- p2.getY()), 2));
        side3 = Math.sqrt(Math.pow((p1.getX()- p3.getX()), 2) + Math.pow((p3.getY()- p1.getY()), 2));

        double s = (side1 + side2 + side3)/2;
        double area = Math.sqrt(s*((s-side1)*(s-side2)*(s-side3)));

        return area;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
}