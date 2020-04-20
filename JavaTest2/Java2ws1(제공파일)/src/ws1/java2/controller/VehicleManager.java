package ws1.java2.controller;

import ws1.java2.entity.*;

public class VehicleManager {
	Airplane[] airplaneArr;
	Car[] carArr;
	Ship[] shipArr;
	
	public VehicleManager() {
		airplaneArr = new Airplane[2];
		carArr = new Car[3];
		shipArr = new Ship[2];
		
		airplaneArr[0] = new Airplane("����747",1300,300,4);
		
		
		airplaneArr[1] = new Airplane("F-16",1600,1,1);
		
		
		carArr[0] = new Car();
		carArr[0].setModelName("�ҳ�Ÿ3");
		carArr[0].setMaxSpeed(180);
		carArr[0].setNumberLimit(5);
		carArr[0].setMileage(10);
		
		carArr[1] = new Car();
		carArr[1].setModelName("Ƽ��");
		carArr[1].setMaxSpeed(130);
		carArr[1].setNumberLimit(4);
		carArr[1].setMileage(15);

		carArr[2] = new Car();
		carArr[2].setModelName("��Ÿ����");
		carArr[2].setMaxSpeed(150);
		carArr[2].setNumberLimit(10);
		carArr[2].setMileage(11);

		shipArr[0] = new Ship();
		shipArr[0].setModelName("ũ����2");
		shipArr[0].setMaxSpeed(30);
		shipArr[0].setNumberLimit(400);
		shipArr[0].setReplacement(35000);
			
		shipArr[1] = new Ship();
		shipArr[1].setModelName("��ƿ����");
		shipArr[1].setMaxSpeed(25);
		shipArr[1].setNumberLimit(150);
		shipArr[1].setReplacement(15000);
	}
	
	public void displayVehicles(String title) {
		System.out.println(title);
		
		for (int inx = 0 ; inx < airplaneArr.length ; inx++) {
			airplaneArr[inx].displayInfo();
			airplaneArr[inx].setAvailable(true);
		}
		
		for (int inx = 0 ; inx < carArr.length ; inx++) {
			carArr[inx].displayInfo();
			carArr[inx].setAvailable(true);
		}
		
		for (int inx = 0 ; inx < shipArr.length ; inx++) {
			shipArr[inx].displayInfo();
			shipArr[inx].setAvailable(true);
		}
		
		System.out.println();
	}
}

