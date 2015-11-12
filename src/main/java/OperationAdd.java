import java.math.BigDecimal;

public class OperationAdd implements Operation {

    public BigDecimal doOperation(BigDecimal num1, BigDecimal num2) {
        return num1.add(num2);
    }
}
