package srija.com;

public interface EventManagement {
	void createEvent(String name, String location, String date);
    Event getEvent(String name);
}
