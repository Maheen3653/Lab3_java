import java.util.Scanner;
public class Lab3Task5{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Total amount of milk produced in the morning: ");
		double milk = input.nextDouble();

		final double cartonCapacity = 3.78;
		final double costPerLitre = 0.38;
		final double profitPerCarton = 0.27;

		int carton = (int) Math.round(milk / cartonCapacity);
		System.out.println("Number of cartons needed: " + carton);

		double cost = milk * costPerLitre;
		System.out.println("Cost of produced milk is:$ " + cost);

		double profit = carton * profitPerCarton;
		System.out.println("Profit for produced milk is:$ " + profit);
		}
	}