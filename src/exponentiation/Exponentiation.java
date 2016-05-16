package exponentiation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.lang.*;

/**
 * Created by Beata Iłowiecka on 15.05.16.
 */
public class Exponentiation {

    public static final int BIGGEST_NUMBER = 1000000000;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        byte numOfLines = getNrOfLines(reader);
        if (numOfLines <= 0 || numOfLines > 10)
            throw new IllegalArgumentException("Liczba linijek powinna mieścić się w zakresie: 1-10");

        List<BigInteger> results = new ArrayList<>();
        for (int i = 1; i <= numOfLines; i++)
            results.add(determineLine(reader));
        getLastDigitsOfExponentiationResults(results);
    }

    private static byte getNrOfLines(BufferedReader reader) throws IOException {
        return Byte.parseByte(reader.readLine());
    }

    private static BigInteger determineLine(BufferedReader reader) throws IOException {
        String[] ab = reader.readLine().split(" ");
        testNumbers(new Long(ab[0]), new Long(ab[1]));
        int a = new Integer(ab[0]);
        int b = new Integer(ab[1]);
        return exponentiate(a, b);
    }

    private static void testNumbers(long a, long b){
        if (a <= 0 || a > BIGGEST_NUMBER || b <= 0 || b > BIGGEST_NUMBER)
            throw new IllegalArgumentException("Potęgowane liczby powinny mieścić się w zakresie: 1 - 1 000 000 000");
    }

    private static BigInteger exponentiate(int a, int b) {
        BigInteger expResult = BigInteger.valueOf(a);
        BigInteger valueOfA = BigInteger.valueOf(a);
        for (int expPhase = 0; expPhase < b-1; expPhase++)
            expResult = expResult.multiply(valueOfA);
        return expResult;
    }

    private static void getLastDigitsOfExponentiationResults(List<BigInteger> results) {
        for (BigInteger result : results) {
            String stringResult = String.valueOf(result);
            int lastIndex = stringResult.length() - 1;
            String lastDigit = stringResult.substring(lastIndex);
            System.out.println(lastDigit);
        }
    }
}