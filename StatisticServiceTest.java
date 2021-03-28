package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticServiceTest {

    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatisticService service = new StatisticService();

    @Test
    void shouldReturnSum() {
        int actual = service.sum(sales);
        int expected = 180;

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnAvg() {
        int actual = service.avg(sales);
        int expected = 15;

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMonthNumWithMax() {
        int actual = service.numWithMax(sales);
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMonthNumWithMin() {
        int actual = service.numWithMin(sales);
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMonthCountUnderAvg() {
        int actual = service.countUnderAvg(sales);
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMonthCountOverAvg() {
        int actual = service.countOverAvg(sales);
        int expected = 5;

        assertEquals(expected, actual);
    }
}
