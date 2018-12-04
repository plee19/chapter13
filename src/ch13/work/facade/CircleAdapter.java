package ch13.work.facade;

public class CircleAdapter implements Shape {
    private Circle adaptee;

    public CircleAdapter(Circle circle) {
        this.adaptee = circle;
    }

    // Modify for circle - Center point and radius
    @Override
    public void draw(int x1, int x2, int y1, int y2) {
        int width = Math.abs(x2 - x1);
        int height = Math.abs(y2 - y1);
        int centerX = width / 2;
        int centerY = height / 2;
        int radius = Math.min(width, height) / 2;
        adaptee.draw(centerX, centerY, radius);
    }
}
