package ru.netology.statistic;

public class StatisticsService {
    /**
     * Calculate index of max income
     *
     * @param incomes - array of incomes
     * @return - index of first max value
     */
    public long findMax(long[] incomes) {
        long current_max_index = 0;
        long current_max = incomes[0];
        for (long income : incomes)
            if (current_max < income)
                current_max = income;
        return current_max;
    }

    public long findsum(long[] incomes) {

        long sum = 0;

        for (long income : incomes) {

            sum += income;

        }

        return sum;

    }

    public long findmin(long[] incomes) {

        long min = incomes[0];

        for (long income : incomes)

            if (min > income)

                min = income;

        return min;

    }

    public long averageAmount(long[] incomes) {

        return findsum(incomes) / incomes.length;

    }

}

