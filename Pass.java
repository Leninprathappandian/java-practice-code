
import java.util.Scanner;

class Pass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if(marks>40){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
    }
}
