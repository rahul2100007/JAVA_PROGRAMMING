import java.util.Scanner;
class Switchcase
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("Enter day number 1-7:");
		choice=sc.nextInt();
		switch (choice)
		{
		case 1:
			System.out.println("*_* IT'S MONDAY *_*");
			break;
		case 2:
			System.out.println("*_* IT'S TUESDAY *_*");
			break;
		case 3:
			System.out.println("*_* IT'S WEDNESDAY *_*");
			break;
		case 4:
			System.out.println("*_* IT'S THURSDAY *_*");
			break;
		case 5:
			System.out.println("*_* IT'S FRIDAY *_*");
			break;
		case 6:
			System.out.println("*_* IT'S SATURDAY *_*");
			break;
		case 7:
			System.out.println("*_* IT'S SUNDAY :) *_*");
			break;
		default:
			System.out.println("invalid input please enter number between 1 to 7");
		}
	}
}
