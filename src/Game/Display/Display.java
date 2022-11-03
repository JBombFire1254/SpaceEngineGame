package Game.Display;

import javax.swing.JFrame;

public class Display extends JFrame{
	
	private String title;
	private int width, height;

	public Display(String title, int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;
	}
}