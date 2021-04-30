package AdaptingCar;

public class ElectricAdaptor implements MyCar {
	
	private ElectricModeTemplate car;
	
	public ElectricAdaptor(ElectricModeTemplate car) {
		this.car = car;
	}

	@Override
	public void batteryStatus(int mainBattery, int secondaryBattery) {
		car.bothBatteryEnough(mainBattery, secondaryBattery);
	}

	@Override
	public void convertMode(String currentMode) {
		car.convertElectricMode(currentMode);
	}

	@Override
	public void gearSetting(String currentMode) {
		car.cutFuelEngine(currentMode);
	}

	@Override
	public void supplyElectricity(String currentMode) {
		car.supplyFrontRearMotor(currentMode);
	}

	@Override
	public void runningEngine() {
		car.noFuelEngine();
	}

	@Override
	public void chargeBattery() {
		car.chargeBrake();
	}

}
