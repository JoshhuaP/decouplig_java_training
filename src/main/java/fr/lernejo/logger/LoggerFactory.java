package fr.lernejo.logger;

public class LoggerFactory {
    public static Logger getLogger(String name) {
        return new FileLogger("C:\\COURS\\4A\\TPInterfaces\\decoupling_java_training\\test.txt");
    }
}
