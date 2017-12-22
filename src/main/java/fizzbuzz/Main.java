package fizzbuzz;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            String output = "";
            output = Fizzbuzz.fizzbuzz(i, output);

            System.out.println(output);
        }
    }
}
