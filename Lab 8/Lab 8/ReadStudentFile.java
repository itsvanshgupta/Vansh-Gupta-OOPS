import java.io.*;

public class ReadStudentFile {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("student.txt");
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("student.txt not found.");
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }
    }
}