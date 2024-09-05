import java.util.Scanner;
class Switchcase_m
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("Enter month number 1-12:");
		choice=sc.nextInt();
		switch (choice)
		{
		case 1:
			System.out.println("*_* IT'S JANUARY *_*");
			break;
		case 2:
			System.out.println("*_* IT'S FEBRUARY *_*");
			break;
		case 3:
			System.out.println("*_* IT'S MARCH *_*");
			break;
		case 4:
			System.out.println("*_* IT'S APRIL *_*");
			break;
		case 5:
			System.out.println("*_* IT'S MAY *_*");
			break;
		case 6:
			System.out.println("*_* IT'S JUNE *_*");
			break;
		case 7:
			System.out.println("*_* IT'S JULY :) *_*");
			break;
		case 8:
			System.out.println("*_* IT'S AUGUST *_*");
			break;
		case 9:
			System.out.println("*_* IT'S SEPTEMBER *_*");
			break;
		case 10:
			System.out.println("*_* IT'S OCTOMBER *_*");
			break;
		case 11:
			System.out.println("*_* IT'S NOVEMBER *_*");
			break;
		case 12:
			System.out.println("*_* IT'S DECEMBER *_*");
			break;
		default:
			System.out.println("invalid input please enter number between 1 to 12");
		}
	}
}
