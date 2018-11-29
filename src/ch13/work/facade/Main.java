package ch13.work.facade;

public class Main {

    public static void main(String[] args) {
        //ShapeMaker shapeMaker = new ShapeMaker();

        Shape[] shapes = {new RectangleAdapter(new Rectangle()), new LineAdapter(new Line()), new CircleAdapter(new Circle()), new SquareAdapter(new Square())};

        //shapeMaker.drawCircle();
        //shapeMaker.drawRectangle();
        //shapeMaker.drawSquare();

        AdaptiveShapeMaker shapeMaker = new AdaptiveShapeMaker();
        int x1 = 10, y1 = 20;
        int x2 = 40, y2 = 80;
        for (Shape shape : shapes) {
            shape.draw(x1, x2, y1, y2);
        }
        //shapeMaker.drawLine(x1, y1, x2, y2);
        //shapeMaker.drawCircle(x1, y1, x2, y2);
        //shapeMaker.drawRectangle(x1, y1, x2, y2);
        //shapeMaker.drawSquare(x1, y1, x2, y2);
    }
}

