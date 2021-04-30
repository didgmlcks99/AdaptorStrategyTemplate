package HybridCar;

public class FuelAdaptor implements BaseCar {
	
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
		car.cutElectricity(currentMode);
	}

	@Override
	public void supplyElectricity() {
		car.noSupply();
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
