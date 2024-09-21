class courseobj
{
	int courseid,duration,credit;
	String name;
	public static void main(String arg[])
	{
		courseobj obj=new courseobj();
		obj.courseid=205;
		obj.duration=6;
		obj.name="DBMS";
		obj.credit=6;
		System.out.println("courseid"+obj.courseid);
		System.out.println("name"+obj.name);
		System.out.println("duration"+obj.duration);
		System.out.println("credit"+obj.credit);
	}
}

