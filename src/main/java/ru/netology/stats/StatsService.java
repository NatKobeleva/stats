package ru.netology.stats;

public class StatsService {

    public int sumSales(int[] sales) {
        int sum = 0;
        for (int value : sales) {
            sum += value;
        }
        return sum;
    }

    public double averageSales(int[] sales) {
        int sum = sumSales(sales);
        return (double) sum / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int salesBelowAverage(int[] sales){
        int belowAverageMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales(sales)) {
                belowAverageMonth = belowAverageMonth + 1;
            }
        }
        return belowAverageMonth;
    }

    public int salesAboveAverage(int[] sales){
        int aboveAverageMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales(sales)) {
                aboveAverageMonth = aboveAverageMonth + 1;
            }
        }
        return aboveAverageMonth;
    }
}