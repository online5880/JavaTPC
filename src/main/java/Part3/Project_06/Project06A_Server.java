package Part3.Project_06;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Project06A_Server {
    public static void main(String[] args) {
        ServerSocket ss = null;
        try {
            ss = new ServerSocket(9999);
            System.out.println("Server ready...");
        }catch (Exception e){
            e.printStackTrace();
        }
        while (true){
            try {
                Socket socket = ss.accept();
                System.out.println("client connect success!");
                InputStream inputStream = socket.getInputStream();
                DataInputStream dataInputStream = new DataInputStream(inputStream);
                String message = dataInputStream.readUTF();

                OutputStream outputStream = socket.getOutputStream();
                DataOutputStream dos = new DataOutputStream(outputStream);
                dos.writeUTF("[ECHO] :"+ message +"(from Server!)");

                dos.close();
                dataInputStream.close();
                socket.close();
                System.out.println("client socket close...");
            }catch (Exception e){
                e.printStackTrace();
            }
        } // * while
    } // * main
} // * class
