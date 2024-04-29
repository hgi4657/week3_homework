
public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator(new AddOperation());
        System.out.println(calculator.calculate(10,20));
        System.out.println(calculator.calculate(60,20));

        calculator = new Calculator(new SubstractOperation());
        System.out.println(calculator.calculate(10,20));
        System.out.println(calculator.calculate(60,20));
    }
}
