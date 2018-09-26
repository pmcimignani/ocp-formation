package com.ocp.formation.Exo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * A TCP server that runs on port 9090. When a client connects, it sends the
 * client the current date and time, then closes the connection with that
 * client. Arguably just about the simplest server you can write.
 */
public class DateServer {
	public final static int PORT = 9091;
	public static String HOST = "localhost";

	/**
	 * Runs the server.
	 */
	public static void main(String[] args) throws IOException {
		ServerSocket listener = new ServerSocket(PORT);
		System.out.println("Server started!");
		int idx = 0;
		try {
			while (true) {
				Socket socket = listener.accept();
				try {
					PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
					out.println("Message #" + ++idx + " received\n\r");
					BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					String msg = in.readLine();
					System.out.println("Message #" + idx + ": " + msg);

				} finally {
					socket.close();
				}
			}
		} finally {
			listener.close();
		}
	}
}