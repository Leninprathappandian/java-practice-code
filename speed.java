
import java.util.Scanner;

public class speed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed =sc.nextInt();
        if(speed>80){
            System.out.println("it is below 100kmph");
        }
        else{
            System.out.println("it is above 100kmph");
        }
    }
}
