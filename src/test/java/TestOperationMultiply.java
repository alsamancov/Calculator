import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestOperationMultiply {
    @Test
    public void testDoOperation() {
        OperationMultiply operationMultiply = new OperationMultiply();

        int num1 = 3;
        int num2 = 3;
        int result = operationMultiply.doOperation(num1, num2);
        assertEquals(result, 9);

        assertNotEquals(null, result);

        int value1 = 0;
        int value2 = 25000000;
        int summ = operationMultiply.doOperation(value1, value2);
        assertEquals(summ, value1);
    }
}
