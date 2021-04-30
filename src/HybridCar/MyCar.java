package HybridCar;

public interface MyCar {
	void batteryStatus(int mainBattery, int secondaryBattery);
	void convertMode(String currentMode);
	void gearSetting(String currentMode);
	void supplyElectricity(String currentMode);
	void runningEngine();
	void chargeBattery();
}
