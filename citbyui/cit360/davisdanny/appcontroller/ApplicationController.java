package citbyui.cit360.davisdanny.appcontroller;

import java.util.HashMap;

import citbyui.cit360.davisdanny.appcontroller.handlers.Handler;

public class ApplicationController {

	HashMap<String,Handler> handlerMap = new HashMap<String,Handler>();
	
	//fetch the appropriate handler, and set it the parameters
	public void handleRequest(String command,String[] parameters){
		command = command.toLowerCase();
		handlerMap.get(command).handle(parameters);
	}
	
	//take a single string, split it up, then send it to the main handleRequest method
	public void handleRequest(String command){
		command = command.trim();
		if (command.contains(" ")) {
			String[] parts = command.split(" ");
			String[] args = new String[parts.length - 1];
			command = parts[0];
			for (int i = 1; i < parts.length; i++) {
				args[i - 1] = parts[i];
			}
			handleRequest(command, args);
		} else {
			handleRequest(command, new String[0]);
		}
	}
	
	public void addHandler(String key,Handler newHandler){
		handlerMap.put(key, newHandler);
	}
	
}
