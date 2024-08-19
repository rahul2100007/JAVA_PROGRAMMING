import java.util.Scanner;
class RestuBill 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int menuNum,qty,disct;
		int bill;
		System.out.println("===========MENU===========");
		System.out.println("CHOICE     ITEM        PRICE");
		System.out.println(" <1>      BURGER       150rs.");
		System.out.println(" <2>      PIZZA        300rs.");
		System.out.println(" <3>      SANDWICH     100rs.");
		System.out.println("==========================");
		System.out.println("Enter menu choice:");
		menuNum=sc.nextInt();
		System.out.println("Enter Quantity:");
		qty=sc.nextInt();
		System.out.println("+-----------------------+");
		System.out.println("|         BILL          |");
		System.out.println("+-----------------------+");
		System.out.println("| QTY    ITEM   AMOUNT  |");
		System.out.println("|~~~~~+~~~~~~~+~~~~~~~~~|");
		switch (menuNum)
		{
		case 1:
			{
				bill=qty*150;
				int gst=(bill*12)/100;
				bill+=gst;
				if(qty>=5)
				{
					disct=(bill*10)/100;
					bill=bill-disct;
				}
				if(qty<=6){
				System.out.println("| <"+qty+">   BURGER  "+bill+"rs/- |");
				}
				else{
					System.out.println("| <1>  BURGER  "+bill+"rs/- |");
				}
			}
			break;
		case 2:
			{
				bill=qty*300;
				int gst=(bill*12)/100;
				bill+=gst;
				if(bill>1000)
				{
					disct=(bill*15)/100;
					bill=bill-disct;
				}
				if(qty<=3){
				System.out.println("| <"+qty+">   PIZZA   "+bill+"rs/- |");
				}
				else{
					System.out.println("| <"+qty+">  PIZZA   "+bill+"rs/- |");
				}
			}
			break;
		case 3:
			{
				bill=qty*100;
				int gst=(bill*12)/100;
				bill+=gst;
				if(bill>500)
				{
					disct=(bill*20)/100;
					bill=bill-disct;
				}
				if(qty<=11){
				System.out.println("| <"+qty+"> SANDWICH "+bill+"rs/- |");
				}
				else{
					System.out.println("|<"+qty+"> SANDWICH "+bill+"rs/- |");
				}
				
			}
			break;
		}
		System.out.println("+-----------------------+");
	}
}
