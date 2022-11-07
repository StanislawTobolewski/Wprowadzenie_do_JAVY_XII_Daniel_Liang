package chapter_X.Exercise_10_04;

public class MyPoint {
    private double x = 0.0;
    private double y = 0.0;

    public MyPoint(){
        x = 0.0;
        y = 0.0;
    }
    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double distance(MyPoint p){
        double distance = 0.0;
        double left = Math.pow((p.x - this.x),2);
        double right = Math.pow((p.y - this.y),2);
        distance = Math.pow((left + right),0.5);

        return distance;
    }
    public double distance(double x, double y){
        double distance = 0.0;
        double left = Math.pow((x - this.x),2);
        double right = Math.pow((y - this.y),2);
        distance = Math.pow((left + right),0.5);
        return distance;
    }
    //d=√((x_2-x_1)²+(y_2-y_1)²
    public static double distance(MyPoint p1, MyPoint p2){
        double distance = 0.0;
        double left = Math.pow((p2.x - p1.x),2);
        double right = Math.pow((p2.y - p1.y),2);
        distance = Math.pow((left + right),0.5);
        return distance;
    }
}
