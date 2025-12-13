
import java.util.Scanner;

public class weekday {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String day=sc.nextLine();
        if(day.equals("monday")&&day.equals("wednesday")||day.equals("friday")&&day.equals("thursday")&&day.equals("tuesday")){
            System.out.println("weakday price");
        }
        else{
            System.out.println("weekend price");
        }
    }
}
