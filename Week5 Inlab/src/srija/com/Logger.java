package srija.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Logger {
	 private List<Command> commands = new ArrayList<>();

	    public void addCommand(Command command) {
	        commands.add(command);
	    }

	    public void processCommands() {
	        Iterator<Command> iterator = commands.iterator();
	        while (iterator.hasNext()) {
	            Command command = iterator.next();
	            command.execute("INFO: This is an info message");
	            command.execute("DEBUG: This is a debug message");
	            command.execute("ERROR: This is an error message");
	        }
	    }
}
