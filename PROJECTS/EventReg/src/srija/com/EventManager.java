package srija.com;
import java.util.HashMap;
import java.util.Map;
public class EventManager implements EventManagement{
	private Map<String, Event> events = new HashMap<>();

   
    public void createEvent(String name, String location, String date) {
        Event event = new Event(name, location, date);
        events.put(name, event);
    }

  
    public Event getEvent(String name) {
        return events.get(name);
    }
}
