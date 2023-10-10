import java.util.HashSet;
import java.util.Set;
import java.time.LocalDateTime;
public class Flight {
    private String id;
    private int capacity;
    private String departurePoint;
    private String destination;
    private Set<User> passengers;
    private LocalDateTime departureTime;
    private LocalDateTime destinationTime;


    public Flight(){
        this.id=id;
        this.capacity = capacity;
        this.departurePoint = departurePoint;
        this.destination = destination;
        this.departureTime= departureTime;
        this.destinationTime=destinationTime;
        this.passengers = new HashSet<>();
    }
    public void addPasseneger(Passenger passenger){
        this.passengers.add(passenger);
    }

    public Set<User> getPassengers(){
        return passengers;
    }

    public String  getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getDeparturePoint() {
        return departurePoint;
    }

    public void setDeparturePoint(String departurePoint) {
        this.departurePoint = departurePoint;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Set<User> getPassengers(Passenger newPassenger) {
        return passengers;
    }

    public void setPassengers(Set<User> passengers) {
        this.passengers = passengers;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getDestinationTime() {
        return destinationTime;
    }

    public void setDestinationTime(LocalDateTime destinationTime) {
        this.destinationTime = destinationTime;
    }

}
