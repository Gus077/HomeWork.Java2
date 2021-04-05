import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    static ServerSocket server;
    static Socket socket;
    static final int port = 8189;

    public static void main(String[] args) {
        try{
          server = new ServerSocket(port);
            System.out.println("Server started");

            socket = server.accept();
            System.out.println("Client connect");

            Scanner in = new Scanner(socket.getInputStream());
            Scanner inconsole = new Scanner(System.in);
            PrintWriter out = new PrintWriter(socket.getOutputStream(),true);

            Thread t1 = new Thread(() -> {
                while (true){
                    String str = inconsole.nextLine();

                    if(str.equals("/end")){
                        System.out.println("Client disconnect");
                        break;
                    }

                    out.println(str);
                }
            });

            t1.start();

                while (true){
                    String str = in.nextLine();

                    if(str.equals("/end")){
                        System.out.println("Client disconnect");
                        break;
                    }
                    System.out.println("Client: " + str);
                }




        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
