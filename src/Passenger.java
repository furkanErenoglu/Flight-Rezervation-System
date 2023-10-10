import java.util.HashSet;
import java.util.Set;

public class Passenger extends User{
    private String passportNumber;
    private String seatNumber;
    private String flightId;

    public Passenger(User user, String seatNumber, String passportNumber) {

    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }
}
