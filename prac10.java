import java.util.Scanner;
class prac10
{
	public static void main(String arg[]) 
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("<1> for SUM \n<2> for SUBTRACT \n<3> for MULTIPLICATION \n<4> for DIVISION");
		System.out.print("Enter Choice: ");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:
			{
				float a,b,c;
				System.out.print("ENTER TWO NUMBER: ");
				a=sc.nextFloat();
				b=sc.nextFloat();
				c=a+b;
				System.out.print("SUM OF TWO NUMBER IS: " + c);
			}
			break;
			case 2:
			{
				float a,b,c;
				System.out.print("ENTER TWO NUMBER: ");
				a=sc.nextFloat();
				b=sc.nextFloat();
				c=a-b;
				System.out.print("SUBTRACTION OF TWO NUMBER IS: " + c);
			}
			break;
			case 3:
			{
				float a,b,c;
				System.out.print("ENTER TWO NUMBER: ");
				a=sc.nextFloat();
				b=sc.nextFloat();
				c=a*b;
				System.out.print("MULTIPLICATION OF TWO NUMBER IS: " + c);
			}
			break;
			case 4:
			{
				float a,b,c;
				System.out.print("ENTER TWO NUMBER: ");
				a=sc.nextFloat();
				b=sc.nextFloat();
				c=a/b;
				System.out.print("DIVISION OF TWO NUMBER IS: " + c);
			}
			break;
		}
	}
}