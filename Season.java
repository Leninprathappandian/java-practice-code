import java.util.Scanner;

class Season {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
       int m = sc.nextInt();

        switch (m) {
            case 3,4,5 :
                 System.out.println("Summer");
                 break;
            case 6,7,8 :
                 System.out.println("Rainy");
                 break;
            case 9,10,11:
                 System.out.println("Autumn");
                 break;
            case 12,1,2:
                System.out.println("Winter");
                break;
            default:
                 System.out.println("Invalid Month");
        }
    }
}
