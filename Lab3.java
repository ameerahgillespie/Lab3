import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String choice = "y";
			
		System.out.println("Learn your squares and cubes!");
		
		while(choice.equalsIgnoreCase("y")){
				
			System.out.println("Enter an integer:");
			int num = scan.nextInt();
			
			System.out.printf("Number\tSquared\tCubed");// print f  - youll need a format string. Youll put values in ex. value1, value2)
														// format specifies are %f
			
			System.out.println("");
			System.out.printf("=====================");
	
			System.out.println();
		
			for (int i = 0; i < num; i++) {
				System.out.println(i + "\t" + i * i + "\t" + i * i * i);
			}

		System.out.print("\nWould you like to continue? (enter y or n)");
			choice = scan.next();
		}
		
		scan.close();
		System.out.println("\nThanks for your input.");
	}

}
