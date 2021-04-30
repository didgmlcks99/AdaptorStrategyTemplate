package HybridCar;

public interface ElectricModeTemplate {

	void bothBatteryEnough(int mainBattery, int secondaryBattery);
	void convertElectricMode(String currentMode);
	void cutFuelEngine(String currentMode);
	void supplyFrontRearMotor(String currentMode);
	void noFuelEngine();
	void chargeBrake();

}
