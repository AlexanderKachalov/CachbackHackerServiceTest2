package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldReturnZeroIfAmountEqual1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expectedResult = 0;
        int actualResult = service.remain(amount);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturn100IfAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expectedResult = 100;
        int actualResult = service.remain(amount);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturn200IfAmountIs800() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int expectedResult = 200;
        int actualResult = service.remain(amount);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturn300IfAmountIs700() {
        CashbackHackService service = new CashbackHackService();
        int amount = 700;
        int expectedResult = 300;
        int actualResult = service.remain(amount);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}