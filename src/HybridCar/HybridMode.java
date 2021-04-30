package HybridCar;

public class HybridMode implements HybridModeTemplate{

	@Override
	public void secondaryBatteryLow(int mainBattery, int secondaryBattery) {
		System.out.println("Main battery has enough power. But secondary battery needs more charging.");
		System.out.println("Main Battery : -> " + mainBattery + "% Charged.");
		System.out.println("Secondary Battery : -> " + secondaryBattery + "% Charged.");	
	}

	@Override
	public void convertHybridMode(String currentMode) {
		if(currentMode.equals("Hybrid Mode")) {
			System.out.println("Keep Hybrid car mode.");
		}else {
			System.out.println("Convert from " + currentMode + " to hybrid car mode.");
		}
	}

	@Override
	public void startFuelEngine(String currentMode) {
		System.out.println("(For " + currentMode + ") Fuel Engine Started if engine is in sleep mode.");
	}

	@Override
	public void supplyFrontMotor(String currentMode) {
		System.out.println("Supply electricity to front motor of hybrid car.");
	}

	@Override
	public void useFuelEngine() {
		System.out.println("Continue to run fuel engine.");
	}

	@Override
	public void chargeWithMainBrake() {
		System.out.println("Main Generator charges battery.");
		System.out.println("Regenerative brake energy charges battery.");
	}

}
