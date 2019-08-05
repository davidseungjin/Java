import java.util.Scanner;

public class MMmain{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		//System.out.println("Enter your year of birth:");

		System.out.println("Enter your name: ");
		String name = scanner.nextLine();

		System.out.println("Enter your year of birth: ");
		int yearOfBirth = scanner.nextInt();

		System.out.println("Enter your month of birth: ");
		int monthOfBirth = scanner.nextInt();

		System.out.println("Enter your date of birth: ");
		int dateOfBirth = scanner.nextInt();

		System.out.print("Your name is " + name);
		System.out.print(" and Your birth year is " + yearOfBirth);
		System.out.print(" and Your birth month is " + monthOfBirth);
		System.out.println(" and Your birth date  is " + dateOfBirth);

		System.out.println("Thank you so much.!\n");

		scanner.close();
	}
}

