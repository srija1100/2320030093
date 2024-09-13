package srija.com;

public interface Ticketing {
	void addTicket(String eventName, String ticketType, double price, int quantity);
    Ticket getTicket(String eventName, String ticketType);
}
