package lab3;

public class BankUtils {

    public static double calculateSimpleInterest(double principal, double rate, int years) {
        return principal * rate * years;
    }

    public static double calculateCompoundInterest(double p, double r, int n) {
        return p * Math.pow((1 + r), n);
    }

    public static String formatAmount(double amount, String currency) {
        return amount + " " + currency;
    }

    public static void main(String[] args) {
        System.out.println(calculateSimpleInterest(1000, 0.05, 2));
        System.out.println(calculateCompoundInterest(1000, 0.05, 2));
        System.out.println(formatAmount(1500, "EGP"));
    }
}
