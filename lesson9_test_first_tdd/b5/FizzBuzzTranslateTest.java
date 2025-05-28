package b5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FizzBuzzTranslateTest {
    @Test
    public void fizzTestBy3(){
        String expected = "Fizz";
        String actual = FizzBuzzTranslate.translate(3);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void fizzTestBy6(){
        String expected = "Fizz";
        String actual = FizzBuzzTranslate.translate(6);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void fizzTestBy9(){
        String expected = "Fizz";
        String actual = FizzBuzzTranslate.translate(9);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void fizzTestBy5(){
        String expected = "Buzz";
        String actual = FizzBuzzTranslate.translate(5);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void fizzTestBy15(){
        String expected = "FizzBuzz";
        String actual = FizzBuzzTranslate.translate(15);
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void fizzTestBy37(){
        String expected = "ba muoi bay";
        String actual = FizzBuzzTranslate.translate(37);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void fizzTestBy96(){
        String expected = "Fizz";
        String actual = FizzBuzzTranslate.translate(96);
        Assertions.assertEquals(expected, actual);
    }
}
