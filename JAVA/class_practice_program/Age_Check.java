import java.util.Scanner;
public class Age_Check
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age");
        int age=sc.nextInt();
        if(age<=18)
        {
            System.out.println("Not eligable for vote");
        }
        else
        {
            System.out.println("Eligable for vote");
        }
    }    
}        