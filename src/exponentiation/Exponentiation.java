package exponentiation;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Beata Iłowiecka on 25.04.16.
 */
public class Exponentiation {

    // wersja z ArrayListą<BigInteger> i wielkimi potęgami
    public static void main(String[] args) {
        byte numOfCases = getNrOfCases();
        List<BigInteger> results = determineCases(numOfCases);
        getExpResults(results);
    }

    private static byte getNrOfCases() {
        byte numOfCases = (byte) (Math.random() * 10 + 1);
        System.out.println(numOfCases);
        return numOfCases;
    }

    private static List<BigInteger> determineCases(byte numOfCases) {
        List<BigInteger> results = new ArrayList<>();
        for (int caseNr = 0; caseNr < numOfCases; caseNr++) {
            // aby komputer był w stanie wyświetlić te liczby na ekranie
            // należy zmniejszyć wartości a i b
            // (mój komputer miał z tym trudności)
            int a = (int) (Math.random() * 1000000000 + 1);
            int b = (int) (Math.random() * 1000000000 + 1);
            results.add(exponentiate(a, b));
        }
        return results;
    }

    private static BigInteger exponentiate(int a, int b) {
        System.out.println(a + " " + b);
        BigInteger expResult = BigInteger.valueOf(a);
        BigInteger valueOfA = BigInteger.valueOf(a);
        for (int expPhase = 0; expPhase < b; expPhase++)
            expResult = expResult.multiply(valueOfA);
        return expResult;
    }

    private static void getExpResults(List<BigInteger> results) {
        for (BigInteger result : results) {
            String stringResult = String.valueOf(result);
            String lastDigit = stringResult.substring(stringResult.length() - 1);
            System.out.println(lastDigit);
        }
    }
}