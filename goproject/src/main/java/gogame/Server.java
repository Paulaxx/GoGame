package gogame;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Server {
	
	public static void main(String[] args) throws Exception {
        try (ServerSocket listener = new ServerSocket(58901)) {
            System.out.println("Go server is running...");
            ExecutorService pool = Executors.newFixedThreadPool(200);
            while (true) {
                //Game game = new Game();
                //pool.execute(game.new Player(listener.accept(), 'X'));
                //pool.execute(game.new Player(listener.accept(), 'O'));
            }
        }
    }


}
