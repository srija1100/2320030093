package srija.com;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventManager eventManager = new EventManager();
        TicketManager ticketManager = new TicketManager();
        AttendeeManager attendeeManager = new AttendeeManager(eventManager, ticketManager);

     
        eventManager.createEvent("Tech Conference", "Convention Center", "2024-09-15");
        Event techConference = eventManager.getEvent("Tech Conference");
        ticketManager.addEvent(techConference);

    
        ticketManager.addTicket("Tech Conference", "VIP", 200.00, 50);
        ticketManager.addTicket("Tech Conference", "General", 100.00, 200);

    
        attendeeManager.registerAttendee("Tech Conference", "Alice Smith", "alice.smith@example.com", "VIP");

      
        Attendee attendee = attendeeManager.getAttendee("alice.smith@example.com");
        if (attendee != null) {
            System.out.println("Attendee: " + attendee.getName());
            System.out.println("Event: " + attendee.getEvent().getName());
            System.out.println("Ticket Type: " + attendee.getTicket().getTicketType());
        } else {
            System.out.println("Attendee not found.");
        }
	}

}
