package Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;
import javax.swing.Timer;

public class gametest extends JPanel implements KeyListener, ActionListener, MouseListener {
	Timer t = new Timer(5, this);
	double x, y, velx, vely;
	
	private static gametest object = new gametest();
	object.addMouseListener();
	
	public gametest() {
		t.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		addMouseListener(this);
	}
	private static int d,a;
	public void draw(int xx, int yy ) {
		d = xx;
		a = yy;
		repaint();
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.CYAN);
		g2.fill(new Ellipse2D.Double(x, y, 50, 50));
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(x < 0 || x > 650) {
			velx = -velx;
		}
		if (y < 0 || y > 650) {
			vely = -vely;
		}
		repaint();
		x += velx;
		y += vely;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		if (code == KeyEvent.VK_RIGHT) {
			velx= 1.8;
		}
		if (code == KeyEvent.VK_D) {
			velx = 1.8;
		}
		if (code == KeyEvent.VK_LEFT) {
			velx = -1.8;
		}
		if (code == KeyEvent.VK_A) {
			velx = -1.8;
		}
		if (code == KeyEvent.VK_UP) {
			vely = -1.8;
		}
		if (code == KeyEvent.VK_W) {
			vely = -1.8;
		}
		if (code == KeyEvent.VK_DOWN) {
			vely = 1.8;
		}
		if (code == KeyEvent.VK_S) {
			vely = 1.8;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int code = e.getKeyCode();
		if (code == KeyEvent.VK_RIGHT) {
			velx= 0;
		}
		if (code == KeyEvent.VK_D){
			velx = 0;
		}
		if (code == KeyEvent.VK_LEFT) {
			velx = 0;
		}
		if (code == KeyEvent.VK_A) {
			velx = 0;
		}
		if (code == KeyEvent.VK_UP) {
			vely = 0;
		}
		if (code == KeyEvent.VK_W) {
			vely = 0;
		}
		if (code == KeyEvent.VK_DOWN) {
			vely = 0;
		}
		if (code == KeyEvent.VK_S) {
			vely = 0;
		}
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		d = e.getX();
		a = e.getY();
		object.draw(x, y);
		}
	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		
	}

}
