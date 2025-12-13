import java.util.Scanner;

class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());

        if (n <= 9)
            System.out.println("Single-digit");
        else if (n <= 99)
            System.out.println("Two-digit");
        else if (n <= 999)
            System.out.println("Three-digit");
        else
            System.out.println("More than three digits");
    }
}
