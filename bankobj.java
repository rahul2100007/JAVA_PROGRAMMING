class bankobj 
{
	long accnum;
	int branchcode;
	String name,branch;
	public static void main(String arg[])
	{
		bankobj obj=new bankobj();
		obj.accnum=78136859;
		obj.branchcode=00535;
		obj.name="Rahul";
		obj.branch="Dehgam";
		System.out.println(obj.accnum);
		System.out.println(obj.branchcode);
		System.out.println(obj.name);
		System.out.println(obj.branch);
	}
}

