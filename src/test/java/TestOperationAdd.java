import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TestOperationAdd {

    @Test
    public void testDoOperation() {
        OperationAdd operationAdd = new OperationAdd();

        BigDecimal num1 = new BigDecimal(3);
        BigDecimal num2 = new BigDecimal(3);
        BigDecimal result = operationAdd.doOperation(num1, num2);

        BigDecimal num3 = new BigDecimal(6);

        assertEquals(result, num3);

        assertNotEquals(null, result);

        BigDecimal value1 = new BigDecimal(0);
        BigDecimal value2 = new BigDecimal(25000000);
        BigDecimal summ = operationAdd.doOperation(value1, value2);
        assertEquals(summ, value2);
    }


}
