package srija.com;

public class Attendee {
	private String name;
    private String email;
    private Event event;
    private Ticket ticket;

    public Attendee(String name, String email, Event event, Ticket ticket) {
        this.name = name;
        this.email = email;
        this.event = event;
        this.ticket = ticket;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public Event getEvent() { return event; }
    public Ticket getTicket() { return ticket; }
}
