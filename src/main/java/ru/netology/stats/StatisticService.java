package ru.netology.stats;

public class StatisticService {

    // Сумма всех продаж
    public int sum(int[] items) {
        int sum = 0;
        for (int item : items) {
            sum += item;
        }

        return sum;
    }

    // Средняя сумма продаж
    public int avg(int[] items) {
        int sum = sum(items);

        return sum / items.length;
    }

    // Номер месяца с пиком продаж
    public int numWithMax(int[] items) {
        int max = items[0];
        for (int item : items) {
            if (item > max) {
                max = item;
            }
        }

        int monthCount = 0;
        int actualMonth = 0;
        for (int item : items) {
            monthCount++;
            if (item == max) {
                actualMonth = monthCount;
            }

        }

        return actualMonth;

    }

    // Номер месяца с минимумом продаж
    public int numWithMin(int[] items) {
        int min = items[0];
        for (int item : items) {
            if (item < min) {
                min = item;
            }
        }
        int monthCount = 0;
        int actualMonth = 0;
        for (int item : items) {
            monthCount++;
            if (item == min) {
                actualMonth = monthCount;
            }

        }

        return actualMonth;
    }

    // Кол-во месяцев с продажами ниже среднего
    public int countUnderAvg(int[] items) {
        int monthCount = 0;
        int avg = avg(items);
        for (int item : items) {
            if (item < avg) {
                monthCount++;
            }

        }

        return monthCount;
    }

    // Кол-во месяцев с продажами выше среднего
    public int countOverAvg(int[] items) {
        int monthCount = 0;
        int avg = avg(items);
        for (int item : items) {
            if (item > avg) {
                monthCount++;
            }

        }

        return monthCount;
    }
}