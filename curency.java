import java.util.Scanner;

public class curency
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        double amt, ex_Rate;
        String code1, code2;
        System.out.print("Enter the input currency code: ");
        code1 = sc.next();
        System.out.print("Enter the output currency code: ");
        code2 = sc.next();
        System.out.print("Enter the " + code1 + " Amount: ");
        amt = sc.nextDouble();
        System.out.print("Enter the Exachange rate for " + code1 + " to " + code2 + ": " );
        ex_Rate = sc.nextDouble();
        System.out.println("Amount in " + code2 + ": " + amt * ex_Rate);
    }
}