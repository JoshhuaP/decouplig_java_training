package fr.lernejo.logger;

public abstract class LoggerFactory implements Logger {
    Logger logger;
    public Logger getLogger(String name) {
        return logger;
    }
}
