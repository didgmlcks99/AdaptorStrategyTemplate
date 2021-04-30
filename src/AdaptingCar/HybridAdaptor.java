package AdaptingCar;

public class HybridAdaptor implements MyCar {

	private HybridModeTemplate car;
	
	public HybridAdaptor(HybridModeTemplate car) {
		this.car = car;
	}
	
	@Override
	public void batteryStatus(int mainBattery, int secondaryBattery) {
		car.secondaryBatteryLow(mainBattery, secondaryBattery);
	}

	@Override
	public void convertMode(String currentMode) {
		car.convertHybridMode(currentMode);
	}

	@Override
	public void gearSetting(String currentMode) {
		car.startFuelEngine(currentMode);
	}

	@Override
	public void supplyElectricity(String currentMode) {
		car.supplyFrontMotor(currentMode);
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
