package TwoWheeler;

import Automobile.Vehicle;

public class Honda extends Vehicle{
	int currentSpeed;
	public int speed(){
		return currentSpeed;
	}
	
	public int cdPlayer(){
		
		return 1;
	}

	@Override
	public String modelName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String registrationNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String ownerName() {
		// TODO Auto-generated method stub
		return null;
	}
}
