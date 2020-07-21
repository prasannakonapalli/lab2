import java.util.*;

public class Rectangle {

	// static String continue1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Welcome to Grand Circus'Room Detail Generator!");
			Scanner scr = new Scanner(System.in);

			String continue1;
			do {
				System.out.print("Enter Length:");
				double length = scr.nextDouble();
				System.out.print("Enter Width:");
				double width = scr.nextDouble();
				System.out.print("Enter height:");
				double height = scr.nextDouble();

				System.out.print("Area:");
				double area = length * width;
				System.out.print(area);
				System.out.println();
				System.out.print("Perimeter:");
				double perimeter = 2 * (length + width);

				System.out.print(perimeter);
				System.out.println();
				double volume = length * width * height;
				System.out.print("volume :");
				System.out.print(volume);
				System.out.println("\n");
				System.out.print("Continue y/n :");
				continue1 = scr.next();
				if (continue1.equalsIgnoreCase("n"))
					break;
				else if (continue1.equalsIgnoreCase("y")) {

				} else {
					throw new Exception();
				}

			} while (continue1.equalsIgnoreCase("y") || continue1.equalsIgnoreCase("n"));
		} catch (Exception e) {
			System.out.println("*******************************************");
			System.out.println("Invalid input");
		}

	}

}
