package ru.job4j.array;

public class EqualLast {

    public static boolean check(int[] left, int[] right) {
        boolean check = true;
        if (left[left.length - 1] != right[right.length - 1]) {
            check = false;
        }
        return check;
    }
}
