package AdaptingCar;

public class ElectricMode implements ElectricModeTemplate{

	@Override
	public void bothBatteryEnough(int mainBattery, int secondaryBattery) {
		System.out.println("Main and Secondary Batteries have enough power.");
		System.out.println("Main Battery : -> " + mainBattery + "% Charged.");
		System.out.println("Secondary Battery : -> " + secondaryBattery + "% Charged.");
	}

	@Override
	public void convertElectricMode(String currentMode) {
		if(currentMode.equals("Electric Mode")) {
			System.out.println("Keep Electric car mode.");
		}else {
			System.out.println("Convert from " + currentMode + " to electric car mode.");
		}
	}

	@Override
	public void cutFuelEngine(String currentMode) {
		System.out.println("(For " + currentMode + ") Cut fuel to engine.");
	}

	@Override
	public void supplyFrontRearMotor(String currentMode) {
		System.out.println("Supply electricity to front and rear motors of electric car.");
	}

	@Override
	public void noFuelEngine() {
				
	}

	@Override
	public void chargeBrake() {
		System.out.println("Regenerative brake energy charges battery.");
	}

}
