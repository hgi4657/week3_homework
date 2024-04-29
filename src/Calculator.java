// 더하기, 빼기, 나누기, 곱하기 연산을 수행하는 Calculator
public class Calculator {

    AbstractOperation operation;

    // 생성자
    public Calculator(AbstractOperation operation) {
        this.operation = operation;
    }

    public double calculate (int firstNumber, int secondNumber) {
        double result = 0;
        result = operation.operate(firstNumber, secondNumber);
        return result;
    }
}