package ru.netology.stats;

public class StatsService {
    //  сумма всех продаж
    public long calculateTheSumOfAllSales(long[] sales) {
        long total = 0;
        for (long s : sales) {
            total += s;
        }
        return total;
    }

    //  средняя сумма продаж в месяц
    public long calculateTheAverageMonthlySalesAmount(long[] sales) {
        long total = calculateTheSumOfAllSales(sales);
        return total / sales.length;
    }

    //  месяц с максимальными продажами
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    //  месяц с минимальными продажами
    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    // месяц с продажами ниже среднего
    public int salesAreBelowAverage(long[] sales) {
        long average = calculateTheAverageMonthlySalesAmount(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    //  месяце с продажами выше среднего
    public int salesAreAboveAverage(long[] sales) {
        long average = calculateTheAverageMonthlySalesAmount(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}