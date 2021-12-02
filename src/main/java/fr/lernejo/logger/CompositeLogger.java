package fr.lernejo.logger;

import java.io.IOException;
import java.nio.file.Files;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

public class CompositeLogger implements  Logger {
    private final Logger logger;
    private final Logger log;

    public CompositeLogger(Logger logger, Logger logge) {
        this.logger = logger;
        this.log = logge;
    }

    @Override
    public void log(String message) {
        logger.log(message);
        log.log(message);
    }
}
