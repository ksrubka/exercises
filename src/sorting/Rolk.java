package sorting;

/**
 * Created by Beata Iłowiecka on 25.04.16.
 */
public class Rolk {

    int n;
    int k;
    int[] newNumbers;

    public Rolk(int n, int k){
        this.n = n;
        if (k < n)
            this.k = k;
        else
            throw new IllegalArgumentException("Drugi argument konstruktora powinien być mniejszy od pierwszego.");
        this.newNumbers = getOutput(n, k);
        printOutput(this.newNumbers);
    }

    public static void main(String[] args) {
        Rolk sorting = new Rolk(31, 2);
    }

    public int[] getOutput(int n, int k) {

        int[] numbers = createArray(n, k);
        int[] newNumbers = new int[n];

        int index = 0;
        int index1 = 0;
        for (int i : numbers) {
            if (index < (numbers.length - k))
                newNumbers[index + k] = i;
            else
                newNumbers[index1++] = i;{
            this.k = k;
        }
            index++;
        }
        return newNumbers;
    }


    public int[] createArray(int n, int k){
        int[] numbers = new int[n];
        System.out.println(n + " " + k);
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            numbers[i - 1] = i;
        }
        System.out.println();
        return numbers;
    }

    public void printOutput(int[] newNumbers){
        for (int number : newNumbers){
            System.out.print(number + " ");
        }
    }
}
