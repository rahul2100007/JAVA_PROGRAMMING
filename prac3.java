class prac3
{
	public static void main(String[] args) 
	{
		table();
	}
	public static void table() 
	{
		for(int a=20;a>=10;a--)
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