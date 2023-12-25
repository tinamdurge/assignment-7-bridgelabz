import java.util.*;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        sc.nextLine();

        HashSet<Integer> coupons = new HashSet<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Coupon Number: ");
            coupons.add(sc.nextInt());
            sc.nextLine();
        }

        System.out
                .println("Number of random numbers to generate all coupon numbers is: " + numberOfRandomNums(coupons));
        sc.close();
    }

    public static int numberOfRandomNums(HashSet<Integer> coupons) {
        Random random = new Random();
        int count = 0;
        while (!coupons.isEmpty()) {
            int number = random.nextInt(Integer.MAX_VALUE);
            if (coupons.contains(number))
                coupons.remove(number);

            count++;
        }
        return count;
    }
}
