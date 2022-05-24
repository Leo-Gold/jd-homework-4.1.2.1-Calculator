import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntsCalculatorTest {

    @Test
    void sumTest() {
        int valueOne = 25, valueTwo = 5;
        Ints calc = new IntsCalculator();
        int actual  = calc.sum(valueOne, valueTwo);
        int expected = 30;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void multTest() {
        int valueOne = 25, valueTwo = 5;
        Ints calc = new IntsCalculator();
        int actual  = calc.mult(valueOne, valueTwo);
        int expected = 125;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void powTest() {
        int valueOne = 25, valueTwo = 5;
        Ints calc = new IntsCalculator();
        int actual  = calc.pow(valueOne, valueTwo);
        int expected = 9765625;
        Assertions.assertEquals(expected, actual);
    }

}
