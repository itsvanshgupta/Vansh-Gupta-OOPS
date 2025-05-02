/* Que 3: Write a Java program to find the second largest element in an integer array without sorting the array, if not exist return -1.
Example:
Input: arr = {12,32,22,54,39,53,19;
Output: 53 */

public class SecondLargestElement {
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE, secondLargest = -1;
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {12, 32, 22, 54, 39, 53, 19};
        System.out.println(findSecondLargest(arr));
    }
}
