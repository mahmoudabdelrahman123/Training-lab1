public class BankAccount {
    public static void main(String[] args) {
        String accountHolder = "Mahmoud Abdelrahman";
        long accountNumber = 1234567890123L;
        double balance = 15230.75;
        boolean isActive = true;

        System.out.printf(
                "Account Holder: %s%nAccount Number: %d%nBalance: %.2f%nActive: %b%n",
                accountHolder, accountNumber, balance, isActive
        );
    }
}