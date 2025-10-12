import java.util.Scanner;
public class AverageDouble {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Double Number:");
		if(!sc.hasNextDouble())
		{
			System.out.println("Error: First input is not a double value");
			sc.close();
			return;
		}
		
		double num1 = sc.nextDouble();	
		
		System.out.println("Enter second double value:");
		if(!sc.hasNextDouble())
		{
			System.out.println("Error: Second input is not a double value");
		}
		double num2 = sc.nextDouble();
		double avg = (num1+num2)/2;
		System.out.println("Average:"+avg);
		sc.close();
	}

}
