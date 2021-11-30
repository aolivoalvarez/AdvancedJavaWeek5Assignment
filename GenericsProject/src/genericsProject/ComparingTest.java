package genericsProject;

//import for user input
import java.util.Scanner;

public class ComparingTest {

	public static void main(String[] args) {
	
		//variables
		int[] intArray = new int[2];
		double[] dblArray = new double[2];
		String[] strArray = new String[2];
		Scanner input = new Scanner(System.in);
		
		//gathering info
		System.out.print("Please enter an integer: ");
		intArray[0] = input.nextInt();
		
		System.out.print("Please enter another integer: ");
		intArray[1] = input.nextInt();
		
		System.out.print("Please enter a double: ");
		dblArray[0] = input.nextDouble();
		
		System.out.print("Please enter another double: ");
		dblArray[1] = input.nextDouble();
		
		System.out.print("Please enter a word or phrase: ");
		strArray[0] = input.nextLine();
		
		System.out.print("Please enter a word or phrase: ");
		strArray[1] = input.nextLine();
		
		Comparing i = new Comparing(intArray);
		Comparing d = new Comparing(dblArray);
		Comparing s = new Comparing(strArray);
		
		System.out.printf("The maximum integer is: %d", i.max);
		System.out.printf("The minimum integer is: %d", i.min);
		System.out.printf("The maximum double is: %d", d.max);
		System.out.printf("The minimum double is: %d", d.min);
		System.out.printf("The maximum string is: %s", s.max);
		System.out.printf("The minimum string is: %s", s.min);

	}

}
