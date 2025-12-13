import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble(), w = sc.nextDouble(), h = sc.nextDouble();

        double sa = 2 * (l*w + l*h + w*h);
        double volume = l * w * h;

        System.out.println(sa);
        System.out.println(volume);
    }
}
