import java.time.LocalDateTime;
import java.util.*;

public class FlightManager {
    private AirLineManager airLineManager;
    private PassengerManager passengerManager;
    private Map<String,Object> flights = new HashMap<>();
    public FlightManager(AirLineManager airLineManager, PassengerManager passengerManager){
        this.airLineManager = airLineManager;
        this.passengerManager = passengerManager;
        this.flights = new HashMap<>();
    }



    public void addFlight( String id,int capacity, DateDto dateDto,String departurePoint, String destination,int duration){
        AirLine airLine1 = airLineManager.getAirLineByID(id);

        if(airLine1.getId().equals(id) ){
            Flight flight = new Flight(airLine1.getId(),capacity, departurePoint, destination, LocalDateTime.of(dateDto.getYear(),dateDto.getMonth(),dateDto.getDay(),dateDto.getHour(),dateDto.getMinute()),LocalDateTime.of(dateDto.getYear(),dateDto.getMonth(),dateDto.getDay(),dateDto.getHour()+duration,dateDto.getMinute()));
            flights.put(flight.getId(),flight);
            System.out.println("Flight added: " + airLine1.getName() +" id: "+ flight.getId());
        }

    }



    public void buyTicket(User user, Flight flight,String seatNumber, String passportNumber){
        if (flight.getCapacity()>0 && flights.containsKey(flight.getId()) ){
            passengerManager.addPassanger(user, flight, seatNumber, passportNumber);
            flight.getPassengers().add(user);
            flight.setCapacity(flight.getCapacity()-1);
            System.out.println("Capacity: "+ flight.getCapacity());

        }
    }
    public Flight getFlight(String id) {
        return (Flight) flights.get(id);
    }



}
