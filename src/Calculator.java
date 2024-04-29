// 더하기, 빼기, 나누기, 곱하기 연산을 수행하는 Calculator
public class Calculator {

    AddOperation addOperation = new AddOperation();
    SubstractOperation substractOperation = new SubstractOperation();
    MultiplyOperation multiplyOperation = new MultiplyOperation();
    DivideOperation divideOperation = new DivideOperation();

//    private final AddOperation addOperation;
//    private final SubstractOperation substractOperation;
//    private final MultiplyOperation multiplyOperation;
//    private final DivideOperation divideOperation;
//
//
//    public Calculator(AddOperation addOperation, SubstractOperation substractOperation,
//                      MultiplyOperation multiplyOperation, DivideOperation divideOperation) {
//        this.addOperation = addOperation;
//        this.substractOperation = substractOperation;
//        this.multiplyOperation = multiplyOperation;
//        this.divideOperation = divideOperation;
//    }

    public double calculate (String operator, int firstNumber, int secondNumber) {
        double result = 0;
        switch (operator) {
            case "+" :
                result = addOperation.operate(firstNumber, secondNumber);
                break;
            case "-" :
                result = substractOperation.operate(firstNumber, secondNumber);
                break;
            case  "*" :
                result = multiplyOperation.operate(firstNumber, secondNumber);
                break;
            case "/" :
                result = divideOperation.operate(firstNumber, secondNumber);
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