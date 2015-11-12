import java.math.BigDecimal;

public class OperationSubstract implements Operation {
    public BigDecimal doOperation(BigDecimal num1, BigDecimal num2) {
        return num1.subtract(num2);
    }
}
