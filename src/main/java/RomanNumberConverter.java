public class RomanNumberConverter {
    public static String toRoman(int i) {
        StringBuilder result = new StringBuilder();

        if (i == 9) return "IX";
        if (i >= 5) {
            result.append("V");
            i -= 5;
        }
        if (i == 4) return "IV";
        while(i-- > 0){
            result.append("I");
        }

        return result.toString();
    }
}