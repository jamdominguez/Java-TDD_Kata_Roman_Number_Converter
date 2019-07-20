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

}
