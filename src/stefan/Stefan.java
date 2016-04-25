package stefan;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Beata Iłowiecka on 20.04.16.
 */
public class Stefan {

    public static void main(String[] args) {
        System.out.println("Wpisz liczbę miast na trasie koncertowej: ");
        Scanner scanner = new Scanner(System.in);
        int numOfCities = scanner.nextInt();
        Random random = new Random();
        int biggestProfit = 0;
        int generateProfit;

        for (int cityNum = 0; cityNum < numOfCities; cityNum++ ) {
            generateProfit = (random.nextInt(200000) - 100000);
            System.out.println(generateProfit);

            if (cityNum == 0 || cityNum == numOfCities - 1) {
                if (generateProfit < 0)
                    continue;
            }
            biggestProfit += generateProfit;
        }
        System.out.println("\n" + biggestProfit);
    }
}