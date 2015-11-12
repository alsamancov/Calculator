import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestOperationMultiply {
    @Test
    public void testDoOperation() {
        OperationMultiply operationMultiply = new OperationMultiply();

        BigDecimal num1 = new BigDecimal(3);
        BigDecimal num2 = new BigDecimal(3);
        BigDecimal result = operationMultiply.doOperation(num1, num2);

        BigDecimal num3 = new BigDecimal(9);

        assertEquals(result, num3);

        assertNotEquals(null, result);

        BigDecimal value1 = new BigDecimal(0);
        BigDecimal value2 = new BigDecimal(25000000);
        BigDecimal summ = operationMultiply.doOperation(value1, value2);
        assertEquals(summ, value1);
    }
}
