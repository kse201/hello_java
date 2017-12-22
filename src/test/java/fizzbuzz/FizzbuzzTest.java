package fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzbuzzTest {
    @Test
    public void fizzbuzz() throws Exception {
        assertEquals("fizzbuzz", Fizzbuzz.fizzbuzz(15,""));
    }

    @Test
    public void fizz() throws Exception {
        assertEquals("fizz", Fizzbuzz.fizzbuzz(3,""));
    }

    @Test
    public void buzz() throws Exception {
        assertEquals("buzz", Fizzbuzz.fizzbuzz(5,""));
    }

    @Test
    public void not_fizzbuzz() throws Exception {
        assertEquals("1", Fizzbuzz.fizzbuzz(1,""));
    }
}
