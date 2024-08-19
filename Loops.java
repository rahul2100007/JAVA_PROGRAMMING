/*
class Loops
{
	public static void main(String[] args) 
	{
		int a=1;
		while(a<=10)
		{
			System.out.print("\t"+a);
			a++;
		}
	}
}
*/
/*
class Loops
{
	public static void main(String[] args) 
	{
		int a=1;
		while(a<=10)
		{
			if(a%2==0)
			{
			System.out.print("\t"+a);
			}
			a++;
		}
	}
}
*/
/*
class Loops
{
	public static void main(String[] args) 
	{
		int a=20;
		do
		{
			System.out.println("Hello Java!");
		}
		while (a==21);
	}
}
*/
/*
class Loops
{
	public static void main(String[] args) 
	{
		int a;
		int x;
		for(a=1;a<=20;a++)
		{
			System.out.println("\n\n\n");
			System.out.println("TABLE OF: "+a);
			System.out.println("\n");		
			for(int i=1;i<=10;i++)
			{
				//x=a*i;
				System.out.println(a + " x " + i + "=" + a*i);
			}
		}
		
	}
}
*/

class Loops
{
	public static void main(String[] args) 
	{
		for(int a=1;a<=20;a++)
		{
			System.out.println("\n\n");
			System.out.println("TABLE OF: "+ a );
			System.out.println("\n");		
			for(int i=1;i<=10;i++)
			{
				System.out.println(a + " x " + i + " = " + a*i);
			}
		}
		
	}
}

/*
import java.util.Scanner;
class Loops
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER WHICH TABLE YOU WANT DISPLAY");
		int i=sc.nextInt();
		int a=1;
		while(a<=10)
		{
			System.out.println(i + " x " + a + " = " + i*a);
			a++;
		}
		
	}
}
*/
/*
import java.util.Scanner;
class Loops
{
	public static void main(String[] args) 
	{
		int pass_word;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR PIN TO SET: ");
		int pass=sc.nextInt();
		do
		{
			System.out.println("Enter your pin:");
			pass_word=sc.nextInt();
			System.out.println("Enter Amount For withdraw:");
			float amt=sc.nextFloat();
			System.out.println(amt + "rs Withdrawal \n THANK YOU:)");
		}
		while (pass_word==pass);
		
	}
}
*/
/*
import java.util.Scanner;
class Loops
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int ch=sc.nextInt();
		int j;
		for(int i=0;i<ch;i++)
		{
			for (j=0;j<=i;j++)
			{
				System.out.print(" @");
				
			}
			System.out.println("\n");
			
		}
	}
}
*/