import java.util.Scanner;

public class fact  {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();
            System.out.printf("%.2f", num);
        }
    }
}
