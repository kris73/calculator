package pl.maciek;

import pl.maciek.methods.ServiceImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        String wybranaOperacja;
        int pierwszaLiczba;
        int drugaLiczba;
        String czyKontynowac;
        boolean czyZapetlac;
        boolean choiceloop = false;
        do {


        ServiceImpl service = new ServiceImpl();
        Scanner skaner = new Scanner(System.in);
        System.out.println("Wprowadz liczbe");
        pierwszaLiczba = skaner.nextInt();
        System.out.println("Wybierz operacje");
        wybranaOperacja = skaner.next();
        System.out.println("Wprowadz kolejna liczbe");
        drugaLiczba = skaner.nextInt();
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("dodawanie", 1);
        mapa.put("odejmowanie", 2);
        mapa.put("mnozenie", 3);
        mapa.put("dzielenie", 4);
        mapa.put("potegowanie", 5);
        mapa.put("pierwiastkowanie", 6);
        mapa.put("silnia", 7);
        int wynik;

        switch (mapa.get(wybranaOperacja)) {
            default:
                System.out.println("zostala wybrana nieprawidlowa operacja");
                wynik = 0;
                break;
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
                if (drugaLiczba != 0)
                {
                    wynik = service.divideNumber(pierwszaLiczba, drugaLiczba);

                }else
                    System.out.println("nie da sie dzielic przez zero");

            case 5:
                wynik = service.exponentiateNumber(pierwszaLiczba, drugaLiczba);
                break;
            case 6:
                wynik = service.elementNumber(pierwszaLiczba);
                break;


        }
        System.out.println("Twój wynik to: \n");
        System.out.println(wynik);
        do {
        System.out.println("czy chcesz kontynuowac?");
        czyKontynowac = skaner.next();



            if (czyKontynowac.equals("tak")) {
                czyZapetlac = true;
            } else if (czyKontynowac.equals("nie")) {
                czyZapetlac = false;
                System.exit(1);
            } else {
                System.out.println("wybrano zla opcje- wpisz tak albo nie");
                czyZapetlac = false;
                choiceloop = true;
            }
        }while (choiceloop);
    }while (czyZapetlac);
    }
}
