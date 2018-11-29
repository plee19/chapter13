package ch13.work.template;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadfromFile extends BookReader{
    BufferedReader file;

    @Override
    void initialize() {
        try {
            file = new BufferedReader(new FileReader("out/production/chapter13/ch13/work/template/prideprejudice"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    void startReading() {
        try {
            while (file.readLine() != null) {
                try {
                    System.out.println(file.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    void stopReading() {
        try {
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
