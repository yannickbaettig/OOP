package ch.hslu.SW06.Calculator;

public class Calculator implements Calculable {

    @Override
    public int add(int firstNumber, int secondNumber) {
        return Math.addExact(firstNumber,secondNumber);
    }
}
