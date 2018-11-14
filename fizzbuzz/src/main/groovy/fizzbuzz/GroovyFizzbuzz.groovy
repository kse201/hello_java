package fizzbuzz

class GroovyFizzbuzz {
    static String fizzbuzz(int i, String[] output) {
        if (i % 3 == 0 && i % 5 == 0) {
            output += "fizzbuzz";
        } else if (i % 3 == 0) {
            output += "fizz";
        } else if (i % 5 == 0) {
            output += "buzz";
        } else {
            output += i;
        }
        return output;
    }
}