import java.math.BigDecimal;

public class Context {
    private Operation operation;

    public Context(Operation operation){
        this.operation = operation;
    }

    public BigDecimal executeStrategy(BigDecimal num1, BigDecimal num2){
        return operation.doOperation(num1, num2);
    }
}
