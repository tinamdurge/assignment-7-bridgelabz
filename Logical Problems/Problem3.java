import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        if (isPrime(number)) {
            System.out.println("The number is prime number.");
        } else {
            System.out.println("The number is not a prime number.");
        }
        sc.close();
    }

    public static boolean isPrime(int num) {
        if (num == 0 || num == 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
