package interfaces;

import interfaces.Logger;

public class SmsLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Sms Loglandı: "+ message);
    }
}
