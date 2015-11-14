import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

public class TestCalculatorMain {
    @Test
    public void testGetListFromFile() throws IOException {
        List<String> testList = CalculatorMain.getListFromFile();
        String str = testList.get(0);

        assertEquals(str, "apply 3");
    }

    @Test
    public void testGetListFromFileNotEquals() throws IOException{
        List<String> testList = CalculatorMain.getListFromFile();
        String str = testList.get(0);

        assertNotEquals(str, "");
    }

    @Test
    public void testGetListFromFileNotNull() throws IOException{
        List<String> testList = CalculatorMain.getListFromFile();
        String str = testList.get(0);

        assertNotNull(str);
    }


    @Test
    public void testGetDigits() throws IOException {
        List<BigDecimal> numList = CalculatorMain.getDigits(CalculatorMain.getListFromFile());
        BigDecimal num1 = numList.get(0);

        BigDecimal num2 = new BigDecimal(3);
        BigDecimal num3 = new BigDecimal(0);

        assertEquals(num1, num2);

        assertNotEquals(num1,num3);

        assertNotNull(num1);
    }

    @Test
    public void testGetStrings() throws IOException{
        List<String> strList = CalculatorMain.getStrings(CalculatorMain.getListFromFile());
        String str1 = strList.get(0);

        assertEquals(str1, "apply");

        assertNotEquals(str1, "");

        assertNotNull(str1);
    }
}
