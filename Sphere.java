import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();

        double sa = 4 * Math.PI * r * r;
        double volume = (4.0 / 3) * Math.PI * r * r * r;

        System.out.println(sa);
        System.out.println(volume);
    }
}
