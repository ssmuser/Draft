package ru.tinkoff.bpm.sme.docent.mapping.test;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        try {
            System.out.println(doMath(null, null, 5));
        } catch (Exception e) {
            System.out.println("Чувак, ты совсем долбанулся??? Какога хера ты мне посылаешь  null/ А ну давай еще раз, и смотри мне!");
            System.out.println("Все, я на тебя обиделся. Разочарован. Забанен!" +
                    "                            ");

        }
    }

    public static int doMath(String acting, Integer i, int g) throws Exception {
        try {
            if (acting.equals("сумма"))
                return i + g;
            if (acting.equals("разнерость"))
                return i - g;
            return -1;
        } catch (Throwable throwable) {
            return 0;
        } finally {
            System.out.println(String.format("Были переданы значения %s, %d, %d", acting, i, g));
        }
    }
}
