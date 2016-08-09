package subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ArmSubsystem extends Subsystem {

	// components
	private Victor armMotor = new Victor(4);

	private DigitalInput upperArmLimit = new DigitalInput(7);
	private DigitalInput lowerArmLimit = new DigitalInput(8);

	public void moveArmUp() {
		armMotor.set(1.0);
	}

	public void moveArmDown() {
		armMotor.set(-1.0);
	}

	public void stopArm() {
		armMotor.set(0.0);
	}

	public boolean isArmAtUpperLimit() {
		return upperArmLimit.get();
	}

	public boolean isArmAtLowerLimit() {
		return lowerArmLimit.get();
	}

	@Override
	protected void initDefaultCommand() {
		// Do nothing.
	}

}
