package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int i = 2; i <= number - 1; i++) {
            if (number % 2 == 0 || number % (number - 1) == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
