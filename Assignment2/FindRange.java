import acm.program.*;

public class FindRange extends ConsoleProgram {
	public void run() {
		println("This program finds the largest and smallest numbers.");
		int max = 0; 
		int min = 0;
		int counter = 0;
		while (true) {
			int input = readInt("? ");
			
			/** If the user enters the sentinel on the very first 
			 * input line, then no values have been entered, and 
			 * your program should display a message to that effect.
			 */
			while (input == 0 && counter == 0) {
				println("You need input rather than two numbers before sentinel!");
				input = readInt("? ");
			}
			
			/** Break, until a sentinel value of 0 */
			if (input == 0) break;
			counter++;
			if (counter == 1) {
				max = input;
				min = input;
			}
			max = Math.max(input, max);
			min = Math.min(input, min);
		}
		println("smallest = " + min);
		println("largest = " + max);
	}
}
