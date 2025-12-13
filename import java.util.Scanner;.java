import java.util.Scanner;

class AsciiOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (ch % 2 == 0)
            System.out.println("Even ASCII");
        else
            System.out.println("Odd ASCII");
    }
}
