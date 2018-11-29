package ch13.work.template;

import java.util.Scanner;

public class ReadFromUser extends BookReader {
    private String text;

    @Override
    public void initialize() {
        System.out.println("Type a line of text: ");
        Scanner keyboard = new Scanner(System.in);
        text = keyboard.nextLine();
        System.out.println("Type another line: ");
        text += "\n" + keyboard.nextLine();
    }

    @Override
    public void startReading() {
        System.out.println(text);
    }

    @Override
    public void stopReading() {
        System.out.println("Reading complete.");
    }

    @Override
    public boolean isInteractive() {
        return true;
    }
}
