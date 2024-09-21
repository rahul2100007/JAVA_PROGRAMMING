class prac7_3
{
	static
	{
		System.out.println("1.ITS DEFINED BEFORE MAIN METHOD");
	}
	public static void main(String[] args) 
	{
		System.out.println("2.THIS CONTENT IN MAIN METHOD");
	}
	static
	{
		System.out.println("3.ITS DEFINED AFTER MAIN METHOD");
	}
}