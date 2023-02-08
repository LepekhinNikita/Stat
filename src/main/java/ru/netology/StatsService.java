package ru.netology;

public class StatsService {


    public int getSumSales(int[] sales) {                // Сумма всех продаж
        int generalSales = 0;
        for (int sale : sales) {
            generalSales = generalSales + sale;
        }

        return generalSales;
    }


    public int getAverageSales(int[] sales) {             // Средняя сумма продаж в месяц
        int generalSales = 0;
        for (int sale : sales) {
            generalSales = generalSales + sale;
        }
        return generalSales / sales.length;


    }

    public int getMaximumSalesMonth(int[] sales) {       // Номер месяца, в котором был пик продаж

        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;

        }
        return maxMonth + 1;


    }
    public int getMinimumSalesMonth(int[] sales) {       // Номер месяца, в котором был минимум продаж

        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;

        }
        return minMonth + 1;


    }
    public int getSalesBelowAverage(int[] sales){
        int result = 0;
        for (int sale : sales) {
            if (sale < getAverageSales(sales)) {
                result++;
            }

        }
        return result;
    }

    public int getSalesAboveAverage(int[] sales) {
        int result = 0;
        for (int sale : sales) {
            if (sale > getAverageSales(sales)) {
                result++;
            }

        }
        return result;
    }




}