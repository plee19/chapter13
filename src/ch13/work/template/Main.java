package ch13.work.template;

import ch13.work.facade.ShapeMaker;

public class Main {

    public static void main(String[] args) {
        BookReader book1 = new ReadfromFile();
        book1.readBook();

        BookReader book2 = new ReadfromArray();
        book2.readBook();
    }
}

