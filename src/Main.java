public class Main {
    public static void main(String[] args) {

        UserManager userManager = new UserManager();
        AirLineManager airLineManager = new AirLineManager();
        PassengerManager passengerManager = new PassengerManager(airLineManager);
        FlightManager flightManager = new FlightManager(airLineManager,passengerManager);


        User user1 = new User();
        user1.setId("27878769194");
        user1.setFullName("Selin Samir");
        user1.setEmail("user1@gmail.com");
        user1.setAge(26);

        userManager.addUser(user1);

        userManager.getUserById("27878769194");

        User user2 = new User();
        user2.setId("27878859194");
        user2.setFullName("Adam Annhold");
        user2.setEmail("user2@gmail.com");
        user2.setAge(22);

        userManager.addUser(user2);


        AirLine airLine1 = new AirLine();
        airLine1.setId("16934568798");
        airLine1.setName("Pegasus");


        airLineManager.addAirLine(airLine1);

        airLineManager.getAirLineByID("16934568798");


        AirLine airLine2 = new AirLine();
        airLine2.setId("79834328798");
        airLine2.setName("Türk Hava Yolları");


        airLineManager.addAirLine(airLine2);

        DateDto dateDto1 = new DateDto();
        dateDto1.setYear(2023);
        dateDto1.setMonth(11);
        dateDto1.setDay(25);
        dateDto1.setHour(18);
        dateDto1.setMinute(30);


        flightManager.addFlight("79834328798",300,dateDto1,"Ankara","Istanbul",1);
        flightManager.addFlight("16934568798",11,dateDto1,"Ankara", "Istabul",1);




        flightManager.buyTicket(user1,flightManager.getFlight("79834328798"),"THY-1","1234567892");
        flightManager.buyTicket(user2,flightManager.getFlight("16934568798"),"THY-2","1234567879");







    }
}