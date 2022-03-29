package com.jasonharr.src.input;

import java.awt.Graphics2D;
import java.util.LinkedList;

import com.jasonharr.src.objects.Enemy;

public class Controller {

	LinkedList<Enemy> e = new LinkedList<Enemy>();

	Enemy TempEnemy;

	public Controller() {
		addEnemy(new Enemy(100, 100));
		addEnemy(new Enemy(200, 200));
	}

	public void draw(Graphics2D g2d) {
		for (int i = 0; i < e.size(); i++) {
			TempEnemy = e.get(i);
			TempEnemy.draw(g2d);
		}
	}

	public void update() {
		for (int i = 0; i < e.size(); i++) {
			TempEnemy = e.get(i);
			if (TempEnemy.x < 20) {
				removeEnemy(TempEnemy);
			}
			TempEnemy.update();
		}

	}

	public void addEnemy(Enemy enemy) {
		e.add(enemy);
	}

	public void removeEnemy(Enemy enemy) {
		e.remove(enemy);
	}

}
