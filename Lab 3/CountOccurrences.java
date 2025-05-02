/* Que 1: Write a Java program that counts how many times a given number appears in an array.
        Example:
        Input: arr = [2, 3, 2, 5, 2, 6], target = 2
        Output: 3 */

import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {2, 3, 2, 5, 2, 6};

        System.out.print("Enter the number to count: ");
        int target = scanner.nextInt();

        int count = 0;


        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }

        System.out.println("The number " + target + " appears " + count + " times in the array.");

        scanner.close();
    }
}
