package core.adapters
        ;

import JlLogger.JLoggerManager;
import core.services.LoggerService;

public class JloggerManagerAdapter implements LoggerService {
    @Override
    public void logToSystem(String message) {
        JLoggerManager jLoggerManager = new JLoggerManager();
        jLoggerManager.log(message);
    }
}
