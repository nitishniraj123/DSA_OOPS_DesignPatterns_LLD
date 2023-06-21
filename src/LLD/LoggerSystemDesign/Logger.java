package LLD.LoggerSystemDesign;

import java.util.Objects;

public abstract class Logger {
    public static String infoLog  = "INFO";
    public static String debugLog = "DEBUG";
    public static String errorLog = "ERROR";
    public static String warnLog  = "WARN";

    Logger nextLogger;

    Logger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void log(String logLevel , String message ){
        if(!Objects.isNull(nextLogger)){
            nextLogger.log(logLevel,message);
        }
    }
}
