package fr.lernejo.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Predicate;

public class FilteredLogger implements Logger {
    private final Logger delegate;
    private Predicate<String> condition;
    String callerClass;

    public FilteredLogger(Logger delegate, Predicate<String> condition) {
        this.delegate = delegate;
        this.condition = condition;
    }

    @Override
    public void log(String message) {
        condition = messages -> !message.contains("simulation");
        if (message.contains("simulation")) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd' 'HH:mm:ss.SSS");
            delegate.log(LocalDateTime.now().format(formatter) + " " + callerClass + " " + message);
        }
    }
}
