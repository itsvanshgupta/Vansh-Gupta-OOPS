import java.io.*;
import java.util.Scanner;

public class WriteStudentInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter roll number: ");
        String roll = sc.nextLine();
        System.out.print("Enter grade: ");
        String grade = sc.nextLine();

        try (FileWriter fw = new FileWriter("student.txt", true)) {
            fw.write("Name: " + name + ", Roll Number: " + roll + ", Grade: " + grade + "\n");
            System.out.println("Student information written to student.txt");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        sc.close();
    }
}