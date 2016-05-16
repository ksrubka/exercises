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


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        byte numOfLines = getNrOfLines(reader);
        List<BigInteger> results = new ArrayList<>();
        for (int i = 1; i <= numOfLines; i++)
            results.add(determineLine(reader));
        getExponentiationResults(results);
    }

    private static byte getNrOfLines(BufferedReader reader) throws IOException {
        return Byte.parseByte(reader.readLine());
    }

    private static BigInteger determineLine(BufferedReader reader) throws IOException {
        String[] ab = reader.readLine().split(" ");
        int a = new Integer(ab[0]);
        int b = new Integer(ab[1]);
        return exponentiate(a, b);
    }

    private static BigInteger exponentiate(int a, int b) {
        BigInteger expResult = BigInteger.valueOf(a);
        BigInteger valueOfA = BigInteger.valueOf(a);
        for (int expPhase = 0; expPhase < b-1; expPhase++)
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