
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        switch (marks) {
            case 80 :
                System.err.println("A");
                break;
                case 70:
                    System.out.println("B");
                    break;
                      case 60:
                    System.out.println("C");
                    break;
            default:
               System.err.println("fail");
        }
    
    }
}
