public class Symbol {
    private int decimal;
    private String roman;

    public Symbol(int decimal, String roman) {
        this.decimal = decimal;
        this.roman = roman;
    }

    public int getDecimal() {
        return decimal;
    }

    public void setDecimal(int decimal) {
        this.decimal = decimal;
    }

    public String getRoman() {
        return roman;
    }

    public void setRoman(String roman) {
        this.roman = roman;
    }
}
