class prac7_2
{
	static String pm="Ram";//static variable
	static//static method which is run before main method
	{
		String method="rahul";
		System.out.println(method);//rahul
	}
	public static void main(String[] args) 
	{
		String pm="Laxman";
		System.out.println(prac7_2.pm);//print static global variable which is "Ram" not "Laxman" because we access by classname
		String method1="jay";
		System.out.println(method1);//jay
	}
}
/*
OUTPUT WILL BE:-
				rahul
				Ram
				jay
*/
