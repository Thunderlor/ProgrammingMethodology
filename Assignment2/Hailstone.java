import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		int num = readInt("Enter a number: ");
		int counter = 0;
		while (num != 1) {
			if (num % 2 == 1) {
				print(num);
				num = 3 * num + 1;
				println(" is odd, so I make 3n + 1: " + num);
				counter++;
			} else {
				print(num);
				num /= 2;
				println(" is even, so I take half: " + num);
				counter++;
			}
		}
		println("The process took " + counter +" to reach 1!");
	}
}
