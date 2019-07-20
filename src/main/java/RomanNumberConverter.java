public class RomanNumberConverter {
    public static String toRoman(int i) {
        StringBuilder result = new StringBuilder();

        while(i-- > 0){
            result.append("I");
        }

        return result.toString();
    }
}
