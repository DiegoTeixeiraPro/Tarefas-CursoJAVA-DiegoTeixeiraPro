package util;

public class CurrencyConverter {
    public static double iof = 0.06;

    public static double valorTotal(double cotacao, double dollares) {
        return (cotacao * dollares) * iof + (cotacao * dollares);
    }

}
