package fizzbuzz;

import kt.fizzbuzz.KotlinFizzbuzz;

/**
 * Main class.
 */
public class Main {

    /**
     * 100.
     */
    public static final Integer LIMIT = 100;

    /**
     * main methods.
     *
     * @param args final String[]
     */
    public static void main(final String[] args) {
        for (int i = 0; i < LIMIT; i++) {
            String output;
            KotlinFizzbuzz ktFizzbuzz = new KotlinFizzbuzz();
            output = ktFizzbuzz.fizzbuzz(i);

            System.out.println(output);
        }
    }
}
