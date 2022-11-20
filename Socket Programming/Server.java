
import java.net.*;
import java.io.*;
public class Server{
    public static void main(String[] args){
        try{
            ServerSocket ss = new ServerSocket(7500);
            Socket socket = ss.accept();
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());


            String str = (String) dis.readUTF();
            System.out.println("Client : " +str);

            dos.writeUTF(" I am from Server..... ");

            ss.close();

        }catch(Exception e){
             System.out.println(e);
        }

    }
}