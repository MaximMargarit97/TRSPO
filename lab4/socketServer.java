import java.net.*;
import java.io.*;

public class SocketServer {
	public static void main(String[] ar)   {
		int port = 7777;
		try {
			ServerSocket server = new ServerSocket(port);
			System.out.println("Waiting client");
			Socket socket = server.accept(); 
			System.out.println("Connection");
			
			InputStream sin = socket.getInputStream();
			OutputStream sout = socket.getOutputStream();
			
			DataInputStream in = new DataInputStream(sin);
			DataOutputStream out = new DataOutputStream(sout);

			String message = null;
			while(true) {
				message = in.readUTF(); 
				System.out.println("Client send: " + message);
				out.writeUTF(message); 
				out.flush(); 
				System.out.println("Wait next line");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
