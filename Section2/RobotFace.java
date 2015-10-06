import java.awt.*;
import acm.program.*;
import acm.graphics.*;

public class RobotFace extends GraphicsProgram {
	public void run() {
		int cx = getWidth() / 2;
		int cy = getHeight() / 2;
		drawHead(cx, cy);
		drawEyes(cx - HEAD_WIDTH / 4, cy- HEAD_HEIGHT / 4, EYE_RADIUS);
		drawEyes(cx + HEAD_WIDTH / 4, cy - HEAD_HEIGHT / 4,	EYE_RADIUS);
		drawMouth(cx, cy + HEAD_HEIGHT / 4);
	}
	
	/* Adds the entire head centered at (x, y) */
	private void drawHead(int x, int y) {
		GRect head = new GRect(x - HEAD_WIDTH / 2, y - HEAD_HEIGHT / 2,
				HEAD_WIDTH, HEAD_HEIGHT);
		head.setFilled(true);
		head.setFillColor(Color.GRAY);
		add(head);
	}

	/* Adds an eyes centered at (x, y) */
	private void drawEyes(int x, int y, int r) {
		GOval eye = new GOval(x - r, y - r, 2 * r, 2 * r);
		eye.setFilled(true);
		eye.setFillColor(Color.YELLOW);
		add(eye);
	}
	
	/* Adds a mouth centered at (x, y) */
	private void drawMouth(int x, int y) {
		GRect m = new GRect(x - MOUTH_WIDTH / 2, y - MOUTH_HEIGHT / 2,
				MOUTH_WIDTH, MOUTH_HEIGHT);
		m.setFilled(true);
		m.setColor(Color.WHITE);
		add(m);
	}
	/* Drawing parameters */
	private static final int HEAD_WIDTH = 100;
	private static final int HEAD_HEIGHT = 150;
	private static final int EYE_RADIUS = 10;
	private static final int MOUTH_WIDTH = 60;
	private static final int MOUTH_HEIGHT = 20;
}
