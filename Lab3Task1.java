import java.util.Scanner;
public class Lab3Task1{
	Scanner input = new Scanner(System.in);
	public static void main(String [] args){
		System.out.println("Enter the amount as decimal number: ");
		double amount = input.nextDouble();

		double cents = amount * 100;
		
		double dollars = cents / 100;
		double remainingCents = cents % 100;
		
		double quater = remainingCents / 25;
		remainingCents = remainingCents % 25;

		double dimes = remainingCents / 10;
		remainingCents = remainingCents % 10;

		double nickels = remainingCents / 5;
		remainingCents = remainingCents % 5;

		double pennies = remainingCents;
		
		System.out.println("Number of dollars is: " + dollars);
		System.out.println("Number of quater is: " + quater);
		System.out.println("Number of dimes is: " + dimes);
		System.out.println("Number of nickels is: " + nickels);
		System.out.println("Number of pennies is: " + pennies);

		}
	}