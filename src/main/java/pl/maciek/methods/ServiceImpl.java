package pl.maciek.methods;

public class ServiceImpl implements Service {
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

}
