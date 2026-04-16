package lab2;

public class TimesTable {
    public static void main(String[] args) {

        // Column headers
        System.out.print("    ");
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        // Rows and values
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%4d", i);

            for (int j = 1; j <= 5; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}