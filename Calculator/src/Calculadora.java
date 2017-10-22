import java.io.IOException;
import java.util.Scanner;
public class Calculadora {
	public static void main(String[] args) throws IOException, InterruptedException {

		boolean run = true;
		while (run){
		System.out.println("================================");
		System.out.println(" Calculator v1.0 by Jack Chung");
		System.out.println("================================");
		
		
		
		System.out.println("Enter the First Number: ");
		Scanner number1 = new Scanner(System.in);
		int num1 = number1.nextInt();
		
		System.out.println("Enter the Second Number");
		Scanner number2 = new Scanner(System.in);
		int num2 = number2.nextInt();
		
		System.out.println("Select the operation you desire: "+"\n1-Addition"+"\n2-Substraction"+"\n3-Multiplication"+"\n4-Division"+"\n5-Exit");
		Scanner equal = new Scanner(System.in);
		int operation = equal.nextInt();
		int ans;
		
		switch (operation){
	
		case 1:
		{
			ans = num1 + num2;
			System.out.println("The answer of the addition is = " + ans);
			break;
		}
		case 2:
		{
			ans = num1 - num2;
			System.out.println("The answer of the substraction is = "+ ans);
			break;
		}
		case 3:
		{
			ans = num1 * num2;
			System.out.println("The answer of the multiplication is = "+ ans);
			break;
		}
		case 4:
		{
			ans = num1 / num2;
			System.out.println("The answer of the division is  = "+ans);
			Thread.sleep(1000);
			System.out.println("Want to do another operation?"+"\nPress 1 to continue"+"\nPress 2 for Exit");
			Scanner restart = new Scanner (System.in);
			int rest = restart.nextInt();
			if (rest == 1)
			{
			run= true;
				
			}
			
			else if (rest == 2)
			{
				run = false;
			}
			else
				System.out.println("Invalid option!");
				run = false;
		}
		case 5:
		{
			System.out.println("================================================");
			System.out.println(" Thanks for using Calculator v1.0 by Jack Chung!");
			System.out.println("================================================");
			run = false;
			break;
		}
		default:
		{
			System.out.println("Error! Invalid Operation!");
			break;
		}
		
		
		
	}

}
		}
	}

