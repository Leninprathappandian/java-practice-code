import java.util.Scanner;

public class SplitBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalBill = sc.nextDouble();
        System.out.println(totalBill / 3);
    }
}
