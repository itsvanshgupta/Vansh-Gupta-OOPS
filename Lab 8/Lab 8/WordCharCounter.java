import java.io.*;
import java.util.Scanner;

public class WordCharCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter filename: ");
        String filename = input.nextLine();
        input.close();

        try (FileReader fr = new FileReader(filename);
             BufferedReader br = new BufferedReader(fr)) {
            int charCount = 0;
            int wordCount = 0;
            String line;

            while ((line = br.readLine()) != null) {
                charCount += line.replaceAll("\s+", "").length();
                wordCount += line.trim().isEmpty() ? 0 : line.trim().split("\s+").length;
            }

            System.out.println("Total words: " + wordCount);
            System.out.println("Total characters (excluding whitespace): " + charCount);
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}