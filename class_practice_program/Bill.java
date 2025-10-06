import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter unit");
        int unit = sc.nextInt();
        int bill = 0;   // ✅ initialized

        if (unit <= 100) {
            bill = unit * 8;
        } else if (unit > 100 && unit <= 200) {
            bill = unit * 10;
        } else if (unit > 200 && unit <= 300) {
            bill = unit * 11;
        } else if (unit > 300) {
            bill = unit * 12;
        }

        System.out.println("Total bill amount: " + bill);
    }
}
