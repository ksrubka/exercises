package stefan;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Beata Iłowiecka on 20.04.16.
 */
public class Stefan1 {
    public static void main(String[] args) {
        checkTheProfitInCities(6);
    }

    public static void checkTheProfitInCities(int numOfCities) {
        Random random = new Random();
        int generateProfit;
        int biggestProfit = 0;

        System.out.println(numOfCities);
        for (int cityNum = 0; cityNum < numOfCities; cityNum++) {
            generateProfit = (random.nextInt(200000) - 100000);
            System.out.println(generateProfit);
            if (cityNum == 0 || cityNum == numOfCities - 1) {
                if (generateProfit < 0)
                    continue;
            }
            biggestProfit += generateProfit;
        }
        System.out.println(biggestProfit);
    }
}