package pl.maciek.methods;

public interface Service {

    int addNumber(int number, int previousNumber);

    int subtractNumber(int number, int previousNumber);

    int multiplyNumber(int number, int previousNumber);

    int divideNumber(int number, int previousNumber);

    int exponentiateNumber(int number, int exponentation);

    int elementNumber(int number);

    int factorialNumber(int number);
}
