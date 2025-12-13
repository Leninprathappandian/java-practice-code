
import java.util.Scanner;

class Traffic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String color = sc.nextLine();


        switch (color) {
            case "Red" -> System.out.println("Stop");
            case "Yellow" -> System.out.println("Ready");
            case "Green" -> System.out.println("Go");
        }
    }
}
