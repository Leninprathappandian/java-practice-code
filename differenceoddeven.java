
import java.util.Scanner;

public class differenceoddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int diff = a - b;
        if (diff % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        sc.close();
    }
}
