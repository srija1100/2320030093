package srija.com;
import java.util.HashMap;
import java.util.Map;
public class Event {
	private String name;
    private String location;
    private String date;
    private Map<String, Ticket> tickets = new HashMap<>();

    public Event(String name, String location, String date) {
        this.name = name;
        this.location = location;
        this.date = date;
    }

    public String getName() { return name; }
    public String getLocation() { return location; }
    public String getDate() { return date; }

    public void addTicket(Ticket ticket) {
        tickets.put(ticket.getTicketType(), ticket);
    }

    public Ticket getTicket(String ticketType) {
        return tickets.get(ticketType);
    }
}
