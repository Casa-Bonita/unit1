package ru.netology.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    // проверка, что тест "упадёт"
    void shouldReturn200IfAmountIs900() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 200;
        assertEquals(expected, actual);
    }

    @Test
    // проверка, что тест работает, условие выполняется
    void shouldReturn100IfAmountIs900() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
        // проверка пограничного значения minimum
    void shouldReturn1000IfAmountIs0() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;

        int actual = cashbackHackService.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
        // проверка пограничного значения maximum (оно же minimum для следующего диапазона)
    void shouldReturn0IfAmountIs1000() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
        // проверка пограничного значения maximum, в следующем диапазоне
    void shouldReturn0IfAmountIs2000() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 2000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

}