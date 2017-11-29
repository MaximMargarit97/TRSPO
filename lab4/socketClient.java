import java.net.*;
import java.io.*;

public class SocketClient {
    public static void main(String[] ar) {
        int port = 7777; 
        String address = "localhost";
        try {
            InetAddress ipAddress = InetAddress.getByName(address); 
            System.out.println("Connecting IP address " + address + " and port " + port);
            Socket socket = new Socket(ipAddress, port);

            InputStream sin = socket.getInputStream();
            OutputStream sout = socket.getOutputStream();
			
            DataInputStream in = new DataInputStream(sin);
            DataOutputStream out = new DataOutputStream(sout);

        
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            String message = null;

            while (true) {            
                System.out.println("Type message to server");
                message = keyboard.readLine(); 
                out.writeUTF(message); 
                out.flush(); 
                message = in.readUTF(); 
            	System.out.println("Server send: " + message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
