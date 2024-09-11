class groceries extends employee_92
{
		String brand="Tirupati";
		public groceries(int id,String name)
		{
			this.id=id;
			this.name=name;
		}
		public static void main(String Args[])
	    {
			groceries obj1=new groceries(101,"cottenseed-oil");
			System.out.println(obj1.id);
			System.out.println(obj1.brand);
			System.out.println(obj1.name);
	    }
}