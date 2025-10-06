import java.util.Scanner;
class If_ElseIf_Else
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int a=sc.nextInt();
        System.out.println("enter number");
        int b=sc.nextInt();

        if(a<b)
        {
            System.out.println(+a+ " is less then "+b);
        }
        else if (a>b)
        {
            System.out.println(+a+" is greater then "+b);
        }
        else
        {
            System.out.println(+a+" Is equal to "+b);
        }
    }
}