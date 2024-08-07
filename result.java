import java.util.Scanner;
class result
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int M1,M2,M3,M4,M5,sum;
        float result;
        System.out.print("ENTER MARKS 1: ");
        M1 = sc.nextInt();
        System.out.print("ENTER MARKS 2: ");
        M2 = sc.nextInt();
        System.out.print("ENTER MARKS 3: ");
        M3 = sc.nextInt();
        System.out.print("ENTER MARKS 4: ");
        M4 = sc.nextInt();
        System.out.print("ENTER MARKS 5: ");
        M5 = sc.nextInt();
        sum=M1+M2+M3+M4+M5;
        result = sum/5;
        System.out.println("Your result of 5 subject is: " + result + "%");
        if (result>=91)
        {
            System.out.println("YOU GOT GRADE A");
        }
        else if (result>=81 && result<=90)
        {
            System.out.println("YOU GOT GRADE B");
        }
        else if (result>=71 && result<=80)
        {
            System.out.println("YOU GOT GRADE C");
        }
        else if (result>=61 && result<=70)
        {
            System.out.println("YOU GOT GRADE D");
        }
    }
}