package week3;
import java.util.Scanner;

public class Java_Basic_Input_Output {
	public static void main(String[] args) {
		//declare variables and assign values
		int num1;
		float num2;
		char character;
		boolean bool;
		String str;
		double num3;
		
		//Creating object of Scanner class, to take input
		
		Scanner sc = new Scanner(System.in);{
					
		/* system.out.println("enter int number");
			num1=sc.nextInt(); */
			
			System.out.println("enter float number");
			num2=sc.nextFloat();
			
			System.out.println("enter string value");
			str=sc.nextLine();
			
			System.out.println("enter character value");
			character = sc.next().charAt(0);
			
			System.out.println("enter double value ");
			num3 = sc.nextDouble();
			
			/*System.out.println("enter boolean value");
			bool = sc.nextBoolean();
			
			System.out.println("int->"+num1);
			System.out.println("boolean -> " + bool);*/
			System.out.println("float->"+num2);	
			System.out.println("String -> " + str);
			System.out.println("char -> " + character);
			System.out.println("double -> " + num3); 
		
		}
	}
}
