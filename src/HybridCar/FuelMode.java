package HybridCar;

public class FuelMode implements FuelModeTemplate {

	@Override
	public void bothBatteryLow(int mainBattery, int secondaryBattery) {
		System.out.println("Main battery and secondary battery have low power level.");
		System.out.println("Main Battery : -> " + mainBattery + "% Charged");
		System.out.println("Secondary Battery : -> " + secondaryBattery + "% Charged");
	}

	@Override
	public void convertFuelMode(String currentMode) {
		if(currentMode.equals("Fuel Mode")) {
			System.out.println("Keep Fuel car mode");
		}else {
			System.out.println("Convert from " + currentMode + " to fuel car mode");
		}	
	}

	@Override
	public void cutElectricity(String currentMode) {
		System.out.println("(For " + currentMode + ") Fuel Engine Started if engine is in sleep mode.");
		System.out.println("(For " + currentMode + ") Cut Electricity to motor.");
	}

	@Override
	public void noSupply() {
				
	}

	@Override
	public void useFuelEngine() {
		System.out.println("Continue to run fuel engine.");
	}

	@Override
	public void chargeWithMainBrake() {
		System.out.println("Main Generator charges battery.");
		System.out.println("Regenrative brake energy charges battery.");
	}
	
}
