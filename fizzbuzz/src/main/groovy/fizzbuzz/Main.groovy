package fizzbuzz

class GroovyMain {
    static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            String output = ""

            output = GroovyFizzbuzz.fizzbuzz(i, output)
            println output
        }
    }
}
