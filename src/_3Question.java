/**
 * Write a program using while loop to print Even numbers from 1 to 100.
 *
 * @author Udayan Khattry
 */
public class _3Question {
    public static void main(String[] args) {
        int count = 1;
        int end = 100;

        while(count++ <= end) {
            if(count % 2 == 0) {
                System.out.println(count);
            }
        }
    }
}
