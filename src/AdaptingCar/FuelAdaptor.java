package AdaptingCar;

public class FuelAdaptor implements MyCar {
	
	private FuelModeTemplate car;
	
	public FuelAdaptor(FuelModeTemplate car) {
		this.car = car;
	}

	@Override
	public void batteryStatus(int mainBattery, int secondaryBattery) {
		car.bothBatteryLow(mainBattery, secondaryBattery);
	}

	@Override
	public void convertMode(String currentMode) {
		car.convertFuelMode(currentMode);
	}

	@Override
	public void gearSetting(String currentMode) {
		car.startFuelEngine(currentMode);
	}

	@Override
	public void supplyElectricity(String currentMode) {
		car.cutElectricitySupply(currentMode);
	}

	@Override
	public void runningEngine() {
		car.useFuelEngine();
	}

	@Override
	public void chargeBattery() {
		car.chargeWithMainBrake();
	}

}
