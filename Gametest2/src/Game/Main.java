package Game;
import java.awt.Color;

import javax.swing.JFrame;
public class Main {

	public static void main(String[] args) {
		JFrame f = new JFrame("MOVE");
		Gametest g = new Gametest();
		f.setBackground(Color.black);
		f.add(g);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800, 600);
		f.setResizable(false);
		
		
	}

}
