
public class OperationDivision implements Strategy {
    public int doOperation(int num1, int num2) {
        int result = 0;
        try{
            result = num1 / num2;
        }catch (ArithmeticException e){
            System.out.println("Divided by zero!");
        }
        return result;
    }
}
