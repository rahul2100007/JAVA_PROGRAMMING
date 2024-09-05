class employee
{
	int age;
	private long salary;
	String name;
	public employee(int age,String name,long salary) 
	{
		this.age=age;
		this.name=name;
		this.salary=salary;
	}
	public void setSalary(long number)
	{
		this.salary=number;
	}
	public long getSalary()
	{
		return salary;
	}
}