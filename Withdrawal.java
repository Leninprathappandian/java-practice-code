
import java.util.Scanner;

class Withdrawal {
    public static void main(String[] args) {
        int bal = 10000;
        Scanner sc =new Scanner(System.in);
        int amt = sc.nextInt();

        if (amt <= bal && amt % 100 == 0)
            System.out.println("Withdraw Success");
        else
            System.out.println("Invalid Amount");
    }
}
