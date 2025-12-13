import java.util.Scanner;

public class octualinteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.next(), 8);
        System.out.println(num);
    }
}
