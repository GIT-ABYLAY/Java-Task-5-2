package ru.netology.stats;

import java.util.Arrays;

public class StatsService {
    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxSale = sales[0];
        int peakMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                maxSale = sales[i];
                peakMonth = i;
            }
        }
        return peakMonth + 1;
    }

    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale = totalSale + sale;

        }
        return totalSale;
    }
    public double averageSales(int[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale = totalSale + sale;

        }
        long averegeSale = totalSale / 12;
        return averegeSale;
    }
}
