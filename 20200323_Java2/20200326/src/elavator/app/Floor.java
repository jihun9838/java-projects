package elavator.app;

import java.util.ArrayList;
import java.util.List;

public class Floor extends Keyword {
	private int way;
	private List<Passenger> passenger;



	public Floor(int way, List<Passenger> passenger) {
		super();
		this.way = way;
		this.passenger = new ArrayList<Passenger>();
	}
	Floor(){
		this(0, null);
	}



	public int getWay() {
		return way;
	}
	public void setWay(int way) {
		this.way = way;
	}
	public List<Passenger> getPassenger() {
		return passenger;
	}
	public void setPassenger(List<Passenger> passenger) {
		this.passenger = passenger;
	}


	public void addWatingPassenger(Passenger passenger) {
		this.passenger.add(passenger);
	}

	public void checkInPassenger(Passenger passenger) {
		if(this.passenger.contains(passenger)) 
			this.passenger.remove(passenger);			
	}

}
