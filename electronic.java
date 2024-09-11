class electronic extends employee_92
{
		String brand="hp";
		public electronic(int id,String name)
		{
			this.id=id;
			this.name=name;
		}
		public static void main(String Args[])
	    {
			electronic obj1=new electronic(101,"laptop");
			System.out.println(obj1.id);
			System.out.println(obj1.brand);
			System.out.println(obj1.name);
	    }
}