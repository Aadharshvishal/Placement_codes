
class Train {
    int trainNo;
    String trainName;
    String source;
    String destination;
    int seats = 100;
    boolean isBooked = false;
    void bookTicket() {
        if (isBooked == false) {
            isBooked = true;
            seats--;
            System.out.println("Ticket booked successfully");
        } else {
            System.out.println("Seat already booked");
        }
    }
    void cancelTicket() {
        if (isBooked == true) {
            isBooked = false;
            seats++;
            System.out.println("Ticket cancelled successfully");
        } else {
            System.out.println("No booking found");
        }
    }
    void displayTrain() {
        System.out.println("Train No: " + trainNo);
        System.out.println("Train Name: " + trainName);
        System.out.println("From: " + source);
        System.out.println("To: " + destination);
        System.out.println("Available Seats: " + seats);
        System.out.println("Booked: " + isBooked);
    }
}
public class TrainSystem {
    public static void main(String[] args) {
        Train t1 = new Train();
        t1.trainNo = 101;
        t1.trainName = "Chennai Express";
        t1.source = "Chennai";
        t1.destination = "Delhi";
        t1.displayTrain();
        t1.bookTicket();
        t1.cancelTicket();
    }
}