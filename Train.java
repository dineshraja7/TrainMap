package Train;
import java.util.*;
import java.util.HashMap;
public class Train{
	int trainNo;
	String trainName;
	String startingLocation;
	String destination;
	String startingTime;
	String arrivalTime;
    public HashMap<String,String> stopMap = new HashMap<>(); 
    

public HashMap<String,String> getStopMap(){
	return stopMap;
}	




public void initialize(int trNo,String trName,String strtngLoc,String arvlLoc,String strtTim, String arvlTim){
	this.trainNo = trNo;
	this.trainName = trName;
	this.startingLocation = strtngLoc;
	this.destination = arvlLoc;
	this.startingTime = strtTim;
	this.arrivalTime = arvlTim;
	
	}
	
	
	
	
public void print(){
	System.out.println("Train name:--->"+trainName);
	System.out.println("Train No:"+trainNo);
	System.out.println("Train Departure----->"+startingLocation);
	System.out.println("Train Destination---->"+destination);
	System.out.println("Time of departure--->"+startingTime);
	System.out.println("Time of Arrival at destination"+arrivalTime);
	
	for(Map.Entry<String,String>currStop:stopMap.entrySet()){
		System.out.println("Your stop code is -->"+currStop.getKey() + "Your Stop name is:--->" + currStop.getValue());
	}
    
    
}
public void addStop(HashMap stpMap){
	stopMap.putAll(stpMap);
}



}
