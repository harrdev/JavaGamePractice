package com.jasonharr.src.objects;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

import com.jasonharr.src.GlobalPosition;

public class Player extends GlobalPosition {

	private String playerimage = "/images/player.png";

	public Player(int x, int y) {
		super(x, y);
	}

	public void update() {
		x += 2;
	}

	public void draw(Graphics2D g2d) {
		g2d.drawImage(getPlayerImage(), x, y, null);
	}

	public Image getPlayerImage() {
		ImageIcon i = new ImageIcon(getClass().getResource(playerimage));
		return i.getImage();
	}
}
