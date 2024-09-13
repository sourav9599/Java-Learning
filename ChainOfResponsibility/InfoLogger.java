package ChainOfResponsibility;

public class InfoLogger extends Logger{

    InfoLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(String logLevel, String message) {
        if(logLevel.equals("INFO")){
            System.out.println("INFO: " + message);
        }
        else {
            super.log(logLevel, message);
        }
    }
}
