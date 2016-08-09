package commands.auto.defenses;

import commands.LowerArmCommand;
import commands.RaiseArmCommand;
import commands.auto.CrossPlatformCommand;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class CrossLowBarCommand extends CommandGroup {

	public CrossLowBarCommand() {
		addSequential(new LowerArmCommand());
		addSequential(new CrossPlatformCommand());
		addSequential(new RaiseArmCommand());
	}
}
