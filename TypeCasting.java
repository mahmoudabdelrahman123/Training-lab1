public class TypeCasting {
    public static void main(String[] args) {
        double price = 29.99;
        int priceInt = (int) price;

        System.out.println("Double: " + price);
        System.out.println("Int (after casting): " + priceInt);

        System.out.println("7 / 2 = " + (9 / 2));
        System.out.println("(double)7 / 2 = " + ((double)9 / 2));

        String str = "42";
        int num = Integer.parseInt(str);
        System.out.println("Parsed number = " + num);
    }
}