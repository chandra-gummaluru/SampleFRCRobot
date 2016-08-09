package commands.auto;

import commands.LowerArmCommand;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import robot.Robot;

public class CrossPlatformCommand extends Command {

	@Override
	protected void initialize() {
		Scheduler.getInstance().add(new LowerArmCommand());
	}

	@Override
	protected void execute() {
		Robot.chassisSubsystem.setSpeed(1.0, 1.0);
	}

	@Override
	protected boolean isFinished() {
		return Robot.chassisSubsystem.isNearPlatform();
	}

	@Override
	protected void end() {
		Robot.chassisSubsystem.setSpeed(0.0, 0.0);
	}

	@Override
	protected void interrupted() {
		// Do nothing.
	}

}
