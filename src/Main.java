public class Main {
    public static void main(String[] args) {

        UserManager userManager = new UserManager();
        AirLineManager airLineManager = new AirLineManager();


        User user = new User();
        user.setId("27878769194");
        user.setFullName("Selin Samir");
        user.setEmail("user1@gmail.com");
        user.setAge(26);

        userManager.addUser(user);

        userManager.getUserById("27878769194");

        User newUser = new User();
        newUser.setId("27878859194");
        newUser.setFullName("Adam Annhold");
        newUser.setEmail("user2@gmail.com");
        newUser.setAge(22);

        userManager.addUser(newUser);


        AirLine airLine = new AirLine();
        airLine.setId("16934568798");
        airLine.setName("Pegasus");


        airLineManager.addAirLine(airLine);

        airLineManager.getAirLineByID("16934568798");


        AirLine newAirLine = new AirLine();
        newAirLine.setId("79834328798");
        newAirLine.setName("Türk Hava Yolları");


        airLineManager.addAirLine(newAirLine);

        DateDto date = new DateDto();
        date.setYear(2023);
        date.setMonth(11);
        date.setDay(25);
        date.setHour(18);
        date.setMinute(30);

        PassengerManager passengerManager = new PassengerManager(airLineManager);
        FlightManager flightManager = new FlightManager(airLineManager,passengerManager);



        flightManager.addFlight("79834328798",300,date,"Ankara","Istanbul",1);
        flightManager.addFlight("16934568798",11,date,"Ankara", "Istabul",1);




        flightManager.buyTicket(user,"79834328798","THY-1","1234567892");
        flightManager.buyTicket(newUser,"16934568798","THY-2","1234567879");


        System.out.println(passengerManager.getAllPassangers());

        System.out.println(flightManager.getFlights());

        System.out.println(flightManager.getPassengersByFlightId("79834328798"));
        System.out.println(flightManager.getPassengersByFlightId("16934568798"));

    }
}