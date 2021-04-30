package HybridCar;

public interface BaseCar {
	void batteryStatus(int mainBattery, int secondaryBattery);
	void convertMode(String currentMode);
	void gearSetting(String currentMode);
	void supplyElectricity();
	void runningEngine();
	void chargeBattery();
}
