package citbyui.cit360.davisdanny.sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONInputStream;
import org.quickconnectfamily.json.JSONOutputStream;
import org.quickconnectfamily.json.ParseException;

public class TestServer {

	public static void main(String[] args) {
		new TestServer();
	}
	
	public TestServer(){
		try {
			ServerSocket aListeningSocket = new ServerSocket(9292);
			while (true) {
				SocketHandler handler = new SocketHandler(aListeningSocket.accept());
				Thread thread = new Thread(handler);
				thread.start();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
	}

	public class SocketHandler implements Runnable {

		Socket clientSocket;

		public SocketHandler(Socket newSocket) {
			clientSocket = newSocket;
		}

		@Override
		public void run(){
			try {

				JSONInputStream inFromClient = new JSONInputStream(clientSocket.getInputStream());
				JSONOutputStream outToClient = new JSONOutputStream(clientSocket.getOutputStream());

				while (true) {
					System.out.println("Waiting for message from client...");
					HashMap inMap = (HashMap) inFromClient.readObject();
					if (inMap.containsKey("type") && "Message".equals(inMap.get("type"))) {
						MessageBean bean = new MessageBean(inMap);
						System.out.println("New message: " + bean.getMessage());
					} else {
						System.out.println("Unknown map recieved: " + inMap);
					}
				}
			} catch (ParseException | IOException | JSONException e) {
				System.out.println("ParseException");
				System.out.println(e.getMessage());
			}

		}

	}
}
