
public class OperationDivision implements Operation {
    public double doOperation(double num1, double num2) {
        try {
            return num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Divided by zero!");
            throw e;
        }
    }
}
