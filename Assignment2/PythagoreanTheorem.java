import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		println("Enter valuse to compute Pythagorean Theorem.");
		double a = readDouble("a = ");
		double b = readDouble("b = ");
		println("c = " + Math.sqrt((a * a) + (b * b)));
	}
}
