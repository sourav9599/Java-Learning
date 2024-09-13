package ChainOfResponsibility;

public class ErrorLogger extends Logger{
    ErrorLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(String logLevel, String message) {
        if(logLevel.equals("ERROR")){
            System.out.print("ERROR: " + message);
        }
        else {
            super.log(logLevel, message);
        }
    }
}
