import java.util.*;

public class RomanNumberConverter {

    public static Map SYMBOLS;

    static {
        SYMBOLS = new HashMap();
        SYMBOLS.put(1, "I");
        SYMBOLS.put(5, "V");
        SYMBOLS.put(10, "X");
        SYMBOLS.put(50, "L");
        SYMBOLS.put(100, "C");
        SYMBOLS.put(500, "D");
        SYMBOLS.put(1000, "M");
    }

    public static String toRoman(int i) {
        StringBuilder result = new StringBuilder();

        if (i == 1000) {
            result.append(SYMBOLS.get(1000));
            return result.toString();
        }
        if (i >= 900) {
            result.append(SYMBOLS.get(100)).append(SYMBOLS.get(1000));
            i -= 900;
        }
        if (i >= 500) {
            result.append(SYMBOLS.get(500));
            i -= 500;
        }
        if (i >= 400) {
            result.append(SYMBOLS.get(100)).append(SYMBOLS.get(500));
            i -=400;
        }
        while (i >= 100) {
            result.append(SYMBOLS.get(100));
            i -= 100;
        }
        if (i >= 90) {
            result.append(SYMBOLS.get(10)).append(SYMBOLS.get(100));
            i -= 90;
        }
        if (i >= 50) {
            result.append(SYMBOLS.get(50));
            i -= 50;
        }
        if (i >= 40) {
            result.append(SYMBOLS.get(10)).append(SYMBOLS.get(50));
            i -=40;
        }
        while (i >= 10) {
            result.append(SYMBOLS.get(10));
            i -= 10;
        }
        if (i == 9) {
            result.append(SYMBOLS.get(1)).append(SYMBOLS.get(10));
            return result.toString();
        }
        if (i >= 5) {
            result.append(SYMBOLS.get(5));
            i -= 5;
        }
        if (i == 4) {
            result.append(SYMBOLS.get(1)).append(SYMBOLS.get(5));
            return result.toString();
        }
        while (i-- > 0) {
            result.append(SYMBOLS.get(1));
        }

        return result.toString();
    }
}