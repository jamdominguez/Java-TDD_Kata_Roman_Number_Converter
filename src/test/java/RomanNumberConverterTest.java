import org.junit.Assert;
import org.junit.Test;

public class RomanNumberConverterTest {

    @Test
    public void oneReturnI(){
        Assert.assertEquals("I", RomanNumberConverter.toRoman(1));
    }

}
