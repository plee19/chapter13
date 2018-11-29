package ch13.work.facade;

public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;
    private Shape line;

    public ShapeMaker() {
        //circle = new Circle();
        //rectangle = new Rectangle();
        square = new Square();
    }

    public void drawLine(int x1, int x2, int y1, int y2) { line.draw(x1, x2, y1, y2); }
    public void drawCircle(int x1, int x2, int y1, int y2){
        circle.draw(x1, x2, y1, y2);
    }
    public void drawRectangle(int x1, int x2, int y1, int y2){
        rectangle.draw(x1, x2, y1, y2);
    }
    public void drawSquare(int x1, int x2, int y1, int y2){
        square.draw(x1, x2, y1, y2);
    }
}
