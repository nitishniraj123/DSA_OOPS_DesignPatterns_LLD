package LLD.LoggerSystemDesign;

public class DebugLogger extends Logger{
    DebugLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(String logLevel, String message) {
        if(logLevel.equals(debugLog)){
            System.out.println("this is DEBUG logger "+message);
        }
        else{
            super.log(logLevel,message);
        }    }
}
