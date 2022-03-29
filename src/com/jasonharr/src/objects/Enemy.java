package com.jasonharr.src.objects;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

import com.jasonharr.src.GlobalPosition;
import com.jasonharr.src.MainClass;

public class Enemy extends GlobalPosition {

	int speed = 5;

	private String image = "/images/enemy.png";

	public Enemy(int x, int y) {
		super(x, y);
	}

	public void draw(Graphics2D g2d) {
		g2d.drawImage(getEnemyImage(), x, y, null);
	}

	public void update() {
		x += speed;
		if (x > MainClass.WIDTH - 60) {
			speed = -5;
		}
		if (x < 0) {
			speed = 5;
		}
	}

	public Image getEnemyImage() {
		ImageIcon i = new ImageIcon(getClass().getResource(image));
		return i.getImage();
	}
}
