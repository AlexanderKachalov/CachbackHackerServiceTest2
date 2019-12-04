package ru.netology.service;

public class Main {
    public static void main(String[] args) {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expectedResult = 0;
        int actualResult = service.remain(amount);
        if (amount < 1000) {
            System.out.println("Для получения кэшбека приобретите товаров еще на " + actualResult + "рублей");
        }
    }
}
