import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestOperationSubstract {
    @Test
     public void testDoOperation() {
        OperationSubstract operationSubstract = new OperationSubstract();

        int num1 = 3;
        int num2 = 3;
        int result = operationSubstract.doOperation(num1, num2);
        assertEquals(result, 0);

        assertNotEquals(null, result);

        int value1 = 0;
        int value2 = 25000000;
        int summ = operationSubstract.doOperation(value1, value2);
        assertEquals(summ, (value2 * - 1));
    }
}
