package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int right, int third) {
        return max(third, max(left, right));
    }

    public static int max(int left, int right, int third, int fourth) {
        return max(fourth, max(left, right, third));
    }
}
