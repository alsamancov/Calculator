import org.junit.Test;

import static org.junit.Assert.*;

public class TestOperationAdd {

    @Test
    public void testDoOperation() {
        OperationAdd operationAdd = new OperationAdd();

        int num1 = 3;
        int num2 = 3;
        int result = operationAdd.doOperation(num1, num2);
        assertEquals(result, 6);

        assertNotEquals(null, result);

        int value1 = 0;
        int value2 = 25000000;
        int summ = operationAdd.doOperation(value1, value2);
        assertEquals(summ, value2);
    }


}
