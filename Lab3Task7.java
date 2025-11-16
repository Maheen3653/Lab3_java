import java.util.Scanner;
public class Lab3Task7{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		final int classA_Cost = 20;
		final int classB_Cost = 15;
		final int classC_Cost = 10;
		final int classD_Cost = 5;

		System.out.println("Seats sold for class A: ");
		int classA_Tickets = input.nextInt();

		System.out.println("Seats sold for class B: ");
		int classB_Tickets = input.nextInt();

		System.out.println("Seats sold for class C: ");
		int classC_Tickets = input.nextInt();

		System.out.println("Seats sold for class D: ");
		int classD_Tickets = input.nextInt();

		int incomeA = classA_Tickets * classA_Cost;
		System.out.println("Income of classA:$ " + incomeA);

		int incomeB = classB_Tickets * classB_Cost;
		System.out.println("Income of classB:$ " + incomeB);

		int incomeC = classC_Tickets * classC_Cost;
		System.out.println("Income of classC:$ " + incomeC);

		int incomeD = classD_Tickets * classD_Cost;
		System.out.println("Income of class D:$ " + incomeD);

		
		int totalIncome = incomeA + incomeB + incomeC + incomeD;
		System.out.println("Total income generated: " + totalIncome);
		}
	}
		



		