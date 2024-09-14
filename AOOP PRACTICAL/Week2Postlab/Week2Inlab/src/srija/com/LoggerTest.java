package srija.com;

public class LoggerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Logger1 logger = Logger1.getInstance();
        
        // Log a message
        logger.log("This is a test log message.");
        
        // Get another instance of Logger1 (should be the same instance)
        Logger1 anotherLogger = Logger1.getInstance();
        
        // Log another message using the second instance
        anotherLogger.log("This is another test log message.");

        // Verify that both instances are the same
        if (logger == anotherLogger) {
            System.out.println("Logger1 is a singleton. Both instances are the same.");
        } else {
            System.out.println("Logger1 is not a singleton. Instances are different.");
        }
	}

}
