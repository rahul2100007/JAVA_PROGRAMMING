import java.util.Scanner;
class decision_1
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
		else if (num%2!=0)
		{
			System.out.println("\n" + num + " IS ODD NUMBER ");
		}
		
		else if (num%2==0)
		{
			System.out.println("\n" + num + " IS EVEN NUMBER ");
		}
	}
}