package model;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Connection {

    protected ServerSocket ss;
    protected Socket cs;
    private String type;
    private String host;
    private int port;

    public Connection() {

    }

    public void connectServer() {
        try {
            switch (type) {
                case "server": {
                    ss = new ServerSocket(12345);
                    ss.accept();
                    cs = new Socket();
                    break;
                }
                case "client": {
                    cs = new Socket(host, port);
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void send(String value){
        //cs.
    }

    public String recive(String value){
        return value;
    }
}
