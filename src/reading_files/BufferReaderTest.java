package reading_files;

import java.io.*;

/**
 * Created by Beata Iłowiecka on 24.05.16.
 */
public class BufferReaderTest {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/test.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file: " + file.toString());
        }
    }
}
