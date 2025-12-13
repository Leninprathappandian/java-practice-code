import java.time.LocalTime;

public class time {
    public static void main(String[] args) {
        LocalTime t = LocalTime.now();
        System.out.printf("%02d:%02d:%02d", t.getHour(), t.getMinute(), t.getSecond());
    }
}
