import java.util.Scanner;
public class Lab3Task6{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int weeks = 5;
		final double taxrate = 0.14;
		final double clothesrate = 0.1;
		final double suppliesrate = 0.01;
		final double savingBondsrate = 0.25;
		final double parentsBondsrate = 0.50;

		System.out.println("Enter number of hours worked per week: ");
		int hoursPerWeek = input.nextInt();

		System.out.println("Enter the hourly pay rate:$ ");
		double payrate = input.nextDouble();

		double incomebefore = hoursPerWeek * payrate * weeks;
		System.out.println("Income before tax:$ " + incomebefore);

		double incomeafter = incomebefore - (incomebefore * taxrate);
		System.out.println("Income after tax:$ " + incomeafter);
		
		double clothes = incomeafter * clothesrate;
		double remainingincome = incomeafter - clothes;
		double supplies = remainingincome * suppliesrate;
		double remainingAfterSupplies = remainingincome - supplies;
		double savingBonds = remainingAfterSupplies * savingBondsrate;
		double remainingAfterBonds = remainingAfterSupplies - savingBonds;
		double parentsBonds = savingBonds * parentsBondsrate;
		
		System.out.println("Money spent on clothes and other supplies:$ " + clothes);
		System.out.println("Money spent on school supplies:$ " + supplies);
		System.out.println("Money spent on saving bonds:$ " + savingBonds);
		System.out.println("Money spent on additional bonds:$ " + parentsBonds);
		}
	}

		



		

		

		

		
