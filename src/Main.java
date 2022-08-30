import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        String res;
        switch (day) {
            case 1:
                res = Days.MONDAY.getPlanner();
                break;
            case 2:
                res = Days.TUESDAY.getPlanner();
                break;
            case 3:
                res = Days.WEDNESDAY.getPlanner();
                break;
            case 4:
                res = Days.THURSDAY.getPlanner();
                break;
            case 5:
                res = Days.FRIDAY.getPlanner();
                break;
            case 6:
                res = Days.SATURDAY.getPlanner();
                break;
            case 7:
                res = Days.SUNDAY.getPlanner();
                break;
            default:
                res = "Wrong number";
        }
        System.out.println(res);
    }
}