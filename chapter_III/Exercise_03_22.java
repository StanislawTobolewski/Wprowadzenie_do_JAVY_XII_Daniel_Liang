package chapter_III;

import Other.Main;

public class Exercise_03_22 {

    public static void main(String[] args) {

        myCircle testCircle = new myCircle(0.0, 0.0, 10.0);
        myPoint testPoint = new myPoint(9.0, 9.0);

        ifPointInside(testPoint, testCircle);

    }

    public static void ifPointInside(myPoint p, myCircle c){
        double distance = 0.0;
        double firstValue = Math.pow((c.getX() - p.getX()),2);
        double secondValue = Math.pow((c.getY() - p.getY()),2);
        distance = Math.pow((firstValue + secondValue),0.5);

        if(distance <= c.getRadius()){
            System.out.printf("Point inside of circle.");
        }
        else {
            System.out.printf("Point outside of circle.");
        }
    }

}
