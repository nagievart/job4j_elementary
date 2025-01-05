package ru.job4j.math;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + differenceAndDivision(10, 20));
        System.out.println("Результат расчета равен: " + allFunctionsSum(10, 20));
    }

    public static double differenceAndDivision(double first, double second) {
        return MathFunction.difference(first, second)
                + MathFunction.division(first, second);
    }

    public static double allFunctionsSum(double first, double second) {
        return MathFunction.difference(first, second)
                + MathFunction.division(first, second)
                + MathFunction.sum(first, second)
                + MathFunction.sum(first, second);
    }
}
