package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class LoggerHandler {
    private static final Logger logger = Logger.getLogger(LoggerHandler.class);

    static
    {
        try {
            String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            String logFile = "logs/logfile"+timeStamp+".log";
            FileAppender fileAppend = new FileAppender(new PatternLayout("%d{ISO8601} %-5p %c - %m%n"), logFile, true);
            logger.addAppender(fileAppend);
        } catch (Exception e) {
            logger.error("Failed to initialize logger file appender", e);
        }
    }

    /*
     * A. Method Name: trace
     * B. Author Name: Tanu Shree Das
     * C. Description: This method is used for logging a trace-level message. The input message is captured and logged at the TRACE level using a logger.
     * D. Parameters: message(String)
     * E. Return Type: void
     */
    public static void trace(String message)
    {
        logger.trace(message);
    }

    /*
     * A. Method Name: debug
     * B. Author Name: Tanu Shree Das
     * C. Description: This method is used for logging a debug-level message. The input message is captured and logged at the DEBUG level using a logger.
     * D. Parameters: message(String)
     * E. Return Type: void
     */
    public static void debug(String message)
    {
        logger.debug(message);
    }

    /*
     * A. Method Name: info
     * B. Author Name: Tanu Shree Das
     * C. Description: This method is used for logging a info-level message. The input message is captured and logged at the INFO level using a logger.
     * D. Parameters: message(String)
     * E. Return Type: void
     */
    public static void info(String message)
    {
        logger.info(message);
    }

    /*
     * A. Method Name: warn
     * B. Author Name: Tanu Shree Das
     * C. Description: This method is used for logging a warn-level message. The input message is captured and logged at the WARN level using a logger.
     * D. Parameters: message(String)
     * E. Return Type: void
     */
    public static void warn(String message)
    {
        logger.warn(message);
    }

    /*
     * A. Method Name: error
     * B. Author Name: Tanu Shree Das
     * C. Description: This method is used for logging a error-level message. The input message is captured and logged at the ERROR level using a logger.
     * D. Parameters: message(String)
     * E. Return Type: void
     */
    public static void error(String message)
    {
        logger.error(message);
    }

    /*
     * A. Method Name: fatal
     * B. Author Name: Tanu Shree Das
     * C. Description: This method is used for logging a fatal-level message. The input message is captured and logged at the FATAL level using a logger.
     * D. Parameters: message(String)
     * E. Return Type: void
     */
    public static void fatal(String message)
    {
        logger.fatal(message);
    }

    /*
     * A. Method Name: createLog
     * B. Author Name: Tanu Shree Das
     * C. Description: This method is a placeholder for creating a logger instance with the specified name. It currently throws an UnsupportedOperationException, indicating that the functionality has not yet been implemented.
     * D. Parameters: name(String)
     * E. Return Type: Logger
     */
    public static Logger createLog(String name) {
        throw new UnsupportedOperationException("Unimplemented method 'createLog'");
    }
}