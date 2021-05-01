package interfaces;

import interfaces.Logger;

public class FileLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("File Loglandı: "+message);
    }
}
