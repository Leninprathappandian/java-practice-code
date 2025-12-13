
import java.util.Scanner;

public class health {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp =sc.nextInt();
        if(temp>=98&&temp<=100){
            System.out.println("normal");
        }
        else if(temp>100&&temp<=102){
            System.out.println("fever");
        }
        else{
            System.out.println("high fever");
        }
    }
    
}
