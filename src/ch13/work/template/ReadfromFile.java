package ch13.work.template;

public class ReadfromFile extends BookReader{
    @Override
    void initialize() {
        System.out.println("Open an input file");
    }

    @Override
    void startReading() {
        System.out.println("Loop writing out each record");
    }

    @Override
    void stopReading() {
        System.out.println("Close input file");
    }
}
