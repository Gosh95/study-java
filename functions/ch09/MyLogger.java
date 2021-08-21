package ch09;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {
    Logger logger = Logger.getLogger("mylogger");
    private static MyLogger instance = new MyLogger();

    public static final String errorLog = "log.txt";
    public static final String fineLog = "fine.txt";
    public static final String warningLog = "warning.txt";

    private FileHandler logFile = null;
    private FileHandler fineFile = null;
    private FileHandler warningFile = null;

    private MyLogger() {
        try {

            logFile = new FileHandler(errorLog, true);
            fineFile = new FileHandler(fineLog, true);
            warningFile = new FileHandler(warningLog, true);

        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        logFile.setFormatter(new SimpleFormatter());
        fineFile.setFormatter(new SimpleFormatter());
        warningFile.setFormatter(new SimpleFormatter());

        logFile.setLevel(Level.ALL);
        fineFile.setLevel(Level.FINE);
        warningFile.setLevel(Level.WARNING);

        logger.addHandler(fineFile);
        logger.addHandler(warningFile);
        logger.addHandler(logFile);

    }

    public static MyLogger getLogger() {
        if (instance == null) {
            instance = new MyLogger();
        }

        return instance;
    }

    public void log(String message) {
        logger.finest(message);
        logger.finer(message);
        logger.fine(message);
        logger.config(message);
        logger.info(message);
        logger.warning(message);
        logger.severe(message);
    }

    public void fine(String message) {
        logger.fine(message);
    }

    public void warning(String message) {
        logger.warning(message);
    }

}
