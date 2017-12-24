package kt.fizzbuzz

class KotlinFizzbuzz {
    fun fizzbuzz(i: Int ) : String {
        return if ( i%3 == 0 && i % 5 == 0) {
            "fizzbuzz";
        } else if ( i%3 == 0) {
            "fizz";
        } else if ( i %5 == 0 ){
            "buzz";
        } else  {
            i.toString();
        }
    }
}
