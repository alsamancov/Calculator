import java.math.BigDecimal;

public class OperationMultiply implements Operation {
    public BigDecimal doOperation(BigDecimal num1, BigDecimal num2) {
        return num1.multiply(num2);
    }
}
