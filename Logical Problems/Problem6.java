import java.util.*;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long startTime = System.currentTimeMillis();
        System.out.println("The timer has started....");
        System.out.print("To stop the timer, press ENTER");
        sc.nextLine();
        long endTime = System.currentTimeMillis();
        System.out.println("The timer has stopped....");
        System.out.println("Time elapsed is: " + (endTime - startTime) + " ms");
        sc.close();
    }
}
