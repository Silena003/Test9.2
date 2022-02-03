package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {


    @Test
    void findsum() {

        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};


        assertEquals(85, service.findsum(incomesInBillions));

    }

    @Test
    void findmin() {

        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};


        assertEquals(3, service.findmin(incomesInBillions));

    }

    @Test
    void averageAmount() {

        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};


        assertEquals(7, service.averageAmount(incomesInBillions));

    }
}

