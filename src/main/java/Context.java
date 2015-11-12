
public class Context {
    private Operation operation;

    public Context(Operation operation){
        this.operation = operation;
    }

    public double executeStrategy(double num1, double num2){
        return operation.doOperation(num1, num2);
    }
}
