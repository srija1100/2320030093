package srija.com;
import java.util.HashMap;
import java.util.Map;
public class TicketManager implements Ticketing {
	private Map<String, Event> events = new HashMap<>();

    @Override
    public void addTicket(String eventName, String ticketType, double price, int quantity) {
        Event event = events.get(eventName);
        if (event != null) {
            Ticket ticket = new Ticket(ticketType, price, quantity);
            event.addTicket(ticket);
        }
    }

    @Override
    public Ticket getTicket(String eventName, String ticketType) {
        Event event = events.get(eventName);
        if (event != null) {
            return event.getTicket(ticketType);
        }
        return null;
    }

    public void addEvent(Event event) {
        events.put(event.getName(), event);
    }
}
