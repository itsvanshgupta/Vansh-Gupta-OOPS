package Basics;
import java.util.Scanner;

public class New1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the total units consumed: ");
        int units = scanner.nextInt();

        double billAmount = 0;


        if (units <= 100) {
            billAmount = units * 5;
        } else if (units <= 200) {
            billAmount = (100 * 5) + (units - 100) * 7;
        } else if (units <= 300) {
            billAmount = (100 * 5) + (100 * 7) + (units - 200) * 10;
        } else {
            billAmount = (100 * 5) + (100 * 7) + (100 * 10) + (units - 300) * 15;
        }


        System.out.println("Total Electricity Bill: Rs " + billAmount);
    }
}