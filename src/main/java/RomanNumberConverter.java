public class RomanNumberConverter {

    public static Symbol[] SYMBOLS = {
            new Symbol(1, "I"),
            new Symbol(5, "V"),
            new Symbol(10, "X"),
            new Symbol(50, "L"),
            new Symbol(100, "C"),
            new Symbol(500, "D"),
            new Symbol(1000, "M")
    };

    private static boolean isASpecialNumber(int a, int b, int num) {
        int diff = a - b;
        if (diff == 4 && num == 4) return true;
        if (diff == 40 && num >= 40 && num <= 49) return true;
        if (diff == 400 && num >= 400 && num <= 499) return true;
        if (diff == 9 && num == 9) return true;
        if (diff == 90 && num >= 90 && num <= 99) return true;
        if (diff == 900 && num >= 900 && num <= 999) return true;
        return false;
    }

    public static String toRoman(int num) {
        StringBuilder result = new StringBuilder();

        while (num > 0) { //number upper to 0
            for (int i = SYMBOLS.length - 1; i >= 0; i--) { //check all symbols
                Symbol symbol = SYMBOLS[i];
                if (i > 1 && isASpecialNumber(symbol.getDecimal(), SYMBOLS[i - 2].getDecimal(), num)) {//for 9, 99 , 999
                    result.append(SYMBOLS[i - 2].getRoman()).append(symbol.getRoman());
                    num -= symbol.getDecimal() - SYMBOLS[i - 2].getDecimal();
                    break;
                }
                if (i > 0 && isASpecialNumber(symbol.getDecimal(), SYMBOLS[i - 1].getDecimal(), num)) {//for 4, 44, 444
                    if (SYMBOLS[i - 1].getDecimal() == num) {
                        result.append(SYMBOLS[i - 1].getRoman());
                        num = 0;
                        break;
                    } else {
                        result.append(SYMBOLS[i - 1].getRoman()).append(symbol.getRoman());//equals
                        num -= symbol.getDecimal() - SYMBOLS[i - 1].getDecimal();
                        break;
                    }
                }
                if (num >= symbol.getDecimal()) {
                    result.append(symbol.getRoman());
                    num -= symbol.getDecimal();
                    break;
                }
            }
        }
        return result.toString();
    }
}