import org.junit.Assert;
import org.junit.Test;

public class RomanNumberConverterTest {

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
}
