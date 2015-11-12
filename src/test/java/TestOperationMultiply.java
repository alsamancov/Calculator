import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestOperationMultiply {
    @Test
    public void testDoOperation() {
        OperationMultiply operationMultiply = new OperationMultiply();

        double num1 = 3.0;
        double num2 = 3.0;
        double result = operationMultiply.doOperation(num1, num2);
        assertEquals(result, 9.0, 0);

        assertNotEquals(null, result);

        double value1 = 0.0;
        double value2 = 25000000.0;
        double summ = operationMultiply.doOperation(value1, value2);
        assertEquals(summ, value1, 0);
    }
}
