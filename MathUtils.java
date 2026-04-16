package lab3;

public class MathUtils {

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int absolute(int n) {
        return (n < 0) ? -n : n;
    }

    public static double power(double base, int exp) {
        double result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Max: " + max(10, 20));
        System.out.println("Min: " + min(10, 20));
        System.out.println("Is Even: " + isEven(7));
        System.out.println("Absolute: " + absolute(-15));
        System.out.println("Power: " + power(2, 3));
    }
}