package HybridCar;

import java.util.Random;

public class AdaptorMain {
	public static int mainBattery;
	public static int secondaryBattery;
	public static BaseCar car = new FuelAdaptor(new FuelMode());
	public static String currentMode = "Fuel Mode";

	public static void main(String[] args) {
//		for(int i=0; i<10; i++) {
			randomGenerator();
			String initCurrentMode = currentMode;
//			setMode();
			car.batteryStatus(mainBattery, secondaryBattery);
			car.convertMode(currentMode);
			car.gearSetting(currentMode);
			car.supplyElectricity();
			car.runningEngine();
			car.chargeBattery();
			currentSpeed(initCurrentMode);
//		}
	}
	
	public static void randomGenerator() {
		Random rand = new Random();
		mainBattery = rand.nextInt(70) + 30;
		secondaryBattery = rand.nextInt(70) + 30;
	}
	
//	public static void setMode() {
//		if(mainBattery >= 75 && secondaryBattery >=75) {
//			car = new ElectricAdaptor(new ElectricMode());
//			currentMode = "Electric Mode";
//		}else if(mainBattery >= 75 && secondaryBattery < 75) {
//			car = new HybridAdaptor(new HybridMode());
//			currentMode = "Hybrid Mode";
//		}else if(mainBattery < 75 && secondaryBattery < 75) {
//			car = new FuelAdaptor(new FuelMode());
//			currentMode = "Fuel Mode";
//		}
//	}
	
	public static void currentSpeed(String currentMode) {
		Random rand = new Random();
		int speed = rand.nextInt(20) + 40;
		System.out.println("(" + currentMode + ") Current Speed : " + speed);
	}

}