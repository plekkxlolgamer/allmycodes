package Hound;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JPopupMenu;

public class SciTech extends JFrame {

	private JPanel contentPane;

	/**
	 * @wbp.nonvisual location=42,489
	 */

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SciTech frame = new SciTech();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * @throws IOException 
	 * Create the frame.
	 * @throws
	 */
	public SciTech() throws IOException {
		int i = 0;
		while (i < 10) {
			i++;
			boolean running = true;
			while (running) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("New label");
		label.setFont(new Font("Arial Black", Font.PLAIN, 20));
		label.setBounds(37, 11, 614, 78);
		contentPane.add(label);
		
		JRadioButton A = new JRadioButton("");
		A.setBounds(37, 133, 109, 37);
		contentPane.add(A);
		
		JRadioButton B = new JRadioButton("");
		B.setBounds(37, 205, 109, 23);
		contentPane.add(B);
		
		JRadioButton C = new JRadioButton("");
		C.setBounds(355, 140, 109, 23);
		contentPane.add(C);
		
		JRadioButton D = new JRadioButton("");
		D.setBounds(355, 205, 109, 23);
		contentPane.add(D);
		
		JButton btnAnswer = new JButton("Answer");
		btnAnswer.setBounds(37, 265, 89, 23);
		contentPane.add(btnAnswer);
		
	
				BufferedReader reader = new BufferedReader(new FileReader("C:\\questions.txt"));
				List<String> lines = new ArrayList<String>();
			
			String line = reader.readLine();
				
			while (line != null) {
				lines.add(line);
				line = reader.readLine();
				}
			
			Random r = new Random();
			String ran = lines.get(r.nextInt(lines.size()));
			
			label.setText(ran);
			btnAnswer.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
			if (ran.equals("s")) {
				A.setText("mercury");
				B.setText("venus");
				C.setText("earth");
				D.setText("mars");
			}
			if (A.isSelected()) {
				q2 q = new q2();
				q.setVisible(true);
				
			}
			else {
				int c = 0;
				c++;
				if (c > 5) {
					running = false;
				}
				
			}
			
		
		}
			});
	}
}
	
}
	
}
