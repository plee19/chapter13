package ch13.work.facade;

public class Square {
    /*@Override
    public void draw() {
        System.out.println("Square::draw()");
    }*/

    // STARTING POINT AND WIDTH
    //@Override
    public void draw(int x, int y, int length) {
        System.out.println("Square drawn with coordinate left-down point (" + x + ", " + y + "), side length " + length + ".");

    }
}
