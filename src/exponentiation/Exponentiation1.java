package exponentiation;

import java.math.BigInteger;

/**
 * Created by Beata Iłowiecka on 25.04.16.
 */
public class Exponentiation1 {

    // wersja z tablicą longów i mniejszymi potęgami
    // (zmieniona w stosunku do wymagań, by wydobyć wynik na konsolę)

    public static void main(String[] args) {

        byte numOfCases = getNrOfCases();
        long[] results = determineCases(numOfCases);
        getExpResults(results);
    }

    private static byte getNrOfCases(){
        byte numOfCases = (byte) (Math.random() * 10 + 1);
        System.out.println(numOfCases);
        return numOfCases;
    }

    private static long[] determineCases(byte numOfCases){
        long[] results = new long[numOfCases];
        for (int caseNr = 0; caseNr <numOfCases; caseNr++){
            // mniejsze liczby a i b
            int a = (int) (Math.random() * 100 + 1);
            int b = (int) (Math.random() * 10 + 1);
            System.out.println(a + " " + b);
            results[caseNr] = (long) Math.pow(a, b);
        }
        return results;
    }

    private static void getExpResults(long[] results){

        for (long result : results) {
            String stringResult = String.valueOf(result);
            String lastDigit = stringResult.substring(stringResult.length() -1);
            System.out.println(lastDigit);
        }
    }
}