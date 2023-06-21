package LLD.LoggerSystemDesign;

import com.sun.xml.internal.ws.util.StringUtils;

public class WarnLogger extends Logger{

    WarnLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(String logLevel, String message) {
        if(logLevel.equals(warnLog)){
            System.out.println("this is WARN logger "+message);
        }
        else{
            super.log(logLevel,message);
        }
    }
}
