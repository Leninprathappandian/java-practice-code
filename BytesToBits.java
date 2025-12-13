import java.util.Scanner;

public class BytesToBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long bytes = sc.nextLong();
        System.out.println(bytes * 8);
    }
}
