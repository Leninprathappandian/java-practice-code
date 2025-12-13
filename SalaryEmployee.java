import java.util.Scanner;

public class SalaryEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double basic = sc.nextDouble();
        double hra = sc.nextDouble();
        double da = sc.nextDouble();
        System.out.println(basic + hra + da);
    }
}
