import java.util.Scanner;

public class PerimeterRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble(), w = sc.nextDouble();
        System.out.println(2 * (l + w));
    }
}
