import kt.fizzbuzz.KotlinFizzbuzz
import org.junit.Test

class KotlinFizzbuzzTest {
    private fun getSubject() = KotlinFizzbuzz()

    @Test
    fun fizzbuzz() {
       assert("fizzbuzz"  == getSubject().fizzbuzz(15, ""))
    }

    @Test
    fun fizz() {
        assert("fizz" == getSubject().fizzbuzz(3,""))
    }

    @Test
    fun buzz() {
        assert("buzz" == getSubject().fizzbuzz(5,""))
    }

    @Test
    fun nothing() {
        assert("1" == getSubject().fizzbuzz(1,""))
    }
}
