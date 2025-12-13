
import java.util.Scanner;

public class mobiledata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data =sc.nextInt();
        if(data==100){
            System.out.println("full");
        }
        else if(data>=50){
            System.out.println("half");
        }
        else{
            System.out.println("low");
        }
    }
}
