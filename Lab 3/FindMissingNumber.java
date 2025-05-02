/* Que 2: Given an array containing N-1 unique numbers from 1 to N, write a Java program to find the missing number.
Input: [1, 5, 6, 2, 4]
Output: 3   */

public class FindMissingNumber {
    public static int findMissingNumber(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }
        return totalSum - arraySum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 2, 4};
        int n = arr.length + 1;
        System.out.println(findMissingNumber(arr, n));
    }
}
