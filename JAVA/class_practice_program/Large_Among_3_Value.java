import java.util.Scanner;
class Large_Among_3_Value
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number");
        int a=sc.nextInt();
        System.out.println("enter 2nd number");
        int b=sc.nextInt();
        System.out.println("enter 3rd number");
        int c=sc.nextInt();

        if(a>b && a>c)
        {
            System.out.println(+a+ " is Greater then "+b+"&"+c);
        }
        else if (b>a  && b>c)
        {
            System.out.println(+b+" is Greater then "+a+"&"+c);
        }
        else
        {
            System.out.println(+c+" is Greater then"+a+"&"+b);
        }
    }
}