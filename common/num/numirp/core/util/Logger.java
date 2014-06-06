package num.numirp.core.util;

import num.numirp.lib.Reference;
import org.apache.logging.log4j.LogManager;

public class Logger {
    private static final org.apache.logging.log4j.Logger cwLogger = LogManager.getLogger(Reference.MOD_ID);

    public static void init() {
    }

    public static void log(org.apache.logging.log4j.Level level, String message) {
        cwLogger.log(level, message);
    }

    public static void error(String message) {
        log(org.apache.logging.log4j.Level.ERROR, message);
    }

    public static void warn(String message) {
        log(org.apache.logging.log4j.Level.WARN, message);
    }

    public static void info(String message) {
        log(org.apache.logging.log4j.Level.INFO, message);
    }

    public static void debug(String message) {
        log(org.apache.logging.log4j.Level.WARN, message);  //TODO: DO THE THING WITH log4j.properities!
    }
}