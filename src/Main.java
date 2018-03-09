
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",1025);
            socket.close();
        } catch (Exception e) {

        }
    }
}
