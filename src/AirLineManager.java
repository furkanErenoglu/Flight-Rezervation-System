import java.util.HashSet;
import java.util.Set;

public class AirLineManager {

    private Set<AirLine> airLines = new HashSet<>();


    public Set<AirLine> getAirLines(){
        return airLines;
    }



    public void addAirLine(AirLine airLine){
        airLines.add(airLine);
        System.out.println("Airline company added :" + airLine.getName());
    }


    public AirLine getAirLineByID(String id){
        AirLine airline = null;
        for(AirLine airLine : airLines){

            if (airLine.getId().equals(id)){
                System.out.println("AirLines company is "+ airLine.getName());
                airline = airLine;
                break;
            }
        }
        return airline;
    }



}
