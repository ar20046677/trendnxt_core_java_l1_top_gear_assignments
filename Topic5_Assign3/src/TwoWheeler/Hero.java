package TwoWheeler;

import Automobile.Vehicle;

public class Hero extends Vehicle{
	private int currentSpeed = 0;
	
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

	public int speed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	
	public void radio(){
		System.out.println("Controlling radio.");
	}
	
}
