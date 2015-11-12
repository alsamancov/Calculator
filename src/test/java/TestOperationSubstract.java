import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestOperationSubstract {
    @Test
     public void testDoOperation() {
        OperationSubstract operationSubstract = new OperationSubstract();

        BigDecimal num1 = new BigDecimal(3);
        BigDecimal num2 = new BigDecimal(3);
        BigDecimal result = operationSubstract.doOperation(num1, num2);

        BigDecimal value1 = new BigDecimal(0);

        assertEquals(result, value1);

        assertNotEquals(null, result);


        BigDecimal value2 = new BigDecimal(25000000);
        BigDecimal summ = operationSubstract.doOperation(value1, value2);
        assertEquals(summ, (value2.multiply(BigDecimal.valueOf(-1))));
    }
}
