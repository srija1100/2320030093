package srija.com;

public class Main {
	 public static void main(String[] args) {
	        
	        LogHandler infoHandler = new InfoHandler();
	        LogHandler debugHandler = new DebugHandler();
	        LogHandler errorHandler = new ErrorHandler();

	      
	        infoHandler.setNextHandler(debugHandler);
	        debugHandler.setNextHandler(errorHandler);

	      
	        Command infoCommand = new LogCommand(infoHandler);
	        Command debugCommand = new LogCommand(debugHandler);
	        Command errorCommand = new LogCommand(errorHandler);

	     
	        Logger logger = new Logger();
	        logger.addCommand(infoCommand);
	        logger.addCommand(debugCommand);
	        logger.addCommand(errorCommand);

	      
	        System.out.println("Processing INFO level messages:");
	        logger.addCommand(new LogCommand(infoHandler)); // Re-adding for demonstration
	        logger.processCommands();

	        System.out.println("\nProcessing DEBUG level messages:");
	        logger.addCommand(new LogCommand(debugHandler)); // Re-adding for demonstration
	        logger.processCommands();

	        System.out.println("\nProcessing ERROR level messages:");
	        logger.addCommand(new LogCommand(errorHandler)); // Re-adding for demonstration
	        logger.processCommands();
	    }
}
