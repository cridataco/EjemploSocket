package model;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Server {

    private Connection conn;
    private Socket socket;
    private DataOutputStream dataOutputStream;
    private DataInputStream dataInputStream;

    public Server(String host, int port){
        init(host, port);
        System.out.println("Estado del server " + conn);
        sendInfo();
    }

    public void init(String host, int port){
        conn = new Connection();
        conn.setHost(host);
        conn.setPort(port);
        conn.setType("server");
        conn.connectServer();
    }

    public void sendInfo(){
        try {
            conn.ss.accept();
            socket = conn.ss.accept();
            dataOutputStream = new DataOutputStream(conn.cs.getOutputStream());
            for (int i = 0; i < 10; i++) {
                dataOutputStream.writeUTF("hola");
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
