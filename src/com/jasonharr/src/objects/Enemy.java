package com.jasonharr.src.objects;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

import com.jasonharr.src.GlobalPosition;

public class Enemy extends GlobalPosition {

	private String image = "/images/enemy.png";

	public Enemy(int x, int y) {
		super(x, y);
	}

	public void draw(Graphics2D g2d) {
		g2d.drawImage(getEnemyImage(), x, y, null);
	}

	public void update() {

	}

	public Image getEnemyImage() {
		ImageIcon i = new ImageIcon(getClass().getResource(image));
		return i.getImage();
	}
}
