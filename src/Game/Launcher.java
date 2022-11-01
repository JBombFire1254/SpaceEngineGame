package Game;

import javax.swing.JFrame;

public class Launcher {
	
	public static JFrame frame;
	
	
	public static void main(String[] args) {
		
		frame = new JFrame();
		frame.setSize(800, 800);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}