package ChainOfResponsibility;

public class Logger {

    Logger nextLogger;
    Logger(Logger nextLogger){
        this.nextLogger = nextLogger;
    }
    public void log(String logLevel, String message){
        if(this.nextLogger != null){
            this.nextLogger.log(logLevel, message);
        }
    }

}
