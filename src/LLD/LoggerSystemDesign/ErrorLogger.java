package LLD.LoggerSystemDesign;

public class ErrorLogger extends Logger{
    public ErrorLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(String logLevel, String message) {
        if(logLevel.equals(errorLog)){
            System.out.println("this is ERROR logger "+message);
        }
        else{
            super.log(logLevel,message);
        }    }
}
