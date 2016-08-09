package commands.auto;

import edu.wpi.first.wpilibj.command.Command;
import robot.Robot;

public class DriveDistanceCommand extends Command {

	double distance;

	double initialDistance;

	public DriveDistanceCommand(double distance) {
		this.distance = distance;
	}

	@Override
	protected void initialize() {
		initialDistance = Robot.chassisSubsystem.getDistance();
	}

	@Override
	protected void execute() {
		Robot.chassisSubsystem.setSpeed(1.0, 1.0);
	}

	@Override
	protected boolean isFinished() {
		return Robot.chassisSubsystem.getDistance() >= initialDistance + distance;
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
