package pl.maciek;

import java.util.HashMap;
import java.util.Map;

import static pl.maciek.MathematicOperations.DODAWANIE;
import static pl.maciek.MathematicOperations.DZIELENIE;
import static pl.maciek.MathematicOperations.MNOZENIE;
import static pl.maciek.MathematicOperations.ODEJMOWANIE;
import static pl.maciek.MathematicOperations.PIERWIASTKOWANIE;
import static pl.maciek.MathematicOperations.POTEGOWANIE;
import static pl.maciek.MathematicOperations.SILNIA;

public class MathOperationsMap {

    public static final Map<MathematicOperations, Integer> getMap() {
        Map<MathematicOperations, Integer> mapa = new HashMap<>();
        mapa.put(DODAWANIE, 1);
        mapa.put(ODEJMOWANIE, 2);
        mapa.put(MNOZENIE, 3);
        mapa.put(DZIELENIE, 4);
        mapa.put(POTEGOWANIE, 5);
        mapa.put(PIERWIASTKOWANIE, 6);
        mapa.put(SILNIA, 7);

        return mapa;
    }


}