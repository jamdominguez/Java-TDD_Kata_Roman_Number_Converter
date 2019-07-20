public class RomanNumberConverter {
    public static String toRoman(int i) {
        StringBuilder result = new StringBuilder();

        if (i == 4) return "IV";
        while(i-- > 0){
            result.append("I");
        }

        return result.toString();
    }
}
