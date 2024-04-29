Step1,2

// 더하기, 빼기, 나누기, 곱하기 연산을 수행하는 Calculator
public class Calculator {
    // 필드
    String operator;  // 연산자
    int firstNumber;
    int secondNumber;

    // 생성자
    public Calculator(String operator, int firstNumber, int secondNumber) {

    };
    // 메서드
    double calculate (String operator, int firstNumber, int secondNumber) {
        double result = 0;
        switch (operator) {
            case "+" :
                result = firstNumber + secondNumber;
                break;
            case "-" :
                result = firstNumber - secondNumber;
                break;
            case  "*" :
                result = firstNumber * secondNumber;
                break;
            case "/" :
                result = firstNumber / secondNumber;
                break;
            case "%" :
                result = firstNumber % secondNumber;
                break;
            default:
                System.out.println("지정된 연산자가 아닙니다");
                break;
        }
        return result;
    }
}