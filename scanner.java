import java.util.Scanner;
class scanner
{
	public static void main(String args[])
	{
		//Scanner sc=new Scanner(System.in);
		//System.out.println("ENTER FIRST ELEMENT:");
		//int a=sc.nextInt();
		//System.out.println("ENTER SECOND ELEMENT:");
		//int b=sc.nextInt();
		//System.out.print("YOUR RESULT IS:");
		//int c=a+b;
		//System.out.println(c);//30
		//float jay=sc.nextFloat();
		//System.out.print("YOUR RESULT IS:");
		//System.out.println(jay);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER FIRST ELEMENT:");
		float a=sc.nextFloat();
		System.out.println("ENTER SECOND ELEMENT:");
		float b=sc.nextFloat();
		System.out.print("YOUR RESULT IS:");
		float c=a+b;
		System.out.println(c);//30
		System.out.println("ENTER FIOAT ELEMENT:");
		float jay=sc.nextFloat();
		System.out.print("YOUR RESULT IS:");
		System.out.println(jay);
		
		//Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NAME:");
		String str=sc.nextLine();
		System.out.print("YOUR NAME IS:");
		System.out.println(str);
		
		
		System.out.println("ENTER character:");
		char ch=sc.next().charAt(0);
		System.out.print("RESULT:");
		System.out.println(ch);
	}
}