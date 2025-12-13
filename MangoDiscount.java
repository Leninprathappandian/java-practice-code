import java.util.Scanner;

public class MangoDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mangoes = sc.nextInt();
        int price = sc.nextInt();

        int paidMangoes = mangoes - (mangoes / 4);  // 1 free in every 4
        System.out.println(paidMangoes * price);
    }
}
