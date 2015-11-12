import org.junit.Test;

import static org.junit.Assert.*;

public class TestOperationAdd {

    @Test
    public void testDoOperation() {
        OperationAdd operationAdd = new OperationAdd();

        double num1 = 3.0;
        double num2 = 3.0;
        double result = operationAdd.doOperation(num1, num2);
        assertEquals(result, 6.0, 0);

        assertNotEquals(null, result);

        double value1 = 0;
        double value2 = 25000000.0;
        double summ = operationAdd.doOperation(value1, value2);
        assertEquals(summ, value2, 0);
    }


}
