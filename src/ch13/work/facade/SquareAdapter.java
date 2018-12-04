package ch13.work.facade;

public class SquareAdapter implements Shape {
    private Square adaptee;

    public SquareAdapter(Square square) {
        this.adaptee = square;
    }

    @Override
    public void draw(int x1, int x2, int y1, int y2) {
        int length;
        int minX = Math.min(x1, x2);
        int maxX = Math.max(x1, x2);
        int minY = Math.min(y1, y2);
        int maxY = Math.max(y1, y2);
        if (Math.abs(x2 - x1) < Math.abs(y2 - y1)) {
            length = x2 - x1;
        } else {
            length = y2 - y1;
        }
        adaptee.draw(minX, maxY, length);
    }
}
