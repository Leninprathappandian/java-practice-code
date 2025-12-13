import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble(), h = sc.nextDouble();

        double sa = 2 * Math.PI * r * (h + r);
        double volume = Math.PI * r * r * h;

        System.out.println(sa);
        System.out.println(volume);
    }
}
