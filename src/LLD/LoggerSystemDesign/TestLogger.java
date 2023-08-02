package LLD.LoggerSystemDesign;

public class TestLogger {
    public static void main(String[] args) {
        Logger logger = new InfoLogger(new WarnLogger(new DebugLogger(new ErrorLogger(null))));
        logger.log(Logger.infoLog,"here is info log");
        logger.log(Logger.warnLog,"here is warning log");
        logger.log(Logger.debugLog,"here is debug log");
        logger.log(Logger.errorLog,"here is error log");

    }
}
