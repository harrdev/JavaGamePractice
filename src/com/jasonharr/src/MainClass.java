package com.jasonharr.src;

// JFrame for window
import javax.swing.JFrame;

public class MainClass {

	public static void main(String[] args) {
		// Create game window with JFrame
		JFrame frame = new JFrame();
		// Ensures program terminates when program is closed by clicking X button
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Create game object
		frame.add(new Game());
		frame.pack();
		frame.setSize(640, 480);
		frame.setResizable(false);
		// Make sure window appears in center of screen
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
