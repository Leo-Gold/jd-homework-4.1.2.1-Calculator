public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();

        int valueOne = 34, valueTwo = 6;

        int valueMult = calc.mult(valueOne, valueTwo);
        System.out.printf("умножение %d и %d = %d \n",valueOne, valueTwo, valueMult);

        int valueSum = calc.sum(valueOne, valueTwo);
        System.out.printf("сложение %d и %d = %d \n",valueOne, valueTwo, valueSum);

        int valuePow = calc.pow(valueOne, valueTwo);
        System.out.printf("возведение %d в степень %d = %d \n",valueOne, valueTwo, valuePow);
        
    }
}