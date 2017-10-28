package Game;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;

import javax.swing.*;
public class Gametest extends JPanel implements ActionListener, KeyListener {
	
	Timer t = new Timer(5, this);
	double x = 0, y = 0, velx =0  , vely = 0;
	
	public Gametest() {
		t.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.CYAN);
		g2.fill(new Rectangle.Double(x,y,30,30));
	
	}
	public void actionPerformed(ActionEvent e) {
		if(x < 0 || x > 760) {
			velx = -velx;
		}
		if (y < 0 || y > 560) {
			vely = -vely;
		}
		repaint();
		x += velx;
		y += vely;
		
	}
	public void up() {
		vely = -1.5;
		velx= 0;
	}
	public void down() {
		vely = 1.5;
		velx = 0;
		
	}
	public void left() {
		vely = 0;
		velx = -1.5;
	}
	public void right() {
		vely = 0;
		velx = 1.5;
	}
	public void leftdown() {
		vely = 1;
		velx = -1.5;
	}
	public void keyPressed (KeyEvent e) {
		int code = e.getKeyCode();
		if (code == KeyEvent.VK_UP) {
			up();
			
		}
		if (code == KeyEvent.VK_DOWN) {
			down();
			
		}
		if (code == KeyEvent.VK_LEFT) {
			left();
			
		}
		if (code == KeyEvent.VK_RIGHT) {
			right();
		}
		if (code == KeyEvent.VK_LEFT && KeyEvent.VK_DOWN) {
			leftdown();
			
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		int code = e.getKeyCode();
		if (code == KeyEvent.VK_UP) {
			velx = 0;
			vely = 0;
		}
		if (code == KeyEvent.VK_DOWN) {
			velx = 0;
			vely = 0;
			
		}
		if (code == KeyEvent.VK_LEFT) {
			velx = 0;
			vely = 0;
			
		}
		if (code == KeyEvent.VK_RIGHT) {
			velx = 0;
			vely = 0;
			
		}
	}

}
