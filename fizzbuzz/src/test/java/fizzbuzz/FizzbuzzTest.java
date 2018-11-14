package fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzbuzzTest {
    @Test
    public void fizzbuzz() {
        assertEquals("fizzbuzz", Fizzbuzz.fizzbuzz(15));
    }

    @Test
    public void fizz() {
        assertEquals("fizz", Fizzbuzz.fizzbuzz(3));
    }

    @Test
    public void buzz() {
        assertEquals("buzz", Fizzbuzz.fizzbuzz(5));
    }

    @Test
    public void not_fizzbuzz() {
        assertEquals("1", Fizzbuzz.fizzbuzz(1));
    }
}
