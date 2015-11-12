import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

public class TestOperationDivision {
    @Test
    public void testDoOperation() {
        OperationDivision operationDivision = new OperationDivision();

        BigDecimal num1 = new BigDecimal(3);
        BigDecimal num2 = new BigDecimal(3);
        BigDecimal result = operationDivision.doOperation(num1, num2);

        BigDecimal value1 = new BigDecimal(1);

        assertEquals(result, value1);

        assertNotEquals(null, result);


        BigDecimal value2 = new BigDecimal(25000000);
        BigDecimal summ = operationDivision.doOperation(value2, value1);

        assertEquals(summ, value2);



        BigDecimal value4 = new BigDecimal(0);
        BigDecimal summZero = operationDivision.doOperation(value1, value4);
        assertNull(summZero);



    }
}
