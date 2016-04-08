package citbyui.cit360.davisdanny.sockets;

import java.net.Socket;
import java.util.Scanner;

import org.quickconnectfamily.json.JSONInputStream;
import org.quickconnectfamily.json.JSONOutputStream;

public class TestClient {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		try {
			Socket toServer = new Socket("localhost",9292);
			
			JSONInputStream inFromServer = new JSONInputStream(toServer.getInputStream());
			JSONOutputStream outToServer = new JSONOutputStream(toServer.getOutputStream());
			
			MessageBean message = new MessageBean("Test Message");
			
			outToServer.writeObject(message);
			message.setMessage("Test Message 2");
			outToServer.writeObject(message);
			while(true){
				message.setMessage(scanner.nextLine());
				outToServer.writeObject(message);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
