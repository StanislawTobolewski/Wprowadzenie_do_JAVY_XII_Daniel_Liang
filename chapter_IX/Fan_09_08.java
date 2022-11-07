package chapter_IX;

public class Fan_09_08 {

    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;

    private int speed = SLOW;
    private boolean run = false;
    private double fanRadius = 5.0;
    private String colour = "Blue";

    Fan_09_08(){}

    @Override
    public String toString() {
        String info = "Speed: " + getSpeed() +
                "Running: " + isRun() +
                "Radius: " + getFanRadius() +
                "Colour: " + getColour();
        return info;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isRun() {
        return run;
    }

    public void setRun(boolean run) {
        this.run = run;
    }

    public double getFanRadius() {
        return fanRadius;
    }

    public void setFanRadius(double fanRadius) {
        this.fanRadius = fanRadius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
