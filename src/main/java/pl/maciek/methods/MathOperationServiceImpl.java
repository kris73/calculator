package pl.maciek.methods;


public class MathOperationServiceImpl implements MathOperationService {
    @Override
    public int addNumber(int number, int previousNumber) {
        return previousNumber + number;
    }
    @Override
    public int subtractNumber(int number, int previousNumber) {
        return number - previousNumber;
    }
    @Override
    public int multiplyNumber(int number, int previousNumber) {
        return previousNumber * number;
    }
    @Override
    public int divideNumber(int number, int previousNumber) {
        return number / previousNumber;
    }
    @Override
    public int exponentiateNumber(int number, int exponentation) {
        return (int) Math.pow(number, exponentation);
    }
    @Override
    public int elementNumber(int number) {
        return (int) Math.sqrt(number);
    }

    @Override
    public int factorialNumber(int number) {
        if (number < 1) {
            return 1;
        } else {
            return number * factorialNumber(number - 1);
        }
    }
}
