package robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import oi.OI;
import subsystems.ArmSubsystem;
import subsystems.ChassisSubsystem;
import subsystems.ShooterSubsystem;

public class Robot extends IterativeRobot {

	// subsystems
	public static ChassisSubsystem chassisSubsystem;
	public static ShooterSubsystem shooterSubsystem;
	public static ArmSubsystem armSubsystem;

	// oi
	public static OI oi;

	@Override
	public void robotInit() {
		chassisSubsystem = new ChassisSubsystem();
		shooterSubsystem = new ShooterSubsystem();
		armSubsystem = new ArmSubsystem();

		oi = new OI();
	}

	public void autonomousInit() {
		// get the auto command.
		Command autoCommand = null;

		// schedule the command.CrossChavelDeFriseCommand.java
		Scheduler.getInstance().add(autoCommand);
	}

	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	public void teleopInit() {
		// Do nothing.
	}

	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	public void disabledInit() {
		// Do nothing.
	}

	public void disabledPeriodic() {
		// Do nothing.
	}

}
