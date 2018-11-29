package ch13.work.facade;

public class SquareAdapter implements Shape {
    private Square adaptee;
    public SquareAdapter(Square square) {
        this.adaptee = square;
    }

    @Override
    public void draw(int x1, int x2, int y1, int y2) {

        //adaptee.draw();
    }
}
