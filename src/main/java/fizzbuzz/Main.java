package fizzbuzz;

import kt.fizzbuzz.*;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            String output = "";
            KotlinFizzbuzz ktFizzbuzz = new KotlinFizzbuzz();
            output = ktFizzbuzz.fizzbuzz(i, output);

            System.out.println(output);
        }
    }
}
