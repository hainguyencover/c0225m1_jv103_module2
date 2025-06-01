package b3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NextDayCalculatorTest {
    @Test
    public void testCalculateNextDay0() {
        NextDayCalculator calculator = new NextDayCalculator(1, 1, 2018);
        int[] nextDay = calculator.calculateNextDay();
        assertArrayEquals(new int[]{2, 1, 2018}, nextDay);
    }
    @Test
    public void testCalculateNextDay1() {
        NextDayCalculator calculator = new NextDayCalculator(31, 1, 2018);
        int[] nextDay = calculator.calculateNextDay();
        assertArrayEquals(new int[]{1, 2, 2018}, nextDay);
    }
    @Test
    public void testCalculateNextDay2() {
        NextDayCalculator calculator = new NextDayCalculator(30, 4, 2018);
        int[] nextDay = calculator.calculateNextDay();
        assertArrayEquals(new int[]{1, 5, 2018}, nextDay);

    }
    @Test
    public void testCalculateNextDay3() {
        NextDayCalculator calculator = new NextDayCalculator(28, 2, 2018);
        int[] nextDay = calculator.calculateNextDay();
        assertArrayEquals(new int[]{1, 3, 2018}, nextDay);
    }
    @Test
    public void testCalculateNextDay4() {
        NextDayCalculator calculator = new NextDayCalculator(29, 2, 2020);
        int[] nextDay = calculator.calculateNextDay();
        assertArrayEquals(new int[]{1, 3, 2020}, nextDay);
    }
    @Test
    public void testCalculateNextDay5() {
        NextDayCalculator calculator = new NextDayCalculator(31, 12, 2018);
        int[] nextDay = calculator.calculateNextDay();
        assertArrayEquals(new int[]{1, 1, 2019}, nextDay);
    }
}



