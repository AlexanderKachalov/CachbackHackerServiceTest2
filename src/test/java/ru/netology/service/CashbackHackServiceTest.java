package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/CashbackData.csv", numLinesToSkip = 1)
    void shouldCalculateCashback(int amount, int expectedResult, String message) {
        CashbackHackService service = new CashbackHackService();

        int actualResult = service.remain(amount);

        assertEquals(expectedResult, actualResult, message);
    }

//    @Test
//    void shouldReturn100IfAmountIs900() {
//        CashbackHackService service = new CashbackHackService();
//        int amount = 900;
//        int expectedResult = 100;
//        int actualResult = service.remain(amount);
//        Assertions.assertEquals(expectedResult, actualResult);
//    }
//
//    @Test
//    void shouldReturn200IfAmountIs800() {
//        CashbackHackService service = new CashbackHackService();
//        int amount = 800;
//        int expectedResult = 200;
//        int actualResult = service.remain(amount);
//        Assertions.assertEquals(expectedResult, actualResult);
//    }
//
//    @Test
//    void shouldReturn300IfAmountIs700() {
//        CashbackHackService service = new CashbackHackService();
//        int amount = 700;
//        int expectedResult = 300;
//        int actualResult = service.remain(amount);
//        Assertions.assertEquals(expectedResult, actualResult);
//    }
//
//    @Test
//    void shouldReturn50IfAmountIs950() {
//        CashbackHackService service = new CashbackHackService();
//        int amount = 950;
//        int expectedResult = 50;
//        int actualResult = service.remain(amount);
//        Assertions.assertEquals(expectedResult, actualResult);
//    }
}