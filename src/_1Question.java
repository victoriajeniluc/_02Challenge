/**
 * Use pre-decrement operator in while's boolean_expression to print HELLO 5 times on to the console.
 *
 * @author Udayan Khattry
 */
public class _1Question {
    public static void main(String[] args) {
        int count = 5;

        // since there is a pre-decrement operator... i would have to use <= because it decrements first to 4 and gets evaluated with the expression... therefore < will only get to print out 4 hellos
        while(--count >= 0) {
            System.out.println("Hello");
        }
    }
}
