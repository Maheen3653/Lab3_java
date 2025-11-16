import java.util.Scanner;
public class Lab3Task3{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students in class A: ");
		int A = input.nextInt();

		System.out.println("Enter the number of students in class B: ");
		int B = input.nextInt();

		System.out.println("Enter the number of students in class C: ");
		int C = input.nextInt();

		int deskA = (A + 1) / 2;
		int deskB = (B + 1) / 2;
		int deskC = (C + 1) / 2;

		int totalDesks = deskA + deskB + deskC; 
		System.out.println("Smallest possible number of desks are: " + totalDesks);
		}
	}
		
