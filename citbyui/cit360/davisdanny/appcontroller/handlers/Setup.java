package citbyui.cit360.davisdanny.appcontroller.handlers;

import citbyui.cit360.davisdanny.appcontroller.ApplicationController;
import citbyui.cit360.davisdanny.appcontroller.SessionBean;
import citbyui.cit360.davisdanny.appcontroller.View;

public class Setup implements Handler {
	SessionBean session;

	public Setup(SessionBean session) {
		this.session = session;
	}

	@Override
	public void handle(String[] args) {
		View view = session.getView();
		ApplicationController controller = session.getController();
		view.display("setting up...");
		controller.addHandler("close", new Close());
		controller.addHandler("menu", new Menu(session));
		controller.handleRequest("menu main");
	}

}
