package srija.com;

public class Ticket {
	private String ticketType;
    private double price;
    private int quantityAvailable;

    public Ticket(String ticketType, double price, int quantityAvailable) {
        this.ticketType = ticketType;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
    }

    public String getTicketType() { return ticketType; }
    public double getPrice() { return price; }
    public int getQuantityAvailable() { return quantityAvailable; }
}
