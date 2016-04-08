package citbyui.cit360.davisdanny.appcontroller.handlers;

import citbyui.cit360.davisdanny.appcontroller.SessionBean;
import citbyui.cit360.davisdanny.appcontroller.View;

public class Menu implements Handler {
	SessionBean session;

	public Menu(SessionBean session) {
		this.session = session;
	}

	@Override
	public void handle(String[] args) {
		displayMenu(args[0]);
	}

	public void displayMenu(String[] args) {
		View view = session.getView();
		int i = 0;
		for (String option : args) {
			view.display((i + 1) + ": " + option);
			i++;
		}
		while (true) {
			int command = view.getInputInt();
			if (command > args.length) {
				view.display(command + " is too high. Please enter a number that corrosponds to a command.");
			} else if (command <= 0) {
				view.display(
						"Numbers lower than 1 are not supported. Please enter a number that corrosponds to a command.");
			} else {
				session.getController().handleRequest(args[command - 1]);
				break;
			}
		}
	}

	public void displayMenu(String menuName) {
		switch (menuName.toLowerCase()) {
		case "main":
			displayMenu(new String[] { "Close", "menu test" });
			break;
		case "test":
			displayMenu(new String[] { "menu Main" });
			break;
		default:
			System.out.println("menu \""+menuName+"\" not found.");
		}
	}
	
}
