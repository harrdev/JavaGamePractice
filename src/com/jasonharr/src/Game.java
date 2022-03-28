package com.jasonharr.src;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.jasonharr.src.input.KeyInput;
import com.jasonharr.src.objects.Player;

public class Game extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private String background = "/images/background.png";
	// Game Loop
	Timer gameLoopTimer;
	Player p;

	public Game() {
		// Ensures the window is focused so you don't have to click on the window first
		// to click something else
		setFocusable(true);
		// 10 = how many milliseconds
		gameLoopTimer = new Timer(10, this);
		gameLoopTimer.start();
		p = new Player(120, 100);

		addKeyListener(new KeyInput(p));
	}

	// Function to allow to paint on screen
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// Convert Graphics g variable into Graphics2D
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(getBackgroundImage(), 0, 0, null);
		p.draw(g2d);
	}

	public Image getBackgroundImage() {
		ImageIcon i = new ImageIcon(getClass().getResource(background));
		return i.getImage();
	}

	// Runs this code every 10 milliseconds. ActionListener requires this, it is
	// implemented in the class
	@Override
	public void actionPerformed(ActionEvent e) {
		p.update();
		repaint();
	}
}
