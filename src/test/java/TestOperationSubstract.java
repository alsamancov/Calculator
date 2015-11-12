import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestOperationSubstract {
    @Test
     public void testDoOperation() {
        OperationSubstract operationSubstract = new OperationSubstract();

        double num1 = 3.0;
        double num2 = 3.0;
        double result = operationSubstract.doOperation(num1, num2);
        assertEquals(result, 0.0, 0);

        assertNotEquals(null, result);

        double value1 = 0.0;
        double value2 = 25000000.0;
        double summ = operationSubstract.doOperation(value1, value2);
        assertEquals(summ, (value2 * - 1), 0);
    }
}
