import java.util.Scanner;

public class hexadecimal {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int num = s.nextInt();
            System.out.printf("%x", num);
        }
    }
}
