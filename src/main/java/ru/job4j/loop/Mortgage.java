package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        double sum = amount + amount * percent;
        double ostatok = sum - salary;
        if (ostatok > salary) {
            ostatok = ostatok + ostatok * percent - salary;
            year++;
        }
        return year;
    }
}