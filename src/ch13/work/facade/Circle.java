package ch13.work.facade;

public class Circle {
    /*@Override
    public void draw() {
        System.out.println("Circle::draw()");
    }*/

    // STARTING POINT AND RADIUS
    public void draw(int centerX, int centerY, int radius) {
        System.out.println("Circle drawn with center point (" + centerX + ", " + centerY + ") and radius " + radius);
    }
}