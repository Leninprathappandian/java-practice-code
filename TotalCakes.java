import java.util.Scanner;

public class TotalCakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flour = sc.nextInt();  // flour packets
        int eggs = sc.nextInt();   // eggs
        System.out.println(Math.min(flour, eggs));
    }
}
