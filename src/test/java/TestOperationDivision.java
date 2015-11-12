import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestOperationDivision {
    @Test
    public void testDoOperation() {
        OperationDivision operationDivision = new OperationDivision();

        int num1 = 3;
        int num2 = 3;
        int result = operationDivision.doOperation(num1, num2);
        assertEquals(result, 1);

        assertNotEquals(null, result);

        int value1 = 1;
        int value2 = 25000000;
        int summ = operationDivision.doOperation(value2, value1);
        assertEquals(summ, value2);


    }
}
