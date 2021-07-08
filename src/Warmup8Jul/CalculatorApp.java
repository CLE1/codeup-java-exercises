package Warmup8Jul;

public class CalculatorApp extends Calculator {
    public static void main(String[] args) {
        int input1 = Integer.parseInt(args[0]);
        int input2 = Integer.parseInt(args[1]);
        add(input1, input2);
        subtract(input1, input2);
        multiply(input1, input2);
        divide(input1, input2);

    }
}
