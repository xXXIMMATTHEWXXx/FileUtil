package code.matthew.fileutil.command;

import java.io.File;

import code.matthew.fileutil.ICommand;

public class IsValidDir implements ICommand {

	@Override
	public String getCommand() {
		return "-isValidDictonary";
	}

	@Override
	public void processComannd(String[] args) {
		if(args[0] != null)  {
			File f = new File(args[0]);
			
			if(f.exists()) {
				System.out.println(args[0] + " is a valid dictonary!");
				System.exit(0);
			} else {
				System.out.println(args[0] + " is not a valid dictonary!");
				System.exit(0);
			}
		}
	}

}