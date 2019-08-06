import java.util.Scanner;

public class AUG5{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your year of birth:");
		int yoB = scanner.nextInt();

		scanner.nextLine(); // handle next line character (enter key)
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();

		while(yoB < 1950){
			System.out.println("Really? I can't believe you were born before 1950");
			System.out.println("Please provide correct year of Birth. ");
			yoB = scanner.nextInt();
		}

		System.out.println("Your name is " + name);
		System.out.println("Your year of birth is " + yoB);

		scanner.close();
	}
}
	
