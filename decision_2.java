import java.util.Scanner;
class decision_2
{
	public static void main(String arg[]) 
	{
		Scanner scan=new Scanner(System.in);
		int num;
		System.out.print("Enter Number: ");
		num=scan.nextInt();
		if(num==0)
		{
			System.out.println("\nENTERED NUMBER IS ZERO");
		}
		else if (num>0)
		{
			System.out.println("\n" + num + " IS POSITIVE NUMBER ");
		}
		
		else if (num<0)
		{
			System.out.println("\n" + num + " IS NEGATIVE NUMBER ");
		}
	}
}

