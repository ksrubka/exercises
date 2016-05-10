package exponentiation;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Beata Iłowiecka on 10.05.16.
 */
public class Exp1 {

    public static void main(String[] args) {
        byte numOfLines = getNrOfLines();
        List<BigInteger> results = null;

        for(int i = 1; i <= numOfLines; i++){
            determineLines(numOfLines);
        }
        getExponentiationResults(results);
    }

    private static byte getNrOfLines() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextByte();
    }

    private static List<BigInteger> determineLines(byte numOfLines) {
        List<BigInteger> results = new ArrayList<>();
        for (int lineNr = 0; lineNr < numOfLines; lineNr++) {
            Scanner scanner = new Scanner(System.in);
            String[] ab = scanner.nextLine().split(" ");
            int a = new Integer(ab[0]);
            int b = new Integer(ab[1]);
            results.add(exponentiate(a, b));
        }
        return results;
    }

    private static BigInteger exponentiate(int a, int b) {
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
