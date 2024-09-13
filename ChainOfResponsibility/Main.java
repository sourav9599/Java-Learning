package ChainOfResponsibility;

public class Main {

    public static void main(String[] args){
        Logger logger = new InfoLogger( new DebugLogger( new ErrorLogger(null)));
        logger.log("INFO", "Info Message");
        logger.log("ERROR", "ERROR Message");
        logger.log("DEBUG", "Debug Message");
    }




}
