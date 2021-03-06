/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {
	/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

	/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

	/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;

	public void run() {
		for (int i = 0; i < BRICKS_IN_BASE; i++) {
			int x = (getWidth() - BRICK_WIDTH * (BRICKS_IN_BASE - i)) / 2;
			int y = (getHeight() - BRICK_HEIGHT * (i + 1));
			drawRaw(BRICKS_IN_BASE - i, x, y);
		}
	}
	
	/** Draw a raw with different numbers in different position */
	private void drawRaw(int num, int x, int y) {
		for (int i = 0; i < num; i++) {
			add(new GRect(x + i * BRICK_WIDTH, y, BRICK_WIDTH, BRICK_HEIGHT));
		}
	}
}
