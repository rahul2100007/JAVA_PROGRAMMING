class prac2 
{
	public static void main(String[] args) 
	{
		int x=10;
		x+=10;
		x-=5;
		int l=100;
		if (x>10 || l<10)
		{
			System.out.println("x is grater then 10");
		}
		else if (x<10 || l>=10)
		{
			System.out.println("x is less then 10");
		}
		else if (x!=10 && l==100)
		{
			System.out.println("x is equal to 10");
		}
		System.out.println("sum:"+ (2+4));
		System.out.println("diff:"+ (120-9));
		System.out.println("multi:"+ (7*2));
		System.out.println("div:"+ (10/2));
		int a=10;
		System.out.println("post increment:"+ a++);
		System.out.println("pre incriment:"+ ++a);
		int b=9;
		System.out.println("post decrement:"+ b--);
		System.out.println("pre decriment:"+ --b);
	}
}
