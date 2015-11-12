import java.math.BigDecimal;

public class OperationDivision implements Operation {
    public BigDecimal doOperation(BigDecimal num1, BigDecimal num2) {
        BigDecimal result = new BigDecimal(0);
        try {
            result = num1.divide( num2);
        } catch (ArithmeticException e) {
            System.out.println("Divided by zero!");
        }
        return result;
    }
}
