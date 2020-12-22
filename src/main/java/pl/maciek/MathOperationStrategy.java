package pl.maciek;

import pl.maciek.methods.MathOperationServiceImpl;

import java.util.Map;

public class MathOperationStrategy {
    private static final Map<MathematicOperations, Integer> ALL_OPERATIONS_MAP = MathOperationsMap.getMap();

    MathOperationServiceImpl service;

    public MathOperationStrategy(MathOperationServiceImpl service) {
        this.service = service;
    }

    public int getResultByStrategy(int pierwszaLiczba, int drugaLiczba, MathematicOperations wybranaOperacja) {
        int wynik = 0;
        switch (ALL_OPERATIONS_MAP.get(wybranaOperacja)) {
            case 1:
                wynik = service.addNumber(pierwszaLiczba, drugaLiczba);
                break;
            case 2:
                wynik = service.subtractNumber(pierwszaLiczba, drugaLiczba);
                break;
            case 3:
                wynik = service.multiplyNumber(pierwszaLiczba, drugaLiczba);
                break;
            case 4:
                wynik = divideNumber(drugaLiczba, pierwszaLiczba);
                break;
            case 5:
                wynik = service.exponentiateNumber(pierwszaLiczba, drugaLiczba);
                break;
            case 6:
                wynik = service.elementNumber(pierwszaLiczba);
                break;
            default:
                System.out.println(Messages.WRONG_OPERATION);
        }
        return wynik;
    }

    private int divideNumber(int drugaLiczba, int pierwszaLiczba) {
        if (drugaLiczba != 0) {
            return service.divideNumber(pierwszaLiczba, drugaLiczba);
        } else
            System.out.println(Messages.MUSTNT_DIVIDE_BY_ZERO);
        return 0;
    }
}
