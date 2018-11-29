package ch13.work.facade;

public class CircleAdapter implements Shape {
    private Circle adaptee;

    public CircleAdapter(Circle circle) {
        this.adaptee = circle;
    }

    // Modify for circle - Center point and radius
    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        int minX = Math.min(x1, x2);
        int minY = Math.min(y1, y2);
        int maxX = Math.max(x1, x2);
        int maxY = Math.max(y1, y2);
        int width = Math.abs(x2 - x1);
        int height = Math.abs(y2 - y1);
        int centerX = width / 2;
        int centerY = height / 2;
        int radius = Math.min(width, height) / 2;
        adaptee.draw(centerX, centerY, radius);
        /*int minX = Math.min(x1, x2);
        int minY = Math.min(y1, y2);
        int maxX = Math.max(x1, x2);
        int maxY = Math.max(y1, y2);
        int centerX = maxX - minX;
        int centerY = maxY - minY;
        int halfShortestLength = Math.min(maxX - minX, maxY - minY) / 2;
        adaptee.draw(centerX, centerY, halfShortestLength);*/
    }
}
