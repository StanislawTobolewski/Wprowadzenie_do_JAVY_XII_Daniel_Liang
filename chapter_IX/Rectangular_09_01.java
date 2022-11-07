package chapter_IX;

public class Rectangular_09_01 {
    private double width = 1;
    private double height = 1;

    Rectangular_09_01(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return this.height*this.width;
    }

    public double getPerimeter(){
        return 2*this.width + 2*this.height;
    }
}
