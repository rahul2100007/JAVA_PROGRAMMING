/*
class lab_vii 
{
	static String pm="Ram";
	public static void main(String[] args) 
	{
		String pm="Laxman";
		System.out.println(lab_vii.pm);
	}
}
*/
/*
class lab_vii 
{
	static
	{
		String pm="Ram";
		System.out.println(pm);
	}
	public static void main(String[] args) 
	{
		String pm="Laxman";
		System.out.println(pm);
	}
}
*/
class lab_vii
{
	int id;
	String numb,color,model;
	public static void main(String arg[])
	{
		lab_vii obj=new lab_vii();
		obj.id=1001;
		obj.numb="GJ-18AQ-0627 ";
		obj.color="BLACK";
		obj.model="PASION_PRO";
		System.out.println(obj.id);
		System.out.println(obj.numb);
		System.out.println(obj.color);
		System.out.println(obj.model);
	}
}