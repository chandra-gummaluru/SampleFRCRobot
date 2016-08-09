package commands.auto.defenses;

import commands.LowerArmCommand;
import commands.RaiseArmCommand;
import commands.auto.DriveDistanceCommand;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class CrossPortcullisCommand extends CommandGroup {

	public CrossPortcullisCommand() {
		// lower the arm.
		addSequential(new LowerArmCommand());

		// drive forward 1'.
		addSequential(new DriveDistanceCommand(12));

		// lower the arm.
		addSequential(new RaiseArmCommand());

		// drive forward.
		addSequential(new DriveDistanceCommand(50));
	}
}
