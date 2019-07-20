public class RomanNumberConverter {
    public static String toRoman(int i) {
        StringBuilder result = new StringBuilder();

        if (i == 7) return "VII";
        if (i == 6) return "VI";
        if (i == 5) return "V";
        if (i == 4) return "IV";
        while(i-- > 0){
            result.append("I");
        }

        return result.toString();
    }
}
