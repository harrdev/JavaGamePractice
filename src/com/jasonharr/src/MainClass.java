package com.jasonharr.src;

// JFrame for window
import javax.swing.JFrame;

public class MainClass {

	public static final int WIDTH = 640, HEIGHT = 480;

	public static void main(String[] args) {
		// Create game window with JFrame
		JFrame frame = new JFrame();
		// Ensures program terminates when program is closed by clicking X button
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Create game object
		frame.add(new Game());
		frame.pack();
		frame.setSize(WIDTH, HEIGHT);
		frame.setResizable(false);
		// Make sure window appears in center of screen
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
