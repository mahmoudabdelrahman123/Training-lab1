package lab3;

public class NumberUtils {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static int reverseNumber(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int n) {
        return n == reverseNumber(n);
    }

    public static int sumDigits(int n) {
        if (n == 0)
            return 0;
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(isPrime(7));
        System.out.println(reverseNumber(123));
        System.out.println(isPalindrome(121));
        System.out.println(sumDigits(456));
    }
}
