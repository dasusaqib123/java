import java.util.Scanner;
class If
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int a=sc.nextInt();

        if(a<20)
        {
            System.out.println(+a+ "is less then 20");
        }
    }
}