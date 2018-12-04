package ch13.work.facade;

public class LineAdapter implements Shape {
    private Line adaptee;
    public LineAdapter(Line line) {
        this.adaptee = line;
    }
    @Override
    public void draw(int x1, int x2, int y1, int y2) {
        adaptee.draw(x1, x2, y1, y2);
    }
}
