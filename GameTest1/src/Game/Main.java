package Game;
import java.awt.*;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("GameTest1");
		gametest g = new gametest();
		frame.add(g);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700, 700);
		frame.setResizable(false);
		
	}

}
