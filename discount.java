import java.util.Scanner;
class discount
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        double totalAmount;
        System.out.print("Enter your total amount: ");
        totalAmount=sc.nextDouble();
        String str=(totalAmount>=10000)?"\nYou are eligible for 25% discount":"\nYou are eligible for 2% discount";
        System.out.println(str);
        float prct;
        System.out.print("Enter your percentage: ");
        prct=sc.nextFloat();
        String jamura=(prct>33)?"\nPASSED":"\nFAILED";
        System.out.println(jamura);
        int num;
        System.out.print("Enter Number: ");
        num=sc.nextInt();
        String number=(num%2==0)?"\nNUMBER IS EVEN":"\nNUMBER IS ODD";
        System.out.println(number);
    }
}
