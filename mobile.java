
import java.util.Scanner;

public class mobile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String num=sc.nextLine();
        if(num.length()==10){
            System.out.println("valid");
        }
        else{
            System.out.println("invalid");
        }
    }
}
