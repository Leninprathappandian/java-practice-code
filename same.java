
import java.util.Scanner;

public class same {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year1 = sc.nextInt();
        int yearTwo = sc.nextInt();
        year1 = year1 % 100;
        yearTwo = yearTwo % 100;
        if(year1==yearTwo){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}
