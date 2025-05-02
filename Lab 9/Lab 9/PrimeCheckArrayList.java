import java.util.*;

public class PrimeCheckArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10));
        for (Integer num : numbers) {
            int n = num;
            boolean isPrime = n > 1;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.println(n + " is " + (isPrime ? "prime" : "not prime"));
        }
    }
}