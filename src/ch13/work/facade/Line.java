package ch13.work.facade;

public class Line {
    public void draw(int x1, int x2, int y1, int y2) {
        System.out.println("Line drawn from point A(" + x1 + ", " + y1 + "), to point B(" + x2 + ", " + y2 + ").");
    }
}
