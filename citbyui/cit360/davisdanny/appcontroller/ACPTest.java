package citbyui.cit360.davisdanny.appcontroller;

import citbyui.cit360.davisdanny.appcontroller.handlers.Setup;

public class ACPTest {

	public static void main(String[] args) {
		ApplicationController controller = new ApplicationController();
		View view = new View();
		SessionBean session = new SessionBean(controller,view);
		controller.addHandler("setup", new Setup(session));
		controller.handleRequest("Setup", null);
	}

}
