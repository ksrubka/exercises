package reading_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Beata Iłowiecka on 23.05.16.
 */
public class ScannerReader {

    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "/media/radekibeatka/F854-9417/Beatka/Programowanie/Bottega/materiały/text.txt";
        File textFile = new File(fileName);

        Scanner in = new Scanner(textFile);
        int value = in.nextInt();
        System.out.println("Read value: " + value);

        in.nextLine();

        int count = 2;
        while (in.hasNextLine()) {
            String line = in.nextLine();
            System.out.println(count + ": " + line);
            count++;
        }
        in.close();
    }
}
