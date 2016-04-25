package stefan.stefan_obiektowy;

import stefan.Stefan1;

import java.util.Random;

/**
 * Created by Beata Iłowiecka on 25.04.16.
 */
public class TrasaKoncertowaStefana {

    int numOfEvents;
    int biggestPossibleProfit;
    int[] profitsInCities;

    public TrasaKoncertowaStefana(int numOfEvents){
        this.numOfEvents = numOfEvents;
        this.profitsInCities = new int[numOfEvents];
        this.biggestPossibleProfit = checkTheProfitInCities(numOfEvents);
    }

    public int checkTheProfitInCities(int numOfCities) {
        Random random = new Random();
        int generateProfit;
        int biggestProfit = 0;

        for (int cityNum = 0; cityNum < numOfCities; cityNum++) {
            generateProfit = (random.nextInt(200000) - 100000);
            profitsInCities[cityNum] = generateProfit;
            if (cityNum == 0 || cityNum == numOfCities - 1) {
                if (generateProfit < 0)
                    continue;
            }
            biggestProfit += generateProfit;
        }
        return biggestProfit;
    }

    @Override
    public String toString(){
        StringBuilder tourDescription = new StringBuilder();
        tourDescription.append(numOfEvents + "\n");
        for (int profit : profitsInCities)
            tourDescription.append(profit + "\n");
        tourDescription.append("\n" + biggestPossibleProfit);
        return tourDescription.toString();
    }
}