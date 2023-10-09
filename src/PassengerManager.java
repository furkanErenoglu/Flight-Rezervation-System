import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PassengerManager {
private List<Passenger> passangers = new ArrayList<>();
    private AirLineManager airLineManager;
    public PassengerManager(AirLineManager airLineManager){
        this.airLineManager = airLineManager;
    }


    public void addPassanger(User user, String seatNumber, String passportNumber){
        Passenger passenger = new Passenger();
        passenger.setId(user.getId());
        passenger.setFullName(user.getFullName());
        passenger.setAge(user.getAge());
        passenger.setEmail(user.getEmail());
        passenger.setSeatNumber(seatNumber);
        passenger.setPassportNumber(passportNumber);
        passangers.add(passenger);
        System.out.println("Rezervation created: " + passenger.getFullName());
    }

    public void getAllPassangers(){
        for (Passenger passenger:passangers){
            System.out.println(passenger.getFullName());
        }

    }














}
