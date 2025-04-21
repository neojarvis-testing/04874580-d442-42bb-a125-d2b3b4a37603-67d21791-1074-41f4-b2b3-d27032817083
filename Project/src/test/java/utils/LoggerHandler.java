package utils;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;

public class LoggerHandler {
    private static final Logger logger = Logger.getLogger(LoggerHandler.class);

    static
    {
        try {
            String logFile = "logs/logfile.log";
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void trace(String message)
    {
        logger.trace(message);
    }
    public static void debug(String message)
    {
        logger.debug(message);
    }
    public static void info(String message)
    {
        logger.info(message);
    }
    public static void warn(String message)
    {
        logger.warn(message);
    }
    public static void error(String message)
    {
        logger.error(message);
    }
    public static void fatal(String message)
    {
        logger.fatal(message);
    }
}
