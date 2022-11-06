package Game.Display;

import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Dimension;


public class Display {
	
	private static JFrame frame;
	private Canvas canvas;

	private String title;
	private int width, height;

	public Display(String title, int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;

		createDisplay();
	}

	//Sets up the stuff for the JFrame and the Canvas in the JFrame to render on
	private void createDisplay() {
		//Creation of JFrame
		frame = new JFrame(title);
		frame.setSize(width, height);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		//creation of Canvas
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width, height));
		canvas.setMinimumSize(new Dimension(width, height));
		canvas.setMaximumSize(new Dimension(width, height));
		canvas.setFocusable(false);

		frame.add(canvas);
		frame.pack();

	}

	public JFrame getJFrame() {
		return this.frame;
	}

	public void setJFrame(JFrame frame) {
		this.frame = frame;
	}

	public Canvas getCanvas() {
		return this.canvas;
	}

	public void setCanvas(Canvas canvas) {
		this.canvas = canvas;
	}
}