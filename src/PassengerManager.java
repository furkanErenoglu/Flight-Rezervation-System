import java.util.Scanner;

public class PassengerManager {

    private AirLineManager airLineManager;
    public PassengerManager(AirLineManager airLineManager){
        this.airLineManager = airLineManager;
    }


    public void addPassanger(User user, Flight flight, String seatNumber, String passportNumber){
        Passenger passenger = new Passenger();
        passenger.setId(user.getId());
        passenger.setFullName(user.getFullName());
        passenger.setAge(user.getAge());
        passenger.setEmail(user.getEmail());
        passenger.setSeatNumber(seatNumber);
        passenger.setPassportNumber(passportNumber);
        System.out.println("Rezervation created: " + passenger.getFullName());
    }














}
