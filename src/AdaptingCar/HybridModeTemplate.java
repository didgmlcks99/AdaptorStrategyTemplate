package AdaptingCar;

public interface HybridModeTemplate{

	void secondaryBatteryLow(int mainBattery, int secondaryBattery);
	void convertHybridMode(String currentMode);
	void startFuelEngine(String currentMode);
	void supplyFrontMotor(String currentMode);
	void useFuelEngine();
	void chargeWithMainBrake();
	
}
