import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai_tap_exception {

	public static void calculate(double a, double b, char op) {
		switch (op) {
		case '+':
			System.out.println(a + " + " + b + " = " + (a + b));
			break;
		case '-':
			System.out.println(a + " - " + b + " = " + (a - b));
			break;
		case '*':
			System.out.println(a + " * " + b + " = " + (a * b));
			break;
		case '/':
			if (b == 0) {
				System.out.println("Cannot divided by 0. Please go back to the beginning!");
			} else {
				System.out.println(a + " / " + b + " = " + (a / b));
			}
			break;
		default:
			System.out.println("No result");
		}
	}

	public static void printName(String lastName, String middleName, String firstName) {
		System.out.println("The full name is: " + lastName + " " + middleName + " " + firstName);
	}

	public static double grades(double chuyenCan, double giuaKy, double cuoiKy) {
		double hocPhan = chuyenCan * 0.1 + giuaKy * 0.2 + cuoiKy * 0.7;
		return hocPhan;
	}

	public static void check(int n, String arr[], String name) {
		boolean found = false;
		for (int i = 0; i < n; i++) {
			if (arr[i].equalsIgnoreCase(name)) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	public static void main(String[] args) {

		System.out.println("MENU\n");
		System.out.println("----------");
		System.out.println("1. Entering 2 numbers from the keyboard to print the results of addition, subtraction, multiplication, and division.");
		System.out.println("2. Enter your first and last name, print out the full name.");
		System.out.println("3. Enter the attendance score (10%), midterm (20%), and final semester (70%) to print the course score.");
		System.out.println("4. Enter the full name to check whether it exists in the initialization list or not. If so, print \"Yes\", otherwise print \"No\"");
		System.out.println("Other to quit.");
		System.out.println("----------");

		int choice, flag = 1;
		Scanner input = new Scanner(System.in);

		while (flag == 1) {
			System.out.println("Enter your choice: ");
			choice = input.nextInt();

			switch (choice) {
			case 1:

				double a = 0, b = 0;
				char op = '+';
				boolean isValid = false;
				do {
					try {

						System.out.println("Enter a: ");
						String a1 = input.next();
						a = Double.parseDouble(a1);
						System.out.println("Enter b: ");
						String b1 = input.next();
						b = Double.parseDouble(b1);
						System.out.println("Enter operation: ");
						op = input.next().charAt(0);
						isValid = true;

					} catch (NumberFormatException e) {
						System.out.println("Please re-enter input! ");
					}
				} while (isValid == false);
				calculate(a, b, op);
				break;

			case 2:

				System.out.println("Enter the first name: ");
				String firstName = input.next();
				System.out.println("Enter the middle name: ");
				String middleName = input.next();
				System.out.println("Enter the last name: ");
				String lastName = input.next();
				printName(lastName, middleName, firstName);
				break;

			case 3:

				double chuyenCan = 0, giuaKy = 0, cuoiKy = 0;
				boolean abc = false;
				do {
					try {

						System.out.println("Enter the attendence: ");
						String chuyenCan1 = input.next();
						chuyenCan = Double.parseDouble(chuyenCan1);
						System.out.println("Enter the midterm: ");
						String giuaKi1 = input.next();
						giuaKy = Double.parseDouble(giuaKi1);
						System.out.println("Enter the final:");
						String cuoiKi1 = input.next();
						cuoiKy = Double.parseDouble(cuoiKi1);
						abc = true;
					} catch (NumberFormatException e) {
						System.out.println("Please re-enter input!");
					}
				} while (abc == false);

				System.out.println("Your course grade is: " + grades(chuyenCan, giuaKy, cuoiKy));
				break;

			case 4:

				System.out.println("Number of members in the list are: ");
				int n = input.nextInt();
				String arr[] = new String[n];
				input.nextLine();
				;
				System.out.println("Enter number of members in the list: ");
				for (int i = 0; i < n; i++) {
					arr[i] = input.nextLine();
				}
				System.out.println("Enter your name you want to check: ");
				String name = input.nextLine();
				check(n, arr, name);
				break;

			default:
				System.out.println("BYE. HAVE NICE DAY!");
				flag = 0;

			}
		}
	}
}