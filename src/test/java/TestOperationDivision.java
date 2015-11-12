import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestOperationDivision {
    @Test
    public void testDoOperation() {
        OperationDivision operationDivision = new OperationDivision();

        double num1 = 3.0;
        double num2 = 3.0;
        double result = operationDivision.doOperation(num1, num2);


        assertEquals(result, 1.0, 0);

        assertNotEquals(null, result);

        double value1 = 1.0;
        double value2 = 25000000.0;
        double summ = operationDivision.doOperation(value2, value1);
        assertEquals(summ, value2, 0);

//        double value3 = 0;
//        double result2 = operationDivision.doOperation(value1, value3);
//        assertNull("NaN", result2);



    }
}
