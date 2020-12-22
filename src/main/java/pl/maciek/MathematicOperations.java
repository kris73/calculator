package pl.maciek;

public enum MathematicOperations {
    DODAWANIE("dodawanie"),
    ODEJMOWANIE("dodawanie"),
    MNOZENIE("mnozenie"),
    DZIELENIE("dzielenie"),
    POTEGOWANIE("potegowanie"),
    PIERWIASTKOWANIE("pierwiastkowanie"),
    SILNIA("silnia");

    public final String value;

    MathematicOperations(String value) {
        this.value = value;
    }

    public static MathematicOperations valueOfString(String string) {
        for (MathematicOperations e : values()) {
            if (e.value.equals(string)) {
                return e;
            }
        }
        return null;
    }
}
