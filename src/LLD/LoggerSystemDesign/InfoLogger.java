package LLD.LoggerSystemDesign;

public class InfoLogger extends Logger{

    public InfoLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(String logLevel, String message) {
        if(logLevel.equals(infoLog)){
            System.out.println("this is INFO logger "+message);
        }
        else{
            super.log(logLevel,message);
        }    }
}
