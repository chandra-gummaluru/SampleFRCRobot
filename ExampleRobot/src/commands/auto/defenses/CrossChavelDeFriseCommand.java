package commands.auto.defenses;

import commands.LowerArmCommand;
import commands.RaiseArmCommand;
import commands.auto.DriveDistanceCommand;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class CrossChavelDeFriseCommand extends CommandGroup {

	public CrossChavelDeFriseCommand() {
		// raise the arm.
		addSequential(new RaiseArmCommand());

		// drive forward 1'.
		addSequential(new DriveDistanceCommand(12));

		// lower the arm.
		addSequential(new LowerArmCommand());

		// drive forward and raise the arm.
		addSequential(new DriveDistanceCommand(50));
		addParallel(new RaiseArmCommand());
	}
}
