import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public static void readFile(String filename) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filename));
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter filename: ");
        String filename = input.nextLine();
        try {
            readFile(filename);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        } finally {
            System.out.println("File operation attempted");
        }
        input.close();
    }
}