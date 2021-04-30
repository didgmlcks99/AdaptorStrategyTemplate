package AdaptingCar;

public interface FuelModeTemplate {

	void bothBatteryLow(int mainBattery, int secondaryBattery);
	void convertFuelMode(String currentMode);
	void startFuelEngine(String currentMode);
	void cutElectricitySupply(String currentMode);
	void useFuelEngine();
	void chargeWithMainBrake();
	
}
