package pl.maciek.methods;

public class ServiceImpl implements Service {
    @Override
    public int addNumber(int number, int previousNumber) {
        return previousNumber + number;
    }
}
