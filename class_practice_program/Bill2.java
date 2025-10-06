import java.util.Scanner;
public class Bill2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter unit");
        int unit=sc.nextInt();
        int bill=0;

         if (unit <= 100) {
            bill = unit * 8;
        } else if (unit <= 200) {
            bill = (100 * 8) + (unit - 100) * 10;
        } else if (unit <= 300) {
            bill = (100 * 8) + (100 * 10) + (unit - 200) * 11;
        } else if(unit>300){
            bill = (100 * 8) + (100 * 10) + (100 * 11) + (unit - 300) * 12;
        }

        System.out.println("Total bill amount: " + bill+ "Rs");

    }
}