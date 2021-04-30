package HybridCar;

public interface FuelModeTemplate {

	void bothBatteryLow(int mainBattery, int secondaryBattery);
	void convertFuelMode(String currentMode);
	void cutElectricity(String currentMode);
	void noSupply();
	void useFuelEngine();
	void chargeWithMainBrake();
	
}
