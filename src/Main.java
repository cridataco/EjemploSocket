import model.Client;
import model.Connection;
import model.Server;

public class Main {
    public static void main(String[] parameters) {
        System.out.println("Hello world!");
        if (parameters.length == 3) {


            System.out.println(parameters[0] + parameters[1] + " " + parameters[2]);
            String typeConnectio = parameters[0];
            int port = Integer.parseInt(parameters[2]);
            String host = parameters[1];
            if (typeConnectio.equalsIgnoreCase("server")) {
                Server server = new Server(host, port);
            }
            if (typeConnectio.equalsIgnoreCase("client")) {
                Client client = new Client(host, port);
            }
        }
        else {
            System.out.println("help");
            System.out.println("parameter : server / client");
        }
    }
}