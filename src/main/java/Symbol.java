public class Symbol {
    private int arabic;
    private String roman;

    public Symbol(int arabic, String roman) {
        this.arabic = arabic;
        this.roman = roman;
    }

    public int getArabic() {
        return arabic;
    }

    public void setArabic(int arabic) {
        this.arabic = arabic;
    }

    public String getRoman() {
        return roman;
    }

    public void setRoman(String roman) {
        this.roman = roman;
    }
}
