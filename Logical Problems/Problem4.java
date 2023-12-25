import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("Reverse of the number is: " + reverse(number));
        sc.close();
    }

    public static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        return rev;
    }
}