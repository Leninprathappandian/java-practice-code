import java.util.Scanner;

class MonthDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();

        switch (month) {
            case 1,3,5,7,8,10,12 -> System.out.println("31 days");
            case 4,6,9,11 -> System.out.println("30 days");
            case 2 -> {
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
                    System.out.println("29 days");
                else
                    System.out.println("28 days");
            }
            default -> System.out.println("Invalid month");
        }
    }
}
