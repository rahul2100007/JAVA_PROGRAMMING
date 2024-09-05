import java.util.Scanner;
class Decision_3
{
	public static void main(String[] args) 
	{
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your age: ");
		age=sc.nextInt();
		if(age>=18)
		{
			System.out.print("You are eligible for voting");
		}
		else
		{
			System.out.print("You are not eligible for voting\n");
		}
	}
}
