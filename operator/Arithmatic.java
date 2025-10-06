import java.util.Scanner;
class Arithmatic
{
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter First Number");
      int a=sc.nextInt();
      System.out.println("Enter Second Number");
      int b=sc.nextInt();
      int add=a+b;
      int sub=a-b;
      int mul=a*b;
      int div=a/b;

      System.out.println("Addition of :"+a+"+"+b+"="+add);
      System.out.println("Subtraction of :"+a+"-"+b+"="+sub);
      System.out.println("Multiplication of :"+a+"*"+b+"="+mul);
      System.out.println("Division of :"+a+"/"+b+"="+div);


    }
}