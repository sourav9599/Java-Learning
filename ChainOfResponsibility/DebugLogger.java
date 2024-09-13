package ChainOfResponsibility;

public class DebugLogger extends Logger{
    DebugLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(String logLevel, String message) {
        if(logLevel.equals("DEBUG")){
            System.out.print("DEBUG: " + message);
        }
        else {
            super.log(logLevel, message);
        }
    }
}
