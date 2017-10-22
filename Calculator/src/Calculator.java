import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.util.Scanner;
import com.sun.glass.events.KeyEvent;
public class Calculator {
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {

		boolean start = true;
		while (start){
		System.out.println("================================");
		System.out.println(" Calculator v1.0 by Jack Chung");
		System.out.println("================================");
		
		System.out.println("\nEnter the First Number: ");
		Scanner number1 = new Scanner(System.in);
		int num1 = number1.nextInt();
		
		System.out.println("Enter the Second Number");
		Scanner number2 = new Scanner(System.in);
		int num2 = number2.nextInt();
		
		System.out.println("Select the operation you desire: "+"\n1-Addition"+"\n2-Substraction"+"\n3-Multiplication"+"\n4-Division"+"\n5-Exit");
		Scanner equal = new Scanner(System.in);
		int operation = equal.nextInt();
		int ans;
		
		if (operation == 1) 
		{
			ans = num1 + num2;
			System.out.println("The answer of the addition is = " + ans);
			Thread.sleep(1000);
			System.out.println("\nWant to do another operation?"+"\nEnter 1 to Continue"+"\nEnter 2 to Exit");
			Scanner restart = new Scanner (System.in);
			int rest = restart.nextInt();
		if (rest == 1)
			{
			Robot RobinHood = new Robot();
			RobinHood.keyPress(KeyEvent.VK_SHIFT);
			RobinHood.keyPress(KeyEvent.VK_F10);
			RobinHood.keyPress(KeyEvent.VK_R);
			RobinHood.keyRelease(KeyEvent.VK_SHIFT);
			RobinHood.keyRelease(KeyEvent.VK_F10);
			RobinHood.keyRelease(KeyEvent.VK_R);
			start = true;
				
			}
			
			else if (rest == 2)
			{
				System.out.println("================================================");
				System.out.println(" Thanks for using Calculator v1.0 by Jack Chung!");
				System.out.println("================================================");
				start = false;
				Thread.sleep(1250);
				Robot RobinHood = new Robot();
				RobinHood.keyPress(KeyEvent.VK_SHIFT);
				RobinHood.keyPress(KeyEvent.VK_F10);
				RobinHood.keyPress(KeyEvent.VK_R);
				RobinHood.keyRelease(KeyEvent.VK_SHIFT);
				RobinHood.keyRelease(KeyEvent.VK_F10);
				RobinHood.keyRelease(KeyEvent.VK_R);
			}
			else
				{
				System.out.println("Invalid option!");
				start = false;
				Thread.sleep(1000);
				Robot RobinHood = new Robot();
				RobinHood.keyPress(KeyEvent.VK_SHIFT);
				RobinHood.keyPress(KeyEvent.VK_F10);
				RobinHood.keyPress(KeyEvent.VK_R);
				RobinHood.keyRelease(KeyEvent.VK_SHIFT);
				RobinHood.keyRelease(KeyEvent.VK_F10);
				RobinHood.keyRelease(KeyEvent.VK_R);
				}
		
			
		}
		else if (operation == 2)
		{
			ans = num1 - num2;
			System.out.println("The answer of the substraction is = "+ ans);
			Thread.sleep(1000);
			System.out.println("\nWant to do another operation?"+"\nEnter 1 to Continue"+"\nEnter 2 to Exit");
			Scanner restart = new Scanner (System.in);
			int rest = restart.nextInt();
		if (rest == 1)
			{
			Robot RobinHood = new Robot();
			RobinHood.keyPress(KeyEvent.VK_SHIFT);
			RobinHood.keyPress(KeyEvent.VK_F10);
			RobinHood.keyPress(KeyEvent.VK_R);
			RobinHood.keyRelease(KeyEvent.VK_SHIFT);
			RobinHood.keyRelease(KeyEvent.VK_F10);
			RobinHood.keyRelease(KeyEvent.VK_R);
			start = true;
				
			}
			
			else if (rest == 2)
			{
				System.out.println("================================================");
				System.out.println(" Thanks for using Calculator v1.0 by Jack Chung!");
				System.out.println("================================================");
				start = false;
				Thread.sleep(1250);
				Robot RobinHood = new Robot();
				RobinHood.keyPress(KeyEvent.VK_SHIFT);
				RobinHood.keyPress(KeyEvent.VK_F10);
				RobinHood.keyPress(KeyEvent.VK_R);
				RobinHood.keyRelease(KeyEvent.VK_SHIFT);
				RobinHood.keyRelease(KeyEvent.VK_F10);
				RobinHood.keyRelease(KeyEvent.VK_R);
			}
			else
				{
				System.out.println("Invalid option!");
				start = false;
				Thread.sleep(1000);
				Robot RobinHood = new Robot();
				RobinHood.keyPress(KeyEvent.VK_SHIFT);
				RobinHood.keyPress(KeyEvent.VK_F10);
				RobinHood.keyPress(KeyEvent.VK_R);
				RobinHood.keyRelease(KeyEvent.VK_SHIFT);
				RobinHood.keyRelease(KeyEvent.VK_F10);
				RobinHood.keyRelease(KeyEvent.VK_R);
				}
		
		}
		else if (operation == 3)
		{
			ans = num1 * num2;
			System.out.println("The answer of the multiplication is = "+ ans);
			Thread.sleep(1250);
			System.out.println("\nWant to do another operation?"+"\nEnter 1 to Continue"+"\nEnter 2 to Exit");
			Scanner restart = new Scanner (System.in);
			int rest = restart.nextInt();
		if (rest == 1)
			{
			Robot RobinHood = new Robot();
			RobinHood.keyPress(KeyEvent.VK_SHIFT);
			RobinHood.keyPress(KeyEvent.VK_F10);
			RobinHood.keyPress(KeyEvent.VK_R);
			RobinHood.keyRelease(KeyEvent.VK_SHIFT);
			RobinHood.keyRelease(KeyEvent.VK_F10);
			RobinHood.keyRelease(KeyEvent.VK_R);
			start = true;
				
			}
			
			else if (rest == 2)
			{
				System.out.println("================================================");
				System.out.println(" Thanks for using Calculator v1.0 by Jack Chung!");
				System.out.println("================================================");
				start = false;
				Thread.sleep(1250);
				Robot RobinHood = new Robot();
				RobinHood.keyPress(KeyEvent.VK_SHIFT);
				RobinHood.keyPress(KeyEvent.VK_F10);
				RobinHood.keyPress(KeyEvent.VK_R);
				RobinHood.keyRelease(KeyEvent.VK_SHIFT);
				RobinHood.keyRelease(KeyEvent.VK_F10);
				RobinHood.keyRelease(KeyEvent.VK_R);
			}
			else
				{
				System.out.println("Invalid option!");
				start = false;
				Thread.sleep(1000);
				Robot RobinHood = new Robot();
				RobinHood.keyPress(KeyEvent.VK_SHIFT);
				RobinHood.keyPress(KeyEvent.VK_F10);
				RobinHood.keyPress(KeyEvent.VK_R);
				RobinHood.keyRelease(KeyEvent.VK_SHIFT);
				RobinHood.keyRelease(KeyEvent.VK_F10);
				RobinHood.keyRelease(KeyEvent.VK_R);
				}
		
		}
		else if (operation == 4)
		{
			ans = num1 / num2;
			System.out.println("The answer of the division is  = "+ans);
			Thread.sleep(1000);
			System.out.println("\nWant to do another operation?"+"\nEnter 1 to Continue"+"\nEnter 2 to Exit");
			Scanner restart = new Scanner (System.in);
			int rest = restart.nextInt();
		if (rest == 1)
			{
			Robot RobinHood = new Robot();
			RobinHood.keyPress(KeyEvent.VK_SHIFT);
			RobinHood.keyPress(KeyEvent.VK_F10);
			RobinHood.keyPress(KeyEvent.VK_R);
			RobinHood.keyRelease(KeyEvent.VK_SHIFT);
			RobinHood.keyRelease(KeyEvent.VK_F10);
			RobinHood.keyRelease(KeyEvent.VK_R);
			start = true;
				
			}
			
			else if (rest == 2)
			{
				System.out.println("================================================");
				System.out.println(" Thanks for using Calculator v1.0 by Jack Chung!");
				System.out.println("================================================");
				start = false;
				Thread.sleep(1250);
				Robot RobinHood = new Robot();
				RobinHood.keyPress(KeyEvent.VK_SHIFT);
				RobinHood.keyPress(KeyEvent.VK_F10);
				RobinHood.keyPress(KeyEvent.VK_R);
				RobinHood.keyRelease(KeyEvent.VK_SHIFT);
				RobinHood.keyRelease(KeyEvent.VK_F10);
				RobinHood.keyRelease(KeyEvent.VK_R);
			}
			else
				{
				System.out.println("Invalid option!");
				start = false;
				Thread.sleep(1000);
				Robot RobinHood = new Robot();
				RobinHood.keyPress(KeyEvent.VK_SHIFT);
				RobinHood.keyPress(KeyEvent.VK_F10);
				RobinHood.keyPress(KeyEvent.VK_R);
				RobinHood.keyRelease(KeyEvent.VK_SHIFT);
				RobinHood.keyRelease(KeyEvent.VK_F10);
				RobinHood.keyRelease(KeyEvent.VK_R);
				}
		
		}
		else if (operation == 5)
		{
			System.out.println("================================================");
			System.out.println(" Thanks for using Calculator v1.0 by Jack Chung!");
			System.out.println("================================================");
			start = false;
			Thread.sleep(1250);
			Robot RobinHood = new Robot();
			RobinHood.keyPress(KeyEvent.VK_SHIFT);
			RobinHood.keyPress(KeyEvent.VK_F10);
			RobinHood.keyPress(KeyEvent.VK_R);
			RobinHood.keyRelease(KeyEvent.VK_SHIFT);
			RobinHood.keyRelease(KeyEvent.VK_F10);
			RobinHood.keyRelease(KeyEvent.VK_R);
		}
		else
		{
			System.out.println("Error! Invalid Operation!");
			start = false;
			Thread.sleep(1000);
			Robot RobinHood = new Robot();
			RobinHood.keyPress(KeyEvent.VK_SHIFT);
			RobinHood.keyPress(KeyEvent.VK_F10);
			RobinHood.keyPress(KeyEvent.VK_R);
			RobinHood.keyRelease(KeyEvent.VK_SHIFT);
			RobinHood.keyRelease(KeyEvent.VK_F10);
			RobinHood.keyRelease(KeyEvent.VK_R);
		}
		
		
		
	}

}
}
