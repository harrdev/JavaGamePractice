package com.jasonharr.src.objects;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

import com.jasonharr.src.GlobalPosition;

public class Player extends GlobalPosition {

	private String playerimage = "/images/player.png";
	int velX = 0;
	int velY = 0;

	public Player(int x, int y) {
		super(x, y);
	}

	public void update() {
		x += velX;
		y += velY;

		// Collision with outside border
		if (x < 0) {
			x = 0;
		}
		if (y < 0) {
			y = 0;
		}
		if (x > 640 - 74) {
			x = 640 - 74;
		}
		if (y > 480 - 102) {
			y = 480 - 102;
		}
	}

	public void draw(Graphics2D g2d) {
		g2d.drawImage(getPlayerImage(), x, y, null);
	}

	public Image getPlayerImage() {
		ImageIcon i = new ImageIcon(getClass().getResource(playerimage));
		return i.getImage();
	}

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_D) {
			velX = 5;
		} else if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_A) {
			velX = -5;
		} else if (key == KeyEvent.VK_DOWN || key == KeyEvent.VK_S) {
			velY = 5;
		} else if (key == KeyEvent.VK_UP || key == KeyEvent.VK_W) {
			velY = -5;
		}
	}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_D) {
			velX = 0;
		} else if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_A) {
			velX = 0;
		} else if (key == KeyEvent.VK_DOWN || key == KeyEvent.VK_S) {
			velY = 0;
		} else if (key == KeyEvent.VK_UP || key == KeyEvent.VK_W) {
			velY = 0;
		}
	}
}
