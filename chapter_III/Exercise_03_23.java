package chapter_III;

public class Exercise_03_23 {

    public static void main(String[] args) {

        Rectangle3_23 testRect = new Rectangle3_23(0.0,0.0,10.0,5.0);
        myPoint testPoint = new myPoint(-4.9,2.49);

        isPointInsideRect(testRect, testPoint);

    }

    public static void isPointInsideRect(Rectangle3_23 rect, myPoint point){

        boolean isXinside = false;
        boolean isYinside = false;

        if(point.getX()>=(rect.getPosX()-(rect.getWidth()/2))&&point.getX()<=(rect.getPosX()+(rect.getWidth()/2))){
            isXinside = true;
        }
        else {
            isXinside = false;
        }
        if(point.getY()>=(rect.getPosY()-(rect.getHeight()/2)) && point.getY()<= (rect.getPosY()+(rect.getHeight())/2)){
            isYinside = true;
        }
        else {
            isYinside = false;
        }
        if(isXinside&&isYinside){
            System.out.printf("is inside.");
        }else {
            System.out.printf("is outside.");
        }



    }



}
