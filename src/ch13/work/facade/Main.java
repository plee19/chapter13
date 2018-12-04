package ch13.work.facade;

public class Main {

    public static void main(String[] args) {
        AdaptiveShapeMaker adaptiveShapeMaker = new AdaptiveShapeMaker();

        Shape[] shapes = {new RectangleAdapter(new Rectangle()), new LineAdapter(new Line()), new CircleAdapter(new Circle()), new SquareAdapter(new Square())};

        int x1 = 10, y1 = 20;
        int x2 = 40, y2 = 80;
        for (Shape shape : shapes) {
            shape.draw(x1, x2, y1, y2);
        }
        adaptiveShapeMaker.lineAdapter.draw(x1, x2, y1, y2);
    }
}

