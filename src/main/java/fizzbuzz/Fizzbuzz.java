package fizzbuzz;

/**.
 * Fizzbuzz class.
 */
public class Fizzbuzz {
    /**
     * 3.
     */
    public static final int FIZZ  = 3;
    /**
     * 5.
     */
    public static final int BUZZ  = 5;

    /**
     * fizzbuzz method.
     * @param i int
     * @return output String
     */
    public static String fizzbuzz(final int i) {
        String output;
        if (i % FIZZ == 0 && i %  BUZZ == 0) {
            output = "fizzbuzz";
        } else if (i % FIZZ == 0) {
            output = "fizz";
        } else if (i % BUZZ == 0) {
            output = "buzz";
        } else {
            output = Integer.toString(i);
        }
        return output;
    }
}
