package pl.maciek;

import pl.maciek.methods.MathOperationServiceImpl;
import java.util.Scanner;

import static pl.maciek.Messages.CHOOSE_OPERATION;
import static pl.maciek.Messages.DISPLAY_RESULT;
import static pl.maciek.Messages.ENTER_FIRST_NUMBER;
import static pl.maciek.Messages.ENTER_SECOND_NUMBER;
import static pl.maciek.Messages.NO;
import static pl.maciek.Messages.SHOULD_CONTINUE;
import static pl.maciek.Messages.WRONG_OPTION;
import static pl.maciek.Messages.YES;

public class App {
    public static void main(String[] args) {
        String wybranaOperacja;
        int pierwszaLiczba;
        int drugaLiczba;
        int wynik;
        String czyKontynowac;
        boolean czyZapetlac;
        MathOperationServiceImpl service = new MathOperationServiceImpl();
        MathOperationStrategy sw = new MathOperationStrategy(service);
        Scanner skaner = new Scanner(System.in);

        do {
            System.out.println(ENTER_FIRST_NUMBER);
            pierwszaLiczba = skaner.nextInt();
            System.out.println(ENTER_SECOND_NUMBER);
            drugaLiczba = skaner.nextInt();
            System.out.println(CHOOSE_OPERATION);
            wybranaOperacja = skaner.next();

            wynik = sw.getResultByStrategy(pierwszaLiczba, drugaLiczba, MathematicOperations.valueOfString(wybranaOperacja));

            System.out.println(DISPLAY_RESULT);
            System.out.println(wynik);

            System.out.println(SHOULD_CONTINUE);
            czyKontynowac = skaner.next();
            czyZapetlac = reloop(czyKontynowac);
        } while (czyZapetlac);
    }

    private static boolean reloop(String czyKontynowac) {
        boolean czyZapetlac;
        if (YES.equals(czyKontynowac)) {
            czyZapetlac = true;
        } else if (NO.equals(czyKontynowac)) {
            czyZapetlac = false;
            System.exit(0);
        } else {
            System.out.println(WRONG_OPTION);
            czyZapetlac = false;
        }
        return czyZapetlac;
    }
}
