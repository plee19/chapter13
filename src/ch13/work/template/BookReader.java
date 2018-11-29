package ch13.work.template;

import java.io.IOException;

public abstract class BookReader {
    abstract void initialize();
    abstract void startReading();
    abstract void stopReading();

    public final void readBook() {
        initialize();
        startReading();

        if (!isInteractive()) {
            stopReading();
        }
    }

    public boolean isInteractive() {
        return false;
    }
}
