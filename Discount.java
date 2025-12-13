
import java.util.Scanner;

class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bill = sc.nextInt();
        if (bill >= 5000)
            System.out.println("20% Discount");
        else if (bill >= 2000)
            System.out.println("10% Discount");
        else
            System.out.println("No Discount");
    }
}
