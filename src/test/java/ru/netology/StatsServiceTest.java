package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    public void sumSales() {
        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int actual = service.getSumSales(sales);
        int expected = 180;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void getAverageSales() {
        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int actual = service.getAverageSales(sales);
        int expected = 15;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void getMaximumSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int actual = service.getMaximumSalesMonth(sales);
        int expected = 8;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void getMinimumSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int actual = service.getMinimumSalesMonth(sales);
        int expected = 9;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void getSalesBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int actual = service.getSalesBelowAverage(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void getSalesAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int actual = service.getSalesBelowAverage(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);

    }

}