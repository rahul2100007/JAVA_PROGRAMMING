import java.util.Scanner;
class election_eligiblity
{
    public static void main(String arg[])
    {
        int age;
        String pass;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age: ");
        age=sc.nextInt();
        String str=(age>=18)?"You are eligible for voting \n":"You are not eligible for voting\n";
        System.out.print(str);
        System.out.print("Enter Password: ");
        pass=sc.next();
        String str1=(pass.length()>6 && pass.length()<16)?"password created":"password should be greater then 6 and less then 16 character";
        System.out.print(str1);
    }
}
