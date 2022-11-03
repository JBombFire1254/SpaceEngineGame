package Game;

import javax.swing.JFrame;

import Game.Display.Display;

public class Launcher {
	
	private static Display display;
	
	
	public static void main(String[] args) {
		display = new Display("2D Space Engine", 800, 800);
		
	}
}