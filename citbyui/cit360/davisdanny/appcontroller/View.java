package citbyui.cit360.davisdanny.appcontroller;

import java.util.Scanner;

public class View {
	
	Scanner scanner;

	public View() {
		scanner = new Scanner(System.in);
	}
	
	public int getInputInt() {

		while (true) {
			String command = scanner.nextLine();

			try {
				int intCommand = Integer.parseInt(command);
				return intCommand;
			} catch (NumberFormatException e) {
				display("Please enter a number");
			}
		}
	}
	
	public String prompt(String message){
		display(message);
		return scanner.nextLine();
	}
	
	public void display(String message) {
		System.out.println(message);
	}
}
