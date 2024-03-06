import java.time.LocalDate;  
import java.util.ArrayList;  
import java.util.Scanner;  
  
class Event {  
    private String eventID;  
    private String eventName;  
    private String eventVenue;  
    private LocalDate eventDate;  
    private ArrayList<String> eventAttendees;  
  
    public Event(String eventID, String eventName, String eventVenue, LocalDate eventDate) {  
        this.eventID = eventID;  
        this.eventName = eventName;  
        this.eventVenue = eventVenue;  
        this.eventDate = eventDate;  
        this.eventAttendees = new ArrayList<>();  
    }  
  
    public String getEventID() {  
        return eventID;  
    }  
  
    public void setEventID(String eventID) {  
        this.eventID = eventID;  
    }  
  
    public String getEventName() {  
        return eventName;  
    }  
  
    public void setEventName(String eventName) {  
        this.eventName = eventName;  
    }  
  
    public String getEventVenue() {  
        return eventVenue;  
    }  
  
    public void setEventVenue(String eventVenue) {  
        this.eventVenue = eventVenue;  
    }  
  
    public LocalDate getEventDate() {  
        return eventDate;  
    }  
  
    public void setEventDate(LocalDate eventDate) {  
        this.eventDate = eventDate;  
    }  
  
    public ArrayList<String> getEventAttendees() {  
        return eventAttendees;  
    }  
  
    public void addAttendee(String attendee) {  
        eventAttendees.add(attendee);  
    }  
  
    public void removeAttendee(String attendee) {  
        eventAttendees.remove(attendee);  
    }  
  
    public void updateAttendee(String oldAttendee, String newAttendee) {  
        int index = eventAttendees.indexOf(oldAttendee);  
        if (index != -1) {  
            eventAttendees.set(index, newAttendee);  
        }  
    }  
  
    public String findAttendee(String attendee) {  
        if (eventAttendees.contains(attendee)) {  
            return "Attendee found!";  
        } else {  
            return "Attendee not found!";  
        }  
    }  
  
    public int getTotalAttendees() {  
        return eventAttendees.size();  
    }  
  
    @Override  
    public String toString() {  
        return "Event{" +  
                "eventID='" + eventID + '\'' +  
                ", eventName='" + eventName + '\'' +  
                ", eventVenue='" + eventVenue + '\'' +  
                ", eventDate=" + eventDate +  
                ", eventAttendees=" + eventAttendees +  
                '}';  
    }  
}  
  
public class EventOrganizer {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
  
        System.out.print("Enter event ID: ");  
        String eventID = scanner.nextLine();  
  
        System.out.print("Enter event name: ");  
        String eventName = scanner.nextLine();  
  
        System.out.print("Enter event venue: ");  
        String eventVenue = scanner.nextLine();  
  
        System.out.print("Enter event date (yyyy-MM-dd): ");  
        String eventDateString = scanner.nextLine();  
        LocalDate eventDate = LocalDate.parse(eventDateString);  
  
        Event event = new Event(eventID, eventName, eventVenue, eventDate);  
  
        while (true) {  
            System.out.println("\nEvent Management Menu:");  
            System.out.println("1. Add attendee");  
            System.out.println("2. Remove attendee");  
            System.out.println("3. Update attendee");  
            System.out.println("4. Find attendee");  
            System.out.println("5. Display event details");  
            System.out.println("6. Exit");  
  
            System.out.print("Enter your choice: ");  
            int choice = scanner.nextInt();  
            scanner.nextLine(); // Consume the newline left after nextInt()  
  
            switch (choice) {  
                case 1:  
                    System.out.print("Enter attendee name: ");  
                    String attendee = scanner.nextLine();  
                    event