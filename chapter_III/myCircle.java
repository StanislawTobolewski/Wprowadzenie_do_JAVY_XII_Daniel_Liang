package chapter_III;

public class myCircle extends myPoint{

    private double radius;

    public myCircle(double x, double y, double r){
        super(x,y);
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
