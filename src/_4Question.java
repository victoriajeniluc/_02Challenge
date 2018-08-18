/**
 * Write a program for following logic:
 * Print all the odd numbers in comma separated form from 1 till end (you may change it):
 * if end = 10, OUTPUT = 1, 3, 5, 7, 9
 * if end = 11, OUTPUT = 1, 3, 5, 7, 9, 11
 *
 * You should use while loop and if - else statements. Note that, there should not be any comma after last digit.
 *
 * @author Udayan Khattry
 */


public class _4Question {
    public static void main(String[] args) {
        int count = 1;
        int end = 10;

        while(count <= end) {
            if(count % 2 != 0) {
                System.out.print(count);

                // logic to add the comma
                if(end % 2 == 0) { // if end is an even number
                    if(count != (end -1)) { // check to not add , after printing number
                        System.out.print(", ");
                    }
                } else { // if end is an odd number
                    if(count != end) { // check to not add , after printing number
                        System.out.print(", ");
                    }
                }
            }
            count++;
        }
    }
}
