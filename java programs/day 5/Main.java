import java.net.*;
public class Main extends InetAddress{
    public static void main(String[] args) throws UnknownHostException {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost.getHostAddress());
            
        } catch (UnknownHostException e) {
            System.out.println("hello");
        }
        

    }
}