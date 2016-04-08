package citbyui.cit360.davisdanny.sockets;

import java.io.Serializable;
import java.util.HashMap;

public class MessageBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String message;
	private String type;

	public MessageBean(String message) {
		setMessage(message);
		setType("Message");
	}
	
	public MessageBean(HashMap map){
		setMessage((String) map.get("message"));
	}
	
	public static long getUID(){
		return serialVersionUID;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
