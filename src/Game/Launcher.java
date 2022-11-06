package Game;


import Game.Display.Display;

public class Launcher {
	
	private static Display display;
	
	//START POINT OF PPROGRAM
	public static void main(String[] args) {
		display = new Display("2D Space Engine", 800, 800);
		
	}
}