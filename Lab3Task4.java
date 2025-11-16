import java.util.Scanner;
public class Lab3Task4{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("The number of minutes that is passed since midnight: ");
		int N = input.nextInt();
		
		int hours = N / 60;
		int minutes = N % 60;

		hours = hours % 24;

		System.out.println("Time on clock is: " + hours + " " + minutes);
		}
	}