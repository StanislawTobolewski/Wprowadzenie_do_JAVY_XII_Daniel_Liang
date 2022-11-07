package chapter_III;
/** Additiona class Rectangular for Exercise_3_28 - lazines ... **/
public class Rectangular {
    private double centerX;
    private double centerY;
    private double height;
    private double width;
    private double top;
    private double bottom;
    private double left;
    private double right;

    Rectangular(double centerX, double centerY, double width, double height) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.height = height;
        this.width = width;
        this.top = centerY + height / 2.0;
        this.bottom = centerY - height / 2.0;
        this.left = centerX - width / 2.0;
        this.right = centerX + width / 2.0;

    }
    public static void checkRectangulars(Rectangular r1, Rectangular r2) {

        testInfo(r1,r2);

        if (((r2.left > r1.right) || (r2.right < r1.left)) || ((r2.bottom > r1.top) || (r2.top < r1.bottom))) {
            System.out.println("Rect 1 is outside of Rect 2 and are not intersect");
        } else if (((r2.left >= r1.left) && (r2.right <= r1.right)) && ((r2.top <= r1.top) && (r2.bottom >= r1.bottom))) {
            //check if 2 is inside 1
            System.out.println("Rect 2 is inside Rect 1");
        } else if (((r1.left >= r2.left) && (r1.right <= r2.right)) && ((r1.top <= r2.top) && (r1.bottom >= r2.bottom))) {
            //also chcek if 1 is inside 2
            System.out.println("Rect 1 is inside Rect 2");
        } else {
            System.out.println("Rec 1 and 2 are intersect");
        }
    }
    public static void testInfo(Rectangular r1, Rectangular r2){
        System.out.println("R1 left: " + r1.left + "\tR2 left: " + r2.left + "\nR1 right: " + r1.right + "\tR2 right: " + r2.right);
        System.out.println("R1 top: " + r1.top + "\t\tR2 top: " + r2.top + "\nR1 bottom: " + r1.bottom + "\tR2 bototm: " + r2.bottom);
        System.out.println("\n");
    }
}