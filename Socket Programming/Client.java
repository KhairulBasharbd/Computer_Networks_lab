
import java.net.*;
import java.io.*;
public class Client{

    public static void main(String[] args){
        try{
            Socket socket = new Socket("localhost",7500);
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            dos.writeUTF("Hellow MAN !!,   I am from Client..... ");
            
            String str = (String) dis.readUTF();
            System.out.println("Server :"+str);

            dos.flush();
            dos.close();
            socket.close();

        }catch (Exception e){ 
            System.out.println(e);
        }
    }

}


