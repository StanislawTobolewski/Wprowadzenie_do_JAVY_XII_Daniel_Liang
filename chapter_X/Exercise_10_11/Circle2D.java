package chapter_X.Exercise_10_11;

public class Circle2D {

    private double x;
    private double y;
    private double radius;

    public Circle2D(){
        x = 0;
        y = 0;
        radius = 1;
    }

    public Circle2D(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Circle2D(double x, double y, double r){
        this.x = x;
        this.y = y;
        this.radius = r;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

    public double getPerimeter(){
        return (2 * Math.PI * radius);
    }

    //d=√((x_2-x_1)²+(y_2-y_1)²
    public boolean contains(double x, double y){
        double distance = 0.0;
        double left = Math.pow((x - this.x),2);
        double right = Math.pow((y - this.y),2);
        distance = Math.pow((left + right),0.5);
        return (distance<this.radius)?true:false;
    }

    public boolean contains(Circle2D circle){
        double distance = 0.0;
        double left = Math.pow((circle.x - this.x),2);
        double right = Math.pow((circle.y - this.y),2);
        distance = Math.pow((left + right),0.5);
        return (distance + circle.radius<this.radius)?true:false;
    }

    public boolean overlaps(Circle2D circle){
        double distance = 0.0;
        double left = Math.pow((circle.x - this.x),2);
        double right = Math.pow((circle.y - this.y),2);
        distance = Math.pow((left + right),0.5);
        return (distance < circle.radius+this.radius)?true:false;
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
