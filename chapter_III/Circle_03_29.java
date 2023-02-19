package chapter_III;

public class Circle_03_29 {
    private String name;
    private double x;
    private double y;
    private double radius;

    public Circle_03_29(double x, double y, double radius, String name) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    //d=√((x2 – x1)² + (y2 – y1)²)
    public boolean isCommon(Circle_03_29 circle) {
        double distance = 0.0;
        distance = Math.pow((Math.pow((circle.x - this.x), 2) + Math.pow((circle.y - this.y), 2)), 0.5);
                if (distance < (this.radius - circle.radius)) {
                    System.out.printf(circle.name + " is inside " + this.name);
                } else if (distance <= (this.radius + circle.radius)) {
                    System.out.printf(circle.name + " have common area with " + this.name);
                } else {
                    System.out.printf(circle.name + " and " + this.name + " doess not have any common part.");
                }
        return true;
    }
}