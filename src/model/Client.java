package model;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Client {

     Connection conn;
     DataOutputStream dataOutputStream;
     DataInputStream dataInputStream;

    public Client(String host, int port){
        init(host, port);
        recive();
    }

    public void recive(){
        try {
            dataInputStream = new DataInputStream(conn.cs.getInputStream());
            String aux = "";
            while ((aux = dataInputStream.readUTF()) != null) {
                System.out.println(aux);
            }
            System.out.println("fin de la transmi");
            dataInputStream.close();
        } catch (IOException e){
        throw new RuntimeException(e);
    }
    }

    public void init(String host, int port){
        conn = new Connection();
        conn.setHost(host);
        conn.setPort(port);
        conn.setType("client");
        conn.connectServer();
    }
}
