import org.junit.Assert;
import org.junit.Test;

public class RomanNumberConverterTest {

    @Test
    public void zeroReturnEmpty(){
        Assert.assertEquals("", RomanNumberConverter.toRoman(0));
    }

    @Test
    public void oneReturnI(){
        Assert.assertEquals("I", RomanNumberConverter.toRoman(1));
    }

    @Test
    public void twoReturnII(){
        Assert.assertEquals("II", RomanNumberConverter.toRoman(2));
    }

    @Test
    public void threeReturnIII(){
        Assert.assertEquals("III", RomanNumberConverter.toRoman(3));
    }

    @Test
    public void fourReturnIV(){
        Assert.assertEquals("IV", RomanNumberConverter.toRoman(4));
    }

    @Test
    public void fiveReturnV(){
        Assert.assertEquals("V", RomanNumberConverter.toRoman(5));
    }

    @Test
    public void sixReturnVI(){
        Assert.assertEquals("VI", RomanNumberConverter.toRoman(6));
    }

    @Test
    public void sevenReturnVII(){
        Assert.assertEquals("VII", RomanNumberConverter.toRoman(7));
    }

    @Test
    public void eightReturnVIII(){
        Assert.assertEquals("VIII", RomanNumberConverter.toRoman(8));
    }

    @Test
    public void nineReturnIX(){
        Assert.assertEquals("IX", RomanNumberConverter.toRoman(9));
    }

    @Test
    public void tenReturnX(){
        Assert.assertEquals("X", RomanNumberConverter.toRoman(10));
    }

    @Test
    public void elevenReturnXI(){
        Assert.assertEquals("XI", RomanNumberConverter.toRoman(11));
    }

    @Test
    public void twelveReturnXII(){
        Assert.assertEquals("XII", RomanNumberConverter.toRoman(12));
    }

    @Test
    public void thirteenReturnXIII(){
        Assert.assertEquals("XIII", RomanNumberConverter.toRoman(13));
    }

    @Test
    public void fourteenReturnXIV(){
        Assert.assertEquals("XIV", RomanNumberConverter.toRoman(14));
    }

    @Test
    public void _44returnXLIV(){
        Assert.assertEquals("XLIV", RomanNumberConverter.toRoman(44));
    }

    @Test
    public void criticalNumbersFrom15To100() {
        Assert.assertEquals("XV", RomanNumberConverter.toRoman(15));
        Assert.assertEquals("XX", RomanNumberConverter.toRoman(20));
        Assert.assertEquals("XXIV", RomanNumberConverter.toRoman(24));
        Assert.assertEquals("XXV", RomanNumberConverter.toRoman(25));
        Assert.assertEquals("XXX", RomanNumberConverter.toRoman(30));
        Assert.assertEquals("XXXV", RomanNumberConverter.toRoman(35));
        Assert.assertEquals("XL", RomanNumberConverter.toRoman(40));
        Assert.assertEquals("XLIV", RomanNumberConverter.toRoman(44));
        Assert.assertEquals("XLV", RomanNumberConverter.toRoman(45));
        Assert.assertEquals("XLIX", RomanNumberConverter.toRoman(49));
        Assert.assertEquals("L", RomanNumberConverter.toRoman(50));
        Assert.assertEquals("LXXX", RomanNumberConverter.toRoman(80));
        Assert.assertEquals("LXXXV", RomanNumberConverter.toRoman(85));
        Assert.assertEquals("XC", RomanNumberConverter.toRoman(90));
        Assert.assertEquals("XCV", RomanNumberConverter.toRoman(95));
        Assert.assertEquals("XCVIII", RomanNumberConverter.toRoman(98));
        Assert.assertEquals("XCIX", RomanNumberConverter.toRoman(99));
        Assert.assertEquals("C", RomanNumberConverter.toRoman(100));
    }

    @Test
    public void criticalNumbersFrom104To999(){
        Assert.assertEquals("CIV", RomanNumberConverter.toRoman(104));
        Assert.assertEquals("CCCXCIX", RomanNumberConverter.toRoman(399));
        Assert.assertEquals("CDXXIV", RomanNumberConverter.toRoman(424));
        Assert.assertEquals("CDXLIV", RomanNumberConverter.toRoman(444));
        Assert.assertEquals("CDXLIX", RomanNumberConverter.toRoman(449));
        Assert.assertEquals("CDXCIV", RomanNumberConverter.toRoman(494));
        Assert.assertEquals("CDXCIX", RomanNumberConverter.toRoman(499));
        Assert.assertEquals("D", RomanNumberConverter.toRoman(500));
        Assert.assertEquals("DCXCIX", RomanNumberConverter.toRoman(699));
        Assert.assertEquals("DCCXXIV", RomanNumberConverter.toRoman(724));
        Assert.assertEquals("DCCCLIV", RomanNumberConverter.toRoman(854));
        Assert.assertEquals("CMXCIV", RomanNumberConverter.toRoman(994));
        Assert.assertEquals("CMXCIX", RomanNumberConverter.toRoman(999));
        Assert.assertEquals("M", RomanNumberConverter.toRoman(1000));
    }

    @Test(expected = Exception.class)
    public void notAllowedConversion(){
        Assert.assertEquals("", RomanNumberConverter.toRoman(1001));
        Assert.assertEquals("", RomanNumberConverter.toRoman(999999));
        Assert.assertEquals("", RomanNumberConverter.toRoman(-1));
        Assert.assertEquals("", RomanNumberConverter.toRoman(-111111));
    }
}
