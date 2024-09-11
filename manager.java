class manager extends employee_9
{
		String role="manager";
		public manager(int id,String name,double salary)
		{
			this.id=id;
			this.name=name;
			this.salary=salary;
		}
		public static void main(String Args[])
	    {
			manager obj1=new manager(101,"rahul boss",600000);
			System.out.println(obj1.id);
			System.out.println(obj1.role);
			System.out.println(obj1.name);
			System.out.println(obj1.salary);
	    }
}