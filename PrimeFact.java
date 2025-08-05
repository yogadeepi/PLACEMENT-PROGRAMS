import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println("No prime factor");
            return;
        }
        if (num % 2 == 0) {
            System.out.println(2);
            return;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0 && isPrime(i)) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(num);
    }
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
