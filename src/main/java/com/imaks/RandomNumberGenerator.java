package com.imaks;

import java.util.Random;
import java.util.function.Supplier;

public class RandomNumberGenerator {
    public static int generateRandomNumber(int min, int max){
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;//bound - виключено, тому +1, щоб включити його в рендж(це я щоб запам'ятати:))
    }

    public static void main(String[] args) {
        Supplier<Integer> supply = () -> generateRandomNumber(1, 100);

        System.out.println("Оцінка за ДЗ: " + supply.get() + ". Вітаю!");
    }

}
