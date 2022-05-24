import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void multTest() {
        Calculator calc = new Calculator();
         double actual = calc.newFormula()
                 .addOperand(5)
                 .addOperand(15)
                 .calculate(Calculator.Operation.MULT)
                 .result();
         double expected = 75.0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void sumTest() {
        Calculator calc = new Calculator();
        double actual = calc.newFormula()
                .addOperand(5)
                .addOperand(15)
                .calculate(Calculator.Operation.SUM)
                .result();
        double expected = 20.0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void subTest() {
        Calculator calc = new Calculator();
        double actual = calc.newFormula()
                .addOperand(5)
                .addOperand(15)
                .calculate(Calculator.Operation.SUB)
                .result();
        double expected = -10.0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void divTest() {
        Calculator calc = new Calculator();
        double actual = calc.newFormula()
                .addOperand(100)
                .addOperand(50)
                .calculate(Calculator.Operation.DIV)
                .result();
        double expected = 2.0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void powTest() {
        Calculator calc = new Calculator();
        double actual = calc.newFormula()
                .addOperand(4)
                .addOperand(2)
                .calculate(Calculator.Operation.POW)
                .result();
        double expected = 16;
        Assertions.assertEquals(expected, actual);
    }
}
