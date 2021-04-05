import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    static ServerSocket server;
    static Socket socket;
    static final int port = 8189;

    public static void main(String[] args) {
        try{
            socket = new Socket("localhost",port);

            Scanner in = new Scanner(socket.getInputStream());
            Scanner inconsole = new Scanner(System.in);
            PrintWriter out = new PrintWriter(socket.getOutputStream(),true);

                Thread t1 = new Thread(() -> {
                    while (true){
                        String str = in.nextLine();
                        System.out.println(str);
                    }
                });
                t1.start();

                while (true){
                    String str = inconsole.nextLine();

                    if(str.equals("/end")){
                        System.out.println("Client disconnect");
                        break;
                    }

                    out.println("Client: " + str);
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

