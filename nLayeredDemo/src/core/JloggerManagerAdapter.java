package core;

import jLogger.JloggerManager;

public class JloggerManagerAdapter implements LoggerService{

    @Override
    public void logToSystem(String message) {
        JloggerManager jloggerManager = new JloggerManager();
        jloggerManager.log(message);
    }
}
