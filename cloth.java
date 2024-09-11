class cloth extends employee_92
{
		String brand="adidas";
		public cloth(int id,String name)
		{
			this.id=id;
			this.name=name;
		}
		public static void main(String Args[])
	    {
			cloth obj1=new cloth(101,"t-shirt");
			System.out.println(obj1.id);
			System.out.println(obj1.brand);
			System.out.println(obj1.name);
	    }
}