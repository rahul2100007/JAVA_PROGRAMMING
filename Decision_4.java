import java.util.Scanner;
class Decision_4
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String healthCondition,locationType,gender;
		int age;
		System.out.print("Enter your health condition (like:excellent,poor):");
		healthCondition=sc.nextLine();
		System.out.print("\nEnter your location type (like:city,villege):");
		locationType=sc.nextLine();
		System.out.print("\nEnter your gender male or female:");
		gender=sc.nextLine();
		System.out.print("\nEnter your age:");
		age=sc.nextInt();
		if (healthCondition.equals("excellent") && age>=25 && age<=35 && locationType.equals("city") && gender.equals("male"))
		{
			System.out.println("Your premium is Rs. 4000.\n Maximum policy amount is Rs. 2 lakhs");
		}
		else if (healthCondition.equals("excellent") && age>=25 && age<=35 && locationType.equals("city") && gender.equals("female"))
		{
			System.out.println("Your premium is Rs. 3000.\n Maximum policy amount is Rs. 1 lakh");
		}
		else if (healthCondition.equals("poor") && age>=25 && age<=35 && locationType.equals("villege") && gender.equals("male"))
		{
			System.out.println("Your premium is Rs. 6000.\n Maximum policy amount is Rs. 10000");
		}
		else
		{
			System.out.println("You are not insured :( ");
		}
	}
}
