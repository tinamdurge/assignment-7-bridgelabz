import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("The nth fibonacci number is: " + fibonacci(n));
        sc.close();
    }

    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
