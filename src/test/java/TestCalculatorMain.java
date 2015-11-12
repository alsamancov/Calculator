import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

public class TestCalculatorMain {
    @Test
    public void testGetListFromFile() throws IOException {
        List<String> testList = CalculatorMain.getListFromFile();
        String str = testList.get(0);

        assertEquals(str, "apply 3");

        assertNotEquals(str, "");

        assertNotNull(str);

    }

    @Test
    public void testGetDigits(){

    }
}
