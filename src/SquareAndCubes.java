import java.util.Scanner;

public class SquareAndCubes {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num;
		String cont = "y";
		System.out.println("Learn your squares and cubes!");
		System.out.println();

		System.out.print("Enter an integer: ");
		num = scan.nextInt();
		System.out.println();
		System.out.printf("Number/tSquared/tCubed");

		scan.close();
	}

}
