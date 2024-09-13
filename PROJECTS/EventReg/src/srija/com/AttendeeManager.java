package srija.com;
import java.util.HashMap;
import java.util.Map;
public class AttendeeManager implements AttendeeManagement{
	private Map<String, Attendee> attendees = new HashMap<>();
    private EventManager eventManager;
    private TicketManager ticketManager;

    public AttendeeManager(EventManager eventManager, TicketManager ticketManager) {
        this.eventManager = eventManager;
        this.ticketManager = ticketManager;
    }

    public void registerAttendee(String eventName, String name, String email, String ticketType) {
        Event event = eventManager.getEvent(eventName);
        Ticket ticket = ticketManager.getTicket(eventName, ticketType);
        if (event != null && ticket != null) {
            Attendee attendee = new Attendee(name, email, event, ticket);
            attendees.put(email, attendee);
        }
    }

 
    public Attendee getAttendee(String email) {
        return attendees.get(email);
    }
}
