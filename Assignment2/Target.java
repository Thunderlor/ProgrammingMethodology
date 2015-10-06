import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {
	/** Radius of the outer red circle */
	private final double OUTER_RED_RADIUS = 72;
	
	/** Radius of the middle white circle */
	private final double MIDDLE_WHITE_RADIUS = (72 * 0.65);

	/** Radius of the inner red circle */
	private final double INNER_RED_RADIUS = (72 * 0.3);
	
	public void run() {
		int x = getWidth() / 2;
		int y = getHeight() / 2;
		addCircle(x, y, OUTER_RED_RADIUS, Color.RED);
		addCircle(x, y, MIDDLE_WHITE_RADIUS, Color.WHITE);
		addCircle(x, y, INNER_RED_RADIUS, Color.RED);
	}
	
	/** Create a Circle with parameters of x - y position, radius and color */
	private void addCircle(double x, double y, double r, Color color) {
		GOval o = new GOval(x - r / 2, y - r / 2, r, r);
		/** Only the object setFilled(true), this object can be filled. */ 
		o.setFilled(true);
		o.setFillColor(color);
		o.setColor(color);
		add(o);
	}
}
