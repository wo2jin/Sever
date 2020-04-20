package ws2.java2.entity;

import ws2.java2.entity.Vehicle;

public class Car{
	
	private int mileage;
	private boolean available;
	
	public Car() {}
	
	public Car(String modelName, int maxSpeed, int numberLimit,int mileage) {
		super(modelName,maxSpeed,numberLimit);
		this.mileage = mileage;
	}

	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" 모 델 명 : " + getModelName());
		System.out.println(" 최고속도 : " + getMaxSpeed() + "km/h");
		System.out.println(" 최대정원 : " + getNumberLimit() + "명");
		System.out.println(" 평균연비 : " + mileage + "km/l");
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getNumberLimit() {
		return numberLimit;
	}

	public void setNumberLimit(int numberLimit) {
		this.numberLimit = numberLimit;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
}
