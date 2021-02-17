package pong;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Graphics;

public class Pong extends JFrame {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	static int WIDTH = 700, HEIGHT = 500;

	public static void main(String[] args) {
		Pong tennis = new Pong();
		tennis.setVisible(true);
		tennis.setTitle("Pong");
		tennis.setBounds(0, 0, WIDTH, HEIGHT);
	}

	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, WIDTH, HEIGHT);
	}

	public void update(Graphics g) {
		paint(g);
	}

}
