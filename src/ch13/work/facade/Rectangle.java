package ch13.work.facade;

public class Rectangle {
    /*public void draw() {
        System.out.println("Rectangle::draw()");
    }*/

    //@Override
    public void draw(int x, int y, int width, int height) {
        System.out.println("Rectangle with coordinate left-down point (" + x + ";" + y + "), width: " + width
                + ", height: " + height);
    }

}
