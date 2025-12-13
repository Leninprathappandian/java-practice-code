import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String word = sc.next();   // reads one word as input
            System.out.println(word);  // prints the same word
        }
    }
}

