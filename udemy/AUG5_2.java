import java.util.Scanner;

public class AUG5_2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int counter = 0;
		int sum = 0;

		while(true){
			int order = counter + 1;
			System.out.println("Enter number #" + order + ":");


			boolean isAnInt = scanner.hasNextInt();


			if(isAnInt){
				int num = scanner.nextInt();
				if(num > max){
					max = number;
				}
			}else{
				System.out.println("Invalid number");
				break;
			}
			scanner.nextLine();	// handle end of line (enter key)
		}

		scanner.close();
	}
}
