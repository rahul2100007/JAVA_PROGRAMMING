class employee1
{
	public static void main(String[] args) 
	{
		employee obj=new employee(53,"ambani",99992549);
		obj.setSalary(999999999);
		System.out.println("SALARY:" + obj.getSalary());
		System.out.println("NAME:" + obj.name);
		System.out.println("AGE:" + obj.age);
	}
}