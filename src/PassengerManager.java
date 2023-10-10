import java.util.*;

public class PassengerManager {
    private List<Passenger> passangers = new ArrayList<>();
    private AirLineManager airLineManager;



    public void addPassanger(User user, String  flightId, String seatNumber, String passportNumber){
        Passenger passenger = new Passenger(user, seatNumber, passportNumber);
        passenger.setId(user.getId());
        passenger.setFullName(user.getFullName());
        passenger.setAge(user.getAge());
        passenger.setEmail(user.getEmail());
        passenger.setSeatNumber(seatNumber);
        passenger.setPassportNumber(passportNumber);
        passenger.setFlightId(flightId);
        passangers.add(passenger);
        System.out.println("Rezervation created: " + passenger.getFullName());
    }

    public PassengerManager(AirLineManager airLineManager){
        this.airLineManager = airLineManager;

    }


    public List<Passenger> getAllPassangers(){
        return passangers;

    }


}
