package com.ocp.formation.Exo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;

import javax.swing.JOptionPane;

/**
 * Trivial client for the date server.
 */
public class DateClient {

	/**
	 * Runs the client as an application. First it displays a dialog box asking for
	 * the IP address or hostname of a host running the date server, then connects
	 * to it and displays the date that it serves.
	 */
	public static void main(String[] args) throws IOException {
		String msg = JOptionPane.showInputDialog("Send Message to service on port :" + DateServer.PORT );
		msg += " (" + new Date() + ")";
		Socket socket = new Socket(DateServer.HOST, DateServer.PORT);
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
		socket.getOutputStream().write(msg.getBytes());
		out.write(msg);
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

		msg = in.readLine();
		System.out.println(msg);
		JOptionPane.showMessageDialog(null, msg);

		socket.close();
		System.exit(0);
	}
}
