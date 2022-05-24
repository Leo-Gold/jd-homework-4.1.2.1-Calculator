public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        return calculator(arg0, arg1, Calculator.Operation.SUM);
    }

    @Override
    public int mult(int arg0, int arg1) {
        return calculator(arg0, arg1, Calculator.Operation.MULT);
    }

    @Override
    public int pow(int a, int b) {
        return calculator(a, b, Calculator.Operation.POW);
    }

    private int calculator(int valueOne, int valueTwo, Calculator.Operation operation) {
        int result = (int) target
                .newFormula()
                .addOperand(valueOne)
                .addOperand(valueTwo)
                .calculate(operation)
                .result();
        return result;
    }
}