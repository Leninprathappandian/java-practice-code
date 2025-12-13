import java.util.Scanner;

class SmallestThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if (a <= b && a <= c)
            System.out.println(a + " is smallest");
        else if (b <= a && b <= c)
            System.out.println(b + " is smallest");
        else
            System.out.println(c + " is smallest");
    }
}
