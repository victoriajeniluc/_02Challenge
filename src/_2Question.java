/**
 * Write a program to calculate the sum of the numbers from 1 till upper bound.
 * If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15.
 * If upper bound is 11, sum should be 1 + 2 + ... + 11 = 66.
 * If upper bound is 100, sum should be 1 + 2 + ... + 100 = 5050.
 *
 * You should use while loop.
 *
 * @author Udayan Khattry
 */

public class _2Question {
    public static void main(String[] args) {
        int start = 0; // should start at 1
        int sum = 0; // variable to store the sum of the numbers
        final int upperBound = 11;

        while(start++ < upperBound) {
            sum+=start;
        }
        System.out.println(sum);
    }
}
