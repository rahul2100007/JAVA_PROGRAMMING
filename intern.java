static class intern extends employee_9
{
		String role="intern";
		public intern(int id,String name,double salary)
		{
			this.id=id;
			this.name=name;
			this.salary=salary;
		}
		public static void main(String Args[])
		{
			developer obj1=new developer(103,"mayank bha",300);
			System.out.println(obj1.id);
			System.out.println(obj1.role);
			System.out.println(obj1.name);
			System.out.println(obj1.salary);	
		}
}
