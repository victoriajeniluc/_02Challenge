/**
 * Use pre-decrement operator in while's boolean_expression to print HELLO 5 times on to the console.
 */
public class _1Question {
    public static void main(String[] args) {
        int count = 0;

        // since there is a pre-decrement operator... i would have to use <= because it increments first to 1 and gets evaluated with the expression... therefore < will only get to print out 4 hellos
        while(++count <= 5) {
            System.out.println("Hello");
        }
    }
}
