import java.util.Scanner;
class Table
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
			System.out.println("ENTER TABLE NUMBER : ");
			int a = sc.nextInt();
			System.out.println("\n");		
			for(int i=1;i<=10;i++)
			{
				System.out.println(a + " x " + i + " = " + a*i);
			}
		
	}
}
