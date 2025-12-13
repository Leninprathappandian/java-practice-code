import java.util.Scanner;

public class fine{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed =sc.nextInt();
        if(speed<=100){
            System.out.println("speed is within limit");
        }
        else{
            System.out.println("Over-speeding! Fine imposed");
        }
    }
}
