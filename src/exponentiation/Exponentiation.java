package exponentiation;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Beata Iłowiecka on 25.04.16.
 */
public class Exponentiation {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        byte numOfLines = getNrOfLines();
        List<BigInteger> results = determineLines(numOfLines);
        getExponentiationResults(results);
    }

    private static byte getNrOfLines() {
        byte numOfLines = (byte) (Math.random() * 10 + 1);
        //liczba przypadków
        System.out.println(numOfLines);
        return numOfLines;
    }

    private static List<BigInteger> determineLines(byte numOfLines) {
        List<BigInteger> results = new ArrayList<>();
        for (int lineNr = 0; lineNr < numOfLines; lineNr++) {
            // aby komputer był w stanie wyświetlić te liczby na ekranie
            // należy zmniejszyć wartości a i b
            // (a przymnajmniej mój komputer miał z tym trudności)
            int a = (int) (Math.random() * 1000000000 + 1);
            int b = (int) (Math.random() * 1000000000 + 1);
            results.add(exponentiate(a, b));
        }
        return results;
    }

    private static BigInteger exponentiate(int a, int b) {
        // przypadki
        System.out.println(a + " " + b);
        BigInteger expResult = BigInteger.valueOf(a);
        BigInteger valueOfA = BigInteger.valueOf(a);
        for (int expPhase = 0; expPhase < b; expPhase++)
            expResult = expResult.multiply(valueOfA);
        return expResult;
    }

    private static void getExponentiationResults(List<BigInteger> results) {
        for (BigInteger result : results) {
            String stringResult = String.valueOf(result);
            int lastIndex = stringResult.length() - 1;
            String lastDigitAsString = stringResult.substring(lastIndex);
            // ostatnia cyfra potęgi - wynik
            int lastDigit = Integer.valueOf(lastDigitAsString);
            System.out.println(lastDigit);
        }
    }
}