package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    void testCalculateTheSumOfAllSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180; // Общая сумма
        long actual = service.calculateTheSumOfAllSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCalculateTheAverageMonthlySalesAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15; // Средняя сумма
        long actual = service.calculateTheAverageMonthlySalesAmount(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8; // Месяц с максимальными продажами
        int actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9; // Месяц с минимальными продажами
        int actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSalesAreBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5; // Месяцы ниже среднего: 8, 13, 7, 14, 14
        long actual = service.salesAreBelowAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSalesAreAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5; // Месяцы выше среднего: 17, 20, 19, 20, 18
        long actual = service.salesAreAboveAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}

