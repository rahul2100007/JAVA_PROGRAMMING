/*
class student
{
	public static void main(String arg[])
	{
		int S=12;
		int M=25;
		int L=3;
		M-=5;
		S+=5;
		S-=7;
		M+=7;
		M-=10;
		System.out.println("SHEELA : " + S);
		System.out.println("MALA : " + M);
		System.out.println("LAILA" + L);
	}
}

*/
/*
class student
{
	public static void main(String arg[])
	{
		int R=30000;
		int S=30000;
		int H=5000;
		R-=5000+5000;
		S-=10000;
		S-=5000;
		H+=5000;
		H-=4000;
		S+=2000;
		System.out.println("RAM : " + R);
		System.out.println("SHYAM : " + S);
		System.out.println("HARI : " + H);
	}
}
*/
/*
import java.util.Scanner;
class student
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NUMBER:");
		int R=sc.nextInt();
		String str=(R%2==0)?"Number is Even":"Number is odd";
		System.out.println(str);
	}
}
*/
/*
import java.util.Scanner;
class student
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NUMBER:");
		int R=sc.nextInt();
		if(R%2==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
	}
}
*/
import java.util.Scanner;
class student
{
	public static void main(String arg[])
	{
		Scanner scan=new Scanner(System.in);
		int a;
		System.out.print("Enter choice 1 to 3: ");
		a=scan.nextInt();
		switch(a)
		{
			case 1:
			{
				System.out.println("helloooooo");
			}
			break;
			case 2:
			{
				System.out.println("hiiiiiii");
			}
			break;
			case 3:
			{
				System.out.println("byeeeeeee");
			}
			break;
			default:
			{
				System.out.println("okkkkkkkk");
			}
		}
	}
}