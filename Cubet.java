import java.util.Scanner;

public class Cubet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        double sa = 6 * a * a;
        double volume = a * a * a;
        double peri = 12 * a;

        System.out.println(sa);
        System.out.println(volume);
        System.out.println(peri);
    }
}
