import acm.graphics.*;
import acm.program.*;

public class ProgramHierarchy extends GraphicsProgram {
	/** Width of the box */
	private final int BOX_WIDTH = 200;

	/** Height of the box */
	private final int BOX_HEIGHT = 50;

	/** Gap between two boxes */
	private final int BOX_GAP = 20;

	public void run() {
		int x = (getWidth() - BOX_WIDTH) / 2;
		int y = getHeight() / 4;
		createBox(x, y, BOX_WIDTH, BOX_HEIGHT, 
				"Program");
		createBox(x - BOX_WIDTH - BOX_GAP, 2 * y, BOX_WIDTH, BOX_HEIGHT,
				"GraphicsProgram");
		createBox(x, 2 * y, BOX_WIDTH, BOX_HEIGHT,
				"ConsoleProgram");
		createBox(x + BOX_WIDTH + BOX_GAP, 2 * y, BOX_WIDTH, BOX_HEIGHT,
				"DialogProgram");
		int xStart = getWidth() / 2;
		int yStart = y + BOX_HEIGHT;
		/** Connect two boxes with GLine */
		add(new GLine(xStart, yStart, x - BOX_WIDTH / 2 - BOX_GAP , 2 * y));
		add(new GLine(xStart, yStart, x + BOX_WIDTH / 2, 2 * y));
		add(new GLine(xStart, yStart, x + BOX_WIDTH / 2 * 3 + BOX_GAP , 2 * y));
	}

	/** Create box containing GLabel and GRect */
	private void createBox(int x, int y, int width, int height, String s) {
		GRect r = new GRect(x, y, width, height);
		add(r);
		GLabel l = new GLabel(s);
		/** Set label in the center of the box */
		l.setLocation(x + (r.getWidth() - l.getWidth()) / 2, 
				y + (r.getHeight() + l.getAscent()) / 2);
		add(l);
	}
}
