import java.util.Scanner;

public class SquareAndCubes {
	/*
	 * Lab Number 4 - April 25, 2018 Code by Tim Pienianek and Victoria Rush --Tim
	 * understands formatting with printf much better
	 * 
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num;
		String cont = "y";

		System.out.println("Learn your squares and cubes!");

		// cont initialized to y for first iteration, then as user inputs
		while (cont.equalsIgnoreCase("y")) {
			System.out.println();

			// Query user for integer and read it
			System.out.print("Enter an integer: ");
			num = scan.nextInt();

			// Print headings
			System.out.println();
			System.out.printf("%1$-11s %2$-11s %3$-11s%n", "Number", "Squared", "Cubed");
			System.out.printf("%1$-11s %2$-11s %3$-11s%n", "=======", "=======", "======");

			// Calculate and print squares and cubes
			for (int i = 1; i <= num; i++) {
				System.out.printf("%1$-11s %2$-11s %3$-11s%n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
			}
			System.out.printf("%nContinue? (y/n): ");
			cont = scan.next();
		}

		// End program
		System.out.println();
		System.out.println("Bye!");
		scan.close();
	}

}
