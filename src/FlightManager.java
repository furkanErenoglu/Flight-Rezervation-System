import java.time.LocalDateTime;
import java.util.*;

public class FlightManager {
    private AirLineManager airLineManager;
    private PassengerManager passengerManager;
    private Map<String, Flight> flights = new HashMap<>();

    public FlightManager(AirLineManager airLineManager, PassengerManager passengerManager){
        this.airLineManager = airLineManager;
        this.passengerManager = passengerManager;
    }


    public Map<String , Flight> getFlights(){
        return flights;
    }



    public void addFlight( String id,int capacity, DateDto dateDto,String departurePoint, String destination,int duration){
        AirLine airLine1 = airLineManager.getAirLineByID(id);

        Flight flight = new Flight();
        dateDto.setYear(dateDto.getYear());
        flight.setId(id);
        flight.setCapacity(capacity);
        flight.setDeparturePoint(departurePoint);
        flight.setDestination(destination);
        flight.setDepartureTime(LocalDateTime.of(dateDto.getYear(), dateDto.getMonth(), dateDto.getDay(), dateDto.getHour(), dateDto.getMinute()));
        flight.setDestinationTime(LocalDateTime.of(dateDto.getYear(), dateDto.getMonth(), dateDto.getDay(), dateDto.getHour() + duration, dateDto.getMinute()));

        flights.put(flight.getId(),flight);
        System.out.println("Flight added: " + airLine1.getName() +" id: "+ flight.getId());
    }



    public void buyTicket(User user, String flightId,String seatNumber, String passportNumber){
        Flight flight = getFlightById(flightId);
        if (flight!=null){
            if (flight.getCapacity()>0 ){
                Passenger newPassenger = new Passenger(user, seatNumber, passportNumber);
                passengerManager.addPassanger(user, flightId, seatNumber, passportNumber);
                flight.getPassengers().add(newPassenger);
                flight.setCapacity(flight.getCapacity()-1);
                System.out.println("Capacity: "+ flight.getCapacity());

            }
        }
    }


    public Map<String, Flight> getFlightsListById(String id) {
            return flights;
    }

    public Flight getFlightById(String id){
        if (flights.containsKey(id)){
            return (Flight) flights.get(id);
        }
        return null;
    }

    public Set<User> getPassengersByFlightId(String id){
        Set<User> passengers = new HashSet<>();

        for (Flight flight: getFlights().values()){
            if (flight.getId().equals(id)){
                passengers.addAll(flight.getPassengers());
                System.out.println(flight.getId());
            }
        }
        return passengers;
    }


}
