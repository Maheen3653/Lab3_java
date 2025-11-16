import java.util.Scanner;
public class Lab3Task2{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int students = input.nextInt();

		System.out.println("Enter the number of apples: ");
		int apples = input.nextInt();

		int applesPerStudent = apples / students;
		System.out.println("Each student gets: " + applesPerStudent);

		int remainingApples = apples % students;
		System.out.println("The remaining number of apples are: " + remainingApples);
		}
	}
