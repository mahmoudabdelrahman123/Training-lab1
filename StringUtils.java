package lab3;

public class StringUtils {

    public static boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }

    public static String capitalise(String s) {
        if (isEmpty(s))
            return s;

        char first = s.charAt(0);
        if (first >= 'a' && first <= 'z') {
            first = (char)(first - 32);
        }

        String result = "" + first;
        for (int i = 1; i < s.length(); i++) {
            result += s.charAt(i);
        }
        return result;
    }

    public static String repeat(String s, int times) {
        String result = "";
        for (int i = 0; i < times; i++) {
            result += s;
        }
        return result;
    }

    public static int countChar(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(isEmpty(""));
        System.out.println(capitalise("java"));
        System.out.println(repeat("Hi", 3));
        System.out.println(countChar("banana", 'a'));
    }
}
