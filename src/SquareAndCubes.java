import java.util.Scanner;

public class SquareAndCubes {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num;
		String cont = "y";
		System.out.println("Learn your squares and cubes!");

		while (cont.equalsIgnoreCase("y")) {
			System.out.println();
			System.out.print("Enter an integer: ");
			num = scan.nextInt();
			System.out.println();
			System.out.printf("%1$-11s %2$-11s %3$-11s%n", "Number", "Squared", "Cubed");
			System.out.printf("%1$-11s %2$-11s %3$-11s%n", "=======", "=======", "======");

			for (int i = 1; i <= num; i++) {
				System.out.printf("%1$-11s %2$-11s %3$-11s%n", i, i * i, i * i * i);
			}
			System.out.printf("%nContinue? (y/n): ");
			cont = scan.next();
		}
		System.out.println();
		System.out.println("Bye!");
		scan.close();
	}

}
