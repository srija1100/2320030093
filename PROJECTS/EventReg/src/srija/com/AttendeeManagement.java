package srija.com;

public interface AttendeeManagement {
	void registerAttendee(String eventName, String name, String email, String ticketType);
    Attendee getAttendee(String email);
}
