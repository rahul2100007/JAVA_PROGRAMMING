class prac9 
{
	public static void main(String[] args) 
	{
		int count=0;
		for (int i=1;i<100;i++)
		{
			if (i%3==0&&i%5==0)
			{
				count++;
			}
		}
		System.out.println(count+" Number are divisible by 3 and 5");
	}
}
