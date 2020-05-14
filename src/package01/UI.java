package package01;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UI {
	
	JFrame window;
	JPanel titleNamePanel, startButtonPanel;
	JLabel titleNameLabel;
	JButton startButton;

	public void createUI(){
		
		//WINDOW
		
		window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		window.setVisible(true);
		
	}
}