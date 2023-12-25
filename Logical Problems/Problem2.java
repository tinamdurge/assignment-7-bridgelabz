import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        if (isPerfect(number)) {
            System.out.println("The number you entered is perfect number.");
        } else {
            System.out.println("The number you entered is not a perfect number.");
        }
        sc.close();
    }

    public static boolean isPerfect(int num) {
        ArrayList<Integer> factors = new ArrayList<>();

        // storing all factors of number
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                factors.add(i);
                factors.add(num / i);
            }
        }

        int sum = 0;

        // adding all the factors except number itself
        for (int i = 0; i < factors.size(); i++) {
            if (factors.get(i) != num) {
                sum += factors.get(i);
            }
        }

        return sum == num;
    }
}
