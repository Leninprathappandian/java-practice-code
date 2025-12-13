import java.util.Scanner;

public class PenDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pens = sc.nextInt();
        int price = sc.nextInt();

        int freePens = pens / 5;
        int paidPens = pens - freePens * 2; // pay for 3 out of 5
        System.out.println(paidPens * price);
    }
}
